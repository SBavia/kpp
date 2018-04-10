public abstract class Book {
	
	protected int numberOfpages;
	
	protected Writer writer;
	
	public Book() {
		this.numberOfpages = 0;
		this.writer = null;
	}
	
	public Book(int numberOfpages) {
		this.numberOfpages = numberOfpages;
		this.writer = null;		
	}
	
	public int getPages() {
		return this.numberOfpages;
	}
	
	public void setPages(int numberOfpages) {
		this.numberOfpages = numberOfpages;
	}
	
	public Writer getWriter() {
		return this.writer;
	}
	
	public void setWriter(Writer writer) {
		this.writer = writer;
	}
}
