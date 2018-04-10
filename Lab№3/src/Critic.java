import java.util.ArrayList;
import java.util.List;

public class Critic extends Reader{
	
	private List<Review> reviews;
	
	public Critic() {
		super();
		this.reviews = new ArrayList<Review>();
	}
	
	public Critic(String critic_name) {
		super(critic_name);
		this.reviews = new ArrayList<Review>();
	}
	
	public boolean addReview(Review review) {
		if (this.reviews == null || review == null) return false;
		//review.setWriter(this);
		return this.reviews.add(review);
	}
	
	public boolean removeReview(Review review) {
		if (this.reviews == null || review == null) return false;
		return this.reviews.remove(review);
	}
	
	public List<Review> getReview() {
		return this.reviews;
	}
	
 	public void setReviews(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}

}