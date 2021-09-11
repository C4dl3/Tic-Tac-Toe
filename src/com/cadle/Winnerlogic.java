package com.cadle;
import java.util.Timer;
import java.util.TimerTask;

public class Winnerlogic {
    Timer time;

    public Winnerlogic(){
        time = new Timer();
        time.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(GUI.winner == 0){
                    // Row 1 for X horizontal
                    if(GUI.state[0] == 1 && GUI.state[1] == 1 && GUI.state[2] == 1){
                        GUI.winner = 1;
                    }
                    // Row 2 for X horizontal
                    else if(GUI.state[3] == 1 && GUI.state[4] == 1 && GUI.state[5] == 1){
                        GUI.winner = 1;
                    }
                    // Row 3 for X horizontal
                    else if(GUI.state[6] == 1 && GUI.state[7] == 1 && GUI.state[8] == 1){
                        GUI.winner = 1;
                    }
                    // Column 1 for X vertical
                    else if(GUI.state[0] == 1 && GUI.state[3] == 1 && GUI.state[6] == 1){
                        GUI.winner = 1;
                    }
                    // Column 2 for X vertical
                    else if(GUI.state[1] == 1 && GUI.state[4] == 1 && GUI.state[7] == 1){
                        GUI.winner = 1;
                    }
                    // Column 1 for X vertical
                    else if(GUI.state[2] == 1 && GUI.state[5] == 1 && GUI.state[8] == 1){
                        GUI.winner = 1;
                    }
                    // Diagonal bottom left to top right for X
                    else if(GUI.state[6] == 1 && GUI.state[4] == 1 && GUI.state[2] == 1){
                        GUI.winner = 1;
                    }
                    // Diagonal top left to bottom right for X
                    else if(GUI.state[0] == 1 && GUI.state[4] == 1 && GUI.state[8] == 1){
                        GUI.winner = 1;
                    }


                    // Row 1 for O horizontal
                    if(GUI.state[0] == 2 && GUI.state[1] == 2 && GUI.state[2] == 2){
                        GUI.winner = 2;
                    }//Row 2 for O horizontal
                    else if(GUI.state[3] == 2 && GUI.state[4] == 2 && GUI.state[5] == 2){
                        GUI.winner = 2;
                    }
                    // Row 3 for O horizontal
                    else if(GUI.state[6] == 2 && GUI.state[7] == 2 && GUI.state[8] == 2){
                        GUI.winner = 2;
                    }
                    // Column 1 for O vertical
                    else if(GUI.state[0] == 2 && GUI.state[3] == 2 && GUI.state[6] == 2){
                        GUI.winner = 2;
                    }
                    // Column 2 for O vertical
                    else if(GUI.state[1] == 2 && GUI.state[4] == 2 && GUI.state[7] == 2){
                        GUI.winner = 2;
                    }
                    // Column 1 for O vertical
                    else if(GUI.state[2] == 2 && GUI.state[5] == 2 && GUI.state[8] == 2){
                        GUI.winner = 2;
                    }
                    // Diagonal bottom left to top right for O
                    else if(GUI.state[6] == 2 && GUI.state[4] == 2 && GUI.state[2] == 2){
                        GUI.winner = 2;
                    }
                    // Diagonal top left to bottom right for O
                    else if(GUI.state[0] == 2 && GUI.state[4] == 2 && GUI.state[8] == 2){
                        GUI.winner = 2;
                    }
                }

            }
        }, 0, 150);
    }
}
