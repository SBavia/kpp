public class Reader extends Human {
	
	//private Human human;
	
	public Reader() {
		//super("Reader");
	}
	
	public Reader(String reader_name) {
		//super(reader_name);
	}

	public int Read(Book book) {
		return book.getPages();
	}
	
	public void GiveFeedback(Writer writer, String Feedback) {
		writer.setFeedback(Feedback);
	}

	/*public Human getHuman() {
		return this.human;
	}
	
	public void setHuman(Human human) {
		this.human = human;
	}*/
	
}
