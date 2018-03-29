<%@include file="/WEB-INF/views/layout/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<section class="container">
		<form action="<c:url value='/BBS/update/${BBS.IDX }'/>" method="post">
		<input type="hidden" name="idx" value="${BBS.IDX }">
		<div class="row">
			<div class="form-group col-sm-7 col-sm-offset-3">
   				<label for="">Title</label>
    			<input type="text" value="${BBS.TITLE} " class="form-control" name="title" placeholder="Title" required>
  			</div>
  		</div>
  		<div class="row">
  			<div class="form-group col-sm-7 col-sm-offset-3">
  				<label>content</label>
  				<textarea class="form-control" rows="3" required name="content">${BBS.CONTENTS}</textarea>
  			</div>
  		</div>	
  		<div class="row">
  			<div class="col-sm-md-7 col-sm-offset-3">
  				<button type="submit" class="btn btn-default">완료</button>
  				<a class="btn btn-default" href="<c:url value='/BBS/read/${BBS.IDX }'/>">취소</a>
  			</div>
  		</div>
		</form>
</section>