package servlets;

import model.Status;
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
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "DeleteTaskServlet", urlPatterns = "/deleteTask")
public class DeleteTaskServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        if(session.getAttribute("myList") == null){
            session.setAttribute("myList", new ArrayList<Task>());
        }
        List<Task> myList = (List<Task>) session.getAttribute("myList");

        Iterator<Task> iterator = myList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getStatus().equals(Status.DONE)){
                iterator.remove();
            }
        }
        session.setAttribute("myList", myList);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
