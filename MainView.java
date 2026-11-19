import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        showLoginView(primaryStage);
    }

    private void showLoginView(Stage stage) {

        Label lblUsername = new Label("Username:");
        Label lblPassword = new Label("Password:");

        TextField txtUsername = new TextField();
        PasswordField txtPassword = new PasswordField();

        Button btnLogin = new Button("Login");

        btnLogin.setOnAction(e -> {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText(null);
            alert.setContentText("Login Successful!");
            alert.showAndWait();

            showCustomerView(stage);
        });

        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblUsername, 0, 0);
        root.add(txtUsername, 1, 0);

        root.add(lblPassword, 0, 1);
        root.add(txtPassword, 1, 1);

        root.add(btnLogin, 1, 2);

        stage.setScene(new Scene(root, 350, 200));
        stage.setTitle("Login View");
        stage.show();
    }

    private void showCustomerView(Stage stage) {

        Label lblCustomerID = new Label("Customer ID:");
        Label lblFirstName = new Label("First Name:");
        Label lblLastName = new Label("Last Name:");
        Label lblPhone = new Label("Phone:");
        Label lblAddress = new Label("Address:");

        TextField txtCustomerID = new TextField();
        TextField txtFirstName = new TextField();
        TextField txtLastName = new TextField();
        TextField txtPhone = new TextField();
        TextField txtAddress = new TextField();

        Button btnSave = new Button("Save");
        Button btnClear = new Button("Clear");

        btnSave.setOnAction(e -> {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Customer");
            alert.setHeaderText(null);
            alert.setContentText("Customer Saved Successfully!");
            alert.showAndWait();

            showAccountView(stage);
        });

        btnClear.setOnAction(e -> {

            txtCustomerID.clear();
            txtFirstName.clear();
            txtLastName.clear();
            txtPhone.clear();
            txtAddress.clear();
        });

        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblCustomerID, 0, 0);
        root.add(txtCustomerID, 1, 0);

        root.add(lblFirstName, 0, 1);
        root.add(txtFirstName, 1, 1);

        root.add(lblLastName, 0, 2);
        root.add(txtLastName, 1, 2);

        root.add(lblPhone, 0, 3);
        root.add(txtPhone, 1, 3);

        root.add(lblAddress, 0, 4);
        root.add(txtAddress, 1, 4);

        root.add(btnSave, 0, 5);
        root.add(btnClear, 1, 5);

        stage.setScene(new Scene(root, 450, 300));
        stage.setTitle("Customer View");
        stage.show();
    }

    private void showAccountView(Stage stage) {

        Label lblAccountNumber = new Label("Account Number:");
        Label lblAccountType = new Label("Account Type:");
        Label lblBalance = new Label("Balance:");

        Label accountNumber = new Label("1001");
        Label accountType = new Label("Savings");
        Label balance = new Label("P5000.00");

        Button btnDeposit = new Button("Deposit");
        Button btnWithdraw = new Button("Withdraw");
        Button btnTransfer = new Button("Transfer");
        Button btnBack = new Button("Back");

        btnDeposit.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Deposit Selected");
            alert.showAndWait();
        });

        btnWithdraw.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Withdrawal Selected");
            alert.showAndWait();
        });

        btnTransfer.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Transfer Selected");
            alert.showAndWait();
        });

        btnBack.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Returning to Customer View");
            alert.showAndWait();

            showCustomerView(stage);
        });

        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblAccountNumber, 0, 0);
        root.add(accountNumber, 1, 0);

        root.add(lblAccountType, 0, 1);
        root.add(accountType, 1, 1);

        root.add(lblBalance, 0, 2);
        root.add(balance, 1, 2);

        root.add(btnDeposit, 0, 4);
        root.add(btnWithdraw, 1, 4);
        root.add(btnTransfer, 0, 5);
        root.add(btnBack, 1, 5);

        stage.setScene(new Scene(root, 450, 300));
        stage.setTitle("Account View");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}