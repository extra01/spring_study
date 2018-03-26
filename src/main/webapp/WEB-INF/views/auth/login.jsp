<%@include file="/WEB-INF/views/layout/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<section class="container">
	<div class="row">
		<%if(request.getAttribute("error")!=null){%>
		<div class="col-md-4 col-md-offset-5"><%=request.getAttribute("error") %></div>
		<%}%>
	</div>
	<div class="row">
		<form action="/hello_jsp/member/login" method="post" class="form-horizontal">
  			<div class="form-group">
    			<label for="inputEmail3" class="col-sm-2  col-sm-offset-3 control-label">Email</label>
    			<div class="col-sm-4">
     				<input required type="email" name="email" class="form-control" id="inputEmail3" placeholder="Email">
    			</div>
 			</div>
  			<div class="form-group">
    			<label for="inputPassword3" class="col-sm-2 col-sm-offset-3 control-label">Password</label>
    			<div class="col-sm-4">
      				<input required type="password" name="pw" class="form-control" id="inputPassword3" placeholder="Password">
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-5 col-sm-7">
      				<div class="checkbox">
        				<label>
          					<input type="checkbox"> Remember me
        				</label>
      				</div>
    			</div>
  			</div>
  			<div class="form-group">
    			<div class="col-sm-offset-5 col-sm-7">
      				<button type="submit" class="btn btn-default">Sign in</button>
      				<a class="btn btn-default">Register</a>
    			</div>
  			</div>
		</form>
	</div>
</section>