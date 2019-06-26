package com.example.springfxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(value={"connectMsSql","formJavaFx","personTable"} )
public class SpringfxjdbcApplication extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void init() throws Exception {
        context=SpringApplication.run(SpringfxjdbcApplication.class);
    }

    public static void main(String[] args) {
     //   SpringApplication.run(SpringfxjdbcApplication.class, args);
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("/formstart.fxml"));
        primaryStage.setTitle("Spring Boot Hibernet");
        Scene scene= new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        context.close();
    }
}
