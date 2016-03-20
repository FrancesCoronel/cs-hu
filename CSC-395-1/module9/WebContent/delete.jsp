<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.text.*, java.util.*, java.sql.*, javax.servlet.*, javax.servlet.http.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Record</title>
  	<link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="my.css">
</head>
<script>
function delete_id( id ){
	var answer = confirm('Are you sure?'); 
	if ( answer ){
	            window.location = 'delete.jsp?action=delete&id=' + id;
	}
}
</script>
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
	if (formaction.equals("delete")) {

		if(formid >= 1) {
			
			
			try {
				d = new com.mysql.jdbc.Driver();
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root","");
				String sqlStr = "DELETE FROM movies WHERE id = ? ";
				stmt = conn.prepareStatement(sqlStr);
				stmt.setInt(1, formid);
	
				System.out.println(sqlStr); // for debugging
				
				if(stmt.execute()) {
					out.println("Record delete failed! <br>");
				} else {
					out.println("Record was deleted. <br>");
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
		} else {
			out.println("Record not found!");
		}
	}
	
%>
<a href='#' onclick='delete_id( " + sId + " );'>Delete</a>
</body>
</html>
