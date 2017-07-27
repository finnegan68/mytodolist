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
import java.util.List;

@WebServlet(name = "AddTaskServlet", urlPatterns = "/addTask")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("myList") == null){
            session.setAttribute("myList", new ArrayList<Task>());
        }
        session.getAttribute("myList");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("taskName");
        String description = req.getParameter("taskDescription");
        Task task = new Task();
        task.setName(name);
        task.setDescription(description);
        List<Task> myList = (List<Task>) session.getAttribute("myList");
        myList.add(task);
        session.setAttribute("myList", myList);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }
}
