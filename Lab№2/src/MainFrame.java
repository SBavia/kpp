import javafx.application.Application;
import javafx.stage.Stage;

public class MainFrame extends Application {
	
	private Stage stage;
	
	@Override 
	public void start(Stage primaryStage) {
		
		primaryStage = new Funcs();
		this.stage = primaryStage;
		
	}
	
	public static void main(String[] args) {

		launch(args);

	}

}