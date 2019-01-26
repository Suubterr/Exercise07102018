package JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class Exercise extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Image image = new Image("https://3.bp.blogspot.com/-zEkKJoFuFoo/WW5NJTQPpuI/AAAAAAAAFL8/unbH4le2Hro1aQhJc7mwgLs8fJs_DaguACLcBGAs/s1600/download.jpg");
        ImageView imageView = new ImageView(image);

        imageView.setX(400);
        imageView.setY(175);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        Text text = new Text();

        text.setFont(Font.font("verdana",
                FontWeight.BOLD,
                FontPosture.ITALIC,
                50));
        text.setX(40);
        text.setY(145);
        text.setText("Does he looks like a bitch?");
        text.setFill(Color.PINK);
        text.setStrokeWidth(2);
        text.setStroke(Color.BLACK);


        Line line = new Line();

        line.setStartX(50.0);
        line.setStartY(150);
        line.setEndX(775);
        line.setEndY(150);

        Group group = new Group(line,text,imageView);

        Scene scene = new Scene(group,1000,300);

        scene.setFill(Color.BROWN);

        primaryStage.setTitle("Sample application");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
