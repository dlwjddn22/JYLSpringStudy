<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<script language="javascript">

	$(document).ready(function(){
		$("h2").text("jqeury에 의해 변경되었다");
	});
</script>
</head>
<body>
<h2>게시판 목록</h2>
<table style="border:1px solid #ccc" >
    <colgroup>
        <col width="10%"/>
        <col width="*"/>
        <col width="15%"/>
        <col width="20%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">회원ID</th>
            <th scope="col">회원명</th>
            <th scope="col">영문명</th>
            <th scope="col">비밀번호</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td><x:if></x:if> ${row.USR_ID }
                        </td>
                        <td>${row.USR_NM }</td>
                        <td>${row.USR_ENG_NM }</td>
                        <td>${row.PWD }</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
         
    </tbody>
</table>
</body>
</html>