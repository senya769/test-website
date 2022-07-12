package com.Website.repository.impl;


import com.Website.model.User;
import com.Website.repository.BaseDAO;
import com.Website.connection.JDBCConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImplUser implements BaseDAO {

    private static final String CREATE_USER = "INSERT INTO users (login,password,name,surName,age,status) VALUES (?,?,?,?,?,?)";
    private static final String FIND_BY_LOGIN_AND_PASSWORD = "SELECT * FROM users WHERE login = ? AND password = ?";
    private JDBCConnector connector;

    public ImplUser(JDBCConnector connector) {
        this.connector = connector;
    }

    @Override
    public User findByLoginAndPassword(String login, String password) {
        User user = new User();
        try (Connection connection = connector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_LOGIN_AND_PASSWORD)) {
            preparedStatement.setString(1,login);
            preparedStatement.setString(2,password);
            ResultSet set = preparedStatement.executeQuery();
            if(set.next()){
            user.setLogin(login);
            user.setPassword(password);
            user.setName(set.getString("name"));
            user.setSurName(set.getString("surName"));
           user.setAge(set.getInt("age"));
           user.setStatusAccount(set.getString("status"));
           user.setId(set.getInt("id"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return user.getName()!=null ?user:null;
    }

    @Override
    public boolean createUser(User user) {
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_USER))  {
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getSurName());
            statement.setInt(5, user.getAge());
            statement.setString(6, user.getStatusAccount());
    return statement.executeUpdate() == 1;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }
}
