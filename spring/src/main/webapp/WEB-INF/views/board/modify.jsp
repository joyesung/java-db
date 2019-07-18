<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/common/nav.jsp"></jsp:include>
	<form action="<%=request.getContextPath()%>/board/modify" method="post">
	<input type="hidden" name="num" value="${board.num}">
	<div class="container-fluid">
		<div class="form-group">
		  <label>제목</label>
		  <input type="text" class="form-control" name="title" value="${board.title}" >
		</div>
		<div class="form-group">
		  <label>작성자</label>
		  <input type="text" class="form-control" name="writer" value="${board.writer}" readonly>
		</div>
		<div class="form-group">
		  <label>등록일</label>
		  <input type="text" class="form-control" name="registered" value="${board.registered}" >
		</div>
		<div class="form-group">
			<label>내용</label>
			<textarea rows="10" class="form-control" name="contents" >"${board.contents}"</textarea>
		</div>
		<div class="form-group">
		  <label>조회수</label>
		</div>
		<div class="form-group">
		  <label>첨부파일</label>
		  <input type="text" class="form-control" name="file" value="${board.file}" >
		</div>
	   		<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}">
		  		<button type="submit" class="btn btn-danger">수정</button>
	   		</a>
	   		<a href="<%=request.getContextPath()%>/board/register?num=${board.num}">
		  		<button type="submit" class="btn btn-danger">등록</button>
	   		</a>
	   		<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}">
		  		<button type="submit" class="btn btn-danger">삭제</button>
	   		</a>
		</div>
		</form>
</body>
</html>