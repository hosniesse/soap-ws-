package library;

import java.util.ArrayList;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import daos.BookDaoImpl;
import models.Book;
import models.BookRequest;
import models.BookResponse;

@WebService(serviceName="LibraryWs")
public class LibraryService {
	
	@WebMethod(operationName="Booklist")
	public BookResponse getAllBooks(@WebParam(name="listBooks")BookRequest bookrequest) {
		
		BookResponse getresponse= new BookResponse();
		//List<Book> booklist= new ArrayList<Book>();
		//Book book= bookrequest.getBookreq();
		BookDaoImpl bookd= new BookDaoImpl();
		List<Book> bl=bookd.getAllBooks();
		
		for (int i=0;i<bl.size();i++) {
			System.err.println("----------");
			System.err.println("id_book="+bl.get(i).getId());
			System.err.println("title_book="+bl.get(i).getTitle());
			System.err.println("isbn_book="+bl.get(i).getIsbn());
			System.err.println("releaseDate="+bl.get(i).getReleaseDate());
			System.err.println("registerDate="+bl.get(i).getRegisterDate());
			System.err.println("totalExamplaries="+bl.get(i).getTotalExamplaries());
			System.err.println("author="+bl.get(i).getAuthor());
			System.err.println("Categorys_code="+bl.get(i).getCategorys_code());
			System.err.println("----------");
			
			
		}
		return getresponse;
		
	}
	@WebMethod(operationName="Bookinsert")
	public   BookResponse insertbook(@WebParam (name="insert" )BookRequest bookrequest) {
		BookResponse getresponse= new BookResponse();
		List<Book> booklist= new ArrayList<Book>();
		Book book= bookrequest.getBookreq();
		BookDaoImpl bookd= new BookDaoImpl();
		
		boolean  bins=bookd.savebooks(book);
		if(bins) {
			System.err.println("insert successful");
			getresponse.setErrorMessage("no error");
			getresponse.setBookl(booklist);
			getresponse.setIssuccefull(Boolean.TRUE);
		}
		else
		{
			System.err.println("insert  unsuccessful");
			getresponse.setErrorMessage("no error");
			getresponse.setBookl(booklist);
			getresponse.setIssuccefull(Boolean.FALSE);
			
		}
		return getresponse;
	
	}
	


}
