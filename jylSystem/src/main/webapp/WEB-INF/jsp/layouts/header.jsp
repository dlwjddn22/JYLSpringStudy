<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp" %>
head.jsp
<br />
<security:authorize ifAnyGranted="ROLE_USER">
	<security:authentication property="name"/>님이 접속하셨습니다.
	<a href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a>
</security:authorize>