<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <title>JYLSpringStudy</title>
  <script type="text/javascript" src="/js/jquery-1.11.3.js" ></script>
  <link rel="stylesheet" href="/css/default.css">
 </head>
 <body>
<div id="header">
	<tiles:insertAttribute name="header"/>
</div>
<div id="middle">
	<div id="menu">
	 	<tiles:insertAttribute name="menu"/>
	</div>
	<div id="body">
	 	<tiles:insertAttribute name="body" />
	</div>
</div>
<div id="footer">
 	<tiles:insertAttribute name="footer" />
</div>
 </body>
</html>