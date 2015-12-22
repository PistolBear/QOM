package dice;

public class Die implements Rollable
{
	protected int m_sides = 0;
	
	protected Die()
	{
		this(20);
	}
	
	public Die(int sides)
	{
		m_sides = sides;
	}

	public int getSides() 
	{
		return m_sides;
	}

	@Override
	public int roll() {
		return (int)(randomLong() % m_sides)+1;
	}
	
	protected long randomLong() 
	{
		long x = System.nanoTime();
		  x ^= (x << 21);
		  x ^= (x >>> 35);
		  x ^= (x << 4);
		  return Math.abs(x);
	}

}
