import java.util.Random;

public class TicTacToeAssign 
{

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) 
	{
        tossAndAssignSymbols();
        displayTossResult();
    }

    static void tossAndAssignSymbols() 
	{
        Random random = new Random();
        
        // 0 for Human, 1 for Computer
        int toss = random.nextInt(2);

        if (toss == 0) 
		{
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } 
		else 
		{
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() 
	{
        if (isHumanTurn) 
		{
            System.out.println("Toss Outcome: Human plays first.");
        } 
		else 
		{
            System.out.println("Toss Outcome: Computer plays first.");
        }
        
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}