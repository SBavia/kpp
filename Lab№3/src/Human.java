public abstract class Human {
	
	protected String human_name;
	
	public Human() {
		this.human_name = null;
	}
	
	public Human(String human_name) {
		this.human_name = human_name;
	}
	
	public int ReadBook(Book book) {
		return book.getPages();
	}
 	
	public String getName() {
		return this.human_name;
	}
	
	public void setName(String human_name) {
		this.human_name = human_name;
	}	
}