package JDBC_Practice;

import jdbc.DBWork;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query02 {
    public static void main(String[] args) throws SQLException {

        DBWork db = new DBWork();

        Connection con = db.connect_to_db("SQLPractice", "postgres", "15658612012");

        Statement st = con.createStatement();

        String sql1 = "select * from ogrenciler where cinsiyet ILIKE 'E'";

        ResultSet veri = st.executeQuery(sql1);

        while (veri.next()){

            System.out.println(veri.getInt(1) + " " + veri.getString(2) + " " + veri.getString(3) + " " + veri.getString(4));
            System.out.println(veri.getString("okul_no")+ veri.getString("ogrenci_ismi")+ veri.getString("sinif")+veri.getString("cinsiyet"));

        }

        con.close();
        st.close();
        veri.close();
    }
}
