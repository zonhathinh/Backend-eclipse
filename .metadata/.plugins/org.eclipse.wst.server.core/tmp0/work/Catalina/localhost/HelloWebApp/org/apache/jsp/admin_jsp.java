/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2024-05-09 08:45:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cgm.hello_web_app.eitities.*;
import com.cgm.hello_web_app.eitities.User;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1426003893000L));
    _jspx_dependants.put("jar:file:/C:/laptrinhlop/resfulweb/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HelloWebApp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425953470000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.cgm.hello_web_app.eitities");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.cgm.hello_web_app.eitities.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

User auth =(User) request.getSession().getAttribute("auth");
if(auth == null || !"admin@gmail.com".equals(auth.getEmail())) {
    response.sendRedirect("loginreal.jsp");
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("	ustora by freshdesignweb.com\r\n");
      out.write("	Twitter: https://twitter.com/freshdesignweb\r\n");
      out.write("	URL: https://www.freshdesignweb.com/ustora/\r\n");
      out.write("-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>Cart Page - Ustora Demo</title>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <style >\r\n");
      out.write("    a{\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("    color:black\r\n");
      out.write("    }\r\n");
      out.write("    a:hover{\r\n");
      out.write("     text-decoration:none;\r\n");
      out.write("    color:black\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>admin Demo</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<link\r\n");
      out.write("	href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Raleway:400,100'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header-area\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("                    <div class=\"user-menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> My Account</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-heart\"></i> Wishlist</a></li>\r\n");
      out.write("                            <li><a href=\"cart.html\"><i class=\"fa fa-user\"></i> My Cart</a></li>\r\n");
      out.write("                            <!-- <li><a href=\"checkout.html\"><i class=\"fa fa-user\"></i> Checkout</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> Login</a></li> -->\r\n");
      out.write("                            ");
 if(request.getSession().getAttribute("auth") != null) { 
      out.write("\r\n");
      out.write("                            <li><a href=\"checkout.html\"><i class=\"fa fa-user\"></i> Checkout</a></li>\r\n");
      out.write("                            <li><a href=\"user-logout\"><i class=\"fa fa-user\"></i> Logout</a></li>\r\n");
      out.write("                        ");
 } else { 
      out.write("\r\n");
      out.write("                            <li><a href=\"user-login\"><i class=\"fa fa-user\"></i> Login</a></li>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"header-right\">\r\n");
      out.write("                        <ul class=\"list-unstyled list-inline\">\r\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\r\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">currency :</span><span class=\"value\">USD </span><b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">USD</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">INR</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">GBP</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\r\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">language :</span><span class=\"value\">English </span><b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">English</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">French</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">German</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> <!-- End header area -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("   <div class=\"row p-5\">\r\n");
      out.write("   <div class=\"col-md-3\">\r\n");
      out.write("   <a href=\"addproduct.jsp\">\r\n");
      out.write("   <div class=\"card\">\r\n");
      out.write("   <div class=\"card-body\">\r\n");
      out.write("   <i class=\"fa fa-shopping-cart text-primary\"></i><br>\r\n");
      out.write("   <h4>Add Product</h4>\r\n");
      out.write("   --------------\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </a>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("    <a href=\"allproduct.jsp\">\r\n");
      out.write("   <div class=\"card\">\r\n");
      out.write("   <div class=\"card-body\">\r\n");
      out.write("   <i class=\"fa fa-shopping-cart text-danger\"></i><br>\r\n");
      out.write("   <h4>All Product</h4>\r\n");
      out.write("   --------------\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </a>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("     <a href=\"order.jsp\">\r\n");
      out.write("   <div class=\"card\">\r\n");
      out.write("   <div class=\"card-body\">\r\n");
      out.write("   <i class=\"fa fa-user text-warning\"></i><br>\r\n");
      out.write("   <h4>Order</h4>\r\n");
      out.write("   --------------\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </a>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("    <a data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
      out.write("   <div class=\"card\">\r\n");
      out.write("   <div class=\"card-body\" >\r\n");
      out.write("   <i class=\"fa fa-user\"></i><br>\r\n");
      out.write("   <h4>Logout</h4>\r\n");
      out.write("   --------------\r\n");
      out.write("   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   </a>\r\n");
      out.write("   </div>\r\n");
      out.write("  \r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write(" \r\n");
      out.write("<!-- Model -->\r\n");
      out.write("<!-- Button trigger modal -->\r\n");
      out.write("<!-- <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
      out.write("  Launch demo modal\r\n");
      out.write("</button>\r\n");
      out.write(" -->\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLongTitle\"></h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("      <h4>Do you want out</h4>\r\n");
      out.write("         <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("         <a href=\"user-logout\" type=\"button\" class=\"btn btn-primary text-white\">Logout</a>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("       </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<!-- EndModel -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<!-- End footer bottom area -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Latest jQuery form server -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Bootstrap JS form CDN -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery sticky menu -->\r\n");
      out.write("	<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.sticky.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery easing -->\r\n");
      out.write("	<script src=\"js/jquery.easing.1.3.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Main Script -->\r\n");
      out.write("	<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Slider -->\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/bxslider.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"js/script.slider.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
