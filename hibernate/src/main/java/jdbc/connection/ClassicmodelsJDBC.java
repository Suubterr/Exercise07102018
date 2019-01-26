package jdbc.connection;


import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.StringJoiner;
import java.util.logging.Logger;

public class ClassicmodelsJDBC {



    public static void main(String[] args) throws SQLException, IOException {
        myConnection();
    }

    public static void myConnection() throws SQLException, IOException {

        Logger logger = Logger.getLogger(ClassicmodelsJDBC.class.getName());

        String url = "jdbc:mysql://localhost:3306/sda?serverTimezone=UTC&useSSL=false";
        String databaseUsername = "root";
        String databasePassword = "korn44";
        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("connection.prop"));
//        properties.put("user", databaseUsername);
//        properties.put("password", databasePassword);
        Connection connection = DriverManager.getConnection(url, properties);

        logger.info("Connection "+url+" established.");

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(
                    "SELECT\n" +
                            "\ta.customerName\n" +
                            "\t, b.orderDate\n" +
                            "from \n" +
                            "\tclassicmodels.customers a\n" +
                            "\tjoin classicmodels.orders b on a.customerNumber = b.customerNumber\n" +
                            "\tjoin classicmodels.orderdetails c on c.orderNumber = b.orderNumber\n" +
                            "order by b.orderDate DESC\n" +
                            "limit 10\n" +
                            ";"
                    );
            while (resultSet.next()) {
                //int column1 = resultSet.getInt(1);
                String column1 = resultSet.getString(1);
                String column2 = resultSet.getString(2);
                //String column3 = resultSet.getString(3);
                //String column4 = resultSet.getString(4);
                String row = new StringJoiner(",")
                        .add(String.valueOf(column1))
                        .add(column2)//.add(column3).add(column4)
                        .toString();
                System.out.println(row);
            }
        }
    }
}
