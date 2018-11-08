import java.util.Random;

public class Randomer
{
	//initiates the x and y
	public Randomer(int xLocation, int yLocation)
	{
		x = xLocation;
		y = yLocation;
	}
	//changes the walkers x or y depending on the random number and checks to see if the walker is on the grid
	public void move()
	{
			Random rando = new Random();

			switch(rando.nextInt(4))
			{
				case 0: if(x < 19) x++; else move(); break;
				case 1: if(x > 1) x--; else move(); break;
				case 2: if(y < 19) y++; else move(); break;
				case 3: if(y > 1) y--; else move(); break;
			}
	}
	//sends x
	public int getX()
	{
		return x;
	}
	//sends y
	public int getY()
	{
		return y;
	}

	private int x;
	private int y;
}