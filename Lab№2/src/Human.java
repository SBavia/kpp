//import java.util.ArrayList;
//import java.util.List;

public class Human {
	
	private String human_name;
	
	//private List<Writer> writer;

	//private List<Reader> reader;
	
	public Human() {
		this.human_name = null;
	}
	
	public Human(String human_name) {
		this.human_name = human_name;
	}
	
	/*public boolean addWriter(Writer writer) {
		if (this.writer == null || writer == null) return false;
		writer.setHuman(this);
		return this.writer.add(writer);
		
		/*if (this.writer == null || writer == null) return false;
		for ( : this.animals) employee.addAnimal(animal);
		writer.setHuman(this);
		return this.writer.add(writer);
		
	}
	
	public boolean addAll(Writer... writers) {
		for (int i = 0; i < writers.length; i++) if (writers[i] == null) return false;
		for (int i = 0; i < writers.length; i++) this.writer.add(writers[i]);
		return true;
	}
	
	public boolean removeWriter(Writer writer) {
		if (this.writer == null || writer == null) return false;
		return this.writer.remove(writer);
	}
	
 	public boolean addReader(Reader reader) {
		if (this.reader == null || reader == null) return false;
		reader.setHuman(this);
		return this.reader.add(reader);
	}
	
 	public boolean removeReader(Reader reader) {
		if (this.reader == null || reader == null) return false;
		return this.reader.remove(reader);
	}*/
 	
	public String getName() {
		return this.human_name;
	}
	
	public void setName(String human_name) {
		this.human_name = human_name;
	}
		
	/*public List<Writer> getWriter() {
		return this.writer;
	}
	
	public void setWriter(ArrayList<Writer> writer) {
		this.writer = writer;
	}
	
	public List<Reader> getReader() {
		return this.reader;
	}
	
	public void setReader(ArrayList<Reader> reader) {
		this.reader = reader;
	}*/
	
}
