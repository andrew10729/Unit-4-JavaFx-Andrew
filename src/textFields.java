import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;






public class textFields extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private TextField radius;

    @Override
    public void start(Stage primaryStage) {
        radius = new TextField();
        Button go = new Button("Print new Circle");
        go.setOnAction(this::printNew);


        Circle circleMain = new Circle(50, radiusInput, 50, Color.BLACK);
        circleMain.setFill(Color.WHITE);
        circleMain.setStroke(Color.BLACK);


        Group all = new Group(radius, circleMain);
        Scene scene = new Scene(all, 300, 300, Color.WHITE);

        primaryStage.setTitle("Push Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void printNew(ActionEvent event) {

    }

}
