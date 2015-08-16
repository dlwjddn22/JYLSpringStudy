<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ko">
 <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <title>JYLSpringStudy</title>
  <script type="text/javascript" src="/js/jquery-1.11.3.js" ></script>
  <script type="text/javascript" src="/js/bootstrap.min.js"></script><!-- 부트스트랩js -->
  <link rel="stylesheet" href="/css/default.css">
  <link rel="stylesheet" href="/css/bootstrap.min.css"><!-- 부트스트랩css -->
  <link rel="stylesheet" href="/css/bootstrap-theme.min.css"><!-- 부트스트랩css theme -->
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