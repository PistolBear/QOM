package dice;

import java.util.Random;

public class NamedDie extends ModDie 
{
	private String m_name;
	
	public NamedDie(int sides) 
	{
		super(sides);
		m_name = GreekRomanName.genName() + ' ' + Math.abs(new Random(System.nanoTime()).nextInt(1000));
	}
	
	public String getName()
	{
		return m_name;
	}

}
