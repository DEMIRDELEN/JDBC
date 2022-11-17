package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //.1. adım: driver a kaydol
        Class.forName("org.postgresql.Driver");

        //.2. adım: database a bağlan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed", "postgres", "15658612012");

        //.3. adım: Statement olustur.
        Statement st = con.createStatement();

        /*
        Statement:Statik bir SQL ifadesi yürütmek ve ürettiği sonuçları döndürmek için kullanılan nesne. Varsayılan olarak,
        aynı anda Statement nesnesi başına yalnızca bir ResultSet nesnesi açılabilir. Bu nedenle, bir ResultSet nesnesinin okuması
        diğerinin okumasıyla aralanmışsa, her biri farklı Statement nesneleri tarafından oluşturulmuş olmalıdır. Açık bir varsa,
        Statement arabirimindeki tüm yürütme yöntemleri, ifadenin geçerli bir ResultSet nesnesini örtük olarak kapatır.
         */

        //.4. adım: Query calıstır.
        //1.Example: "workers" adında bir table oluşturup "worker_id,worker_name, worker_salary" sütunlarını ekleyin.

        String sql1="Create table workers(worker_id varchar(50),worker_name varchar(50), worker_salary int)";
        st.execute(sql1);

        //2.Örnek: Alter table by adding worker_address column into the workers table
        // table a worker_address sütunu ekleyerek alter yapın.

        String sql2="alter table workers add worker_address varchar(80)";
        st.execute(sql2);

        //.3. örnek: drop workers table
        String sql3="drop table workers";
        st.execute(sql3);

        //.5. adım: bağlantı ve statement ı kapat.
        con.close();
        st.close();


    }
}
