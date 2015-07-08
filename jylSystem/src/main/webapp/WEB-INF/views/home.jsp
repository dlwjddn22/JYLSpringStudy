<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" scope="request" />
<html>
<head>
	<title>Home</title>
	<script type="text/javascript" src="/js/jquery-1.11.3.js"></script>
	<script>
	$(document).ready(function(){
		$("p").text("123");
	})
	</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. 컨플릭트난거 수정완료 윤성욱</P>
<h1>컨플릭트 해결 방법.. </h1>
1) 컨플릭트난 파일 오픈
2) 수정완료한 후.
3) add index (add index를 해야 커밋 가능해짐.) 
4) commit
5) push 

확인해봐야될 사항.. 

커밋+푸시 전 fetch를 안하면 어떻게 될것인가..
</body>
</html>
