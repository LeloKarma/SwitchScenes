package javafxGui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;

//extend the application class
public class SwitchScenes extends Application {
  
  //declaring the stage and scenes
   //Stage window;
   Scene scene1, scene2;

  //ovrride the start method
	@Override 
	public void start(Stage primaryStage) throws Exception{
	
		
		//layout 1
		Label label1 = new Label("THis is Stage one");
		Button button1 = new Button("Go to scene 2 here");
		button1.setOnAction(e -> primaryStage.setScene(scene2));
		
		VBox box = new VBox(20);
		box.getChildren().addAll(label1, button1);
		scene1 = new Scene(box, 300, 150);
		
		
		//layout 2
		Label label2 = new Label("This is Stage two");
		Button button2 = new Button("This page is ugly! Go back here");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		
		StackPane pane = new StackPane();
		pane.getChildren().addAll(label2, button2);
		scene2 = new Scene(pane, 200, 200);
		
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Switching Scenes Fx");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
