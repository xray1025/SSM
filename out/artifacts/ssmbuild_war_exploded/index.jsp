<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 20px;
      }
      h3{
        width: 200px;
        height: 60px;
        margin: 200px auto;
        text-align: center;
        line-height: 50px;
        background: deepskyblue;
        border-radius: 10px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>
