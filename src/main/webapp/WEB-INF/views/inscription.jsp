<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <!DOCTYPE html>
        <html>
        <head>
            <meta charset="UTF-8">
            <title>Inscription à PayMyBuddy</title>
        </head>
        <body>
        <h1>Inscrivez-vous :</h1>
            <p>
                <form:form action="addUser" method="post" modelAttribute="registrationForm">

                    <form:input path="email" type="email" id="email"/>
                    <label for="email">Adresse mail : </label>

                    <form:input path="firstName" type="text" id="firstName"/>
                    <label for="firstName">Prénom : </label>

                    <form:input path="lastName" type="text" id="lastName"/>
                    <label for="lastName">Nom : </label>

                    <form:input path="password" type="password" id="password"/>
                    <label for="password">






                </form:form>
            </p>

        <a href="/">Home</a>
        </body>
        </html>