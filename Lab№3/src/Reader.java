public class Reader extends Human {
	
	public Reader() {
		super();
	}
	
	public Reader(String reader_name) {
		super(reader_name);
	}
	
	protected void GiveFeedback(Writer writer, String Feedback) {
		writer.setFeedback(Feedback);
	}	
}