package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
    public String loginSuccess(String uname, String pass){
        try{
            Connect connect = new Connect();
            
            Connection c = connect.connect();
            
            Statement stmt = null;
            stmt = c.createStatement();
            System.out.println(uname);
//            String sql = "Select count(*) cnt from LoginClient where client_id = '" + uname + "' and passwd = '" + pass+"';";
            String sql = "Select count(*) cnt from InsuranceData where ins_id = '" + uname + "' and passwd = '" + pass+"';";
            
            ResultSet rs =  stmt.executeQuery(sql);
            rs.next();
            
            if(rs.getInt("cnt") == 1){
                return "Success";
            }
            
        }
        catch(Exception e){
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            return "Error Exception";
        }
        System.out.println("Inserted Insurance into database");          
        return "Invalid Username or Password!";
    }
}
