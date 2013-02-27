<br /><%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学校管理系统</title>
<base href="<%=basePath%>"/>
<link rel="stylesheet" type="text/css"
	href="manager/back_css/style.css" />
<script type="text/javascript"
	src="manager/back_css/jquery.min.js"></script>
<script type="text/javascript"
	src="manager/back_css/ddaccordion.js"></script>
<script type="text/javascript">
	ddaccordion.init({
		headerclass : "submenuheader", //Shared CSS class name of headers group
		contentclass : "submenu", //Shared CSS class name of contents group
		revealtype : "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
		mouseoverdelay : 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
		collapseprev : true, //Collapse previous content (so only one open at any time)? true/false 
		defaultexpanded : [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
		onemustopen : false, //Specify whether at least one header should be open always (so never all headers closed)
		animatedefault : false, //Should contents open by default be animated into view?
		persiststate : true, //persist state of opened contents within browser session?
		toggleclass : [ "", "" ], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
		togglehtml : [ "suffix",
				"<img src='manager/back_css/images/plus.gif' class='statusicon' />",
				"<img src='manager/back_css/images/minus.gif' class='statusicon' />" ], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
		animatespeed : "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
		oninit : function(headers, expandedindices) { //custom code to run when headers have initalized
			//do nothing
		},
		onopenclose : function(header, index, state, isuseractivated) { //custom code to run whenever a header is opened or closed
			//do nothing
		}
	})
</script>
<script
	src="manager/back_css/jquery.jclock-1.2.0.js.txt"
	type="text/javascript"></script>
<script type="text/javascript"
	src="manager/back_css/jconfirmaction.jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.ask').jConfirmAction();
	});
</script>
<script type="text/javascript">
	$(function($) {
		$('.jclock').jclock();
		$('#menu').load("manager/meun.jsp");
	});
	
</script>

<script language="javascript" type="text/javascript"
	src="manager/back_css/niceforms.js"></script>
<link rel="stylesheet" type="text/css" media="all"
	href="manager/back_css/niceforms-default.css" />

</head>
<body>
	<div id="main_container">

		<div class="header">
			<div class="logo">
				<a href="#"><img
					src="manager/back_css/images/logo.gif" alt=""
					title="" border="0" /> </a>
			</div>

			<div class="right_header">
				Welcome Admin, <a href="#">Visit site</a> | <a href="#"
					class="messages">(3) Messages</a> | <a href="#" class="logout">Logout</a>
			</div>
			<div class="jclock"></div>
		</div>

		<div class="main_content">

			<div class="menu" id="menu"></div>

			<div class="center_content">



				<div class="left_content">

					

					<div class="sidebarmenu">

						<a class="menuitem submenuheader" href="">添加学生</a> 
						<a class="menuitem" href="">学生列表</a> 
						<a class="menuitem" href=""> </a> 
						<a class="menuitem_green" href=""> </a>
						<a class="menuitem_red" href=""></a>

					</div>


					<div class="sidebar_box">
						<div class="sidebar_box_top"></div>
						<div class="sidebar_box_content">
							<h3>User help desk</h3>
							<img src="manager/back_css/images/info.png"
								alt="" title="" class="sidebar_icon_right" />
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua.</p>
						</div>
						<div class="sidebar_box_bottom"></div>
					</div>

					<div class="sidebar_box">
						<div class="sidebar_box_top"></div>
						<div class="sidebar_box_content">
							<h4>Important notice</h4>
							<img src="manager/back_css/images/notice.png"
								alt="" title="" class="sidebar_icon_right" />
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua.</p>
						</div>
						<div class="sidebar_box_bottom"></div>
					</div>

					<div class="sidebar_box">
						<div class="sidebar_box_top"></div>
						<div class="sidebar_box_content">
							<h5>Download photos</h5>
							<img src="manager/back_css/images/photo.png"
								alt="" title="" class="sidebar_icon_right" />
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua.</p>
						</div>
						<div class="sidebar_box_bottom"></div>
					</div>

					<div class="sidebar_box">
						<div class="sidebar_box_top"></div>
						<div class="sidebar_box_content">
							<h3>To do List</h3>
							<img src="manager/back_css/images/info.png"
								alt="" title="" class="sidebar_icon_right" />
							<ul>
								<li>Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</li>
								<li>Lorem ipsum dolor sit ametconsectetur <strong>adipisicing</strong>
									elit, sed do eiusmod tempor incididunt ut labore et dolore
									magna aliqua.</li>
								<li>Lorem ipsum dolor sit amet, consectetur <a href="#">adipisicing</a>
									elit.</li>
								<li>Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</li>
								<li>Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</li>
								<li>Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</li>
							</ul>
						</div>
						<div class="sidebar_box_bottom"></div>
					</div>


				</div>

				<div class="right_content">


					<h2>学生信息详情</h2>

					<div class="form">
						<form action="" method="post" class="niceform">

							<fieldset>
								<dl>
									<dt>
										<label for="name">姓名:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" value="<s:property value="student.name" />  "    />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="email">所属学校:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="password">班级:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label>学号:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="email">专业:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="email">联系电话:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="email">email:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="email">qq:</label>
									</dt>
									<dd>
										<input type="text" name="" id="" size="54" />
									</dd>
								</dl>
								<dl>
									<dt>
										<label for="upload">照片:</label>
									</dt>
									<dd>
										<input type="file" name="upload" id="upload" />
									</dd>
								</dl>
								
								<dl>
									<dt>
										<label for="interests">爱好:</label>
									</dt>
									<dd>
										<textarea name="comments" id="comments" rows="5" cols="36"></textarea>
									</dd>
								</dl>




								

								<dl>
									<dt>
										<label for="comments">备注:</label>
									</dt>
									<dd>
										<textarea name="comments" id="comments" rows="5" cols="36"></textarea>
									</dd>
								</dl>

								

								<dl class="submit">
									<input type="submit" name="submit" id="submit" value="提交" />
								</dl>



							</fieldset>

						</form>
					</div>


				</div>
				<!-- end of right content-->


			</div>
			<!--end of center content -->




			<div class="clear"></div>
		</div>
		<!--end of main content-->


		<div class="footer">

			<div class="left_footer">
				IN ADMIN PANEL | Powered by <a href="http://indeziner.com">INDEZINER</a>
			</div>
			<div class="right_footer">
				<a href="http://indeziner.com"><img
					src="manager/back_css/images/indeziner_logo.gif"
					alt="" title="" border="0" /> </a>
			</div>

		</div>

	</div>
</body>
</html>