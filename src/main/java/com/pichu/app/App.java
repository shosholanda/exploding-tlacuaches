package com.pichu.app;

/* Ejemplo de animacion */
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Hello world!
 */
public class App extends Application {
    public static void main(String[] args) {
	// launch(args);
	System.out.println("Hola mundo");
	System.exit(0);
    }

    @Override
    public void start(Stage stage) {
        Circle circle = new Circle(50, Color.BLUE);

        TranslateTransition anim = new TranslateTransition(Duration.seconds(1), circle);
        anim.setFromY(0);
        anim.setToY(100);
        anim.setAutoReverse(true);
        anim.setCycleCount(Animation.INDEFINITE);
        anim.play();

        stage.setScene(new Scene(new StackPane(circle), 300, 200));
	stage.setTitle("Exploding tlacuacheesss");
        stage.show();
    }
}
