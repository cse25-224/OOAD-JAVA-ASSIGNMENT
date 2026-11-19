import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView {

    public void show(Stage stage) {

        Label lblUser = new Label("Username");
        TextField txtUser = new TextField();

        Label lblPass = new Label("Password");
        PasswordField txtPass = new PasswordField();

        Button btnLogin = new Button("Login");

        VBox root = new VBox(10);
        root.getChildren().addAll(
                lblUser, txtUser,
                lblPass, txtPass,
                btnLogin
        );

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }
}
