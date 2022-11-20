/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author Ritesh Roushan
 */
public class Connectionproviderclass {
    public static Connection getCon()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qems1","root","Kaushik@0082");
                    return con;
        
        }
        catch(Exception e)
        {
            return null;
        }
    
    }
  
    
}
