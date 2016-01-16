package global;

import dice.DiceBag;
import dice.Die;
import dice.Rollable;

public abstract class Ability implements Rollable 
{
	Die m_die = new Die(20);
	Modifier m_mod = new Modifier(0);
	String m_name = "Ability";
	int m_value = 10;
	
	public Ability(String name, int value)
	{
		m_name = name;
		m_value = value;
		m_mod.newAbScore(m_value);
	}
	
	
	public int roll()
	{
		return DiceBag.roll(m_die) + m_mod.get();
	}


	public int getModifier() 
	{
		return m_mod.get();
	}
	

}

