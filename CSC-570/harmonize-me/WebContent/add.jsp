<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

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

	<%
		java.util.Date date = new java.util.Date();

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

			// get applicaton parameter
			String databaseURL = "jdbc:mysql://localhost:3306/musicdb";
			String username = "root";
			String password = "yolo";

			// connect to database
			Connection conn = null;
			PreparedStatement stmt = null;
			com.mysql.jdbc.Driver d = null;

			try {
				d = new com.mysql.jdbc.Driver();
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdb", "root","yolo");
				String sqlStr = "insert into music ( song, artist, album, genre, artwork, source ) values ( ? , ?, ?, ?, ?, ?)";
				stmt = conn.prepareStatement(sqlStr);
				stmt.setString(1, formsong);
				stmt.setString(2, formartist);
				stmt.setString(3, formalbum);
				stmt.setString(4, formgenre);
				stmt.setString(5, formartwork);
				stmt.setString(6, formsource);

				System.out.println(sqlStr); // for debugging
				stmt.execute();

				out.println("New record was saved.");
				out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");

			}

			catch (SQLException ex) {
				out.println("<h3>Service not available. Please try again later!</h3>");
				out.println("SQLException: " + ex.getMessage());
				out.println("SQLState: " + ex.getSQLState());
				out.println("VendorError: " + ex.getErrorCode());
				out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");

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
					out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");

				}
			}
		}

//		else {
	%>

	<form action='#' method='post'>
		<table>
			<tr>
				<td>Song</td>
				<td><input type='text' size=75 name='song' /></td>
			</tr>
			<tr>
				<td>Artist</td>
				<td><input type='text' size=75 name='artist' /></td>
			</tr>
			<tr>
				<td>Album</td>
				<td><input type='text' size=75 name='album' /></td>
			</tr>
			<tr>
				<td>Genre</td>
				<td><input type='text' size=75 name='genre' /></td>
			</tr>
			<tr>
				<td>Artwork</td>
				<td><input type='text' size=75 name='artwork' /></td>
			</tr>
			<tr>
				<td>MP3 File</td>
				<td><input type='text' size=75 name='source' /></td>
			</tr>
			<tr>
				<td>
					<input type='hidden' name='action' value='create' /> 
					<input class="btn btn-primary-outline btn-lg" type='submit' value='Add New Song' />
				</td>
				<td><a href='music.jsp'><button type="button" class="btn btn-danger-outline btn-lg">Back to Music</button></a></td>
			</tr>
		</table>
	</form>

	<%
//		}
	%>
</body>
</html>