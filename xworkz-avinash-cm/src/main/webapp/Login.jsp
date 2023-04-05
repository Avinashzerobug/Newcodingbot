<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Login</title>
        </head>

        <body>

            <form id="loginForm" modelAttribute="login" action="searchByUserIdAndPassWord" method="get">
                <table align="center">
                    <tr>
                        <td>
                            <form><label path="userId">UserId: ${userID} </label>
                           
                            <input path="userId" name="userId" id="userId" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form> <label path="password">Password: ${password}</label>
                       
                            <input path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <button id="login" name="login">Login</button>
                        </td>
                    </tr>

                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="Ai.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>

        </body>

        </html>