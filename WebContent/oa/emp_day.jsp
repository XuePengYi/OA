<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Bootstrap Admin</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">

    <script src="lib/jquery-1.7.2.min.js" type="text/javascript"></script>

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
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
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
    <script type="text/javascript">
    	function changeState(){
    		document.getElementById("employee_Name").removeAttribute("readonly");
    		document.getElementById("employee_Sex").removeAttribute("readonly");
    		document.getElementById("employee_Phone").removeAttribute("readonly");
    		document.getElementById("employee_Address").removeAttribute("readonly");
    	}
    </script>
  </head>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body class=""> 
  <!--<![endif]-->
 
  <div class="content" style="width:100%; margin-left:0px">
        
      <div class="header">
            
            <h1 class="page-title">个人基本信息</h1>
        </div>
        
               

        <div class="container-fluid">
            <div class="row-fluid">
                    
<div class="btn-toolbar">
    
    
     <form action="saveEWDAction" method="post">
    <input type="submit" value="保存" class="btn">
  <div class="btn-group">
  </div>
</div>
<% String date=new SimpleDateFormat("yyyy-MM-dd").format(new Date()); %>
<div class="well">
    <table class="table">
      <thead>
        <tr>
          <th>#</th>
          <th>&nbsp;</th>
          <th>&nbsp;</th>
          <th>&nbsp;</th>
          <th style="width: 26px;"></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>员工工号</td>
          <td><input type="text"  value="${sessionScope.loginUser.employee_Id }" readonly="readonly"/></td>
          <td></td>
         
        </tr>
        <tr>
          <td>2</td>
          <td>员工姓名</td>
          <td><input type="text"  value="${sessionScope.loginUser.employee_Name }" id="employee_Name" readonly="readonly"/></td>
          <td>修改（按钮）</td>
         
        </tr>
        <tr>
          <td>3</td>
          <td>提交日期</td>
          <td><input type="text" name="ewd.employee_Workreport_Day_Date" value="<%=date %>" id="employee_Name" readonly="readonly"/></td>
          <td>修改（按钮）</td>
         
        </tr>
        <tr>
          <td>4</td>
          <td>标题</td>
          <td><input type="text" name="ewd.employee_Workreport_Day_Title" value="" /></td>
          <td>修改（按钮）</td>
          
        </tr>
        <tr>
          <td>5</td>
          <td>摘要</td>
          <td><input type="text" name="ewd.employee_Workreport_Day_Summary" value=""/></td>
          <td>修改（按钮）</td>
         
        </tr>
        <tr>
          <td>6</td>
          <td>内容</td>
          <td><textarea rows="20" cols="20" name="ewd.employee_Workreport_Day_Content"></textarea></td>
          <td>修改（按钮）</td>
        </tr>
        <tr>
          <td>7</td>
          <td>回复</td>
          <td><textarea rows="20" cols="20" name="ewd.employee_Workreport_Day_Reply"></textarea></td>
          <td>修改（按钮）</td>
        </tr>
        <tr>
          <td>8</td>
          <td>所属部门</td>
          <td><input type="text"  value="${sessionScope.loginUser.employee_Sector.employee_Sector_Name }" readonly="readonly"/></td>
          <td>修改（按钮）</td>
        </tr>
        <tr>
          <td>9</td>
          <td>经理姓名</td>
          <td><input type="text"  value="${sessionScope.manager.employee_Name }" readonly="readonly"/></td>
          <td>修改（按钮）</td>
        </tr>
      </tbody>
    </table>
</div>
<!-- <div class="pagination">
    <ul>
        <li><a href="#">Prev</a></li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">Next</a></li>
    </ul>
</div> -->

<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">Delete Confirmation</h3>
    </div>
    <div class="modal-body">
        <p class="error-text"><i class="icon-warning-sign modal-icon"></i>Are you sure you want to delete the user?</p>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
        <button class="btn btn-danger" data-dismiss="modal">Delete</button>
    </div>
</div>


                    
                    <footer>
                        <hr>
                        
                        <p class="pull-right">Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
                        

                        <p>&nbsp;</p>
                    </footer>
                    
            </div>
        </div>
    </div>
    


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    </form>
  </body>
</html>