import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
//import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Funcs extends Stage {
	
	private final String TITLE_WINDOW;
	private Writer writer = new Writer("�����������");
	private Reader reader = new Reader("�������� ������������");
	private Critic critic = new Critic("�����");
	
	// ���������� ����������� ���������
	private Scene scene;
	private Label[] labels;
	private Button[] buttons;
	private TextField[] text;
	//private RadioButton[] radio_buttons;
	private ComboBox<String> combo_box;
	int novels = -1, stories = -1, reviews = -1, temp_pages;

	public Funcs() {
			
		this.TITLE_WINDOW = new String("���2, 16� ���");
		
		this.text = new TextField[] {
				new TextField(),
				new TextField(),
				new TextField()
				};
		
		this.labels = new Label[] {
				new Label("�������� club"), 
				new Label("��������"),
				new Label("��������"),
				new Label("������"),
				new Label("��� ������"),
				new Label("���-�� �������"),
				new Label("��� ��������(���-�� ���.)")
				};
		
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				this.labels[0].setStyle("-fx-font-size: 25px; -fx-font-weight: bold");
				continue;
				}
			
			this.labels[i].setStyle("-fx-font-size: 20px");
			}
		
		this.buttons = new Button[] {
				new Button("������ �����"),
				new Button("��������� ����� � ���� �����"),
				new Button("�����"),
				new Button("�������� ��������"),
				new Button("��������� ��������")
				};
		
		/*this.radio_buttons = new RadioButton[] {
				new RadioButton("�����"),
				new RadioButton("�������")
			};*/
		
		this.combo_box = new ComboBox<String>();
		this.combo_box.getItems().addAll("�����", "�������");
		this.combo_box.setPromptText("�����");
		
		GridPane Pane = new GridPane();
		Pane.setPadding(new Insets(10.0));
		Pane.setVgap(10.0);
		Pane.setHgap(10.0);
		
		/*ToggleGroup group = new ToggleGroup();
		
		for (int i = 0; i < this.radio_buttons.length; i++) 
			this.radio_buttons[i].setToggleGroup(group);
		this.radio_buttons[0].setSelected(true);*/
		
		// ������������ ������������ ������� � �������
		for (int i = 0; i < this.labels.length; i++) 
			GridPane.setHalignment(this.labels[i], HPos.CENTER);
		// ������������� ������������ ������ � �������
		for (int i = 0; i < this.buttons.length; i++) 
			GridPane.setHalignment(this.buttons[i], HPos.CENTER);
		GridPane.setHalignment(this.combo_box, HPos.CENTER);
		
		Pane.add(this.text[0], 0, 3);
		Pane.add(this.labels[0], 0, 0, 3, 1);
		Pane.add(this.labels[1], 0, 1);
		Pane.add(this.labels[2], 1, 1);
		Pane.add(this.buttons[0], 0, 5);
		Pane.add(this.buttons[1], 1, 4);
		Pane.add(this.buttons[2], 1, 7);
		Pane.add(this.buttons[3], 2, 4);
		Pane.add(this.buttons[4], 0, 6);
		Pane.add(this.text[1], 1, 3);
		Pane.add(this.text[2], 2, 3);
		Pane.add(this.labels[4], 1, 2);
		Pane.add(this.labels[5], 0, 2);
		Pane.add(this.labels[6], 2, 2);
		//Pane.add(this.radio_buttons[0], 2, 1);
		//Pane.add(this.radio_buttons[1], 2, 2);
		Pane.add(this.combo_box, 0, 4);
		Pane.add(this.labels[3], 2, 1);
		
		
		// ������������� ����������� �������
		for (int i = 0; i < this.buttons.length; i++) {
			
			switch (i) {
			
			case 0:    
				
				this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
					try {
						/*if (this.radio_buttons[0].isSelected()) {this.writer.addNovel(new Novel(numberOfpages)); k++;}
						else {this.writer.addStory(new Story(numberOfpages)); k1++;}*/
						
						switch (this.combo_box.getValue()) {
						
						case "�����": 
							this.writer.addNovel(new Novel(Integer.parseInt(text[0].getText()))); 
							novels++;
							break;
						case "�������": 
							this.writer.addStory(new Story(Integer.parseInt(text[0].getText()))); 
							stories++;
							break;
							}
						Funcs.showDialogMessage("����� ��������!");
						text[0].setText(null);
						}catch (Exception ex ) {Funcs.showDialogMessage("WARNING!!!", "����� �������� �����, ������� ������� ���-�� �������");}
					});
				break;
				
					   
			case 1:
				
				this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
					try {
							Book book = null;
							
							/*if (this.radio_buttons[0].isSelected()) book = this.writer.getNovel().get(k);
							else book = this.writer.getStory().get(k1);*/
							
							switch (this.combo_box.getValue()) {
							
							case "�����": book = this.writer.getNovel().get(novels);
							break;
							case "�������": book = this.writer.getStory().get(stories);
							break;
							
							}
							this.reader.GiveFeedback(this.writer, text[1].getText());
							temp_pages = this.reader.ReadBook(book);
							Funcs.showDialogMessage("���-�� ������� � ����������� ����� = " + String.valueOf(temp_pages) + "\n����� ���������");
							text[1].setText(null);
							}catch (Exception ex ) {Funcs.showDialogMessage("WARNING!!!", "�� �� ������ ��������� ����� � �������� �� ��� �����, ���� ��� ��� �� �������� :)");}
					});
				break;
					   
			case 2:
				
				this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
					this.close();
					});
				break;
				
			case 3:
				
				this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
					try {
						this.critic.addReview(new Review(Integer.parseInt(text[2].getText()))); 
						reviews++;
						Funcs.showDialogMessage("�������� ��������!");
						text[2].setText(null);
						}catch (Exception ex ) {Funcs.showDialogMessage("WARNING!!!", "����� �������� ��������, ������� ������� ���-�� �������");}
					});
				break;
				
			case 4:
				
				this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
					try {
							Book book = null;
							book = this.critic.getReview().get(reviews);
							temp_pages = this.writer.ReadBook(book);
							Funcs.showDialogMessage("���-�� ������� � �������� = " + String.valueOf(temp_pages));
							}catch (Exception ex ) {Funcs.showDialogMessage("WARNING!!!", "�� �� ������ ��������� ��������, ���� ��� ��� �� �������� :)");}
					});
				break;
				}
			}	
		
		this.scene = new Scene(Pane);
		setTitle(this.TITLE_WINDOW);
		setResizable(false);
		setScene(this.scene);
		show();
	}

	private static void showDialogMessage(String message) {
		
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		//alert.setTitle(title);
		alert.setContentText(message);
		alert.setHeaderText("");
		alert.showAndWait();
	}
	
	public static void showDialogMessage(String title, String message) {
		
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setContentText(message);
		alert.setHeaderText("");
		alert.showAndWait();
		
	}		
}