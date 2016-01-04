<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>moviesApp</title>
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
//    conn = DriverManager.getConnection(databaseURL, username, password);
      conn = DriverManager.getConnection(databaseURL, "root", "");
    stmt = conn.createStatement();
    String sqlStr = "select id, title, year, poster from movies";
    // System.out.println(sqlStr); // for debugging
    ResultSet rset = stmt.executeQuery(sqlStr);
    out.println("<table border='1'>");
    out.println("<tr><th>Id</th><th>Title</th><th>Year</th><th>Poster</th></tr>");

    while (rset.next()) { // list all the authors
      String sId = rset.getString("id");
      String sTi = rset.getString("title");
      String sYe = rset.getString("year");
      String sPo = rset.getString("poster");
      out.println("<tr><td>" + sId + "</td><td>" + sTi + "</td><td>" + sYe + "</td><td><img src=" + "http://image.tmdb.org/t/p/original/" + sPo + "</img></td></tr>");
    }

    out.println("</table>");

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
  
%>
</body>

</html>