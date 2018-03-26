<%@include file="/WEB-INF/views/layout/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<section class="container">
		<form action="/study/BBS/insert" method="post">
		<div class="row">
			<div class="form-group col-sm-7 col-sm-offset-3">
   				<label for="">Title</label>
    			<input type="text" class="form-control" name="title" placeholder="Title" required>
  			</div>
  		</div>
  		<div class="row">
  			<div class="form-group col-sm-7 col-sm-offset-3">
  				<label>content</label>
  				<textarea class="form-control" rows="3" required name="content"></textarea>
  			</div>
  		</div>	
  		<div class="row">
  			<div class="col-sm-md-7 col-sm-offset-3">
  				<button type="submit" class="btn btn-default">완료</button>
  				<a class="btn btn-default" href="/study/BBS/">취소</a>
  			</div>
  		</div>
		</form>
</section>