import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;

public class numberCounter extends Application {

    private int count;
    private Text countText;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        countText = new Text("Pushes: 0");

        Button add = new Button("+1");
        add.setOnAction(this::addingButton);

        Button minus = new Button("-1");
        add.setOnAction(this::minusButton);

        FlowPane pane = new FlowPane(add, countText, minus);

        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setStyle("-fx-background-color: cyan");


        Scene scene = new Scene(pane, 300, 100);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void addingButton(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        count = count + 1;
        countText.setText("Pushes: " + count);
    }




    private void minusButton(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        count = count - 1;
        countText.setText("Pushes: " + count);
    }
}
