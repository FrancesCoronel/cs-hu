<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Record</title>
  	<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="my.css">
</head>
<body>

	<%
		java.util.Date date = new java.util.Date();

		// get webform data
		String formaction = "";
		if (request.getParameter("action") != null)
			formaction =  request.getParameter("action");
		

		if (formaction.equals("create")) {
			String formtitle = request.getParameter("title");
			Integer formyear = Integer.parseInt(request.getParameter("year"));
			String formposter = request.getParameter("poster");

			// get applicaton parameter
			String databaseURL = "jdbc:mysql://localhost:3306/moviesdb";
			String username = "root";
			String password = "";

			// connect to database
			Connection conn = null;
			PreparedStatement stmt = null;
			com.mysql.jdbc.Driver d = null;

			try {
				d = new com.mysql.jdbc.Driver();
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root","");
				String sqlStr = "insert into movies ( title, year, poster ) values ( ? , ?, ?)";
				stmt = conn.prepareStatement(sqlStr);
				stmt.setString(1, formtitle);
				stmt.setInt(2, formyear);
				stmt.setString(3, formposter);

				System.out.println(sqlStr); // for debugging
				stmt.execute();

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

//		else {
	%>

	<form action='#' method='post'>
		<table>
			<tr>
				<td>Title</td>
				<td><input type='text' name='title' /></td>
			</tr>
			<tr>
				<td>Year</td>
				<td><select name="year">
						<option value="0000">Year:</option>

						<%
							for (int i = 2015; i >= 1970; i--) {
									if (i == 2015) {
										out.println("<option value=" + i
												+ " selected='selected'>" + i + "</option>");
									} else {
										out.println("<option value=" + i + ">" + i
												+ "</option>");
									}
								}
						%>

				</select>
			</tr>
			<tr>
				<td>Poster</td>
				<td><input type='text' name='poster' /></td>
			</tr>
			<tr>
			<td></td>
			<td><input type='hidden' name='action' value='create' /> <input
				type='submit' value='Save' /></td>
			</tr>
		</table>
	</form>

	<%
//		}
	%>

</body>
</html>