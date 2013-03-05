<br /><%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>学校管理系统</title>
<base href="<%=basePath%>" />
<link rel="stylesheet" type="text/css" href="manager/back_css/style.css" />
<script type="text/javascript" src="manager/back_css/jquery.min.js"></script>
<script type="text/javascript" src="manager/back_css/ddaccordion.js"></script>
<script type="text/javascript">
	ddaccordion
			.init({
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
				togglehtml : [
						"suffix",
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
<script src="manager/back_css/jquery.jclock-1.2.0.js.txt"
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
				<a href="#"><img src="manager/back_css/images/logo.gif" alt=""
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

						<a class="menuitem submenuheader" href="">教师信息</a>
						<div class="submenu">
							<ul>
								<li><a href="">教师信息上传</a></li>
								<li><a href="">教师信息下载</a>
								</li>
							</ul>
						</div>
						<a class="menuitem submenuheader"
							href="manager/school/teacher.jsp">学生信息</a>
						<div class="submenu">
							<ul>
								<li><a href="">学生信息上传</a></li>
								<li><a href="">学生信息下载</a>
								</li>
							</ul>
						</div>
					</div>




				</div>

				<div class="right_content">


					<h2>学生信息下载</h2>
					<div class="form">
						<s:form action="%{id>0?'updateteacher':'addteacher'}"
							enctype="multipart/form-data" namespace="/school" method="post"
							theme="simple" cssClass="niceform">
								<dl>
									<dt>
										<label for="upload">上传:</label>
									</dt>
									<dd>
										<input type="file" name="upload" id="upload" />
									</dd>
								</dl>




								<dl class="submit">
									<input type="submit" name="submit" id="submit" value="提交" />
								</dl>



							</fieldset>

						</s:form>
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
					src="manager/back_css/images/indeziner_logo.gif" alt="" title=""
					border="0" /> </a>
			</div>

		</div>

	</div>
</body>
</html>