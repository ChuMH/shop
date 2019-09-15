<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	 <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>E Shop Cart Widget A Flat Responsive Widget Template ::
	W3layouts</title>

<!-- For-Mobile-Apps -->
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="E Shop Cart Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Android Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //For-Mobile-Apps -->

<!-- Custom-Theme-Files -->
<link rel="stylesheet" href="cart/css/style.css" type="text/css"
	media="all" />
<!-- //Custom-Theme-Files -->

<!-- Remove-Item-JavaScript -->
<script type="text/javascript" src="cart/js/jquery-1.11.1.min.js"></script>
<script>
	$(document).ready(function(c) {
		$('.alert-close1').on('click', function(c) {
			$('.close1').fadeOut('slow', function(c) {
				$('.close1').remove();
			});
		});
	});
</script>
<script>
	$(document).ready(function(c) {
		$('.alert-close2').on('click', function(c) {
			$('.close2').fadeOut('slow', function(c) {
				$('.close2').remove();
			});
		});
	});
</script>
<script>
	$(document).ready(function(c) {
		$('.alert-close3').on('click', function(c) {
			$('.close3').fadeOut('slow', function(c) {
				$('.close3').remove();
			});
		});
	});
</script>
<!-- //Remove-Item-JavaScript -->

</head>

<!-- Body-Starts-Here -->
<body>

	<h1>E SHOP CART WIDGET</h1>

	<!-- Content-Starts-Here -->
	<div class="container">

		<!-- Mainbar-Starts-Here -->
		<div class="main-bar">
			<div class="product">
				<h3>商品名称</h3>
			</div>
			<div class="quantity">
				<h3>数量</h3>
			</div>
			<div class="price">
				<h3>价格</h3>
			</div>
			<div class="clear"></div>
		</div>
		<!-- //Mainbar-Ends-Here -->
		
		<c:forEach items="${cartlist}" var="p">
		<!-- Items-Starts-Here -->
		<div class="items">

			<!-- Item1-Starts-Here -->
			<div class="item1">
				<div class="close1">
					<!-- Remove-Item -->
					<div class="alert-close1"></div>
					<!-- //Remove-Item -->
					<div class="image1">
						<img src=${p.imageUrl } alt="item1">
					</div>
					<div class="title1">
						<p>${p.description}</p>
					</div>
					<div class="quantity1">
						<form action="action_page.php">
							<input type="number" name="quantity" min="1" max="10" value="1">
						</form>
					</div>
					<div class="price1">
						<p>${p.productPrice }</p>
					</div>
					<div class="clear"></div>
				</div>
			</div></c:forEach>
		</div>
		<div class="checkout">
			<div class="discount">
				<span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			</div>
			<div class="add"></div>
			<div class="checkout-btn">
				<a href="${pageContext.request.contextPath }/cart/account.do">结算</a>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<center>
	<a href="${pageContext.request.contextPath }/cart/showcart.do?pageNo=1">首页</a>
	<a href="${pageContext.request.contextPath }/cart/showcart.do?pageNo=${currentPage-1 }">上一页</a>
	<a href="#">当前第${currentPage }页</a>
	<a href="#">共${totalPageCount}页</a>
	<a href="${pageContext.request.contextPath }/cart/showcart.do?pageNo=${currentPage+1 }">下一页</a>
	<a href="${pageContext.request.contextPath }/cart/showcart.do?pageNo=${totalPageCount}">尾页</a>
	</center>
</body>
</html>