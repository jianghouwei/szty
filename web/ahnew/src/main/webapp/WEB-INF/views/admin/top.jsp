<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title><s:text name="admin_title"/></title>
    <link href="<spring:message code="url.main" />css/admin.css" rel="stylesheet" type="text/css"/>
</head>
<script language="JavaScript" type="text/javascript">
    function exit() {
        if (confirm("亲，你确定要退出拇指购后台管理系统吗?")) {
            window.parent.location = "../admin/admin_logout.action";
            return true;
        } else {
            return false;
        }

    }
</script>
<body style="background-image:url(<spring:message code="url.main" />images/top_back.jpg); background-repeat:repeat-x;">
<div class="admin_logo">
    <img src="<spring:message code="url.main" />images/admin_logo.jpg"/>
</div>
<div class="admin_prompt">
    <s:bean name="java.util.Date" id="now"/>
    <s:text name="admin_welcome">
        <s:param>
            <s:property value="#session.admin.loginName" default="管理员"/>
        </s:param>
    </s:text><br/>
    <s:text name="admin_datetime">
        <s:param>
            <s:date name="now" format="yyyy年MM月dd日 HH:mm:ss E"/><a href="javascript:history.go(-1);">返回</a> <input type="button" onclick="exit()" value="退出系统">
        </s:param>
    </s:text>
</div>
</body>
</html>
