<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.LinkedHashMap" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>manage-list</title>
</head>
<body>
<s:if test="#request.manager==null||request.manager.size()==0">
    没有任何管理信息
</s:if>
<table align="center" width="66%" cellpadding="0" cellspacing="10">

    <br/>
    <tr>
        <td><a href="manage-input">新建标题</a></td>
    </tr>
    <br/>
    <br/>
    <tr>
        <td>标题</td>
        <td>网址</td>
        <td>操作</td>
    </tr>

    <s:iterator value="#request.manager">
        <tr>
            <td>${name}</td>
            <td>${channel}</td>
            <td>
                <s:if test="parentInd != -1">
                    <a href="manage-delete?id=${id }">删除</a>
                </s:if>
            </td>
            <td><a href="manage-input?id=${id }">修改</a></td>
        </tr>
    </s:iterator>
    <%--    <s:iterator value="#request.manager">
            <tr>
                <td>栏目</td>
                <td>${name} </td>
            </tr>

            <tr>
                <td>标题</td>
                <td>${name} </td>
            </tr>
            <tr>
                <td>地址</td>
                <td>${channel} </td>
            </tr>
            <tr style="width: auto">
                <td>内容</td>
                <td><input type="text"/></td>
            </tr>
            <tr>
                <%--<td><a href="manage-delete?id=${id }">DELETE</a></td>--%>
    <%--<td><a href="manage-input?id=${id }">Edit</a></td>--%>
    <%--</tr>--%>
    <%--</s:iterator>&ndash;%&gt;--%>

</table>

<%--<s:form action="manage-save" method="post">
    <s:select name="fa" label="栏目" list="#request.managerFaName"></s:select>
    <s:select list="#request.managerCldName" name="name" label="标题"></s:select>
    <s:textfield name="channel" label="路径"></s:textfield>
    &lt;%&ndash;    <a href="manage-delete?id=${id }">DELETE</a>
        <a href="manage-input?id=${id }">Edit</a>&ndash;%&gt;

    <s:submit action="Input" value="Input"></s:submit>

</s:form>--%>
<%--<table align="right" width="30%" cellpadding="0" cellspacing="10">
    <tr>
        <td>栏目</td>
        <td>
            <select name="fa">
                <s:iterator value="#request.manager" id="i">
                    <option value="${i.name}">
                        <s:if test="parentInd == -1">
                            ${name}
                        </s:if>
                    </option>
                </s:iterator>
            </select>
        </td>
    </tr>

    <td><a href="manage-delete?id=${id }">DELETE</a></td>
    <td><a href="manage-input?id=${id }">Edit</a></td>
    <td>
        <s:submit></s:submit>
    </td>

    </tr>
    </s:form>
</table>--%>

</body>
</html>
