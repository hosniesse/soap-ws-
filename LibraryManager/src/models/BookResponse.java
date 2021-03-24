package models;

import java.util.List;

public class BookResponse {
	
	List<Book> Bookl;
	
	Boolean issuccefull ;
	String errorMessage ;

	public Boolean getIssuccefull() {
		return issuccefull;
	}

	public void setIssuccefull(Boolean issuccefull) {
		this.issuccefull = issuccefull;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<Book> getBookl() {
		return Bookl;
	}

	public void setBookl(List<Book> bookl) {
		Bookl = bookl;
	}
	
	

}
