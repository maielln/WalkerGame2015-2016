import java.util.*;

public class Grid
{
	//initializes the grid by importing the needed classes
	public Grid(Randomer aRandomer, stalker Stalker)
	{
		 randomer = aRandomer;
		 sTalker = Stalker;
	}

	//prints out the board while checking the location of the walker and the stalker
	public void print()
	{

		 for(int i = 0; i < 20; i++)
		 {
			 for(int j = 0; j < 20; j++)
			 {
				 if(sTalker.getY() == randomer.getY() && sTalker.getX() == randomer.getX() && sTalker.getY() == i && sTalker.getX() == j)
				 	System.out.print("x");

				 else if (i == randomer.getY() && j == randomer.getX())
				 	System.out.print("o");

				 else if (i == sTalker.getY() && j == sTalker.getX())
				 	System.out.print("*");

				 else
				 	System.out.print("-");
			 }
			System.out.println();
		}

		if(sTalker.getY() == randomer.getY() && sTalker.getX() == randomer.getX())
		{
		 	System.out.println("The stalker has caught the walker!");
			System.exit(0);
		}

		randomer.move();
		sTalker.move(randomer);
	}
	private Randomer randomer;
	private stalker sTalker;
}
