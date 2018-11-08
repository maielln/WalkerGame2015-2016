import java.util.Random;

public class stalker
{
	//initializes the stalker's coordinates
	public stalker()
	{
		x = 0;
		y = 0;
	}

	//changes the stalker's x and y depending on the location of the walker
	public void move(Randomer walker)
	{
		Walker = walker;

		if(x < walker.getX())
			x++;
		else if(x > walker.getX())
			x--;

		else if (y < walker.getY())
			y++;

		else
			y--;
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
	private Randomer Walker;

}