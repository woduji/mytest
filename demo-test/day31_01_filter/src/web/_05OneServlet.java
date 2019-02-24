package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "_05OneServlet",urlPatterns = "/OneServlet")
public class _05OneServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("执行了OneServlet代码");
        //重定向到TwoServlet
        //response.sendRedirect("TwoServlet");
        //转发到TwoServlet
        req.getRequestDispatcher("TwoServlet").forward(req,resp);
    }
}
