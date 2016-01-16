package characterRaces;

import global.AbilityName;
import global.Modifier;

/**
 * Racial Ability Modifier
 * 
 *  Since Racial Modifiers will never be applied more than once, the equals() method 
 *  only checks the AbilityName, not the modifier value itself.  This allows these 
 *  objects to be placed into a Set, simplifying their (rare) replacement. 
 *  <p>
 *  The RacialAbilityModifier (RAM) adds to the Ability SCORE (not the Ability's modifier itself).  
 *  Therefore, a RAM of 2 adds only 1 to the modifier of the Ability in question.
 *  <p>
 *  RAMs may be negative, but are always an integer.
 *  
 *   
 * @author woody
 *
 */
public class RacialAbilityModifier extends Modifier 
{
	AbilityName m_name = null;

	public RacialAbilityModifier(int i, AbilityName a)
	{
		this(i);
		m_name = a;
	}
	
	private RacialAbilityModifier(int i) 
	{
		super(i);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RacialAbilityModifier other = (RacialAbilityModifier) obj;
		if (m_name != other.m_name)
			return false;
		return true;
	}
}
