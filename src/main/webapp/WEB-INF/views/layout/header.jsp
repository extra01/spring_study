<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- jqury -->
<script
  src="https://code.jquery.com/jquery-3.3.1.min.js"
  integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
  crossorigin="anonymous"></script>
  
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">


<title>index title</title>
<style>
</style>
</head>
<body>
<header class="container">
	<div class="row">
		<div class="col-md-12" style="text-align:right">
			<%
			if(session.getAttribute("user") != null){
				//member_dto dto = (member_dto)session.getAttribute("member");
			%>
			<a href="<c:url value='/auth/logout'/>">logout</a>
			<%}else{ %>
			<a href="<c:url value='/auth/login'/>">login</a> <span>/</span>
			<a href="<c:url value='/auth/register'/>">register</a>
			<%} %>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12 header">
			<h1>Wellcome to HelloWorld</h1>
		</div>
	</div>
	<div class="row navbar navbar-default menu">
		<div class="container-fluid">
    		<ul class="nav navbar-nav">
      			<li><a href="/study/BBS/">BBS</a></li>
    		</ul>
  		</div>
	</div>
</header>
