package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    Controller boardController;
    Stage stage;
    static Probability ghostPath;






   public void init(){

       ghostPath=new Probability();
       ghostPath.initProbability();

   }






    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root =loader.load();

        boardController=loader.getController();
        boardController.setMain(this);
        primaryStage.setTitle("GhostBuster");
        primaryStage.setScene(new Scene(root, 700, 700));
        primaryStage.show();
        stage=primaryStage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
