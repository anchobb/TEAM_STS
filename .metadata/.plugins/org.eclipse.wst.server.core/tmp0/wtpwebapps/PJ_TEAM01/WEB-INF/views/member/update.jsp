<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE PAGE</title>
<style>
		<%@include file="/resources/static/css/common.css" %>
		<%@include file="/resources/static/css/header.css" %>
		<%@include file="/resources/static/css/update_Page.css" %>
		<%@include file="/resources/static/css/footer.css" %>		
</style>
</head>
<body>

<div class="wrapper">
<header>
   <div class="log-header">
       <a href="${pageContext.request.contextPath}/indexlog" /><img class="logo" src="${pageContext.request.contextPath}/resources/static/img/로고.png" alt=""></a>
       <ul>
          <li><a href=""><img  src="${pageContext.request.contextPath}/resources/static/img/english.png" alt="">ENGLISH</a></li>
       </ul>
    </div>
    <div class="logheader_line"></div>
</header>

<section class="update">
    <h1>내 정보를 수정 해보세요!</h1>
   	<form action="${pageContext.request.contextPath}/member/update" method="post">
        <span class="title" >ID</span><hr/><input type="text" name="id" value="<sec:authentication property="principal.username" />" /><br /> 
        <span class="title">NAME</span><hr/><input type="text" name="name" value="<sec:authentication property="principal.name" />" /><br /> 
        <span class="title">PW</span><hr/><input type="password" name="pw" value="<sec:authentication property="principal.password" />" /><br />
        <span class="title">ADDR</span><hr/><input type="text" name="addr" value="<sec:authentication property="principal.addr" />" /><br />
        <span class="title">PHONE</span><hr/><input type="text" name="phone" value="<sec:authentication property="principal.phone" />" />
        <input id="update_btn" type="submit" value="수정하기" />
    </form>

</section>


<footer>
    <div class="footer_line"></div>
    <div>
        <ul class="footer_menu">
           <li><a href="">이용약관</a></li>
           <li><a href="">고객센터</a></li>
           <li><a href="">제휴/프로모션</a></li>
           <li style="width:170px"><a href=""> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;개인정보처리방침</a></li>
        </ul>
    </div>
    <p></p>
    <div class="Site_info">
        <img id="footer_logo" src="${pageContext.request.contextPath}/resources/static/img/로고.png" alt="">
        <span class="Sitename">(주)WATERMELON MUSIC</span>
        <span>대구광역시 중구 중앙대로 366 반월센트럴타워 10층</span>
        <span>대표이사 : 윤치연, 김예솔, 이헌지, 최정기</span>
        <span>사업자등록번호 : 024-04-02023</span>
        <br>
        <span>문의전화 : 1544-1111 (평일 09:00-18:00)</span>
        <span>WATERMELON MUSIC으로 음악과 함께하는 즐거운 하루 보내세요!</span>
     </div>
</footer>
</div>

</body>
</html>