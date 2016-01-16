package global;

/**
 * Prerequisites
 * 
 * Labels used to modify Feats and such that need something to be satisfied in order for them to move forward in some way.
 * 
 * @author woody
 *
 */
public enum Prerequisites 
{
	NONE, COMBAT, FIGHTER, METAMAGIC, FEAT, CLASS_LEVEL, ABILITY_SCORE, SPECIAL_ABILITY;

	private String m_qualifier = null;
	
	Prerequisites() 
	{
		this("");
	}
	/**
	 * Used to add a value that limits what Feat, Ability, etc. is being referenced in the Prereq.
	 * @param name
	 */
	Prerequisites(String name) 
	{
		m_qualifier = name;
	}

}
