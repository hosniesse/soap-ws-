package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectionMysql.ConnectionMysql;
import models.Category;

public class CategoryDaoImpl implements CategoryDao {
	
	public CategoryDaoImpl() {
		
	}
	public Connection getconnectionmysql() {
		Connection con=ConnectionMysql.mysqlconnect();
		return con;
	}
	
	public List<Category> getAllcategorys(){
		List<Category> getAllcategorys=new ArrayList<>();
		try {
			
		Connection con = getconnectionmysql();
		Statement st=con.createStatement();
		String query="SELECT * FROM categorys";
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			Category newcategory=new Category();
			newcategory.setCode(rs.getString("code"));
			newcategory.setLabel(rs.getString("label"));
			
			getAllcategorys.add(newcategory);
			
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return getAllcategorys;
	}

}
