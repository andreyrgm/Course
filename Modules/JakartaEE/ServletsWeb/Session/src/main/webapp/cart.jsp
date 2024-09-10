<%@ page import="co.argm.app.app.Cart" %>
<%@ page import="co.argm.app.app.ItemCart" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% Cart cart = (Cart) session.getAttribute("cart"); %>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
<h1>Shopping Cart</h1>

<% if (cart == null || cart.getItems().isEmpty()) { %>
<p>Sorry, there are no products in the shopping cart.</p>
<% } else { %>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
        <th>amount</th>
        <th>total</th>
    </tr>
    <% for (ItemCart item : cart.getItems()) { %>
    <tr>
        <td><%=item.getProduct().id()%></td>
        <td><%=item.getProduct().name()%></td>
        <td><%=item.getProduct().price()%></td>
        <td><%=item.getAmount()%></td>
        <td><%=item.getQuantity()%></td>
    </tr>
    <% } %>
    <tr>
        <td colspan="4" style="text-align: right">Total:</td>
        <td><%=cart.getTotalPrice()%></td>
    </tr>
</table>
<% } %>
<p><a href="<%=request.getContextPath()%>/products">keep shopping</a></p>
<p><a href="<%=request.getContextPath()%>/index.html">return</a></p>
</body>
</html>
