package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Image upperLeftWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView upperLeftWhiteImageView = new ImageView(upperLeftWhiteImage);

        Image upperCenterWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView upperCenterWhiteImageView = new ImageView(upperCenterWhiteImage);

        Image upperRightWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView upperRightWhiteImageView = new ImageView(upperRightWhiteImage);

        Image middleLeftWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView middleLeftWhiteImageView = new ImageView(middleLeftWhiteImage);

        Image middleCenterWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView middleCenterWhiteImageView = new ImageView(middleCenterWhiteImage);

        Image middleRightWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView middleRightWhiteImageView = new ImageView(middleRightWhiteImage);

        Image lowerLeftWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView lowerLeftWhiteImageView = new ImageView(lowerLeftWhiteImage);

        Image lowerMiddleWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView lowerMiddleWhiteImageView = new ImageView(lowerMiddleWhiteImage);

        Image lowerRightWhiteImage = new Image(
                new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/whiteSquare.jpg"));
        ImageView lowerRightWhiteImageView = new ImageView(lowerRightWhiteImage);

        Image upperLeftX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView upperLeftXImageView = new ImageView(upperLeftX);
        upperLeftXImageView.setCache(true);
        upperLeftXImageView.setSmooth(true);
        upperLeftXImageView.setPreserveRatio(true);
        upperLeftXImageView.setFitWidth(250);
        upperLeftXImageView.setFitHeight(250);

        Image upperCenterX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView upperCenterXImageView = new ImageView(upperCenterX);
        upperCenterXImageView.setCache(true);
        upperCenterXImageView.setSmooth(true);
        upperCenterXImageView.setPreserveRatio(true);
        upperCenterXImageView.setFitWidth(250);
        upperCenterXImageView.setFitHeight(250);

        Image upperRightX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView upperRightXImageView = new ImageView(upperRightX);
        upperRightXImageView.setCache(true);
        upperRightXImageView.setSmooth(true);
        upperRightXImageView.setPreserveRatio(true);
        upperRightXImageView.setFitWidth(250);
        upperRightXImageView.setFitHeight(250);

        Image middleRightX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView middleRightXImageView = new ImageView(middleRightX);
        middleRightXImageView.setCache(true);
        middleRightXImageView.setSmooth(true);
        middleRightXImageView.setPreserveRatio(true);
        middleRightXImageView.setFitWidth(250);
        middleRightXImageView.setFitHeight(250);

        Image middleCenterX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView middleCenterXImageView = new ImageView(middleCenterX);
        middleCenterXImageView.setCache(true);
        middleCenterXImageView.setSmooth(true);
        middleCenterXImageView.setPreserveRatio(true);
        middleCenterXImageView.setFitWidth(250);
        middleCenterXImageView.setFitHeight(250);

        Image middleLeftX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView middleLeftXImageView = new ImageView(middleLeftX);
        middleLeftXImageView.setCache(true);
        middleLeftXImageView.setSmooth(true);
        middleLeftXImageView.setPreserveRatio(true);
        middleLeftXImageView.setFitWidth(250);
        middleLeftXImageView.setFitHeight(250);

        Image lowerLeftX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView lowererLeftXImageView = new ImageView(lowerLeftX);
        lowererLeftXImageView.setCache(true);
        lowererLeftXImageView.setSmooth(true);
        lowererLeftXImageView.setPreserveRatio(true);
        lowererLeftXImageView.setFitWidth(250);
        lowererLeftXImageView.setFitHeight(250);

        Image lowerCenterX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView lowerCenterXImageView = new ImageView(lowerCenterX);
        lowerCenterXImageView.setCache(true);
        lowerCenterXImageView.setSmooth(true);
        lowerCenterXImageView.setPreserveRatio(true);
        lowerCenterXImageView.setFitWidth(250);
        lowerCenterXImageView.setFitHeight(250);

        Image lowerRightX = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/x.png"));
        ImageView lowerRightXImageView = new ImageView(lowerRightX);
        lowerRightXImageView.setCache(true);
        lowerRightXImageView.setSmooth(true);
        lowerRightXImageView.setPreserveRatio(true);
        lowerRightXImageView.setFitWidth(250);
        lowerRightXImageView.setFitHeight(250);


        Image upperLeftCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView upperLeftCircleImageView = new ImageView(upperLeftCircle);
        upperLeftCircleImageView.setCache(true);
        upperLeftCircleImageView.setSmooth(true);
        upperLeftCircleImageView.setPreserveRatio(true);
        upperLeftCircleImageView.setFitHeight(250);
        upperLeftCircleImageView.setFitWidth(250);

        Image upperCenterCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView upperCenterCircleImageView = new ImageView(upperCenterCircle);
        upperCenterCircleImageView.setCache(true);
        upperCenterCircleImageView.setSmooth(true);
        upperCenterCircleImageView.setPreserveRatio(true);
        upperCenterCircleImageView.setFitHeight(250);
        upperCenterCircleImageView.setFitWidth(250);

        Image upperRightCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView upperRightCircleImageView = new ImageView(upperRightCircle);
        upperRightCircleImageView.setCache(true);
        upperRightCircleImageView.setSmooth(true);
        upperRightCircleImageView.setPreserveRatio(true);
        upperRightCircleImageView.setFitHeight(250);
        upperRightCircleImageView.setFitWidth(250);

        Image middleLeftCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView middleLeftCircleImageView = new ImageView(middleLeftCircle);
        middleLeftCircleImageView.setCache(true);
        middleLeftCircleImageView.setSmooth(true);
        middleLeftCircleImageView.setPreserveRatio(true);
        middleLeftCircleImageView.setFitHeight(250);
        middleLeftCircleImageView.setFitWidth(250);

        Image middleCenterCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView middleCenterCircleImageView = new ImageView(middleCenterCircle);
        middleCenterCircleImageView.setCache(true);
        middleCenterCircleImageView.setSmooth(true);
        middleCenterCircleImageView.setPreserveRatio(true);
        middleCenterCircleImageView.setFitHeight(250);
        middleCenterCircleImageView.setFitWidth(250);

        Image middleRightCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView middleRightCircleImageView = new ImageView(middleRightCircle);
        middleRightCircleImageView.setCache(true);
        middleRightCircleImageView.setSmooth(true);
        middleRightCircleImageView.setPreserveRatio(true);
        middleRightCircleImageView.setFitHeight(250);
        middleRightCircleImageView.setFitWidth(250);

        Image lowerLeftCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView lowerLeftCircleImageView = new ImageView(lowerLeftCircle);
        lowerLeftCircleImageView.setCache(true);
        lowerLeftCircleImageView.setSmooth(true);
        lowerLeftCircleImageView.setPreserveRatio(true);
        lowerLeftCircleImageView.setFitHeight(250);
        lowerLeftCircleImageView.setFitWidth(250);

        Image lowerCenterCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView lowerCenterCircleImageView = new ImageView(lowerCenterCircle);
        lowerCenterCircleImageView.setCache(true);
        lowerCenterCircleImageView.setSmooth(true);
        lowerCenterCircleImageView.setPreserveRatio(true);
        lowerCenterCircleImageView.setFitHeight(250);
        lowerCenterCircleImageView.setFitWidth(250);

        Image lowerRightCircle = new Image
                (new FileInputStream("/Users/amanti/Desktop/ticTacToe/src/sample/circle.png"));
        ImageView lowerRightCircleImageView = new ImageView(lowerRightCircle);
        lowerRightCircleImageView.setCache(true);
        lowerRightCircleImageView.setSmooth(true);
        lowerRightCircleImageView.setPreserveRatio(true);
        lowerRightCircleImageView.setFitHeight(250);
        lowerRightCircleImageView.setFitWidth(250);



        Button upperLeftButton = new Button();
        upperLeftButton.setPrefSize(250,250);
        upperLeftButton.setGraphic(upperLeftWhiteImageView);
        upperLeftButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 1)
                upperLeftButton.setGraphic(upperLeftXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount()==2)
                upperLeftButton.setGraphic(upperLeftCircleImageView);
        });


        Button upperCenterButton = new Button();
        upperCenterButton.setPrefSize(250,250);
        upperCenterButton.setGraphic(upperCenterWhiteImageView);
        upperCenterButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                upperCenterButton.setGraphic(upperCenterXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount()==2)
                upperCenterButton.setGraphic(upperCenterCircleImageView);
        });


        Button upperRightButton = new Button();
        upperRightButton.setPrefSize(250,250);
        upperRightButton.setGraphic(upperRightWhiteImageView);
        upperRightButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                upperRightButton.setGraphic(upperRightXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() ==2)
                upperRightButton.setGraphic(upperRightCircleImageView);
        });

        Button middleLeftButton = new Button();
        middleLeftButton.setPrefSize(250,250);
        middleLeftButton.setGraphic(middleLeftWhiteImageView);
        middleLeftButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                middleLeftButton.setGraphic(middleLeftXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() ==2)
                middleLeftButton.setGraphic(middleLeftCircleImageView);
        });

        Button middleCenterButton = new Button();
        middleCenterButton.setPrefSize(250,250);
        middleCenterButton.setGraphic(middleCenterWhiteImageView);
        middleCenterButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                middleCenterButton.setGraphic(middleCenterXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount()==2)
                middleCenterButton.setGraphic(middleCenterCircleImageView);
        });

        Button middleRightButton = new Button();
        middleRightButton.setPrefSize(250,250);
        middleRightButton.setGraphic(middleRightWhiteImageView);
        middleRightButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                middleRightButton.setGraphic(middleRightXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2)
                middleRightButton.setGraphic(middleRightCircleImageView);
        });

        Button lowerLeftButton = new Button();
        lowerLeftButton.setPrefSize(250,250);
        lowerLeftButton.setGraphic(lowerLeftWhiteImageView);
        lowerLeftButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                lowerLeftButton.setGraphic(lowererLeftXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2)
                lowerLeftButton.setGraphic(lowerLeftCircleImageView);
        });

        Button lowerCenterButton = new Button();
        lowerCenterButton.setPrefSize(250,250);
        lowerCenterButton.setGraphic(lowerMiddleWhiteImageView);
        lowerCenterButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                lowerCenterButton.setGraphic(lowerCenterXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() ==2)
                lowerCenterButton.setGraphic(lowerCenterCircleImageView);
        });

        Button lowerRightButton = new Button();
        lowerRightButton.setPrefSize(250,250);
        lowerRightButton.setGraphic(lowerRightWhiteImageView);
        lowerRightButton.setOnMouseClicked(event -> {
            if (event.getButton().equals(MouseButton.PRIMARY)&& event.getClickCount()==1)
                lowerRightButton.setGraphic(lowerRightXImageView);
            if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount()==2)
                lowerRightButton.setGraphic(lowerRightCircleImageView);
        });



        GridPane gridPane = new GridPane();
        gridPane.add(upperLeftButton,1,1);
        gridPane.add(upperCenterButton,2,1);
        gridPane.add(upperRightButton,3,1);

        gridPane.add(middleLeftButton,1,2);
        gridPane.add(middleCenterButton,2,2);
        gridPane.add(middleRightButton,3,2);

        gridPane.add(lowerLeftButton,1,3);
        gridPane.add(lowerCenterButton,2,3);
        gridPane.add(lowerRightButton,3,3);

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(new Scene(gridPane, 806, 780));
        primaryStage.show();
    }



}
