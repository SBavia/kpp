public class Novel extends Book{
	
	public Novel() {
		super.numberOfpages = 0;
		super.writer = null;
	}
	
	public Novel(int numberOfpages) {
		super.numberOfpages = numberOfpages;
		super.writer = null;
	}
}