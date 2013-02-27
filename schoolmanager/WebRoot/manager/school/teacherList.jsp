<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

						<a class="menuitem submenuheader" href="">添加教师</a> 
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


					<h2>教师信息列表</h2>


					<table id="rounded-corner"
						summary="2007 Major IT Companies' Profit">
						<thead>
							<tr>
								<th scope="col" class="rounded-company"><input type="checkbox" name="" /></th>
								<th scope="col" class="rounded">姓名</th>
								<th scope="col" class="rounded">学号</th>
								<th scope="col" class="rounded">学校	</th>
								<th scope="col" class="rounded">学院</th>
								<th scope="col" class="rounded">编辑</th>
								<th scope="col" class="rounded-q4">删除</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<td colspan="6" class="rounded-foot-left"><em>  </em>
								</td>
								<td class="rounded-foot-right">&nbsp;</td>

							</tr>
						</tfoot>
						<tbody>
						<s:iterator var="student" value="pageBean.list">
							<tr>
								<td><input type="checkbox" name="" />
								</td>
								<td width="50px"><a  href="school/student.action?id=1"><s:property value="#student.name"/> </a></td>
								<td><s:property value="#student.sno"/> </td>
								<td><s:property value="#student.college"/></td>
								<td width="60px"><s:property value="#student.sclass"/></td>

								<td><a href="#"><img
										src="<%= basePath %>/manager/back_css/images/user_edit.png" alt="" title="" border="0" />
								</a>
								</td>
								<td><a href="#" class="ask"><img
										src="<%= basePath %>/manager/back_css/images/trash.png" alt="" title="" border="0" />
								</a>
								</td>
							</tr>
						</s:iterator>
							

							

						</tbody>
					</table>
					<a href="#" class="bt_red"><span class="bt_red_lft"></span><strong>下载</strong><span class="bt_red_r"></span> </a>
					<a href="#" class="bt_green"><span class="bt_green_lft"></span><strong>删除</strong><span class="bt_green_r"></span> </a> 
					<a href="#" class="bt_blue"><span class="bt_blue_lft"></span><strong>全选</strong><span class="bt_blue_r"></span> </a> 
					
					 
					<div class="pagination">
						<span class="disabled"><< 前五页</span><span class="current">1</span><a
							href="">2</a><a href="">3</a><a href="">4</a><a href="">5</a>…<a
							href="">10</a><a href="">11</a><a href="">12</a>...<a href="">100</a><a
							href="">101</a><a href="">后五页 >></a>
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