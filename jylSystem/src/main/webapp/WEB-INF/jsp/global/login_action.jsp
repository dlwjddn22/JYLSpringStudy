<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String usr_id = request.getParameter("usr_id");
String pwd    = request.getParameter("pwd");

out.println(usr_id);
out.println(pwd);

//id존재여부 체크(db)

//id 존재시 세션 set

//id 미존재시 메세지창 뿌려주고 index.jsp로 돌려보냄

%>