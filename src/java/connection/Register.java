package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Register {
    public String insert(String ins,
                        String fname,
                        String lname,
                        String pass,
                        String company,
                        String startDate,
                        String endDate,
                        int install){
        try{
            Connect connect = new Connect();
            
            Connection c = connect.connect();
            
            Statement stmt = null;
            stmt = c.createStatement();
            
            String sql = "INSERT INTO InsuranceData"
            		+ "(ins_id, fname, lname, passwd, company, startDate, endDate, install) "
                        + "VALUES ('"+ins+"',  '"
            			+fname+"', '"
            			+lname+"', '"
                                +pass+"', '"
                                +company
                 		+"' , (SELECT TO_DATE('" + startDate + "', 'YYYY-MM-DD')),"
                 		+" (SELECT TO_DATE('" + endDate + "', 'YYYY-MM-DD')), " 
                 		+install+");";
            
            int n = stmt.executeUpdate(sql);
            if(n>=0)
            {
                return "Success";
            }   
            System.out.print("Returned: "+n);
        }
        catch(Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            return "Error";
        }         
        return "There was an error while registration";
    }
}
