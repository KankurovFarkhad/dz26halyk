package com.example.sometry;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String position = request.getParameter("position");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "name  " + name + ", position " + position + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}