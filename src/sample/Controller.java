package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.sql.BatchUpdateException;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    Main main;


    @FXML
    private GridPane grid;

    @FXML
    private Button b00;

    @FXML
    private Button b01;

    @FXML
    private Button b02;

    @FXML
    private Button b03;

    @FXML
    private Button b04;

    @FXML
    private Button b05;

    @FXML
    private Button b06;

    @FXML
    private Button b07;

    @FXML
    private Button b08;

    @FXML
    private Button b10;

    @FXML
    private Button b11;

    @FXML
    private Button b12;

    @FXML
    private Button b13;

    @FXML
    private Button b14;

    @FXML
    private Button b15;

    @FXML
    private Button b16;

    @FXML
    private Button b17;

    @FXML
    private Button b18;



    @FXML
    private Button b20;

    @FXML
    private Button b21;

    @FXML
    private Button b22;

    @FXML
    private Button b23;

    @FXML
    private Button b24;

    @FXML
    private Button b25;

    @FXML
    private Button b26;

    @FXML
    private Button b27;

    @FXML
    private Button b28;

    @FXML
    private Button b30;

    @FXML
    private Button b31;

    @FXML
    private Button b32;

    @FXML
    private Button b33;

    @FXML
    private Button b34;

    @FXML
    private Button b35;

    @FXML
    private Button b36;

    @FXML
    private Button b37;

    @FXML
    private Button b38;

    @FXML
    private Button b40;

    @FXML
    private Button b41;

    @FXML
    private Button b42;

    @FXML
    private Button b43;

    @FXML
    private Button b44;

    @FXML
    private Button b45;

    @FXML
    private Button b46;

    @FXML
    private Button b47;

    @FXML
    private Button b48;

    @FXML
    private Button b50;

    @FXML
    private Button b51;

    @FXML
    private Button b52;

    @FXML
    private Button b53;

    @FXML
    private Button b54;

    @FXML
    private Button b55;

    @FXML
    private Button b56;

    @FXML
    private Button b57;

    @FXML
    private Button b58;

    @FXML
    private Button b60;

    @FXML
    private Button b61;

    @FXML
    private Button b62;

    @FXML
    private Button b63;

    @FXML
    private Button b64;

    @FXML
    private Button b65;

    @FXML
    private Button b66;

    @FXML
    private Button b67;

    @FXML
    private Button b68;

    @FXML
    private Button b70;

    @FXML
    private Button b71;

    @FXML
    private Button b72;

    @FXML
    private Button b73;

    @FXML
    private Button b74;

    @FXML
    private Button b75;

    @FXML
    private Button b76;

    @FXML
    private Button b77;

    @FXML
    private Button b78;

    @FXML
    private Button b80;

    @FXML
    private Button b81;

    @FXML
    private Button b82;

    @FXML
    private Button b83;

    @FXML
    private Button b84;

    @FXML
    private Button b85;

    @FXML
    private Button b86;

    @FXML
    private Button b87;

    @FXML
    private Button b88;

    @FXML
    private Button timeInc;

    @FXML
    private Button catchGhost;




    Button rChangeRev;

    @FXML
    void clearOnAction(MouseEvent event) {
        if(rChangeRev!=null){
            String str= "-fx-background-color: #f1eaff";
            rChangeRev.setStyle(str);
        }
    }




    @FXML
    void b00OnAction(MouseEvent event) {

        b00.setStyle(main.ghostPath.sensorUpdate(0,0));
        rChangeRev=b00;
        updateProbabilityOnGrid();
    }

    @FXML
    void b01OnAction(MouseEvent event) {

        b01.setStyle(main.ghostPath.sensorUpdate(0,1));
        rChangeRev=b01;
        updateProbabilityOnGrid();


    }

    @FXML
    void b02OnAction(MouseEvent event) {

        b02.setStyle(main.ghostPath.sensorUpdate(0,2));
        rChangeRev=b02;
        updateProbabilityOnGrid();

    }

    @FXML
    void b03OnAction(MouseEvent event) {
        b03.setStyle(main.ghostPath.sensorUpdate(0,3));
        rChangeRev=b03;
        updateProbabilityOnGrid();
    }

    @FXML
    void b04OnAction(MouseEvent event) {
        b04.setStyle(main.ghostPath.sensorUpdate(0,4));
        rChangeRev=b04;
        updateProbabilityOnGrid();
    }

    @FXML
    void b05OnAction(MouseEvent event) {
        b05.setStyle(main.ghostPath.sensorUpdate(0,5));
        rChangeRev=b05;
        updateProbabilityOnGrid();
    }

    @FXML
    void b06OnAction(MouseEvent event) {
        b06.setStyle(main.ghostPath.sensorUpdate(0,6));
        rChangeRev=b06;
        updateProbabilityOnGrid();
    }

    @FXML
    void b07OnAction(MouseEvent event) {
        b07.setStyle(main.ghostPath.sensorUpdate(0,7));
        rChangeRev=b07;
        updateProbabilityOnGrid();
    }

    @FXML
    void b08OnAction(MouseEvent event) {
        b08.setStyle(main.ghostPath.sensorUpdate(0,8));
        rChangeRev=b08;
        updateProbabilityOnGrid();
    }

    @FXML
    void b10OnAction(MouseEvent event) {
        b10.setStyle(main.ghostPath.sensorUpdate(1,0));
        rChangeRev=b10;
        updateProbabilityOnGrid();
    }

    @FXML
    void b11OnAction(MouseEvent event) {
        b11.setStyle(main.ghostPath.sensorUpdate(1,1));
        rChangeRev=b11;
        updateProbabilityOnGrid();
    }

    @FXML
    void b12OnAction(MouseEvent event) {
        b12.setStyle(main.ghostPath.sensorUpdate(1,2));
        rChangeRev=b12;
        updateProbabilityOnGrid();
    }

    @FXML
    void b13OnAction(MouseEvent event) {
        b13.setStyle(main.ghostPath.sensorUpdate(1,3));
        rChangeRev=b13;
        updateProbabilityOnGrid();
    }

    @FXML
    void b14OnAction(MouseEvent event) {
        b14.setStyle(main.ghostPath.sensorUpdate(1,4));
        rChangeRev=b14;
        updateProbabilityOnGrid();
    }

    @FXML
    void b15OnAction(MouseEvent event) {
        b15.setStyle(main.ghostPath.sensorUpdate(1,5));
        rChangeRev=b15;
        updateProbabilityOnGrid();
    }

    @FXML
    void b16OnAction(MouseEvent event) {
        b16.setStyle(main.ghostPath.sensorUpdate(1,6));
        rChangeRev=b16;
        updateProbabilityOnGrid();
    }

    @FXML
    void b17OnAction(MouseEvent event) {
        b17.setStyle(main.ghostPath.sensorUpdate(1,7));
        rChangeRev=b17;
        updateProbabilityOnGrid();
    }

    @FXML
    void b18OnAction(MouseEvent event) {


        b18.setStyle(main.ghostPath.sensorUpdate(1,8));
        rChangeRev=b18;
        updateProbabilityOnGrid();
    }

    @FXML
    void b20OnAction(MouseEvent event) {

        b20.setStyle(main.ghostPath.sensorUpdate(2,0));
        rChangeRev=b20;
        updateProbabilityOnGrid();
    }

    @FXML
    void b21OnAction(MouseEvent event) {
        b21.setStyle(main.ghostPath.sensorUpdate(2,1));
        rChangeRev=b21;
        updateProbabilityOnGrid();
    }

    @FXML
    void b22OnAction(MouseEvent event) {
        b22.setStyle(main.ghostPath.sensorUpdate(2,2));
        rChangeRev=b22;
        updateProbabilityOnGrid();
    }

    @FXML
    void b23OnAction(MouseEvent event) {
        b23.setStyle(main.ghostPath.sensorUpdate(2,3));
        rChangeRev=b23;
        updateProbabilityOnGrid();
    }

    @FXML
    void b24OnAction(MouseEvent event) {
        b24.setStyle(main.ghostPath.sensorUpdate(2,4));
        rChangeRev=b24;
        updateProbabilityOnGrid();
    }

    @FXML
    void b25OnAction(MouseEvent event) {
        b25.setStyle(main.ghostPath.sensorUpdate(2,5));
        rChangeRev=b25;
        updateProbabilityOnGrid();
    }

    @FXML
    void b26OnAction(MouseEvent event) {
        b26.setStyle(main.ghostPath.sensorUpdate(2,6));
        rChangeRev=b26;
        updateProbabilityOnGrid();
    }

    @FXML
    void b27OnAction(MouseEvent event) {
        b27.setStyle(main.ghostPath.sensorUpdate(2,7));
        rChangeRev=b27;
        updateProbabilityOnGrid();
    }

    @FXML
    void b28OnAction(MouseEvent event) {
        b28.setStyle(main.ghostPath.sensorUpdate(2,8));
        rChangeRev=b28;
        updateProbabilityOnGrid();
    }

    @FXML
    void b30OnAction(MouseEvent event) {
        b30.setStyle(main.ghostPath.sensorUpdate(3,0));
        rChangeRev=b30;
        updateProbabilityOnGrid();
    }

    @FXML
    void b31OnAction(MouseEvent event) {
        b31.setStyle(main.ghostPath.sensorUpdate(3,1));
        rChangeRev=b31;
        updateProbabilityOnGrid();
    }

    @FXML
    void b32OnAction(MouseEvent event) {
        b32.setStyle(main.ghostPath.sensorUpdate(3,2));
        rChangeRev=b32;
        updateProbabilityOnGrid();
    }

    @FXML
    void b33OnAction(MouseEvent event) {
        b33.setStyle(main.ghostPath.sensorUpdate(3,3));
        rChangeRev=b33;
        updateProbabilityOnGrid();
    }

    @FXML
    void b34OnAction(MouseEvent event) {
        b34.setStyle(main.ghostPath.sensorUpdate(3,4));
        rChangeRev=b34;
        updateProbabilityOnGrid();
    }

    @FXML
    void b35OnAction(MouseEvent event) {
        b35.setStyle(main.ghostPath.sensorUpdate(3,5));
        rChangeRev=b35;
        updateProbabilityOnGrid();
    }

    @FXML
    void b36OnAction(MouseEvent event) {
        b36.setStyle(main.ghostPath.sensorUpdate(3,6));
        rChangeRev=b36;
        updateProbabilityOnGrid();
    }

    @FXML
    void b37OnAction(MouseEvent event) {
        b37.setStyle(main.ghostPath.sensorUpdate(3,7));
        rChangeRev=b37;
        updateProbabilityOnGrid();
    }

    @FXML
    void b38OnAction(MouseEvent event) {
        b38.setStyle(main.ghostPath.sensorUpdate(3,8));
        rChangeRev=b38;
        updateProbabilityOnGrid();
    }

    @FXML
    void b40OnAction(MouseEvent event) {
        b40.setStyle(main.ghostPath.sensorUpdate(4,0));
        rChangeRev=b40;
        updateProbabilityOnGrid();
    }

    @FXML
    void b41OnAction(MouseEvent event) {
        b41.setStyle(main.ghostPath.sensorUpdate(4,1));
        rChangeRev=b41;
        updateProbabilityOnGrid();
    }

    @FXML
    void b42OnAction(MouseEvent event) {
        b42.setStyle(main.ghostPath.sensorUpdate(4,2));
        rChangeRev=b42;
        updateProbabilityOnGrid();
    }

    @FXML
    void b43OnAction(MouseEvent event) {
        b43.setStyle(main.ghostPath.sensorUpdate(4,3));
        rChangeRev=b43;
        updateProbabilityOnGrid();
    }

    @FXML
    void b44OnAction(MouseEvent event) {
        b44.setStyle(main.ghostPath.sensorUpdate(4,4));
        rChangeRev=b44;
        updateProbabilityOnGrid();
    }

    @FXML
    void b45OnAction(MouseEvent event) {
        b45.setStyle(main.ghostPath.sensorUpdate(4,5));
        rChangeRev=b45;
        updateProbabilityOnGrid();
    }

    @FXML
    void b46OnAction(MouseEvent event) {
        b46.setStyle(main.ghostPath.sensorUpdate(4,6));
        rChangeRev=b46;
        updateProbabilityOnGrid();
    }

    @FXML
    void b47OnAction(MouseEvent event) {
        b47.setStyle(main.ghostPath.sensorUpdate(4,7));
        rChangeRev=b47;
        updateProbabilityOnGrid();
    }

    @FXML
    void b48OnAction(MouseEvent event) {
        b48.setStyle(main.ghostPath.sensorUpdate(4,8));
        rChangeRev=b48;
        updateProbabilityOnGrid();
    }

    @FXML
    void b50OnAction(MouseEvent event) {
        b50.setStyle(main.ghostPath.sensorUpdate(5,0));
        rChangeRev=b50;
        updateProbabilityOnGrid();
    }

    @FXML
    void b51OnAction(MouseEvent event) {
        b51.setStyle(main.ghostPath.sensorUpdate(5,1));
        rChangeRev=b51;
        updateProbabilityOnGrid();

    }

    @FXML
    void b52OnAction(MouseEvent event) {
        b52.setStyle(main.ghostPath.sensorUpdate(5,2));
        rChangeRev=b52;
        updateProbabilityOnGrid();
    }

    @FXML
    void b53OnAction(MouseEvent event) {
        b53.setStyle(main.ghostPath.sensorUpdate(5,3));
        rChangeRev=b53;
        updateProbabilityOnGrid();
    }

    @FXML
    void b54OnAction(MouseEvent event) {
        b54.setStyle(main.ghostPath.sensorUpdate(5,4));
        rChangeRev=b54;
        updateProbabilityOnGrid();
    }

    @FXML
    void b55OnAction(MouseEvent event) {
        b55.setStyle(main.ghostPath.sensorUpdate(5,5));
        rChangeRev=b55;
        updateProbabilityOnGrid();
    }

    @FXML
    void b56OnAction(MouseEvent event) {
        b56.setStyle(main.ghostPath.sensorUpdate(5,6));
        rChangeRev=b56;
        updateProbabilityOnGrid();
    }

    @FXML
    void b57OnAction(MouseEvent event) {
        b57.setStyle(main.ghostPath.sensorUpdate(5,7));
        rChangeRev=b57;
        updateProbabilityOnGrid();
    }

    @FXML
    void b58OnAction(MouseEvent event) {
        b58.setStyle(main.ghostPath.sensorUpdate(5,8));
        rChangeRev=b58;
        updateProbabilityOnGrid();
    }

    @FXML
    void b60OnAction(MouseEvent event) {
        b60.setStyle(main.ghostPath.sensorUpdate(6,0));
        rChangeRev=b60;
        updateProbabilityOnGrid();
    }

    @FXML
    void b61OnAction(MouseEvent event) {
        b61.setStyle(main.ghostPath.sensorUpdate(6,1));
        rChangeRev=b61;
        updateProbabilityOnGrid();
    }

    @FXML
    void b62OnAction(MouseEvent event) {
        b62.setStyle(main.ghostPath.sensorUpdate(6,2));
        rChangeRev=b62;
        updateProbabilityOnGrid();
    }

    @FXML
    void b63OnAction(MouseEvent event) {
        b63.setStyle(main.ghostPath.sensorUpdate(6,3));
        rChangeRev=b63;
        updateProbabilityOnGrid();
    }

    @FXML
    void b64OnAction(MouseEvent event) {
        b64.setStyle(main.ghostPath.sensorUpdate(6,4));
        rChangeRev=b64;
        updateProbabilityOnGrid();
    }

    @FXML
    void b65OnAction(MouseEvent event) {
        b65.setStyle(main.ghostPath.sensorUpdate(6,5));
        rChangeRev=b65;
        updateProbabilityOnGrid();
    }

    @FXML
    void b66OnAction(MouseEvent event) {
        b66.setStyle(main.ghostPath.sensorUpdate(6,6));
        rChangeRev=b66;
        updateProbabilityOnGrid();
    }

    @FXML
    void b67OnAction(MouseEvent event) {
        b67.setStyle(main.ghostPath.sensorUpdate(6,7));
        rChangeRev=b67;
        updateProbabilityOnGrid();
    }

    @FXML
    void b68OnAction(MouseEvent event) {
        b68.setStyle(main.ghostPath.sensorUpdate(6,8));
        rChangeRev=b68;
        updateProbabilityOnGrid();
    }

    @FXML
    void b70OnAction(MouseEvent event) {
        b70.setStyle(main.ghostPath.sensorUpdate(7,0));
        rChangeRev=b70;
        updateProbabilityOnGrid();
    }

    @FXML
    void b71OnAction(MouseEvent event) {
        b71.setStyle(main.ghostPath.sensorUpdate(7,1));
        rChangeRev=b71;
        updateProbabilityOnGrid();
    }

    @FXML
    void b72OnAction(MouseEvent event) {
        b72.setStyle(main.ghostPath.sensorUpdate(7,2));
        rChangeRev=b72;
        updateProbabilityOnGrid();
    }

    @FXML
    void b73OnAction(MouseEvent event) {
        b73.setStyle(main.ghostPath.sensorUpdate(7,3));
        rChangeRev=b73;
        updateProbabilityOnGrid();
    }

    @FXML
    void b74OnAction(MouseEvent event) {
        b74.setStyle(main.ghostPath.sensorUpdate(7,4));
        rChangeRev=b74;
        updateProbabilityOnGrid();
    }

    @FXML
    void b75OnAction(MouseEvent event) {
        b75.setStyle(main.ghostPath.sensorUpdate(7,5));
        rChangeRev=b75;
        updateProbabilityOnGrid();
    }

    @FXML
    void b76OnAction(MouseEvent event) {
        b76.setStyle(main.ghostPath.sensorUpdate(7,6));
        rChangeRev=b76;
        updateProbabilityOnGrid();
    }

    @FXML
    void b77OnAction(MouseEvent event) {
        b77.setStyle(main.ghostPath.sensorUpdate(7,7));
        rChangeRev=b77;
        updateProbabilityOnGrid();
    }

    @FXML
    void b78OnAction(MouseEvent event) {
        b78.setStyle(main.ghostPath.sensorUpdate(7,8));
        rChangeRev=b78;
        updateProbabilityOnGrid();
    }

    @FXML
    void b80OnAction(MouseEvent event) {
        b80.setStyle(main.ghostPath.sensorUpdate(8,0));
        rChangeRev=b80;
        updateProbabilityOnGrid();
    }

    @FXML
    void b81OnAction(MouseEvent event) {
        b81.setStyle(main.ghostPath.sensorUpdate(8,1));
        rChangeRev=b81;
        updateProbabilityOnGrid();
    }

    @FXML
    void b82OnAction(MouseEvent event) {
        b82.setStyle(main.ghostPath.sensorUpdate(8,2));
        rChangeRev=b82;
        updateProbabilityOnGrid();
    }

    @FXML
    void b83OnAction(MouseEvent event) {
        b83.setStyle(main.ghostPath.sensorUpdate(8,3));
        rChangeRev=b83;
        updateProbabilityOnGrid();
    }

    @FXML
    void b84OnAction(MouseEvent event) {
        b84.setStyle(main.ghostPath.sensorUpdate(8,4));
        rChangeRev=b84;
        updateProbabilityOnGrid();
    }

    @FXML
    void b85OnAction(MouseEvent event) {
        b85.setStyle(main.ghostPath.sensorUpdate(8,5));
        rChangeRev=b85;
        updateProbabilityOnGrid();
    }

    @FXML
    void b86OnAction(MouseEvent event) {
        b86.setStyle(main.ghostPath.sensorUpdate(8,6));
        rChangeRev=b86;
        updateProbabilityOnGrid();
    }

    @FXML
    void b87OnAction(MouseEvent event) {
        b87.setStyle(main.ghostPath.sensorUpdate(8,7));
        rChangeRev=b87;
        updateProbabilityOnGrid();
    }

    @FXML
    void b88OnAction(MouseEvent event) {
        b88.setStyle(main.ghostPath.sensorUpdate(8,8));
        rChangeRev=b88;
        updateProbabilityOnGrid();
    }

    @FXML
    void catchOnAction(MouseEvent event) {

        int rx=grid.getRowIndex(rChangeRev);//getting row
        int ry=grid.getColumnIndex(rChangeRev);//getting column
        rChangeRev.setText(main.ghostPath.checkingHitting(rx,ry));
    }

    @FXML
    void timeOnAction(MouseEvent event) {

        main.ghostPath.movingGhost();

         main.ghostPath.updateProbabilityOnTimePassed();
         updateProbabilityOnGrid();
    }

    void setMain(Main main){
        this.main=main;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateProbabilityOnGrid();
        main.ghostPath.initGhostPosition();
    }

    void updateProbabilityOnGrid(){

        ObservableList<Node> buttonList=grid.getChildren();
        for(Node n:buttonList){
            if(n instanceof Button){
                Button button=(Button) n;
                int row=0,col=0;
                if(grid.getRowIndex(n)!=null) row=grid.getRowIndex(n);
                if(grid.getColumnIndex(n)!=null) col=grid.getColumnIndex(n);
                button.setText(String.format("%.4f",main.ghostPath.getProbabilityOnIJ(row,col)));

            }
        }

    }

}

