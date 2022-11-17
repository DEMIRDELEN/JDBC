package JDBC_Practice;

public class Query06 {
    public static void main(String[] args) {

        DatabaseUtilty.createConnection();

        String query = "select * from ogrenciler";

        System.out.println("sutun isimleri : " + DatabaseUtilty.getColumnNames(query));

        System.out.println("okul no: " + DatabaseUtilty.getColumnData(query, "okul_no"));
        System.out.println("ogrenci ismi: " + DatabaseUtilty.getColumnData(query, "ogrenci_ismi"));
        System.out.println("Sinif: " + DatabaseUtilty.getColumnData(query, "sinif"));
        System.out.println("cinsiyet: " + DatabaseUtilty.getColumnData(query, "cinsiyet"));
    }
}
