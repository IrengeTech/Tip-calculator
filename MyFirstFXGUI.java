import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class MyFirstFXGUI extends Application 
   { 
   public static void main(String[] args) 
   { 
   launch(args);
   } 
   @Override 
   public void start(Stage primaryStage) 
      { 
         //Create the controls.
         Label promptLabel = new Label("Restaurant Charge:");
         TextField chargesTextField = new TextField();
         Button calcButton = new Button("Calculate Tip");
         Label outputLabel = new Label("Amount to tip:");
         Label tipAmountLabel = new Label();
         
         //Put the controls in the VBox.
         VBox vbox = new VBox(10, promptLabel, chargesTextField, calcButton, outputLabel, tipAmountLabel);
          
         //center align and Pad the VBox.
         vbox.setAlignment(Pos.CENTER);
         vbox.setPadding(new Insets(10));
         
         //Register an event handler for the button
         calcButton.setOnAction(e ->
            {
               double tip = Double.parseDouble(chargesTextField.getText()) * 0.2;
               tipAmountLabel.setText(String.format("$%.2f", tip));
            });
         
         //Make the VBox the root node.
         Scene scene = new Scene(vbox);
         
         //Set a stylesheet for the scene.
         scene.getStylesheets() .add("nccia.css");
         
         // Set the scene to the stage.
         primaryStage.setScene(scene); 
          
         // Show the window. 
         primaryStage.show();
      }
      
    }