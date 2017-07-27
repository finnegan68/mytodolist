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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ChangeStatus", urlPatterns = "/changeStatus")
public class ChangeStatusServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        if(session.getAttribute("myList") == null){
            session.setAttribute("myList", new ArrayList<Task>());
        }
        List<Task> myList = (List<Task>) session.getAttribute("myList");

        if(req.getParameter("taskId")==""){
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
        long id =  Long.parseLong(req.getParameter("taskId"));
        for(Task t : myList){
            if(t.getId()==id){
                t.setStatus(Status.DONE);
            }
        }
        session.setAttribute("myList", myList);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
