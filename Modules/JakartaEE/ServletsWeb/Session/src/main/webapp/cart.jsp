<%@ page import="co.argm.app.model.Cart" %>
<%@ page import="co.argm.app.model.CartItem" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Cart cart = (Cart) session.getAttribute("cart");%>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
<h1>Shopping Cart</h1>
<% if (cart.getItems().isEmpty()) { %>
<p>Sorry, there are no products in the shopping cart!</p>
<% } else { %>
<form name="cartForm" action="<%=request.getContextPath()%>/cart/update" method="post">
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Total</th>
            <th>Delete</th>
        </tr>
        <% for (CartItem item : cart.getItems()) { %>
        <tr>
            <td><%=item.getProduct().id()%>
            </td>
            <td><%=item.getProduct().name()%>
            </td>
            <td><%=item.getProduct().price()%>
            </td>
            <td><label>
                <input type="text" size="4" name="qty_<%=item.getProduct().id()%>" value="<%=item.getQuantity()%>"/>
            </label></td>
            <td><%=item.getTotalPrice()%>
            </td>
            <td><label>
                <input type="checkbox" value="<%=item.getProduct().id()%>" name="deleteProducts"/>
            </label></td>
        </tr>
        <% } %>
        <tr>
            <td colspan="4" style="text-align: right">Total:</td>
            <td><%=cart.getTotal()%>
            </td>
        </tr>
    </table>
    <a href="javascript:document.cartForm.submit();">Update</a>
</form>
<% } %>
<p><a href="<%=request.getContextPath()%>/products">Continue shopping</a></p>
<p><a href="<%=request.getContextPath()%>/index.html">Go back</a></p>
</body>
</html>
