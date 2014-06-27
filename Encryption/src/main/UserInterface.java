package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserInterface extends Application {
	
	Scene scene;
	Stage mainStage;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome");
		NewUserInterface();
		primaryStage.setScene(scene);
		primaryStage.show();
		mainStage = primaryStage;
	}

	
	
	public void NewUserInterface(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		Text scenetitle = new Text("Welcome to behavior passoword beta");
		scenetitle.setId("welcome-text");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);
		
		Button btnSU = new Button("Sign Up");
		Button btnLI = new Button("Login");
		HBox hbBtn = new HBox(10);
		btnSU.setMinWidth(50);
		btnLI.setMinWidth(50);
		btnLI.setPrefSize(75.00, 15.00);
		btnSU.setPrefSize(75.00, 15.00);
	
		/*
		 * 
		btnSU.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btnLI.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

		TilePane tileButtons = new TilePane(Orientation.HORIZONTAL);
		tileButtons.setPadding(new Insets(20, 10, 20, 0));
		tileButtons.setHgap(10.0);
		tileButtons.setVgap(8.0);
		tileButtons.getChildren().addAll(btnLI, btnSU);
		tileButtons.setAlignment(Pos.CENTER);
		
		*/
		
		hbBtn.setAlignment(Pos.CENTER);
		hbBtn.getChildren().addAll(btnLI,btnSU);
		grid.add(hbBtn, 1, 4, 2, 1);
		scene = new Scene(grid, 450, 450);
		scene.getStylesheets().add
		 (UserInterface.class.getResource("WelcomePage.css").toExternalForm());
		
		btnSU.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        SignUpUserInterface();
		    }
		});

	}
	
	public void SignUpUserInterface(){
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		TextField userName = new TextField();
		PasswordField practicePassword = new PasswordField();
		PasswordField enterPassword = new PasswordField();
		PasswordField enterPassword2 = new PasswordField();
		
		Label userN = new Label("User Name");
		Label practiceP = new Label("Practice Password");
		Label enterP = new Label("Enter Password");
		Label enterP2 = new Label("Enter Password");
		
		Button done = new Button("Done");
		done.setPrefSize(75.00, 15.00);
		HBox hbBtn = new HBox();
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().addAll(done);

		
		grid.add(userN , 1, 1);
		grid.add(practiceP, 1, 2);
		grid.add(enterP, 1, 3);
		grid.add(enterP2, 1, 4);
		grid.add(userName, 2,1);
		grid.add(practicePassword,2,2);
		grid.add(enterPassword,2,3);
		grid.add(enterPassword2,2,4);
		grid.add(hbBtn,2,5);

		done.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e){
				
			}
		});
		
		
		scene = new Scene(grid, 450, 450);
		scene.getStylesheets().add
		 (UserInterface.class.getResource("WelcomePage.css").toExternalForm());
		mainStage.setScene(scene);
		mainStage.show();
	}
}
