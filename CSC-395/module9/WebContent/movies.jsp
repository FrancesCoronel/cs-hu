<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Table of Movies</title>
  	<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="my.css">
</head>

<body>

<h1>moviesApp</h1>

<%

// get applicaton parameter
String databaseURL = "jdbc:mysql://localhost:3306/moviesdb"; 
/* application.getInitParameter("databaseURL"); */
String username = "root";
/* application.getInitParameter("username"); */
String password = "password";
/* application.getInitParameter("password"); */

// connect to database
Connection conn = null;
Statement stmt = null;
com.mysql.jdbc.Driver d = null;

  try {
    d = new com.mysql.jdbc.Driver();
	// conn = DriverManager.getConnection(databaseURL, username, password);
    conn = DriverManager.getConnection(databaseURL, "root", "");
    stmt = conn.createStatement();
    String userSelect = "id";
	if (request.getParameter("sortby") != null) {
		userSelect = request.getParameter("sortby");
	}
    String sqlStr = "select id, title, year, poster from movies order by " + userSelect;
    // System.out.println(sqlStr); // for debugging
    ResultSet rset = stmt.executeQuery(sqlStr);
    out.println("<table border='1'>");
    out.println("<tr><th><a href='sortby=id'>Id</a></th><th><a href='sortby=title'>Title</a></th><th><a href='sortby=year'>Year</a></th><th><a href='sortby=title'>Poster</a></th><th>Edit</th><th>Delete</th></tr>");

    while (rset.next()) { // list all the authors
      String sId = rset.getString("id");
      String sTi = rset.getString("title");
      String sYe = rset.getString("year");
      String sPo = rset.getString("poster");
      out.println("<tr><td>" + sId + "</td><td>" + sTi + "</td><td>" + sYe + 
    		  "</td><td><img src=" + "http://image.tmdb.org/t/p/original/" + sPo + 
    		  "</img></td><td><a href='edit.jsp?id=" + sId + 
    		  "'><img src='https://cdn4.iconfinder.com/data/icons/simplicio/64x64/file_edit.png'></a></td><td><a href='delete.jsp?id=" 
    		  + sId + "&action=delete'><img src='https://cdn4.iconfinder.com/data/icons/simplicio/64x64/file_delete.png'></a></td></tr>");
    }
 
    out.println("<form action='#' method='post'>");
    out.println("<td>id</td><td><input type='text' name='title' /></td><td><select name='year'><option value='0000'>Year:</option>");
	
    for (int i = 2015; i >= 1970; i--) {
		if (i == 2015) {
			out.println("<option value=" + i + " selected='selected'>" + i + "</option>");
		} else {
			out.println("<option value=" + i + ">" + i + "</option>");
		}
	}
			
	out.println("</select></td><td><input type='text' name='poster' /></td><td colspan='2'><input type='hidden' name='action' value='create' /> <input type='submit' value='Add new' /></td>");
	out.println("</form></tr></table>");

  } catch (SQLException ex) {
    out.println("<h3>Service not available. Please try again later!</h3>");
    out.println("SQLException: " + ex.getMessage());
    out.println("SQLState: " + ex.getSQLState());
    out.println("VendorError: " + ex.getErrorCode());
  } finally {
    out.close();
    try { 
      if (stmt != null)
        stmt.close();
      if (conn != null)
        conn.close();
    } catch (SQLException ex) {
      out.println("SQLException: " + ex.getMessage());
      out.println("SQLState: " + ex.getSQLState());
      out.println("VendorError: " + ex.getErrorCode());
    }
  }
  
  PreparedStatement stmt2 = null;
  
  String formaction = "";
  
	if (request.getParameter("action") != null)
		formaction =  request.getParameter("action");
	

	if (formaction.equals("create")) {
		String formtitle = request.getParameter("title");
		Integer formyear = Integer.parseInt(request.getParameter("year"));
		String formposter = request.getParameter("poster");
		
		try {
			d = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root","");
			String sqlStr = "insert into movies ( title, year, poster ) values ( ? , ?, ?)";
			stmt2 = conn.prepareStatement(sqlStr);
			stmt2.setString(1, formtitle);
			stmt2.setInt(2, formyear);
			stmt2.setString(3, formposter);

			System.out.println(sqlStr); // for debugging
			stmt2.execute(); 

			out.println("New record was saved.");

		}

		catch (SQLException ex) {
			out.println("<h3>Service not available. Please try again later!</h3>");
			out.println("SQLException: " + ex.getMessage());
			out.println("SQLState: " + ex.getSQLState());
			out.println("VendorError: " + ex.getErrorCode());

		} finally {
			out.close();
			try {
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException ex) {
				out.println("SQLException: " + ex.getMessage());
				out.println("SQLState: " + ex.getSQLState());
				out.println("VendorError: " + ex.getErrorCode());

			}
		}
	}
  
%>

</body>

</html>