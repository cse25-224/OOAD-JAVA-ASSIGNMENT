import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AccountView {

    public void show(Stage stage) {

        // Account Information Labels
        Label lblTitle = new Label("Account Details");

        Label lblAccountNumber = new Label("Account Number:");
        Label lblAccountNumberValue = new Label("1001");

        Label lblAccountType = new Label("Account Type:");
        Label lblAccountTypeValue = new Label("Savings Account");

        Label lblBalance = new Label("Balance:");
        Label lblBalanceValue = new Label("P5000.00");

        // Buttons
        Button btnDeposit = new Button("Deposit");
        Button btnWithdraw = new Button("Withdraw");
        Button btnTransfer = new Button("Transfer");
        Button btnBack = new Button("Back");

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(lblTitle, 0, 0);

        grid.add(lblAccountNumber, 0, 1);
        grid.add(lblAccountNumberValue, 1, 1);

        grid.add(lblAccountType, 0, 2);
        grid.add(lblAccountTypeValue, 1, 2);

        grid.add(lblBalance, 0, 3);
        grid.add(lblBalanceValue, 1, 3);

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(
                btnDeposit,
                btnWithdraw,
                btnTransfer,
                btnBack
        );

        grid.add(buttonBox, 0, 5, 2, 1);

        Scene scene = new Scene(grid, 450, 250);

        stage.setTitle("Account View");
        stage.setScene(scene);
        stage.show();
    }
}