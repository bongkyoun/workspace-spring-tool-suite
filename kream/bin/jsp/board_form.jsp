<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link id="mainStyles" rel="stylesheet" media="screen" href="css_board/styles.min.css">
<link rel="stylesheet" media="screen" href="css_board/vendor.min.css">

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/test.css" type="text/css">
<meta charset="UTF-8">

<style type="text/css">

	
	#ma1{
		margin-left: 600px;
		margin-right: 700px;
	}
</style>

<title>Insert title here</title>
</head>
<body>
<!-- Offcanvas Menu Begin -->
    
    <jsp:include page="top.jsp" />
    
    <!-- Offcanvas Menu End -->
<div>
<jsp:include page="header.jsp" />
</div>
    <section class="breadcrumb-option">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="breadcrumb__text">
                        <h4>Q&A</h4>
                        <div class="breadcrumb__links">
                            <a href="./index.html">Q&A</a>
                            <span>Q&A</span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
 <div id = "ma1">
<h3 class="padding-top-2x">QNA 글쓰기</h3>
            <p class="text-muted mb-30">&nbsp;&nbsp; QNA -> QNA</p>
            <form class="row1" method="post">
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="help_name">아이디</label>
                  <input class="form-control form-control-rounded" type="text" id="help_name" required>
                </div>
              </div>
              <div class="col-sm-6">
                
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="help_subject">제목</label>
                  <input class="form-control form-control-rounded" type="text" id="q_title" required>
                </div>
              </div>
              
              <div class="col-12">
                <div class="form-group">
                  <label for="help_question">내용 </label>
                  <textarea class="form-control form-control-rounded" id="q_content" rows="8" required></textarea>
                </div>
              </div>
              <div class="col-12 text-right">
                <button class="btn btn-primary btn-rounded" type="submit">글쓰기</button>
              </div>
            </form>
            </div>
            
		<div>
			<jsp:include page="footer.jsp" />
		</div>
</body>
</html>