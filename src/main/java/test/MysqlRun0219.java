package test;

import java.sql.*;

public class MysqlRun0219 {
    public static void main(String [] args) throws ClassNotFoundException, SQLException {
        //要连接的数据库URL
        String url = "jdbc:mysql://127.0.0.1:3306/superdb?characterEncoding=UTF-8";
        //连接的数据库时使用的用户名
        String username = "root";
        //连接的数据库时使用的密码
        String password = "1234567";
        Class.forName("com.mysql.cj.jdbc.Driver");//推荐使用这种方式来加载驱动
        //2.获取与数据库的链接
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql="select * from sale limit 0,2 ";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        ResultSet rs=preparedStatement.executeQuery();
        while(rs.next()){
            String BILL=rs.getString("BILL");
            System.out.println(BILL);
        }
    }
}
