<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<html>
<title>首页</title>
<head>
    <%--<script type="text/javascript" src="/resources/js/jquery-3.2.1.min.js"></script>--%>
    <script type="text/javascript" src="/resources/js/jquery-3.2.1.js"></script>
</head>
<body>
<h2>Hello World!</h2>

<%--<form action="/children/testRestful/123456" method="get">--%>
<form action="/children/testRestfulPost/123" method="post">
  <table>
      <tr>
          <td><span>姓名：</span><input type="text" name="name"/></td>
      </tr>
      <tr>
          <td><span>年龄：</span><input type="text" name="age"/></td>
      </tr>
      <tr>
          <td><span>生日：</span><input type="date" name="birth"/></td>
      </tr>
      <tr>
          <td><input type="submit" value="提交"/></td>
      </tr>
  </table>
</form>
<table>
    <tr>
        <td>1.book;</td><td><button onclick="deleteById('123')">删除</button></td>
    </tr>
</table>

<script type="text/javascript">

    function deleteById(id) {
        alert(id);
        $.ajax({
            url:"/children/testRestfulDelete/"+id,
            async:true,
            type:"DELETE",
            data:{id:1},
            dataType:"json",
            success:function (data) {
                alert(data);
            }
        });
    }



</script>

</body>
</html>
