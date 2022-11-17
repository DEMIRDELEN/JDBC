package JDBC_Practice;

import jdbc.DBWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Query04 {

    public static void main(String[] args) throws SQLException {

        DBWork db = new DBWork();

        Connection con = db.connect_to_db("SQLPractice", "postgres", "15658612012");

        //Statement st = con.createStatement();

        String sql1 = "insert into ogrenciler values (?, ?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql1);

        ps.setInt(1, 200);
        ps.setString(2, "Veli Can");
        ps.setString(3, "12");
        ps.setString(4, "E");

        ps.executeUpdate();

        System.out.println("veri girisi yapildi");
    }
}
