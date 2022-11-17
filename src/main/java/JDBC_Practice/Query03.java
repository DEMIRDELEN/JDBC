package JDBC_Practice;

import jdbc.DBWork;

import java.sql.*;

public class Query03 {
    public static void main(String[] args) throws SQLException {

        DBWork db = new DBWork();

        Connection con = db.connect_to_db("SQLPractice", "postgres", "15658612012");

        Statement st = con.createStatement();

        String sql1 = "select * from ogrenciler";
        PreparedStatement ps = con.prepareStatement(sql1);

        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println("sütun sayısı: "+rsmd.getColumnCount());
        System.out.println("1. sütunun ismi: "+rsmd.getColumnName(1));
        System.out.println("2. sütunun ismi: "+rsmd.getColumnName(2));
        System.out.println("3. sütunun ismi: "+rsmd.getColumnName(3));
        System.out.println("4. sütunun ismi: "+rsmd.getColumnName(4));

        System.out.println("1. sütunun data tipi: "+ rsmd.getColumnTypeName(1));
        System.out.println("2. sütunun data tipi: "+ rsmd.getColumnTypeName(2));
        System.out.println("3. sütunun data tipi: "+ rsmd.getColumnTypeName(3));
        System.out.println("4. sütunun data tipi: "+ rsmd.getColumnTypeName(4));

        System.out.println("tablo ismi: "+rsmd.getTableName(2));
    }
}
