//Nicole Maiello
//10/30/15

import java.util.Scanner;

public class RandomWalk
{
	public static void main (String[] args)
	{
		Randomer rand = new Randomer(10, 10);
		stalker theStalker = new stalker();
		Grid gri = new Grid(rand, theStalker);
		Scanner minerva = new Scanner(System.in);

		for(int i = 0; i < 100; i++)
		{
			gri.print();
			System.out.println();
			minerva.nextLine();
		}
	}
}