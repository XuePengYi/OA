<%@ page language="java" contentType="text/html; charset=gbk"
	pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Bootstrap Admin</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" type="text/css"
	href="lib/bootstrap/css/bootstrap.css">

<link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
<link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

<script src="lib/jquery-1.7.2.min.js" type="text/javascript"></script>

<!-- Demo page code -->

<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

.brand .first {
	color: #ccc;
	font-style: italic;
}

.brand .second {
	color: #fff;
	font-weight: bold;
}
</style>

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="../assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="../assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="../assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="../assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="../assets/ico/apple-touch-icon-57-precomposed.png">
</head>

<!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
<!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
<!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
<!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<body class="">
	<!--<![endif]-->

	<div class="content" style="width: 100%; margin-left: 0px">

		<div class="header">
			<div class="stats">
				<p class="stat">
					<span class="number">5</span>users
				</p>
				<p class="stat">
					<span class="number">19</span>Events
				</p>
			</div>

			<h1 class="page-title">每日打卡</h1>
		</div>

		<ul class="breadcrumb">
			操作
			<li class="active"><a href="firstAction"><input type="button" value="上班了！" ></a></li>
			<li class="active"><a href="lastAction"><input type="button" value="下班了！" ></a></li>
		</ul>

		<div class="container-fluid">
			<div class="row-fluid">
				<style type='text/css'>
#calendar {
	width: 100%;
	margin: 0 auto;
}
</style>
				<h2>打卡信息：</h2>
				<div id='calendar'></div>
				<table border="1">
					<tr>
						<td>打卡编号</td>
						<td>员工姓名</td>
						<td>上班打卡</td>
						<td>下班打卡</td>
					</tr>
					<tr>
						<td colspan="5"></td>
					</tr>
<c:forEach items="${sessionScope.Employee_Punchcard_Message }" var="emp" varStatus="vs">
				<tr>
						<td>${vs.index }</td>
						<td>${sessionScope.loginUser.employee_Name}</td>
						<td>${emp.employee_Punchcard_Message_Firsttime }</td>
						<td>${emp.employee_Punchcard_Message_Lasttime }</td>
					</tr>
</c:forEach>
				</table>
			</div>
		</div>
	</div>



	<script src="lib/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript">
		$("[rel=tooltip]").tooltip();
		$(function() {
			$('.demo-cancel-click').click(function() {
				return false;
			});
		});
	</script>

</body>
</html>