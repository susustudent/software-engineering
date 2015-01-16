package org.k.JDBC;
import java.sql.*;

public class main {
    public static void main(String[] args) {
        try{
        jdbc test = new jdbc();
        test.usrAndMsg();
        System.out.println("Number of users: " +test.count());
        //System.out.println("Top ten: "+test.topTen("Desc"));
        //System.out.println("Top ten: "+test.topTen("Asc"));
        System.out.println("Auth: "+test.auth("ok", "10"));
        test.setMessage("ok");
       
        }
        catch (SQLException e)
        {
        System.out.println(e);
        }
        
    }
}
