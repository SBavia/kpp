import javafx.application.Application;
import javafx.stage.Stage;

public class MainFrame extends Application {
	
	private Stage stage;
	
	@Override 
	public void start(Stage primaryStage) {
		
		primaryStage = new Funcs();
		this.setStage(primaryStage);
		
	}
	
	public static void main(String[] args) {

		launch(args);

	}

	/**
	 * @return the stage
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}

}