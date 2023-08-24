/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboundapp;

import java.util.Scanner;

/**
 *
 * @author Siraphob.B
 */
public class ScoreBoundApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean mySource = new LiveScoreBean();
        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        mySource.addPropertyChangeListener(subscriber1);
        mySource.addPropertyChangeListener(subscriber2);
        Scanner sc = new Scanner(System.in);
        String score = "";
        while(true) {
            System.out.print("Enter score: ");
            score = sc.nextLine();
            if(score.equals("")) {
                return;
            }
            mySource.setScoreLine(score);
        } 
    }
    
}
