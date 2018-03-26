<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %> 
<%@include file="/WEB-INF/views/layout/header.jsp" %>
<section class="container">
	<div class="row">
		<table class="table table-hover">
    		<thead>
      			<tr>
        			<th class="col-md-2">IDX</th>
        			<th class="col-md-4">Title</th>
        			<th class="col-md-2">User</th>
        			<th class="col-md-1">HIT</th>
        			<th class="col-md-3">date</th>
      			</tr>
    		</thead>
    		<tbody>
    		 <c:choose>
            <c:when test="${fn:length(list) > 0}">
                <c:forEach items="${list }" var="row">
                    <tr>
                        <td>${row.IDX }</td>
                        <td><a href="<c:url value='/BBS/read/' />${row.IDX}"> ${row.TITLE }</a></td>
                        <td>${row.name}</td>
                        <td>${row.HIT_CNT }</td>
                        <td>${row.CREA_DTM }</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="4">조회된 결과가 없습니다.</td>
                </tr>
            </c:otherwise>
        </c:choose>
				<td colspan="4">
				<a href="/hello_jsp/BBS/content?page=1"><<</a>
				<a href="/hello_jsp/BBS/content?page="></a> 
				<a href="/hello_jsp/BBS/content?page=">>></a>
				</td>
			</tr>
			<tr>
				<td colspan="3"><a class="btn btn-default" href="/study/BBS/insert">글쓰기</a></td>
			</tr>
    		</tbody>
  		</table>
	</div>
</section>
</body>
</html>