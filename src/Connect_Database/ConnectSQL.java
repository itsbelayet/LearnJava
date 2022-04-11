package Connect_Database;

import java.sql.*;

public class ConnectSQL {
    /*
        1. Create a Connection
        2. Create Statement/Query
        3. Execute Statement/Query
        4. Store Date in resultSet
        5. Close Connection/Close Statement
     */

    public static void main(String[] args) throws SQLException {

        // 1. Create a Connection
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Miru@1964");

        // 2. Create Statement/Query
        Statement statement=connection.createStatement();
        String st="select * from miru";

        // 3.4. Execute Statement/Query  &  Store date in resultset
        ResultSet rs=statement.executeQuery(st);

        while (rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            System.out.println(id+"  "+name);
        }

        // 5. Close connection
        connection.close();
        statement.close();
    }
}
