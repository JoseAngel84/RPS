import java.util.Random;
import java.util.Scanner;

public class RPS2 {

	private static Scanner myScan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int R = 0;//R = Rock
			int P = 1;//P = Paper
			int S = 2;//S = Scissors
			int u; //Users Choice
			int c; //Computer's Choice
			myScan = new Scanner(System.in);
			Random myRand = new Random();
			System.out.print("0. Rock, 1. Paper or 2. Scissors?");
			u = myScan.nextInt();
			c = myRand.nextInt(3);
			
			System.out.println("c="+c+"u="+u);
			
			if( u==c )
			{
				System.out.println("Tie Game!");//Tie
			}
			else if( (u==R && c==S) || (u==S && c==P) || (u==P && c==R) )
			{
				System.out.println("User Wins!");//User wins!
			}
			else
			{
				System.out.println("You are a loser!");//Computer wins!
		
	}//end if else
	}//end main method
}//end Program
