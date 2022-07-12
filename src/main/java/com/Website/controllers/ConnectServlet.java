package com.Website.controllers;

import com.Website.model.User;
import com.Website.repository.impl.ImplUser;
import com.Website.connection.JDBCConnector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/connect")
public class ConnectServlet extends HttpServlet {
    private JDBCConnector connector;
    private ImplUser implUser;
    //ConnectionPool connectionPool;
private final String ERROR_NOT_FOUND = "Not Found this Account";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String log = req.getParameter("login");
        String pas = req.getParameter("password");


            HttpSession session = req.getSession();
        if (implUser.findByLoginAndPassword(log, pas) != null) {
            User user = implUser.findByLoginAndPassword(log, pas);
            session.setAttribute("name", user.getName());
            session.setAttribute("login", log);
            session.setAttribute("surName", user.getSurName());
            session.setAttribute("age", user.getAge());
            session.setAttribute("id",user.getId());
            session.setAttribute("status",user.getStatusAccount());
            //getServletContext().getRequestDispatcher("/profile.jsp").forward(req,resp);
            getServletContext().getRequestDispatcher("/profileTest.jsp").forward(req, resp);
        } else {
            session.setAttribute("isValid", ERROR_NOT_FOUND);
            getServletContext().getRequestDispatcher("/singIn.jsp").forward(req, resp);
        }
    }

    @Override
    public void init() throws ServletException {
        connector = new JDBCConnector();
        implUser = new ImplUser(connector);
        //this.connectionPool = new ConnectionPool();
    }
}
