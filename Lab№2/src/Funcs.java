import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Funcs extends Stage {
	
	private final String TITLE_WINDOW;
	private Writer writer = new Writer("Гоголевский");
	private Reader reader = new Reader("Лев");
	
	// объявление графических элементов
	private Scene scene;
	private Label[] labels;
	private Button[] buttons;
	private TextField[] text;
	int numberOfpages, k = -1;
	
	// логический блок для создания графических элементов
		{
			
			//this.human = new Human("клуб");
			//this.human.addWriter(new Writer("Гоголевский"));
			//this.human.addReader(new Reader("Лев"));
			
			this.TITLE_WINDOW = new String("Лаб2, 16й вар");
			
			this.text = new TextField[] {
					
					new TextField(),
					new TextField()
			};
			
			this.labels = new Label[] {
					
				new Label("Читающий club"), 
				new Label("Писатель"),
				new Label("Читатель"),
				new Label("Для отзыва"),
				new Label("Кол-во страниц")
			};
			
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					this.labels[0].setStyle("-fx-font-size: 25px; -fx-font-weight: bold");
					continue;
				}
				this.labels[i].setStyle("-fx-font-size: 20px");
			}
			
			this.buttons = new Button[] {
					 
					new Button("Писать книгу"),
					new Button("Прочитать книгу и дать отзыв"),
					new Button("Выход")					
				};
			//for (int i = 0; i < this.buttons.length; i++) this.buttons[i].setPrefWidth(100.0);
		}
		
		public Funcs() {
			
			GridPane Pane = new GridPane();
			Pane.setPadding(new Insets(10.0));
			Pane.setVgap(15.0);
			Pane.setHgap(10.0);
			
			ToggleGroup group = new ToggleGroup();
			
			// устнавливаем расположение лэйблов в ячейках
			for (int i = 0; i < this.labels.length; i++) 
				GridPane.setHalignment(this.labels[i], HPos.CENTER);
			// устанавливаем расположение кнопок в ячейках
			for (int i = 0; i < this.buttons.length; i++) 
				GridPane.setHalignment(this.buttons[i], HPos.CENTER);
			
			Pane.add(this.text[0], 0, 3);
			Pane.add(this.labels[0], 0, 0, 2, 1);
			Pane.add(this.labels[1], 0, 1);
			Pane.add(this.labels[2], 1, 1);
			Pane.add(this.buttons[0], 0, 4);
			Pane.add(this.buttons[1], 1, 4);
			Pane.add(this.buttons[2], 1, 6);
			Pane.add(this.text[1], 1, 3);
			Pane.add(this.labels[3], 1, 2);
			Pane.add(this.labels[4], 0, 2);
			
			
			// устанавливаем обработчики событий
			for (int i = 0; i < this.buttons.length; i++) {
				
				switch (i) {
				
				case 0:    
					
					this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
						try {
							numberOfpages = Integer.parseInt(text[0].getText());
							this.writer.addBook(new Book(numberOfpages));
							Funcs.showDialogMessage("Книга написана!");
							k++;
							text[0].setText(null);
							}catch (Exception ex ) {Funcs.showDialogMessage("WARNING!!!", "Чтобы написать книгу, сначала введите кол-во страниц");}
						});
					break;
					
						   
				case 1:
					
					this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
						try {
								Book book;
								book = this.writer.getBook().get(k);
								String temp_pages;
								//Sring  temp_feedback;
								int temp;
								this.reader.GiveFeedback(writer, text[1].getText());
								//temp = this.reader.Read();
								//temp_feedback = this.writer.getFeedback();
								temp = book.getPages();
								temp_pages = String.valueOf(temp);
								Funcs.showDialogMessage("Кол-во страниц в прочитанной книге = " + temp_pages + "\nОтзыв отправлен");
								text[1].setText(null);
								}catch (Exception ex ) {Funcs.showDialogMessage("WARNING!!!", "Вы не можете прочитать книгу и оправить по ней отзыв, если она еще не написана :)");}
						});
					break;
						   
				case 2:
					
					this.buttons[i].addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
						this.close();
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