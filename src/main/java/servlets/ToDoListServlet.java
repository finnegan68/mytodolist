package servlets;

import model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ToDoListServlet", urlPatterns = "/todolist")
public class ToDoListServlet extends HttpServlet {

    /*

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("myList") == null){
            session.setAttribute("myList", new ArrayList<Task>());
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if (req.getParameter("delete") != null) {
            out.println("<a href=”http://localhost:8080/HelloWorld/test”> Hello World Servlet </a>");
        } else if (req.getParameter("add") != null) {
            myList.method2();
        } else if (req.getParameter("button3") != null) {
            myList.method3();
        } else {
            // ???
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ListOfTasks myList = new ListOfTasks();

        HttpSession session = req.getSession();
        session.setAttribute("MyToDoList", myList);

        v

        if (req.getParameter("delete") != null) {
            myList.;
        } else if (req.getParameter("add") != null) {
            myList.method2();
        } else if (req.getParameter("button3") != null) {
            myList.method3();
        } else {
            // ???
        }

        synchronized (session){
            session.setAttribute("");
        }

        req.getRequestDispatcher("/WEB-INF/some-result.jsp").forward(req, resp);

    }


    */
}
