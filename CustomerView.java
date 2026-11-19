import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CustomerView {

    public void show(Stage stage) {

        // Labels
        Label lblTitle = new Label("Customer Information");

        Label lblCustomerID = new Label("Customer ID:");
        Label lblFirstName = new Label("First Name:");
        Label lblLastName = new Label("Last Name:");
        Label lblPhone = new Label("Phone Number:");
        Label lblAddress = new Label("Address:");

        // Text Fields
        TextField txtCustomerID = new TextField();
        TextField txtFirstName = new TextField();
        TextField txtLastName = new TextField();
        TextField txtPhone = new TextField();
        TextField txtAddress = new TextField();

        // Buttons
        Button btnSave = new Button("Save");
        Button btnClear = new Button("Clear");
        Button btnBack = new Button("Back");

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(lblTitle, 0, 0);

        grid.add(lblCustomerID, 0, 1);
        grid.add(txtCustomerID, 1, 1);

        grid.add(lblFirstName, 0, 2);
        grid.add(txtFirstName, 1, 2);

        grid.add(lblLastName, 0, 3);
        grid.add(txtLastName, 1, 3);

        grid.add(lblPhone, 0, 4);
        grid.add(txtPhone, 1, 4);

        grid.add(lblAddress, 0, 5);
        grid.add(txtAddress, 1, 5);

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(btnSave, btnClear, btnBack);

        grid.add(buttonBox, 1, 6);

        Scene scene = new Scene(grid, 450, 300);

        stage.setTitle("Customer View");
        stage.setScene(scene);
        stage.show();
    }
}