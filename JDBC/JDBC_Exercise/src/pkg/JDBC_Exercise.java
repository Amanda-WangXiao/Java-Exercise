package pkg;
import java.sql.*;
import com.mysql.*;
import java.util.*;

public class JDBC_Exercise {
	  
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
    	String URL = "jdbc:mysql://localhost:xxxx/";
    	String USER = "";
    	String PASSWORD = "";
    	
//1.加载驱动程序
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
//2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        
//3.操作数据库，实现增删改查
        
        //增加
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Please input id: ");
    	String i_id=scanner.next();
    	System.out.print("Please input name: ");
    	String i_name=scanner.next();
    	System.out.print("Please input age: ");
    	String i_age=scanner.next();
    	
    	String sql="insert into xxx values(?,?,?)";
    	PreparedStatement pre = conn.prepareStatement(sql);
    	pre.setInt(1, Integer.parseInt(i_id));
    	pre.setString(2, i_name);
    	pre.setInt(1, Integer.parseInt(i_age));
        pre.executeUpdate();
        
        
        //删除
        String sql="delete from xxx where id=xxx";
        PreparedStatement pre = conn.prepareStatement(sql);
        pre.executeUpdate();
        
        
        //修改
        String sql="update xxx set age=? where id=xxx";
        PreparedStatement pre = conn.prepareStatement(sql);
        pre.executeUpdate();
        
    
        //查询
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from xxx");

        while(rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getInt("age"));
        }
        
        rs.close();
        st.close();
        conn.close();
    }
}