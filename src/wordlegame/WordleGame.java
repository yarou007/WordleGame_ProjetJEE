/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordlegame;

import java.util.Scanner;

/**
 *
 * @author hammi
 */
public class WordleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String BG_Green = "\u001b[42m";
        final String BG_Yellow = "\u001b[43m";
        final String RESET = "\u001b[0m";

        String words[] = {"SHAKE","SHAPE","SHARM","SHARK"};
        int index = (int) (Math.random() * words.length+1);
        String word = words[index];
        String w;
        int round=0;
      
        for ( round=0;round<4;round++){
           
        do {
            System.out.println("Enter you word in 5 Letter");
            w = in.nextLine().toUpperCase();
            if (w.length() < 5) {
                System.out.println("The word is so short");
            }
            if (w.length() > 5) {
                System.out.println("The word is too long");
            }

        } while (w.length() != 5);
        for (int i = 0; i < 5; i++) {
            if (w.substring(i, i + 1).equals(word.substring(i, i + 1))) {
                System.out.print(BG_Green + w.substring(i, i + 1) + RESET);
               
                
            } else if (word.indexOf(w.substring(i, i + 1)) > -1) {
                System.out.print(BG_Yellow + w.substring(i, i + 1) + RESET);
            } else {
                System.out.print(w.substring(i, i + 1));
            }
        }
          System.out.println();
        if (w.equals(word)){
            System.out.println("CORRECT YOU WIN");
            break;
        }
          
    }
        if (round==4){
            System.out.println("You lost");
        }
    }

}
