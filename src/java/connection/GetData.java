/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sanja
 */
public class GetData {
    public String[] getData(String id)
    {
        String[] data = new String[6];
        try{
            Connect connect = new Connect();
            Connection c = connect.connect();
            Statement stmt = null;
            stmt = c.createStatement();
            System.out.println(id);
            String sql = "Select * from InsuranceData where ins_id = '" +id +"';";
            ResultSet rs =  stmt.executeQuery(sql);
            
            if(rs.next()){
                data[0] = rs.getString(2);
                data[1] = rs.getString(3);
                data[2] = rs.getString(5);
                data[3] = rs.getString(6);
                data[4] = rs.getString(7);
                data[5] = rs.getString(8);
            }
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);
            System.out.println(data[4]);
            System.out.println(data[5]);
            
        }catch(Exception e){
            System.out.print(e);
        }
        return data;
    }
//    public String getLastName(String id)
//    {
//        String lname="Not found";
//        try{
//            Connect connect = new Connect();
//            Connection c = connect.connect();
//            Statement stmt = null;
//            stmt = c.createStatement();
//            System.out.println(id);
//            String sql = "Select * from InsuranceData where client_id = '" +id +"';";
//            ResultSet rs =  stmt.executeQuery(sql);
//            
//            if(rs.next()){
//                return rs.getString(2);
//            }
//        }catch(Exception e){
//            return "Error "+e;
//        }
//        return lname;
//    }
//    
//    public String getCompany(String id)
//    {
//        String company="Not found";
//        try{
//            Connect connect = new Connect();
//            Connection c = connect.connect();
//            Statement stmt = null;
//            stmt = c.createStatement();
//            System.out.println(id);
//            String sql = "Select * from InsuranceData where client_id = '" +id +"';";
//            ResultSet rs =  stmt.executeQuery(sql);
//            
//            if(rs.next()){
//                return rs.getString(3);
//            }
//        }catch(Exception e){
//            return "Error "+e;
//        }
//        return lname;
//    }
    
    public static void main(String args[])
    {
        try{
        String id="IN001";
        Connect connect = new Connect();
        Connection c = connect.connect();
            
        Statement stmt = null;
        stmt = c.createStatement();
        System.out.println(id);
        String sql = "Select * from InsuranceData where ins_id = '" +id +"';";
        //String sql = "Select * from InsuranceData;";
        ResultSet rs =  stmt.executeQuery(sql);
        
        String fname ="";
        if(rs.next())
        {
            fname=rs.getString(2);
        }
        
        System.out.print("First Name: "+fname);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
