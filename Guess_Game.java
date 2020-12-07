package com.company;
import java.util.Random;
import java.util.Scanner;
class Game {
    int GuessNo;
    int ActualNo;
    int NoOfGuess = 0;

    // Getters And Setters Of NoOfGuess Function
    public int getNoOfGuess() {
        return NoOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        NoOfGuess = noOfGuess;
    }

    // Generate Random Number Through Computer
    Game() {
        Random rn = new Random();
        this.ActualNo = rn.nextInt(100);
    }

    // Take Input From User
    public void TakeUserinput() {
        System.out.println("Guess The Number (1-100)");
        Scanner sc = new Scanner(System.in);
        GuessNo = sc.nextInt();
    }


    boolean IscorrectNo() {
        NoOfGuess++;
        if (GuessNo == ActualNo) {
            System.out.println("Congratulations! You Can Get The Number " + ActualNo  + " "  + "Your Attempt Score is " + NoOfGuess);
            return true;
        } else if (GuessNo < ActualNo) {
            System.out.println("Your Number Is Too Low");
        } else if (GuessNo > ActualNo) {
            System.out.println("Your Number Is Too High");
        }
        return false;
    }
}




public class Guess_Game {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.TakeUserinput();
             b= g.IscorrectNo();



        }
    }
}