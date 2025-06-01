package com.pichu.app;

/* FXML */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


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
 * Aplicacion de ejemplo de contador de clicks
 */
public class App extends Application {

    /* Vista de la interfaz de aplicacion */
    public static final String FXML_PATH = "fxml/";

    /**
     * Ejecuta este método como parte de launch(args)
     * @param stage la ventana principal de la aplicación.
     * @throws Exception si algo sale mal.
     */
    @Override
    public void start(Stage stage) throws Exception {

	ClassLoader cl = getClass().getClassLoader();

	FXMLLoader fxml = new FXMLLoader(cl.getResource(FXML_PATH + "example.fxml"));
	AnchorPane marco = (AnchorPane)fxml.load();
        Scene scene = new Scene(marco, 300, 275);

        stage.setTitle("Contador de clicks");
        stage.setScene(scene);
        stage.show();

	
	// Una animacion
        // Circle circle = new Circle(50, Color.BLUE);

        // TranslateTransition anim = new TranslateTransition(Duration.seconds(1), circle);
        // anim.setFromY(0);
        // anim.setToY(100);
        // anim.setAutoReverse(true);
        // anim.setCycleCount(Animation.INDEFINITE);
        // anim.play();

        // stage.setScene(new Scene(new StackPane(circle), 300, 200));
	// stage.setTitle("Exploding tlacuacheesss");
        // stage.show();
    }
}
