public class Review extends Book {
	
	public Review() {
		super.numberOfpages = 0;
		super.writer = null;
	}
	
	public Review(int numberOfpages) {
		super.numberOfpages = numberOfpages;
		super.writer = null;
	}
	
	/*public void setWriter(Critic critic) {
		//super.writer = critic;
	}*/
}