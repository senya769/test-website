package com.Website.controllers;


import com.Website.model.BuilderUser;
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

@WebServlet("/registration")
public class RegServlet extends HttpServlet {
    private JDBCConnector connector;
    private ImplUser implUser;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/profileTest.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        int age = Integer.parseInt(req.getParameter("age"));
        String name = req.getParameter("name");
        String surName = req.getParameter("surName");
        String password = req.getParameter("password");
        String status = "User";
      //  User user = new User(login, password, name, surName, age);
        User user = new BuilderUser()
                .login(login)
                        .password(password)
                                .name(name)
                                        .surName(surName)
                                                .age(age)
                                                        .statusAccount(status)
                .build();
        implUser.createUser(user);
        // if(implUser.createUser(user)){
        //    HttpSession session = req.getSession();
            getServletContext().getRequestDispatcher("/profileTest.jsp").forward(req, resp);
      //  }
        //getServletContext().getRequestDispatcher("/profile.jsp").forward(req,resp);
 //       getServletContext().getRequestDispatcher("/singUp.jsp").forward(req,resp);

    }

    @Override
    public void init() throws ServletException {
        connector = new JDBCConnector();
        implUser = new ImplUser(connector);
    }
}
