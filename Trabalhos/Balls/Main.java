import java.util.Scanner;

public class Main{
	
	public static void main(String [] args){

		int nBalls;
		Scanner read = new Scanner(System.in);
		BallDemo teste = new BallDemo();

		System.out.println("How many balls?");
		nBalls = read.nextInt();
		teste.drawFrame();
		teste.bounce(nBalls);

	}

}