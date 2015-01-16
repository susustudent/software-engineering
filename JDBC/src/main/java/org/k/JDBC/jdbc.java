package org.k.JDBC;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class jdbc {
    private Connection dbConnection = null;
    private Statement statement = null;
    private String AuthorizedUser = "";
    
    public static  Connection establishConnection() throws SQLException {
        Connection dbConnection = null;
        dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UserList", "postgres", "admin");
        return dbConnection;
    }
    
        public void usrAndMsg() throws SQLException{
        String selectTableSQL = "SELECT username, message from user_list";
        dbConnection = this.establishConnection();
        statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(selectTableSQL);

        System.out.println("Username         message");
        while (rs.next()) {
            String username = rs.getString("username");
            String message = rs.getString("message");
            System.out.println( username+"     "+message);
            }
        }
        
        public int count() throws SQLException{
        String selectTableSQL = "SELECT username from user_list";
        dbConnection = this.establishConnection();
        statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(selectTableSQL);
        int count = 0;
        while (rs.next()) {
            String username = rs.getString("username");
            count++;
            }
        return count;
        }
        
        public String topTen(String order) throws SQLException{
        String selectTableSQL = "SELECT * FROM user_list  ORDER BY  last_entry "+order+" LIMIT 10 ";
        dbConnection = this.establishConnection();
        statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(selectTableSQL);
        String username="";
        String last_entry="";
        String res="";
        while(rs.next()){
            username = rs.getString("username");
            last_entry = rs.getString("last_entry");
            res += username+"    "+last_entry+"\n";
        }
        return res;
        }
        public String auth(String login, String password) throws SQLException {
        //String selectTableSQL = "SELECT COUNT(*) as total FROM  JLAB.JLAB_TABLE";
        String selectTableSQL = "SELECT * FROM user_list WHERE login='"+login+"' AND password='"+password+"' ";
        dbConnection = this.establishConnection();
        statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(selectTableSQL);
        String res="";
        String log = "";
        String pass = "";
        while(rs.next()){
           log = rs.getString("login");
           pass = rs.getString("password");
           res += log+pass;
           AuthorizedUser = rs.getString("username");
        }
        if (res != "")
        {
          System.out.println("Autentification succeed");
          System.out.println("Hello! " +AuthorizedUser);
          
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Calendar cal = Calendar.getInstance();
            selectTableSQL="UPDATE user_list SET last_entry = '"+dateFormat.format(cal.getTime())+"' WHERE login = '"+login+"'";
            statement.execute(selectTableSQL);
          
        }
        else 
        {
          System.out.println("Autentification failed");
          AuthorizedUser = "";
        }
        return res;
        }
        
        public void exit()
        {
          AuthorizedUser = "";
        }
        
        public void setMessage (String message) throws SQLException
        {
        String updateTableSQL = "UPDATE user_list SET message = '"+message+"' WHERE username = '"+AuthorizedUser+"'";
        dbConnection = this.establishConnection();
        statement = dbConnection.createStatement();
        statement.execute(updateTableSQL);        
        }
        
}
