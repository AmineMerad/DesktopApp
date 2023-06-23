/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagementsy;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */
public class database {
    
     public static Connection connectDb(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             
             Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/restaurant2","root","root");
             System.out.println("success");
             return connect;
         }catch(Exception e){e.printStackTrace();
             
         }
         
         return null;
         
     }
}
