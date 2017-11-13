<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>
<%
	Locale locale=request.getLocale();
	Calendar calendar=Calendar.getInstance(locale);
	int hour=calendar.get(Calendar.HOUR_OF_DAY);
	String greeting="";
	if(hour<=6){
	greeting="凌晨好！";
	}else if(hour<=9){
	greeting="上午好！";
	}else if(hour<=12){
	greeting ="中午好！";
	}else if(hour<=18){
	greeting="下午好！";
	}else{
	
	}
	
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>欢迎界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table>
    	<tr>
    		<td><%=greeting %></td>
    	</tr>
    </table>
  </body>
</html>
