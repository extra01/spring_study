<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@include file="/WEB-INF/views/layout/header.jsp" %>

<%@ page isELIgnored="false" %> 
<section class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-5" id="error" style="color:red">
		<% if(request.getAttribute("ms") != null){ %>
			<%=request.getAttribute("ms") %>
		<%} %>
		</div>
	</div>
	<div class="row">
		<form name="register" action="<c:url value='/auth/register'/>" method="post" class="form-horizontal" onsubmit="return check()">
  			<div class="form-group">
    			<label for="inputEmail3" class="col-sm-2  col-sm-offset-3 control-label">Email</label>
    			<div class="col-sm-4">
     				<input required type="email" name="email" class="form-control" id="inputEmail3" placeholder="Email">
    			</div>
 			</div>
 			<div class="form-group">
    			<label for="inputEmail3" class="col-sm-2  col-sm-offset-3 control-label">Name</label>
    			<div class="col-sm-4">
     				<input required type="text" name="name" class="form-control" id="inputEmail3" placeholder="Name">
    			</div>
 			</div>
  			<div class="form-group">
    			<label for="inputPassword3" class="col-sm-2 col-sm-offset-3 control-label">Password</label>
    			<div class="col-sm-4">
      				<input required type="password" name="pw" class="form-control" id="inputPassword3" placeholder="Password">
    			</div>
  			</div>
  			<div class="form-group">
    			<label for="inputPassword3" class="col-sm-2 col-sm-offset-3 control-label">Password</label>
    			<div class="col-sm-4">
      				<input required type="password" name="pw2" class="form-control" id="inputPassword3" placeholder="Password">
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
<script>
function check(){
	if(register.pw.value != register.pw2.value){
		var error = document.getElementById("error");
		error.innerHTML = "비번 다름";
		//alert("비번다름");
		return false;
	}else{
		return true;
	}
	//var t=	docment.GetElementById('test');
	//console.log(t);
return false;
}

</script>