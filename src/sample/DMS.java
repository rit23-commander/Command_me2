package sample;

import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DMS {
  String location = "jdbc:mysql//127.0.0.1:3306/command_line";
   String uname = "root";
   String password = "ritesh";

    public void take_out() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(location , uname , password);
            Statement stm = con.createStatement();
            ResultSet rs =  stm.executeQuery(" select  //table name //  form command_line.login_info   ");

            while(rs.next()) {
              // loop body
            }

        }catch(Exception e) {
            System.out.println("Error :- " +e.getMessage());
        }

    }

    public static void main(String [] args) {
        new DMS().take_out();
    }
}
