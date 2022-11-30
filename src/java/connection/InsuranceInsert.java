/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author sanja
 */
public class InsuranceInsert {
    
	public String insertInsurance(String uname, String pass)
	{
	try{
            Connect connect = new Connect();
            Connection c = connect.connect();
            Statement stmt = null;
            stmt = c.createStatement();
            System.out.println(uname);
            String sql = "Select count(*) cnt from LoginClient where client_id = '" + uname + "' and passwd = '" + pass+"';";
            ResultSet rs =  stmt.executeQuery(sql);
            rs.next();
            
            if(rs.getInt("cnt") == 1){
                return "Login Successful";
            }
            
        }
        catch(Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            return "Error Exception";
//            System.exit(0);
        }
        System.out.println("Inserted Insurance into database");          
                return "Invalid Username or Password";
	}
	
	public void insertClient()
    {
        try{
            Connect connect = new Connect();
            Connection c = connect.connect();
            Statement stmt = null;
            stmt = c.createStatement();

            Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter client id: ");
            String client_id = sc.next();
            System.out.println("Enter client name: ");
            String client_name = sc.next();
            
            System.out.println("Enter DOB: ");
            String dob = sc.next();
            
            System.out.println("Enter address: ");
            String address = sc.next();
            System.out.println("Enter insurance id: ");
            int insurance_id = sc.nextInt();
                                  
            String sql = "INSERT INTO Client (client_id, client_name, dob, address, insurance_id) "
                 + "VALUES ('" + client_id + "', '"+client_name+"' , (SELECT TO_DATE('" + dob + "', 'YYYY-MM-DD')), '" +address+"', '"+ insurance_id+"');";
            stmt.executeUpdate(sql);
             
            stmt.close();
            c.close();
        }
        catch(Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Inserted Client into database");                
    }
	
	public boolean checkClient(String username, String passwd)
	{
		boolean loginSuccessful=false;
		try{
                    Connect connect = new Connect();
            Connection c = connect.connect();
            Statement stmt = null;
            stmt = c.createStatement();            
            
            ResultSet rs= null;
            String sql = "SELECT * FROM LoginClient WHERE client_id='"+username+"' AND passwd='"+passwd+"';";            
            rs = stmt.executeQuery(sql);
             
            stmt.close();
            c.close();
            
            if(rs.getRow()>0)
            {
            	loginSuccessful=true;
            }
        }
        catch(Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
		System.out.println("User verified");
		return loginSuccessful;
	}
}
