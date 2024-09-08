package co.argm.app.controller;

import co.argm.app.Product;
import co.argm.app.service.ProductService;
import co.argm.app.service.ProductServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet que gestiona los productos en formato Excel o HTML.
 */
@WebServlet({"/products-xls", "/products"})
public class ProductXls extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ProductService service = new ProductServiceImpl();
        List<Product> products = service.list();

        String servletPath = req.getServletPath();

        if ("/products-xls".equals(servletPath)) {
            resp.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            resp.setHeader("Content-Disposition", "attachment;filename=products.xlsx");

            try (Workbook workbook = new XSSFWorkbook()) {
                Sheet sheet = workbook.createSheet("Products");
                Row headerRow = sheet.createRow(0);
                headerRow.createCell(0).setCellValue("ID");
                headerRow.createCell(1).setCellValue("Name");
                headerRow.createCell(2).setCellValue("Type");
                headerRow.createCell(3).setCellValue("Price");

                int rowIdx = 1;
                for (Product p : products) {
                    Row row = sheet.createRow(rowIdx++);
                    row.createCell(0).setCellValue(p.id());
                    row.createCell(1).setCellValue(p.name());
                    row.createCell(2).setCellValue(p.type());
                    row.createCell(3).setCellValue(p.price());
                }

                workbook.write(resp.getOutputStream());
            }
        } else {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {
                out.println("<html><head><title>Product List</title></head><body>");
                out.println("<h1>Product List!</h1>");
                out.println("<p><a href=\"" + req.getContextPath() + "/products-xls\">Export to XLS</a></p>");
                out.println("<p><a href=\"" + req.getContextPath() + "/products-json\">Show JSON</a></p>");
                out.println("<table><tr><th>ID</th><th>Name</th><th>Type</th><th>Price</th></tr>");

                products.forEach(p -> out.println("<tr><td>" + p.id() + "</td><td>" + p.name() + "</td><td>" + p.type() + "</td><td>" + p.price() + "</td></tr>"));

                out.println("</table></body></html>");
            }
        }
    }
}
