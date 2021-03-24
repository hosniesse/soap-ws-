package models;


import java.util.Date;

public class Book {
	
	private Integer id;

	private String title;
	
	private String isbn;
	
	private Date releaseDate;
	
	private Date registerDate;
	
	private Integer totalExamplaries;
	
	private String author;
	
	private String Categorys_code;
	
	private Category category;
	
	public Book(String title,String isbn, Date releaseDate,Date registerDate,Integer totalExamplaries,String author, String Categorys_code ,Category category) {
		this.title=title;
		this.isbn=isbn;
		this.releaseDate=releaseDate;
		this.registerDate=registerDate;
		this.totalExamplaries=totalExamplaries;
		this.author=author;
		this.Categorys_code=Categorys_code;
		this.category=category;
	}
public Book() {
	
}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Integer getTotalExamplaries() {
		return totalExamplaries;
	}

	public void setTotalExamplaries(Integer totalExamplaries) {
		this.totalExamplaries = totalExamplaries;
	}

	public String getAuthor() {
		return author;
	}
	
	

	public String getCategorys_code() {
		return Categorys_code;
	}
	public void setCategorys_code(String categorys_code) {
		Categorys_code = categorys_code;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}


	
	
	

}
