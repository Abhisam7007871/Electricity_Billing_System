package electricity.billing.system;

import java.sql.*;

public class database {

    Connection connection;

    Statement statement;

    database(){
        try {

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_System","root","Rupal91#");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
