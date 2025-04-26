package com.ibroximjon.concurency_multithreading.dao;

import com.ibroximjon.concurency_multithreading.beans.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    public int saveUser(User user) throws SQLException, ClassNotFoundException {
        int rows = 0;
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?)");
        ps.setString(1, user.getName());
        ps.setInt(2, user.getId());
        ps.setString(3, user.getEmail());
        rows = ps.executeUpdate();
        return rows;
    }
}
