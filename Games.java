package com.company;
import java.util.Scanner;
import java.util.Random;

// ROCK PAPER SCISSOR GAME BY MABTOOR MABX

/*
public  class  Games
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Choose Your Number \n (0 Mean Rock , 1 Mean Paper, 2 Mean Scissor )");
        int you = sc.nextInt();
        int comp = rn.nextInt(3);
        if ((comp == 0 && you == 1) || (comp == 1 && you == 2) || (comp == 2 && you == 0)) {
            System.out.println("You Win!!!");
        } else if ((comp == 0 && you == 0) || (comp == 1 && you == 1) || (comp == 2 && you == 2))
        {
            System.out.println("Match Is Tie!!!");
        }
        else
        {
            System.out.println("You Lose!!!");
        }
    }
}*/


// GUESS THE NUMBER GAME DESIGNED BY MABTOOR MABX

class game
{
    int ActualNo,GuessNo,NoGuess=0;
    game()
    {
        Random rn = new Random();
         ActualNo = rn.nextInt(100);
    }

    public void TakeUserInput()
    {

        Scanner sc = new Scanner(System.in);
         GuessNo = sc.nextInt();
    }

    boolean IsNumber()
    {
        NoGuess++;
        if (ActualNo==GuessNo)
        {
            System.out.println("Congratulations! You Got The Number " + ActualNo + " And Your Score Is  " + NoGuess);
            return true;
        }
        else if (ActualNo>GuessNo)
        {
            System.out.println("Please Select The Higher Number");
        }
        else if (GuessNo>ActualNo)
        {
            System.out.println("Please Select The Lower Number");
        }
        return false;
    }

}


public  class  Games
{

    public static void main(String[] args)
    {
        game gm = new game();
        System.out.println("Choose The Number (1-100)");
        boolean b= false;
        while (!b)
        {
            gm.TakeUserInput();
            b= gm.IsNumber();
        }

    }


}
