<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wait for it</title>
</head>
<body>
<%="wait for it" %>
<%
Object name = request.getAttribute("name");
		
out.print(name)	;	
String nameis = request.getParameter("name");	
out.print("<br>"+nameis);
if(nameis!=null){
	session.setAttribute("sname", nameis); //scope restricted to this session
	application.setAttribute("Cname", nameis); // Entire application scope
}

%>
</body>
</html>