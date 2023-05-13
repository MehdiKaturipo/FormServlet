package ma.bankati.web;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        var out = resp.getWriter();
        out.println("<h1>Hello Servlet -_-</h1>");
        out.println("Protocol: " + req.getProtocol());
        out.println("Method: " + req.getMethod());
        out.println("Request URI: " + req.getRequestURI());
        out.println("Request URL: " + req.getServerName());
        out.println("Server Name: " + req.getServerPort());
        out.println("Context Path: " + req.getContextPath());
        out.println("Servlet Path: " + req.getServletPath());
        out.println("Path Info: " + req.getPathInfo());
    }
}
