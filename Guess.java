package  com.company;
import java.util.Scanner;
import java.util.Random;

class game
{
    int ActualNo,GuessNo,NoGuess=0;
    game()
    {
        Random rm = new Random();
        ActualNo = rm.nextInt(100);
    }
    public  int TakeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose The Number  (1-100) !");
        GuessNo = sc.nextInt();
        return  GuessNo;
    }

    boolean IsNumber()
    {
        NoGuess++;
        if (GuessNo==ActualNo)
        {
            System.out.println("Congratulations! You Win! Yo Get The Score  "  + ActualNo + "  Your Score Is   " + NoGuess);
            return  true;

        }
        else  if (GuessNo > ActualNo)
        {
            System.out.println("Please Select The Lower Number");
        }

        else  if (ActualNo>GuessNo)
        {
            System.out.println("Please Select The Higher One");
        }
        return  false;
    }
}


public  class  Guess
{

    public static void main(String[] args)
    {

        game gm = new game();
        boolean b = false;

        while (!b)
        {

            gm.TakeUserInput();
            b = gm.IsNumber();
        }

    }


}