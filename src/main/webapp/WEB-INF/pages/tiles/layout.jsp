<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>    

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

  <div class="container">
    <div class="table-responsive">
      <table class="table" >
		<tr>
		  <td height="100" colspan="2"  style="background-color: blue; border: thick;font: bold;">
		    <tiles:insertAttribute name="header"/>
		  </td>
		</tr>
		<tr>
		   <td height="250" style="background-color: orange; border: thick;font: bold;">
		     <tiles:insertAttribute name="menu"/>
		   </td>
		   <td height="350" width="400" style="background-color: orange; border: thick;font: bold;">
		      <tiles:insertAttribute name="title" /><br>
		      <tiles:insertAttribute name="body"/>
		  </td>
		</tr>
		<tr>
		  <td height="100"  colspan="2" style="background-color: blue; border: thick;font: bold;">
		     <tiles:insertAttribute name="footer"/>
		  </td>
		</tr>
		</table>
    </div>
  </div>
 
</body>
</html>