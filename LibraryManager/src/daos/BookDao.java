package daos;

import java.util.List;

import models.Book;

public interface BookDao {
	
	public  List<Book> getAllBooks();
	//Book getBookByIsbn(String isbn);
	//public void updatebooks (Book book);
    public  boolean savebooks(Book book);
   // public void deletebooks(Book book);

}
