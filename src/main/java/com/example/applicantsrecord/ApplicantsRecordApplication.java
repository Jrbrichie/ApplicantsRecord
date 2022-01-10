package com.example.applicantsrecord;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicantsRecordApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicantsRecordApplication.class.getResource("applicantsrecord-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Applicants Record");
        stage.setScene(scene);
        stage.show();
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        launch();
    }
}