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
	// Set Defaults
	// song ID
	Integer sId = 0;
	// song title
	String  sTi = "";
	// song artist
	String  sAr = "";
	// song album
	String  sAl = "";
	// song genre
	String  sGe = "";
	// song artwork
	String  sArt = "";
	// song source
	String  sSo = "";
	
	// get webform data
	String formaction = "";
	Integer formid = 0;

	if (request.getParameter("action") != null)
		formaction =  request.getParameter("action");

	if (request.getParameter("id") != null)
		formid =  Integer.parseInt(request.getParameter("id"));
	
	// get applicaton parameter
	String databaseURL = "jdbc:mysql://localhost:3306/musicdb";
	String username = "root";
	String password = "yolo";
		
	// connect to database
	Connection conn = null;
	PreparedStatement stmt = null;
	com.mysql.jdbc.Driver d = null;
	
	
	// if we pass edit; expect to update records
	if (formaction.equals("edit")) {
		
		String formsong = request.getParameter("song");
		String formartist = request.getParameter("artist");
		String formalbum = request.getParameter("album");
		String formgenre = request.getParameter("genre");
		String formartwork = request.getParameter("artwork");
		String formsource = request.getParameter("source");
		
		try {
			d = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdb", "root","yolo");
			String sqlStr = "UPDATE music set song = ?, artist = ? , album = ? , genre = ? , artwork = ? , source = ? WHERE id = ?";
			stmt = conn.prepareStatement(sqlStr);
			stmt.setString(1, formsong);
			stmt.setString(2, formartist);
			stmt.setString(3, formalbum);
			stmt.setString(4, formgenre);
			stmt.setString(5, formartwork);
			stmt.setString(6, formsource);
			stmt.setInt(7, formid);

			System.out.println(sqlStr); // for debugging
/* 			out.println(sqlStr);
			out.flush(); */
			
			if(stmt.execute()) {
				out.println("Record update failed! <br>");
				out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");
			} else {
				out.println("Record was updated. <br>");
				out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");
			}
					
		}

		catch (SQLException ex) {
			out.println("<h3>Service not available. Please try again later!</h3>");
			out.println("SQLException: " + ex.getMessage());
			out.println("SQLState: " + ex.getSQLState());
			out.println("VendorError: " + ex.getErrorCode());
			out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");

		} finally {
	//		out.close();
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
	
	// if we pass a valid id; return form
	if ( formid >= 1) {
		try {
			String sqlStrFind = "SELECT * from music WHERE id = ?";
//			d = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection(databaseURL, username, password);
			stmt = conn.prepareStatement(sqlStrFind);
			stmt.setInt(1, formid);
			
			//System.out.println(sqlStrFind); // for debugging
			
			ResultSet rset = stmt.executeQuery();
			while (rset.next()) { // list all results
				sId = rset.getInt("id");
				sTi = rset.getString("song");
				sAr = rset.getString("artist");
				sAl = rset.getString("album");
				sGe = rset.getString("genre");
				sArt = rset.getString("artwork");
				sSo = rset.getString("source");
	
				out.println("<h3 text-align:'center'>You are now editing the song with ID " + sId + ".</h3>");
			}
			
			if(sId >= 1)
			{
			
				%>
			<form action='#' method='post'>
				<table border=0>
					<tr>
						<td>Song</td>
						<td></td>
						<td><input type='text' name='song' size='75' value='<% out.print(sTi); %>' />
						</td>
					</tr>
					<tr>
						<td>Artist</td>
						<td></td>
						<td><input type='text' name='artist' size='75' value='<% out.print(sAr); %>' /></td>
					</tr>
					<tr>
						<td>Album</td>
						<td></td>
						<td>
							<input type='text' name='album' size='75' value='<% out.print(sAl); %>' />
						</td>
					</tr>
					<tr>
						<td>Genre</td>
						<td></td>
						<td>
							<input type='text' name='genre' size='75' value='<% out.print(sGe); %>' />
						</td>
					</tr>
					<tr>
						<td>Artwork</td>
						<td></td>
						<td>
							<input type='text' name='artwork' size='75' value='<% out.print(sArt); %>' />
						</td>
					</tr>
					<tr>
						<td>MP3 File</td>
						<td></td>
						<td>
							<input type='text' name='source' size='75' value='<% out.print(sSo); %>' />
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type='hidden' name='id' value='<% out.print(sId); %>' /> <input
						type='hidden' name='action' value='edit' style="padding: 10px;"/> <input type='submit'
						value='Edit' class="btn btn-primary-outline btn-lg"/>
						</td>
						<td><a href='music.jsp'><button type="button" class="btn btn-danger-outline btn-lg">Back to Music</button></a></td>
					</tr>

				</table>
			</form>
				<%
			} else {
				out.println("Song with ID " + formid + " not found!");
				out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");
			}


			} catch (SQLException ex) {
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
	} else {
		out.println("request id: " + formid + " invalid!!");
		out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");
	}
%>

</body>
</html>
