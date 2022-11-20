/*
 * To change this license header, choose License Headers in Project Properties.
ange this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author kaushik walke
 */
public class Connectionproviderclass {
    static Connection java_Connectionproviderclass;
    
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/qems1","root","");
            
            return con;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
   
    static Connection java_Connectionproviderclass()
            {
                throw new UnsupportedOperationException("Not supported yet.");
            }
}
    
    
    
    
    
    
    
//    public static Connection  getCon(){
//      try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//        } 
//        catch (ClassNotFoundException e) {
//            System.out.println("MySQL JDBC Driver not found !!");
//            return null;
//        }
//        System.out.println("MySQL JDBC Driver Registered!");
//        Connection connection = null;
//        try {
//            connection = DriverManager
//                .getConnection("jdbc:mysql://localhost:3306/qems", "root", "Kaushik@0082");
//            System.out.println("SQL Connection to database established!");
//            
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Connection Failed! Check output console");
//            return null;
//        }
//        
//        System.out.println("Successful connection returned");
//        return connection;
//}
 /*   public static Connection getCon()
    {
        try{
           Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qems", "root", "Kaushik@0082");
                    return con;
        
          
        }
        catch(Exception e)
        {
           System.out.println("connection Exception Test");
           e.printStackTrace();
            return null;
        }
    
    }
  
   */ 
//}
