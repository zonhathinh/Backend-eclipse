	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8" isELIgnored = "false"%>
	
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
	     margin-top: 50px;
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
	 /* Trong CSS */
	.btn-signup {
	    width: 100px; /* Độ rộng mong muốn */
	    margin-left: auto; /* Canh chỉnh nút ở giữa trang */
	    margin-right: auto;
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
	        <h2 class="text-center mb-4">Sign Up</h2>
	           
	        <form action="signup" method="post">
	       
	            <div class="form-group">
	                <label for="fullname">Full Name</label>
	                <input type="text" class="form-control" id="fullname" name="fullname" required>
	            </div>
	            <div class="form-group">
	                <label for="email">Email address</label>
	                <input type="email" class="form-control" id="email" name="email" required>
	            </div>
	            <div class="form-group">
	                <label for="password">Password</label>
	                <input type="password" class="form-control" id="password" name="password" required>
	            </div>
	            <div class="form-group">
	                <label for="confirmPassword">Confirm Password</label>
	                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
	                <p class="text-danger">${mess}</p>
	            </div>
	            <button type="submit" class="btn btn-primary btn-block btn-signup">Sign Up</button>
	        </form>
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