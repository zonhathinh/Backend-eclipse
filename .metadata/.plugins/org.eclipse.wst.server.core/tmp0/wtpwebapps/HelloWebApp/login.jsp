<%-- <%@ page import="com.cgm.hello_web_app.eitities.User" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cgm.hello_web_app.eitities.*" %>
    <% 
    
User auth =(User) request.getSession().getAttribute("auth");
if(auth!=null){
	
	response.sendRedirect("home");
} --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="logincontainer">
<div class="cardd w-50 mx -auto my-5">
<div class="cardd-header text-center">
User login
</div>
<div class="cardd-body">
<form action="" method="post">
<div class="formm-group">

<label>Email</label>
<input type="email" class="form-controll" name="login-email" placeholder="Enter Your email" required >
</div>

<div class="formm-group">

<label>Password</label>
<input type="password" class="form-controll" name="login-password" placeholder="*********" required >
</div>
<div class="text-centerr">
<button type="submit" class="btn btn-primary">Login</button>
</div>
</form>
</div>
</div>
</div>

















































<!-- Latest jQuery form server -->
	<script src="https://code.jquery.com/jquery.min.js"></script>

	<!-- Bootstrap JS form CDN -->
	<script
		src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

	<!-- jQuery sticky menu -->
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.sticky.js"></script>

	<!-- jQuery easing -->
	<script src="js/jquery.easing.1.3.min.js"></script>

	<!-- Main Script -->
	<script src="js/main.js"></script>

	<!-- Slider -->
	<script type="text/javascript" src="js/bxslider.min.js"></script>
	<script type="text/javascript" src="js/script.slider.js"></script>
</body>
</html>