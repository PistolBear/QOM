package characterClasses;

import java.util.List;

final public class SkillFactory extends Skill
{
	private SkillFactory() {}
	
	/**
	 * Call when ready to use and store it as a skill
	 */
	public Skill build()
	{
		return (Skill) this;
	}
	
	public static List<SkillName> getAllSkills()
	{
		
		return null;
	}

	
}
