<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored = "false"%>
	<%@ page import="com.cgm.hello_web_app.eitities.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="com.cgm.hello_web_app.eitities.User" %>
<% 
    
User auth =(User) request.getSession().getAttribute("auth");
if(auth!=null){
	
	response.sendRedirect("home");
}%>
<!DOCTYPE html>
<!--
	ustora by freshdesignweb.com
	Twitter: https://twitter.com/freshdesignweb
	URL: https://www.freshdesignweb.com/ustora/
-->
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ustora Demo</title>

<!-- Google Fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,100'
	rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet" href="css/font-awesome.min.css">

<!-- Custom CSS -->
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="css/responsive.css">
<style>
    /* CSS tùy chỉnh */
    .container{
     margin-top: 150px;
    }
    .card-header.text-center {
    font-size: 50px;
    font-weight: bold;
}
    .form-group {
        font-size: 12px; /* Kích thước font */
        padding: 10px 10px; /* Kích thước padding */
        height: auto; /* Chiều cao */
  
    }
    .form-group label{
      
      width:405px;
      margin-left:355px;
      font-weight: bold;
font-size: 22px;
    }
    .form-group input{
      height:55px;
      width:405px;
      margin-left:355px;
       border: 1px solid black; /* Viền màu và độ rộng */
    box-sizing: 1px; /* Phân biệt kích thước */
    }
    .text-danger{
    margin-left:355px;
   margin-top:5px;
    }
    .custom-btn{
    margin-left:365px;
    }
</style>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>


<div class="container">
    <div class="card w-50 mx-auto my-5">
        <div class="card-header text-center">
            User login
        </div>
      
     <div class="card-body">
    <form class="form" action="user-login" method="post">
        <div class="form-group">
            <label>Email</label>
            <%-- <input type="email" value="${email}" class="form-control form-control-sm" name="login-email" placeholder="Enter Your email" required> --%> 
       <input type="email" value="${not empty email ? email : cookie['userC'].value}" class="form-control form-control-sm" name="login-email" placeholder="Enter Your email" required>
       
        </div>
        <div class="form-group">
            <label>Password</label>
            <input type="password" value="${cookie['passC'].value}" class="form-control form-control-sm" name="login-password" placeholder="*********" required>
            <p class="text-danger">${mess}</p>     
          
        </div>
        
         <div class="form-group">
            <label>Remember</label>
            <input type="checkbox"  name="remember" value="ON">
        </div>
        
        
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>	
        <a href="signup.jsp" class="custom-btn">New Account</a>
    </form>
</div>
    </div>
</div>




	
	<!-- End footer bottom area -->

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