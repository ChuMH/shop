<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>Freight Shipping Form Flat Responsive Widget Template ::
	w3layouts</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="orders/css/font-awesome.css" rel="stylesheet">
<link href="orders/css/style.css" rel="stylesheet" type="text/css"media="all" />
</head>
<body>
	<!-- banner -->
	<div class="center-container">
		<div class="w3ls-agileinfo">
			<h1>创建订单</h1>
		</div>
		<div class="bg-agile">
			<h3>订单联系方式</h3>
			<div class="login-form">
				<form action="#" method="post">
					<input type="text" name="Name" placeholder="姓名" /> <input
						type="text" name="Number" placeholder="联系电话" /> <input
						type="email" name="Email" placeholder="邮箱" />
					<h3>收货地址</h3>
					<div class="left-w3-agile">
						<select class="form-control">
							<option>中国</option>
						</select> <input type="text" name="Region" placeholder="省份" />
					</div>
					<div class="right-agileits">
						<input type="text" name="City" placeholder="城市" /> <input
							type="text" name="Zip/postal code" placeholder="邮编" />
					</div>
					<textarea name="message" value="Address" placeholder="详细地址"></textarea>
					<input type="submit" value="提交订单">
				</form>
			</div>
		</div>
	</div>
</body>
</html>