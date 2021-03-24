package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import models.Book;
import models.Category;

public class BookDaoImpl implements BookDao {
	
	public BookDaoImpl() {
		
	}
	
	
	String Result="no record fund";
	String myDriver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/library?serverTimezone=UTC";
	
	public List<Book> getAllBooks(){
		List<Book>getAllBooks=new ArrayList<>();
		try
		{
			Connection con=DriverManager.getConnection(url,"root","");
			Statement st=con.createStatement();
			String query="SELECT*FROM BOOKS CROSS JOIN categorys ";                                 //ON BOOKS.label= categorys.label
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				Book newbook=new Book();
				newbook.setId(rs.getInt("id"));
				newbook.setAuthor(rs.getString("author"));
				newbook.setIsbn(rs.getString("isbn"));
				newbook.setRegisterDate(rs.getDate("RegisterDate"));
				newbook.setReleaseDate(rs.getDate("ReleaseDate"));
				newbook.setTitle(rs.getString("Title"));
				newbook.setTotalExamplaries(rs.getInt("totalExamplaries"));
				newbook.setCategorys_code(rs.getString("Categorys_code"));
				newbook.setCategory( (Category) rs.getObject("Label"));
				getAllBooks.add(newbook);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return getAllBooks;
	}

	
	public boolean savebooks(Book book) {
		
		try {
			Connection con=DriverManager.getConnection(url,"root","");
			String qry="INSERT INTO BOOKS (Title,isbn ,ReleaseDate ,RegisterDate,totalExamplaries,author)"+" VALUES(?,?,?,?,?,?)";
			PreparedStatement st=con.prepareStatement(qry);
			st.setString(1, book.getTitle());
			st.setString(2, book.getIsbn());
			st.setDate(3,  new java.sql.Date(book.getReleaseDate().getTime()));
			st.setDate(4,new java.sql.Date(book.getRegisterDate().getTime()));
			st.setInt(5, book.getTotalExamplaries());
			st.setString(6, book.getAuthor());
			int i=st.executeUpdate();
			if(i==1) {
				
				
				return true;
			}
			ResultSet tableKeys = st.getGeneratedKeys();
			tableKeys.next();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	
	

}
