<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored = "false"%>
	<%@ page import="com.cgm.hello_web_app.eitities.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.cgm.hello_web_app.dao.*" %>
<%@ page import="com.cgm.hello_web_app.eitities.Product1" %>
<%@ page import="com.cgm.hello_web_app.eitities.User" %>
<%
User auth =(User) request.getSession().getAttribute("auth");
if(auth == null || !"admin@gmail.com".equals(auth.getEmail())) {
    response.sendRedirect("home");
}
%>

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
<title>AddProduct</title>

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
    .form-group select{
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
<a href="admin.jsp">Home</a>

<div class="container">
    <div class="card w-50 mx-auto my-5">
        <div class="card-header text-center">
            EditBook
            
        </div>
      
     <div class="card-body">
     
     <%

     int id=Integer.parseInt(request.getParameter("id"));

    ProductDAO dao = new ProductDAO(DbCon.getConnection());
    Product1 b=dao.getProductId(id);
%>
     
     
    <form class="form" action="edit-product" method="post" 
    enctype="multipart/form-data">
   
        <div class="form-group">
            
             <input type="text" name="id" value="<%=b.getId()%>">
            <label>NameProduct</label>
            <%-- <input type="email" value="${email}" class="form-control form-control-sm" name="login-email" placeholder="Enter Your email" required> --%> 
       <input type="text" value="<%=b.getName()%>"  class="form-control form-control-sm" name="productname"  required>
    
        </div>
        <div class="form-group">
            <label>Price</label>
            <input type="number" value="<%=b.getPrice() %>" class="form-control form-control-sm" name="price" placeholder="Giá tiền" required> 
                
          
        </div>
         <!-- <div class="form-group">
            <label>ProductCategory</label>
            <select name="categories" class="form-control form-control-sm" >
            <option selected>--select</option>
            <option value="New-product">Sản phẩm mới</option>
            </select>
                
          
        </div> -->
         <div class="form-group">
            <label>ProductStatus</label>
            <select name="status" class="form-control form-control-sm" >
            <%if("Active".equals(b.getStatus())){
        	   %>
        	    <option value="Active">Active</option>
        	       <option value="Inactive">Inactive</option>
        	   <%	 
           }else{%>
        	   <option value="Inactive">Inactive</option>
        	    <option value="Active">Active</option>
           <%}
           
           %> 
            
            </select>
                
          
        </div>
         <!--  <div class="form-group">
            <label>Upload photho</label>
            <input type="file"  class="form-control-file" name="bimg"  required>
                
          
        </div> -->
        
        
        <div class="text-center">
            <button type="submit" class="btn btn-primary">Edit</button>
        </div>	
       
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