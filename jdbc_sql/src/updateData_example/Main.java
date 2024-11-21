package updateData_example;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {

            conn = DB.getConnection();
            st = conn.prepareStatement("UPDATE seller " +
                    "SET BaseSalary = BaseSalary + ? " +
                    "WHERE " +
                    "(DepartmentId = ?)");

            st.setDouble(1, 200.0);
            st.setInt(2, 2);

            int affectedRows = st.executeUpdate();

            System.out.println("Done! Affected rows: " + affectedRows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
