<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
head.jsp
<br />
<security:authorize ifAnyGranted="ROLE_USER">
	<security:authentication property="name"/>님이 접속하셨습니다.
	<a href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a>
</security:authorize>