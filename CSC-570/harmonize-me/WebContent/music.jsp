<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

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

<h1><a id="special" href="index.jsp"><img src="media/logo.png" width=125>HarmonizeMe</a></h1>
<a href='add.jsp'><button type="button" class='btn btn-success-outline btn-lg'>Add New Song</button></a>

<!-- Add This Song!

Stressed Out
Twenty One Pilots
Blurryface
Alternative
http://puu.sh/lYAn2/824883bc34.mp3
https://33.media.tumblr.com/_1449420699_cover.jpg -->

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
  // conn = DriverManager.getConnection(databaseURL, username, password);
    conn = DriverManager.getConnection(databaseURL, "root", "yolo");
    stmt = conn.createStatement();
    String sqlStr = "select id, song, artist, album, genre, artwork, source from music";
    // System.out.println(sqlStr); // for debugging
    ResultSet rset = stmt.executeQuery(sqlStr);
    out.println("<table border='0' style='width:100%'>");
    out.println("<tr><th>Artwork & MP3 File</th><th>Song</th><th>Artist</th><th>Album</th><th>Genre</th><th>Edit or Delete</th></tr>");

    while (rset.next()) { // list all the authors
      String sId = rset.getString("id");
      String sTi = rset.getString("song");
      String sAr = rset.getString("artist");
      String sAl = rset.getString("album");
      String sGe = rset.getString("genre");
      String sArt = rset.getString("artwork");
      String sSo = rset.getString("source");
      out.println("<tr><td><img id='art' width='250' src=" + sArt + "><audio controls><source type='audio/mpeg' src=" + sSo +
          ">Your browser does not support the audio element.</audio></td><td>" + sTi +
          "</td><td>" + sAr +
          "</td><td>" + sAl +
          "</td><td>" + sGe +
          "</td><td><a href='edit.jsp?id=" + sId +
          "'><i class='fa fa-pencil-square-o'></i></a><a href='delete.jsp?id=" + sId +
          "&action=delete'><i class='fa fa-trash'></i></a></td></tr>");
    }
    
/*     out.println("<form action='#' method='post'><table><tr><td><input type='text' size=50 placeholder='artwork URL' name='artwork' /><br><input size=50 placeholder='MP3 source' type='text' name='source' /></td><td colspan='2'>");
    out.println("<input type='text' size=30 placeholder='song name' name='song' /><br><input type='text' size=30 placeholder='artist' name='artist' />");
    out.println("</td><td colspan='2'><input type='text' size=30 placeholder='album' name='album' /><br>");
    out.println("<input type='text' size=30 placeholder='genre' name='genre' /></td><td colspan='2'>");
    out.println("<input type='hidden' name='action' value='create' /> <input type='submit' class='btn btn-success-outline btn-lg' value='Add New Song' /></td>");
    out.println("</form></table></table>"); */
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

  PreparedStatement stmt2 = null;
  
	// get webform data
	String formaction = "";
	if (request.getParameter("action") != null)
		formaction =  request.getParameter("action");
	

	if (formaction.equals("create")) {
		String formsong = request.getParameter("song");
		String formartist = request.getParameter("artist");
		String formalbum = request.getParameter("album");
		String formgenre = request.getParameter("genre");
		String formartwork = request.getParameter("artwork");
		String formsource = request.getParameter("source");

		try {
			d = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdb", "root","yolo");
			String sqlStr = "insert into music ( song, artist, album, genre, artwork, source ) values ( ? , ?, ?, ?, ?, ?)";
			stmt2 = conn.prepareStatement(sqlStr);
			stmt2.setString(1, formsong);
			stmt2.setString(2, formartist);
			stmt2.setString(3, formalbum);
			stmt2.setString(4, formgenre);
			stmt2.setString(5, formartwork);
			stmt2.setString(6, formsource);

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