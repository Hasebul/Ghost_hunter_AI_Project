package sample;

import sun.plugin.services.AxBridgeBrowserService;

import java.util.Random;

public class Probability {

    double gridProbability[][]=new double[9][9];
    Random random=new Random(); //random generator

    final double highProb=0.24; // probability on up down movement
    final double lowProb=0.008; // probability on diagonal movement
    int ghostX;
    int  ghostY;



    void initProbability() {
        for(int i=0;i<9;i++) for(int j=0;j<9;j++) gridProbability[i][j]=(1.0/81.0);
        ghostX=4;
        ghostY=4;
    }

    double getProbabilityOnIJ(int i,int j) {
        return gridProbability[i][j];
    }


  void normalize(){
        double sum=0.0;
        for(int i=0;i<9;i++) for (int j=0;j<9;j++) sum+=gridProbability[i][j];//sum all the value
        for(int i=0;i<9;i++) for (int j=0;j<9;j++) gridProbability[i][j]=gridProbability[i][j]/sum;

  }

  String sensorUpdate(int curX,int curY){ // position of the cursor (x,y)

        //-------------------show color---------------------------
        String str="-fx-background-color: ";
        int d=Math.abs(curX-ghostX)+Math.abs(curY-ghostY);
        if(d<2){
            str+="#ff0000";
        }
        else if(d>=2 && d<6){
            str+="#ffAf00";
        }
        else{
            str+="#00ff00";
        }

        //----------------------------------------------------

        updateProbabilityOnSensor(curX,curY,d);

        return  str;




  }

  void updateProbabilityOnSensor(int curX,int curY,int d){

        if(d<2) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                   int rd=Math.abs(curX-i)+Math.abs(curY-j);//relative distance from (x,y)
                   if(rd<2) gridProbability[i][j]=0.7*gridProbability[i][j];
                   else gridProbability[i][j]=0.3*gridProbability[i][j];
                }
            }
        }
        else if(d<6){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int rd=Math.abs(curX-i)+Math.abs(curY-j);//relative distance from (x,y)
                    if(rd>=2 && rd <6 ) gridProbability[i][j]=0.7*gridProbability[i][j];
                    else gridProbability[i][j]=0.3*gridProbability[i][j];
                }
            }
        }
        else{
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int rd=Math.abs(curX-i)+Math.abs(curY-j);//relative distance from (x,y)
                    if(rd>=6) gridProbability[i][j]=0.7*gridProbability[i][j];
                    else gridProbability[i][j]=0.3*gridProbability[i][j];
                }
            }

        }
        normalize();
  }


   void updateProbabilityOnTimePassed(){
        //need to make a copy of previous array
       double temp[][]=new double[9][9];
       for(int i=0;i<9;i++) for(int j=0;j<9;j++) temp[i][j]=gridProbability[i][j]; // previous value of the element

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){ //access inside a grid

                int row,col;
                row=i-1;// up operation
                if( row >= 0 && row < 9 ) gridProbability[i][j]+=(highProb)*(temp[row][j]);
                row=i+1;// down operation
                if( row >= 0 && row < 9 ) gridProbability[i][j]+=(highProb)*(temp[row][j]);

                //Left operation
                col=j-1;

                if( col >=0 && col < 9 ) gridProbability[i][j]+=(highProb)*(temp[i][col]);
                col=j+1;//Right operation
                if( col >=0 && col < 9 ) gridProbability[i][j]+=(highProb)*(temp[i][col]);

                gridProbability[i][j]+=(lowProb)*(temp[i][j]);//same position

                //-----upper-left------
                row=i-1;
                col=j-1;
                if(row >= 0 && row < 9 && col >=0 && col < 9 ) gridProbability[i][j]+=(lowProb)*(temp[row][col]);
                //-----upper-right----
                row=i-1;
                col=j+1;
                if(row >= 0 && row < 9 && col >=0 && col < 9 ) gridProbability[i][j]+=(lowProb)*(temp[row][col]);
                //------down-left--
                row=i+1;
                col=j-1;
                if(row >= 0 && row < 9 && col >=0 && col < 9 ) gridProbability[i][j]+=(lowProb)*(temp[row][col]);
                //------down-right-
                row=i+1;
                col=j+1;
                if(row >= 0 && row < 9 && col >=0 && col < 9 ) gridProbability[i][j]+=(lowProb)*(temp[row][col]);




            }
        }
        normalize();
   }





   void initGhostPosition(){
        int x=Math.abs(random.nextInt()%9);//0--8
        int y=Math.abs(random.nextInt()%9);//0--8
        ghostX=x;
        ghostY=y;
        printGhostPosition();
        //-----ok-------
   }

   void movingGhost(){

        double dim=random.nextDouble();

        //#Up
       if(dim<highProb && (ghostX-1)>=0) ghostX--;
        //#Down
       else if(dim<2*highProb && (ghostX+1)<9) ghostX++;
       //#Left
       else if(dim<3*highProb && (ghostY-1)>=0) ghostY--;
       //#Right
       else if(dim<4*highProb && (ghostY+1)<9) ghostY++;
       //#Upper_Left_Corner
       else if(dim<(4*highProb+lowProb) && (ghostX-1)>=0 && (ghostY-1)>=0){
           ghostX--;
           ghostY--;
       }
       //#Upper_Right_Corner
       else if(dim<(4*highProb+2*lowProb) && (ghostX-1)>=0 && (ghostY+1)<9){
           ghostX--;
           ghostY++;
       }
       //#Down_Left_Corner
       else if(dim<(4*highProb+3*lowProb) && (ghostX+1)<9 && (ghostY-1)>=0){
           ghostX++;
           ghostY--;
       }
       //#Down_Rigth_Corner
       else if(dim<(4*highProb+4*lowProb) && (ghostX+1)<9 && (ghostY+1)<9){
           ghostX++;
           ghostY++;
       }
       //#same position
      printGhostPosition();
   }

   String checkingHitting(int x,int y){
        printGhostPosition();
        System.out.println("this position : (x , y)= ("+x+","+y+ ")");


        if(ghostX==x && ghostY==y) return "HIT";
        else return "MISS";

   }

   void printGhostPosition(){
       System.out.println("Ghost X:"+ghostX+" Y:"+ghostY);
   }

    void printProbability(){
        System.out.println("---------------------------------------------------------------------------------");
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) System.out.print("  "+String.format("%.4f",gridProbability[i][j])+"  ");
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------");
    }






    static void selfTest(){

       // Random rd = new Random(); // creating Random object
       // System.out.println(rd.nextDouble()); // displaying a random double value between 0.0 & 1.0
       // System.out.println(rd.nextInt());

        Probability p=new Probability();
        p.initProbability();
        p.printProbability();
        p.normalize();
        p.printProbability();
        p.updateProbabilityOnTimePassed();
        p.printProbability();
    }

    public static void main(String[] args) {
       selfTest();

    }


}
