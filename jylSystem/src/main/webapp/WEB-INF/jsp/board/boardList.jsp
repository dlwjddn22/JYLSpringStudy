<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<script language="javascript">
	function boardWrite()
	{
		location.href = "/board/boardWrite";
	}
	function goModify(usr_id)
	{
		location.href = "/board/boardModify?usr_id="+usr_id;
	}
	function goDelete(usr_id)
	{
		if(confirm("삭제 하시겠습니까?"))
		{
			location.href = "/board/boardDelete?usr_id="+usr_id;
		}
	}
</script>
</head>
<body>
<h1>회원 목록 <small>${name}님 반갑습니다.</small></h1>
<p>현재 총 ${count}명이 등록 되었습니다.
<table class="table table-hover">
    <colgroup>
        <col width="30%"/>
        <col width="30%"/>
        <col width="30$"/>
        <col width="10%"/>
    </colgroup>
    <thead>
        <tr>
            <th scope="col">회원ID</th>
            <th scope="col">회원명</th>
            <th scope="col">비밀번호</th>
            <th scope="col">삭제</th>
        </tr>
    </thead>
    <tbody>
        <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list}" var="row">
                    <tr style="cursor:hand">
                        <td><a href="#" onClick="goModify('${row.USR_ID }')">${row.USR_ID }</a></td>
                        <td>${row.USR_NM }</td>
                        <td>${row.PWD }</td>
                        <td><a href="#" onclick="goDelete('${row.USR_ID}')">X</a></td>
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
<p class="text-right">
	<button type="button" class="btn btn-primary" onClick="javascript:boardWrite()">회원등록</button>
</p>
</body>
</html>