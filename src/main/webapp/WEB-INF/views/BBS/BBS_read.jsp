<%@include file="/WEB-INF/views/layout/header.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<section class="container">
	<div class="row">
	<div class="col-md-6 col-md-offset-3">
	<table class="table">
        <colgroup>
            <col width="15%"/>
            <col width="35%"/>
            <col width="15%"/>
            <col width="35%"/>
        </colgroup>
        <caption>게시글 상세</caption>
        <tbody>
            <tr>
                <th scope="row">글 번호</th>
                <td>${BBS.IDX }</td>
                <th scope="row">조회수</th>
                <td>${BBS.HIT_CNT }</td>
            </tr>
            <tr>
                <th scope="row">작성자</th>
                <td>${BBS.name }</td>
                <th scope="row">작성시간</th>
                <td>${BBS.CREA_DTM }</td>
            </tr>
            <tr>
                <th scope="row">제목</th>
                <td colspan="3">${BBS.TITLE }</td>
            </tr>
            <tr>
                <td colspan="4">${BBS.CONTENTS }</td>
            </tr>
        </tbody>
    </table>
	</div>
  		</div>	
	<div class="row">
		<div class="col-md-12">
			<a class="btn btn-default" href="/study/BBS/">목록</a>
			<a class="btn btn-default" href="<c:url value='/BBS/update/${BBS.IDX}'/>" >수정</a>
			<a class="btn btn-default" href="<c:url value='/BBS/delete/${BBS.IDX}'/>">삭제</a>
			
		</div>
	</div>
</section>