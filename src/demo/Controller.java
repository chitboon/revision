package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by chitboon on 12/3/15.
 */
@WebServlet(name = "Controller", urlPatterns = "/controller")
public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String id = request.getParameter("id");
            String password = request.getParameter("password");
            System.out.println(id);
        System.out.println(password);
            UserDAO dao = new UserDAO();
            User u = dao.getUser(id, password);
            if (u == null) {
                getServletContext().getRequestDispatcher("/invalid.html").forward(request,response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("user", u);
                getServletContext().getRequestDispatcher("/addquote.jsp").forward(request,response);
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String quote = request.getParameter("quote");
        String author = request.getParameter("author");
        QuoteDAO dao = new QuoteDAO();
        HttpSession session = request.getSession();
        User u = (User)session.getAttribute("user");
        if (u == null) {
            getServletContext().getRequestDispatcher("/invalid.html").forward(request,response);
        } else {
            Quote q = new Quote(quote, author, u.getName());
            dao.addQuote(q);
//            request.setAttribute("quote", q);
            getServletContext().getRequestDispatcher("/quote.jsp").forward(request,response);
        }
    }
}
