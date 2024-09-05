<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Map<String, String> errors = (Map<String, String>) request.getAttribute("errors");%>
<head>
    <title>User form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h3>User form</h3>
<%if (errors != null) {%>
<ul class="alert alert-danger mx-5 px-5">
    <%for (String error : errors.values()) {%>
    <li><%=error%>
    </li>
    <%}%>
</ul>
<%}%>
<div class="px-5">
    <form action="http://localhost:8080/Form/Record" method="post">
        <div class="row mb-3">
            <label for="username" class="col-form-label col-sm-2">Username</label>
            <div class="col-sm-4">
                <input id="username" name="username" type="text" class="form-control" value="${param.username}"></div>
            <%
                if (errors != null && errors.containsKey("username"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("username") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label for="password" class="col-form-label col-sm-2">Password</label>
            <div class="col-sm-4"><input id="password" name="password" type="password" class="form-control"></div>
            <%
                if (errors != null && errors.containsKey("password"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("password") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label for="email" class="col-form-label col-sm-2">Email</label>
            <div class="col-sm-4">
                <input id="email" name="email" type="text" class="form-control" value="${param.email}"></div>
            <%
                if (errors != null && errors.containsKey("email"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("email") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label for="country" class="col-form-label col-sm-2">Country</label>
            <div class="col-sm-4">
                <select name="country" id="country" class="form-select">
                    <option value="">--- Select ----</option>
                    <option value="AR" ${param.country.equals("AR")?"selected":""}>Argentina</option>
                    <option value="CL" ${param.country.equals("CL")?"selected":""}>Chile</option>
                    <option value="CO" ${param.country.equals("CO")?"selected":""}>Colombia</option>
                    <option value="MX" ${param.country.equals("MX")?"selected":""}>Mexico</option>
                    <option value="PE" ${param.country.equals("PE")?"selected":""}>Peru</option>
                    <option value="ES" ${param.country.equals("ES")?"selected":""}>Spain</option>
                    <option value="VE" ${param.country.equals("VE")?"selected":""}>Venezuela</option>
                </select>
            </div>
            <%
                if (errors != null && errors.containsKey("country"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("country") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label for="languages" class="col-form-label col-sm-2">Programming languages</label>
            <div class="col-sm-4">
                <select name="languages" id="languages" multiple class="form-select">
                    <option value="java" ${paramValues.languages.stream().anyMatch(v->v.equals("java")).get()?"selected":""}>
                        Java SE
                    </option>
                    <option value="jakartaee" ${paramValues.languages.stream().anyMatch(v->v.equals("jakartaee")).get()?"selected":""}>
                        Jakarta EE9
                    </option>
                    <option value="spring" ${paramValues.languages.stream().anyMatch(v->v.equals("spring")).get()?"selected":""}>
                        Spring Boot
                    </option>
                    <option value="js" ${paramValues.languages.stream().anyMatch(v->v.equals("jss")).get()?"selected":""}>
                        JavaScript
                    </option>
                    <option value="angular" ${paramValues.languages.stream().anyMatch(v->v.equals("angular")).get()?"selected":""}>
                        Angular
                    </option>
                    <option value="react" ${paramValues.languages.stream().anyMatch(v->v.equals("react")).get()?"selected":""}>
                        React
                    </option>
                </select>
            </div>
            <%
                if (errors != null && errors.containsKey("languages"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("languages") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label class="col-form-label col-sm-2">Roles</label>
            <div class="form-check col-sm-2">
                <label class="form-check-label">
                    <input type="checkbox" name="roles" value="ROLE_ADMIN"
                           class="form-check-input" ${paramValues.roles.stream().anyMatch(v->v.equals("ROLE_ADMIN")).get()?"checked":""}>Admin
                </label>
            </div>
            <div class="form-check col-sm-2">
                <label class="form-check-label">
                    <input type="checkbox" name="roles" value="ROLE_USER"
                           class="form-check-input" ${paramValues.roles.stream().anyMatch(v->v.equals("ROLE_USER")).get()?"checked":""}>User
                </label>
            </div>
            <div class="form-check col-sm-2">
                <label class="form-check-label">
                    <input type="checkbox" name="roles" value="ROLE_MODERATOR"
                           class="form-check-input" ${paramValues.roles.stream().anyMatch(v->v.equals("ROLE_MODERATOR")).get()?"checked":""}>Moderator
                </label>
            </div>
            <%
                if (errors != null && errors.containsKey("roles"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("roles") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label class="col-form-label col-sm-2">Languages</label>
            <div class="form-check col-sm-2">
                <label class="form-check-label"><input type="radio" name="language" value="en"
                                                       class="form-check-input" ${param.language.equals("en")?"checked":""}>English</label>
            </div>
            <div class="form-check col-sm-2">
                <label class="form-check-label"><input type="radio" name="language" value="fr"
                                                       class="form-check-input" ${param.language.equals("fr")?"checked":""}>French</label>
            </div>
            <div class="form-check col-sm-2">
                <label class="form-check-label"><input type="radio" name="language" value="es"
                                                       class="form-check-input" ${param.language.equals("es")?"checked":""}>Spanish</label>
            </div>
            <%
                if (errors != null && errors != null && errors.containsKey("language"))
                    out.print("<small class='alert alert-danger col-sm-4' style='color: red;'>" + errors.get("language") + "</small>");
            %>
        </div>
        <div class="row mb-3">
            <label for="enable" class="col-form-label col-sm-2">Enable</label>
            <div class="form-check col-sm-2">
                <input type="checkbox" name="enable" id="enable" class="form-check-input">
            </div>
        </div>
        <div class="row mb-3">
            <div>
                <input type="submit" value="Send" class="btn btn-primary">
            </div>
        </div>
        <input type="hidden" name="secret" value="12345">
    </form>
</div>
</body>
