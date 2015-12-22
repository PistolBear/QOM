package dice;


public class DiceBag 
{

	public static int roll(Die m_die) 
	{
		long now = System.nanoTime();
		long nowish = (System.currentTimeMillis() >>> 2 << 3 >>> 4) % 104729;
		
		int nowInt = (int) (now - nowish);
		
		return nowInt % m_die.getSides();
	}

	public static int roll(int dieSides)
	{
		return roll(new Die(dieSides));
	}
}
