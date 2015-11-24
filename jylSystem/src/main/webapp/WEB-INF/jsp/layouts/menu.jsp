<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<tiles:importAttribute name = "menus"/>
<c:forEach var = "menu" items = "${menus}">
<a href="${menu.menuUrl}">${menu.menuNm}</a>
<br>
</c:forEach>
