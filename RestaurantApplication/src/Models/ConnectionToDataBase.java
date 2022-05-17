package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionToDataBase {

    Connection ConnectorOfDatabase;

    Connection ConenctToDataBase() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConnectorOfDatabase = DriverManager.getConnection(
                    "jdbc:sqlserver://LAPTOP-K0JBMP71\\SQLEXPRESS01:62638;databaseName=CustomerModule",
                    "sayed", "2073");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Connection to your database is not established!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection to Tables is Failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ConnectorOfDatabase;
    }
}
