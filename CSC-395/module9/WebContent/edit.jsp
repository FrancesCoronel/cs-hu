<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Record</title>
  	<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="my.css">
</head>
<body>

<%
	// Set Defaults
	Integer sId = 0;
	String sTi = "";
	Integer sYe = 9999;
	String sPo = "";

	// get webform data
	String formaction = "";
	Integer formid = 0;

	if (request.getParameter("action") != null)
		formaction =  request.getParameter("action");

	if (request.getParameter("id") != null)
		formid =  Integer.parseInt(request.getParameter("id"));

	// get applicaton parameter
	String databaseURL = "jdbc:mysql://localhost:3306/moviesdb";
	String username = "root";
	String password = "";

	// connect to database
	Connection conn = null;
	PreparedStatement stmt = null;
	com.mysql.jdbc.Driver d = null;


	// if we pass edit; expect to update records
	if (formaction.equals("edit")) {
		String formtitle = request.getParameter("title");
		Integer formyear = Integer.parseInt(request.getParameter("year"));
		String formposter = request.getParameter("poster");

		try {
			d = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root","");
			String sqlStr = "UPDATE movies set  title = ?, year = ? , poster = ? WHERE id = ? ";
			stmt = conn.prepareStatement(sqlStr);
			stmt.setString(1, formtitle);
			stmt.setInt(2, formyear);
			stmt.setString(3, formposter);
			stmt.setInt(4, formid);

			System.out.println(sqlStr); // for debugging

			if(stmt.execute()) {
				out.println("Record update failed! <br>");
			} else {
				out.println("Record was updated. <br>");
			}

		}

		catch (SQLException ex) {
			out.println("<h3>Service not available. Please try again later!</h3>");
			out.println("SQLException: " + ex.getMessage());
			out.println("SQLState: " + ex.getSQLState());
			out.println("VendorError: " + ex.getErrorCode());

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

			}
		}
	}

	// if we pass a valid id; return form
	if ( formid >= 1) {
		try {
			String sqlStrFind = "SELECT * from movies  WHERE id = ?";
//			d = new com.mysql.jdbc.Driver();
			conn = DriverManager.getConnection(databaseURL, username, password);
			stmt = conn.prepareStatement(sqlStrFind);
			stmt.setInt(1, formid);

			//System.out.println(sqlStrFind); // for debugging

			ResultSet rset = stmt.executeQuery();
			while (rset.next()) { // list all results
				sId = rset.getInt("id");
				sTi = rset.getString("title");
				sYe = rset.getInt("year");
				sPo = rset.getString("poster");

				out.println("Movie with id " + sId + " found");
			}

			if(sId >= 1)
			{

				%>
			<form action='#' method='post'>
				<table border=0>
					<tr>
						<td>Title</td>
						<td><input type='text' name='title' value='<% out.print(sTi); %>' />
						</td>
					</tr>
					<tr>
						<td>Year</td>
						<td><input type='text' name='year' value='<% out.print(sYe); %>' /></td>
					</tr>
					<tr>
						<td>Poster</td>
						<td>
							<img src='<% out.print(sPo); %>'/><br>
							<input type='text' name='poster' value='<% out.print(sPo); %>' />
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type='hidden' name='id' value='<% out.print(sId); %>' /> <input
						type='hidden' name='action' value='edit' style="padding: 10px;"/> <input type='submit'
						value='Edit' />
						</td>
					</tr>
					<tr>
						<td></td>
						<td><a href='movies.jsp' style="text-decoration: none">Back to Movies</a></td>
					</tr>

				</table>
			</form>
				<%
			} else {
				out.println("Movie with id " + formid + " not found!");
			}


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
	} else {
		out.println("request id: " + formid + " invalid!!");
	}
%>

</body>
</html>
