package JDBC_Practice;

import jdbc.DBWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws SQLException {

        //SORU: Öğrenciler tablosuna yen bir kayıt ekleyin (300, 'Sena Can', 12, 'K')

        DBWork db = new DBWork();

        Connection con = db.connect_to_db("SQLPractice", "postgres", "15658612012");

        String sql1 = "insert into ogrenciler values (300, 'Sena Can', 12, 'K')";


        Statement st = con.createStatement();

        // int s1 = st.executeUpdate(sql1);
//
        // System.out.println(s1 + " satır database'e eklendi.");


       // String sql2 = "insert into ogrenciler values (302, 'Sena Can', 12, 'K')," +
       //         "(401, 'Sena Can', 12, 'K')," +
       //         "(402, 'Sena Can', 12, 'K')";


        // st.executeUpdate(sql2);

        String veri[] = {"insert into ogrenciler values (400, 'Sena Can', 12, 'K')",
                "insert into ogrenciler values (401, 'Sena Can', 12, 'K')",
                "insert into ogrenciler values (402, 'Sena Can', 12, 'K')"};

        for (String each : veri
        ) {
            st.executeUpdate(each);
        }

        System.out.println(veri.length + " satır data eklendi.");



    }
}
