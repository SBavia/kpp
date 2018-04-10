import java.util.ArrayList;
import java.util.List;

public class Writer extends Human{
	
	private String Feedback;
	private List<Novel> novels;
	private List<Story> storeis;
	
	public Writer() {
		super();
		this.Feedback = null;
		this.novels = new ArrayList<Novel>();
		this.storeis = new ArrayList<Story>();
	}
	
	public Writer(String writer_name) {
		super(writer_name);
		this.Feedback = null;
		this.novels = new ArrayList<Novel>();
		this.storeis = new ArrayList<Story>();
	}

	public boolean addNovel(Novel novel) {
		if (this.novels == null || novel == null) return false;
		novel.setWriter(this);
		return this.novels.add(novel);
	}
	
	public boolean removeNovel(Novel novel) {
		if (this.novels == null || novel == null) return false;
		return this.novels.remove(novel);
	}
	
	public List<Novel> getNovel() {
		return this.novels;
	}
	
 	public void setNovels(ArrayList<Novel> novels) {
		this.novels = novels;
	}
 	
 	public boolean addStory(Story story) {
		if (this.storeis == null || story == null) return false;
		story.setWriter(this);
		return this.storeis.add(story);
	}
	
	public boolean removeStory(Story story) {
		if (this.storeis == null || story == null) return false;
		return this.storeis.remove(story);
	}
	
	public List<Story> getStory() {
		return this.storeis;
	}
	
 	public void setStoreis(ArrayList<Story> storeis) {
		this.storeis = storeis;
	}
	
 	public String getFeedback() {
 		return Feedback;
 	}
 	
	public void setFeedback(String Feedback) {
		this.Feedback = Feedback;
	}

}