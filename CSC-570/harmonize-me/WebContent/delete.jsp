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
	if (formaction.equals("delete")) {

		if(formid >= 1) {
			
			
			try {
				d = new com.mysql.jdbc.Driver();
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicdb", "root","yolo");
				String sqlStr = "DELETE FROM music WHERE id = ? ";
				stmt = conn.prepareStatement(sqlStr);
				stmt.setInt(1, formid);
	
				System.out.println(sqlStr); // for debugging
				
				if(stmt.execute()) {
					out.println("Record delete failed! <br>");
					out.println("<a href='music.jsp'><button type='button' class='btn btn-danger-outline btn-lg'>Back to Music</button></a>");
				} else {
					out.println("Record was deleted. <br>");
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
		} else {
			out.println("Record not found!");
		}
	}
	
%>
</body>
</html>
