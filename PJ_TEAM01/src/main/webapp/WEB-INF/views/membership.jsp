 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@10/swiper-bundle.min.css" />
	<style>
		<%@include file="/resources/static/css/common.css" %>
		<%@include file="/resources/static/css/header.css" %>
		<%@include file="/resources/static/css/membership_Page.css" %>
		<%@include file="/resources/static/css/footer.css" %>		
	</style>
    
</head>

<body>
<div class="wrapper">
        <!-- 메인 -->
        <header>
            <div class="top-header">
                <a href=<c:url value="/indexlog" />><img class="logo" src="${pageContext.request.contextPath}/resources/static/img/로고.png" alt=""></a>
                <form action="<c:url value='/music/search.do' />" method="get"> 
                <div class="search_box">
                    <div class="search_btn" id="searchButton">SEARCH</div>
                    <input id="searchInput" type="text" name="searchText" placeholder="듣고 싶은 노래를 검색하세요!" >
                    <img id="searchIcon" src="${pageContext.request.contextPath}/resources/static/img/search.png" alt="" onclick="searchMusic()" >
                </div>
                </form>
                <ul>
                    <li><a href=<c:url value="/member/membership" />
                            style="color:rgb(92, 115, 6); font-family: 'SDSamliphopangche_Basic'; font-size: 19px;"><img
                                src="${pageContext.request.contextPath}/resources/static/img/add.png" alt=""> 멤버십가입</a></li>
                    <li><a href=""><img src="${pageContext.request.contextPath}/resources/static/img/english.png" alt="">ENGLISH</a></li>
                </ul>
            </div>
        </header>
        <nav>
            <div class="mobilemenu">
                <span href="" class="material-symbols-outlined">menu
                    <ul class="wa">
                        <li><a href="">수박차트</a></li>
                        <li><a href="">수박DJ</a></li>
                        <li><a href="">수박TV</a></li>
                        <li><a href="">수박매거진</a></li>
                        <li><a href="./QnA_Page.html">공지사항</a></li>
                        <li><a href="">마이페이지</a></li>
                    </ul>
                </span>
            </div>
            <div class="navi">
                <div class="Menu_left">
                    <ul class="one--depth">
                        <li>
                            <a href="">수박차트</a>
                            <ul class="two--depth">
                                <li><a href="./TOP100.html">국내TOP100</a></li>
                                <li><a href="">해외TOP100</a></li>
                                <li><a href="">최신음악</a></li>
                                <li><a href="">장르음악</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="">수박DJ</a>
                            <ul class="two--depth">
                                <li><a href="">#투데이</a></li>
                                <li><a href="">테마장르</a></li>
                                <li><a href="">인기선곡</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="">수박TV</a>
                            <ul class="two--depth">
                                <li><a href="">뮤직비디오</a></li>
                                <li><a href="">수박방송</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="">수박매거진</a>
                            <ul class="two--depth">
                                <li><a href="./magazine.html">오늘의매거진</a></li>
                                <li><a href="">완결매거진</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="Menu_right">
                    <ul class="one--depth">
                        <li>
                            <a href="">공지사항</a>
                            <ul class="two--depth">
                                <li><a href="">공지사항</a></li>
                                <li><a href="">QnA</a></li>
                                <li><a href="">자주하는질문</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="">마이페이지</a>
                            <ul class="two--depth">
                                <li><a href=<c:url value="/member/mypage" />>정보수정</a></li>
                                <li><a href="">마이리스트</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>

        </nav>
        <div class="header_line"></div>
        <section class="ms_pay">
            <span class="title">멤버십 가입</span>
            <div>
                <div class="subscribe_1">
                    <span style="font-size:27px; color:rgb(92, 115, 6);">첫 구독 1개월 무료!</span>
                    <span>무제한 스트리밍</span>
                    <span id="price">월 6,900원</span>
                    <img class="sub_img" src="${pageContext.request.contextPath}/resources/static/img/subscribe.png" alt="">
                </div>
                <div class="subscribe_2">
                    <span>무제한 스트리밍</span>
                    <span>오프라인 듣기</span>
                    <span id="price">월 9,900원</span>
                    <img class="sub_img" src="${pageContext.request.contextPath}/resources/static/img/subscribe.png" alt="">
                </div>
            </div>

        </section>
        <section class="ms_benefit">
            <span class="title">멤버십의 특별한 혜택!</span>
            <div id="ben_img">
                <div class="benefit_icon"><img src="${pageContext.request.contextPath}/resources/static/img/crew.png" alt=""></div>
                <div class="benefit_icon"><img src="${pageContext.request.contextPath}/resources/static/img/welcom_kit.png" alt=""></div>
                <div class="benefit_icon"><img src="${pageContext.request.contextPath}/resources/static/img/birthday.png" alt=""></div>
                <div class="benefit_icon"><img src="${pageContext.request.contextPath}/resources/static/img/movie_ticket.png" alt=""></div>
            </div>
            <span id="title1">WATERMELON CREW</span>
            <span id="title2">BIRTHDAY COUPON</span>
            <span id="title3">WELCOME KIT</span>
            <span id="title4">MOVIE TICKET</span>
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
    
    <!-- axios cdn -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/axios/1.5.0/axios.min.js" integrity="sha512-aoTNnqZcT8B4AmeCFmiSnDlc4Nj/KPaZyB5G7JnOnUEkdNpCZs1LCankiYi01sLTyWy+m2P+W4XM+BuQ3Q4/Dg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
	<script>
    const subscribe1_el = document.querySelector('.subscribe_1');
    subscribe1_el.addEventListener('click', function () {
        axios.get('http://localhost:8080/app/membership/request1')
        .then(response=>{
            console.log("request1 Success");
            console.log(response);
            console.log(response.data);
            console.log(response.data.next_redirect_pc_url);
            window.open(response.data.next_redirect_pc_url, "Payment","width=400,height=700");
        })
        .catch(error=>{});
    });

    
    const subscribe2_el = document.querySelector('.subscribe_2');
    subscribe2_el.addEventListener('click', function () {
        axios.get('http://localhost:8080/app/membership/request2')
        .then(response=>{
            console.log("request2 Success");
            console.log(response);
            console.log(response.data);
            console.log(response.data.next_redirect_pc_url);
            window.open(response.data.next_redirect_pc_url, "Payment","width=400,height=700");
        })
        .catch(error=>{});
    });
	</script>
    


</html>