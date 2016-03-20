<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<head lang="en">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HarmonizeMe</title>
	<link rel="stylesheet" href="https://cdn.rawgit.com/twbs/bootstrap/v4-dev/dist/css/bootstrap.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/font-awesome-4.3.0/css/font-awesome.min.css">
	<link rel="shortcut icon" href="media/favicon.ico" type="image/x-icon" />
</head>

<body>
<h1>moviesApp</h1>
<%

// get applicaton parameter
String databaseURL = "jdbc:mysql://localhost:3306/musicdb"; 
/* application.getInitParameter("databaseURL"); */
String username = "root";
/* application.getInitParameter("username"); */
String password = "yolo";
/* application.getInitParameter("password"); */

// connect to database
Connection conn = null;
Statement stmt = null;
com.mysql.jdbc.Driver d = null;

  try {
    d = new com.mysql.jdbc.Driver();
//    conn = DriverManager.getConnection(databaseURL, username, password);
      conn = DriverManager.getConnection(databaseURL, "root", "yolo");
    stmt = conn.createStatement();
    String sqlStr = "select id, song, artist, album, genre, artwork, source from music";
    // System.out.println(sqlStr); // for debugging
    ResultSet rset = stmt.executeQuery(sqlStr);
    out.println("<table border='1'>");
    out.println("<tr><th>MP3 File</th><th>Artwork</th><th><a href='sortby=song'>Song</a></th><th><a href='sortby=artist'>Artist</a></th><th><a href='sortby=album'>Album</a></th><th><a href='sortby=genre'>Genre</a></th><th>Edit</th><th>Delete</th></tr>");

    while (rset.next()) { // list all the authors
      String sId = rset.getString("id");
      String sTi = rset.getString("song");
      String sAr = rset.getString("artist");
      String sAl = rset.getString("album");
      String sGe = rset.getString("genre");
      String sArt = rset.getString("artwork");
      String sSo = rset.getString("source");
      out.println("<tr><td><audio controls><source type='audio/mpeg' src=" + sSo + 
    		  ">Your browser does not support the audio element.</audio></td><td><img height='100' width='100' src=" + sArt + "></td><td>" + sTi + 
    		  "</td><td>" + sAr + 
    		  "</td><td>" + sAl + 
    		  "</td><td>" + sGe + 
    		  "</td><td><a href='edit.jsp?id=" + sId + 
    		  "'><i class='fa fa-pencil-square-o'></i></a></td><td><a href='delete.jsp?id=" + sId + 
    		  "&action=delete'><i class='fa fa-trash'></i></a></td></tr>");
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