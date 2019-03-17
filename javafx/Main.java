package com.javaInlamning;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class Main extends Application {

   TextField tf;
   Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //skapar min webview som laddar en sida på startup
        WebView myWebView = new WebView();
        WebEngine engine = myWebView.getEngine();

        engine.load("https://www.blizzard.com/en-gb/");


        // Skapar knappar som skickar en vidare på sidan
        // knapp 1-8 har ett event som gör att url:en jag har satt visas
        // reload knappen är den ända utan url. den uppdaterar sidan
        Button btn1 = new Button("Overwatch");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/overwatch");
            }
        });
        Button btn2 = new Button("WoW");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/world-of-warcraft");
            }
        });
        Button btn3 = new Button("Diablo 3");
        btn3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/diablo-iii");
            }
        });
        Button btn4 = new Button("Hots");
        btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/heroes-of-the-storm");
            }
        });
        Button btn5 = new Button("Destiny 2");
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/destiny-2");
            }
        });
        Button btn6 = new Button("Hearthstone");
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/hearthstone");
            }
        });
        Button btn7 = new Button("Warcraft 3");
        btn7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/warcraft-iii");
            }
        });
        Button btn8 = new Button("Starcraft 2");
        btn8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.load("https://eu.shop.battle.net/en-gb/family/starcraft-ii");
            }
        });
        Button btnReload = new Button("Reload");
        btnReload.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                engine.reload();
            }
        });

        // skapar label och text field för username funktionen
        response = new Label("Enter");
        response.setId("label1");

        tf = new TextField();
        tf.setPromptText("Users Name");
        tf.setPrefColumnCount(6);

        tf.setOnAction( (ae) -> response.setText(tf.getText()));


        Pane rootP = new Pane();

        // lägger allt i specifika layout
        myWebView.setLayoutX(1);
        myWebView.setLayoutY(1);
        myWebView.setPrefHeight(486);
        myWebView.setPrefWidth(1079);

        btn1.setLayoutX(54);
        btn1.setLayoutY(520);
        btn1.setPrefHeight(31);
        btn1.setPrefWidth(114);

        btn2.setLayoutX(54);
        btn2.setLayoutY(580);
        btn2.setPrefHeight(31);
        btn2.setPrefWidth(114);

        btn3.setLayoutX(191);
        btn3.setLayoutY(520);
        btn3.setPrefHeight(31);
        btn3.setPrefWidth(114);

        btn4.setLayoutX(753);
        btn4.setLayoutY(580);
        btn4.setPrefHeight(31);
        btn4.setPrefWidth(114);

        btn5.setLayoutX(900);
        btn5.setLayoutY(520);
        btn5.setPrefHeight(31);
        btn5.setPrefWidth(114);

        btn6.setLayoutX(191);
        btn6.setLayoutY(580);
        btn6.setPrefHeight(31);
        btn6.setPrefWidth(114);

        btn7.setLayoutX(900);
        btn7.setLayoutY(580);
        btn7.setPrefHeight(31);
        btn7.setPrefWidth(114);

        btn8.setLayoutX(753);
        btn8.setLayoutY(520);
        btn8.setPrefHeight(31);
        btn8.setPrefWidth(114);

        btnReload.setLayoutX(484);
        btnReload.setLayoutY(495);
        btnReload.setPrefHeight(31);
        btnReload.setPrefWidth(114);

        tf.setLayoutX(486);
        tf.setLayoutY(590);
        response.setLayoutX(513);
        response.setLayoutY(550);




        // här samlas all info och visas på "scene"
        rootP.getChildren().addAll(myWebView, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btnReload, tf, response);
        Scene myScene2 = new Scene(rootP, 1081, 643);

        //länkar till css
        myScene2.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(myScene2);

        stage.show();

    }
}

