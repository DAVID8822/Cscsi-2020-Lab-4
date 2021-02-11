package csci2020u.lab04;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        Label user_id=new Label("User ID");
        Label password = new Label("Password");
        Label fullname =new Label("Full Name");
        Label email = new Label("Email");
        Label phone=new Label("Phone Number");
        Label dob = new Label("Date of Birth");
        Label empty = new Label("");
        TextField tf1=new TextField();
        PasswordField passwordField = new PasswordField();
        TextField tf3=new TextField();
        TextField tf4=new TextField();
        TextField tf5=new TextField();
        DatePicker datePicker = new DatePicker();
        Button button = new Button("Submit");
        button.setOnAction(e->{
            System.out.println("You entered: User_ID: "+tf1.getText());
            System.out.println("You entered: password: "+password.getText());
            System.out.println("You entered: Full Name: "+tf3.getText());
            System.out.println("You entered: Email: "+tf4.getText());
            System.out.println("You entered: Phone Number: "+tf5.getText());
            System.out.println("You entered: Date of Birth: "+datePicker.getValue());

        }
        );
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.addRow(0, user_id, tf1);
        root.addRow(1, password, passwordField);
        root.addRow(2, fullname,tf3);
        root.addRow(3, email,tf4);
        root.addRow(4, phone,tf5);
        root.addRow(5, dob,datePicker);
        root.addRow(6, empty,button);
        Scene scene= new Scene(root,1000,1000);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Text Field Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


