import java.util.ArrayList;
import java.util.List;

public class Writer extends Human{
	
	private String Feedback;
	
	private List<Book> books;
	
	private Human human;
	
	public Writer() {
		//super("Writer");
		this.Feedback = null;
		this.books = new ArrayList<Book>();
		this.human = null;
	}
	
	public Writer(String writer_name) {
		//super(writer_name);
		this.Feedback = null;
		this.books = new ArrayList<Book>();
		this.human = null;
	}

	public boolean addBook(Book book) {
		if (this.books == null || book == null) return false;
		book.setWriter(this);
		return this.books.add(book);
	}
	
	/*public boolean addAll(Book... books) {
		for (int i = 0; i < books.length; i++) if (books[i] == null) return false;
		for (int i = 0; i < books.length; i++) this.books.add(books[i]);
		return true;
	}*/
	
	public boolean removeBook(Book book) {
		if (this.books == null || book == null) return false;
		return this.books.remove(book);
	}
	
	public List<Book> getBook() {
		return this.books;
	}
	
 	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

 	public String getFeedback() {
 		return Feedback;
 	}
 	
	public void setFeedback(String Feedback) {
		this.Feedback = Feedback;
	}

	public Human getHuman() {
		return this.human;
	}
	
	public void setHuman(Human human) {
		this.human = human;
	}
}
