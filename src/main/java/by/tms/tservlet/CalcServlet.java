package by.tms.tservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc")
public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        int i = Integer.parseInt(num1);
        int i1 = Integer.parseInt(num2);
        int rest = i + i1;
        req.setAttribute("result", rest);
        resp.sendRedirect("/calc" + "?result=" + rest);
    }
}
