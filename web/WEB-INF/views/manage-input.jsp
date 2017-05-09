<%--
  Created by IntelliJ IDEA.
  User: 看什么看没见过屏幕啊
  Date: 2017/4/29
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>manage-input</title>
</head>
<body>
<center>
    <br/>
    <br/>
    <br/>
    <s:if test="id != null">
        <s:form action="manage-update" method="post">
            <s:hidden name="id"></s:hidden>
            <s:textfield name="name" label="标题" disabled="true"></s:textfield>
            <s:textfield name="channel" label="网址"></s:textfield>
            <s:submit value="修改"></s:submit>
        </s:form>

    </s:if>
    <s:else>
        <s:form action="manage-save" method="post">
            <s:select list="{'公司新闻', '公告信息', '技术中心', '采购需求'}" name="parent" label="栏目"></s:select>
            <s:textfield name="name" label="标题"></s:textfield>
            <s:textfield name="channel" label="网址"></s:textfield>
            <s:submit value="新建"></s:submit>
        </s:form>
    </s:else>
</center>
</body>
</html>
