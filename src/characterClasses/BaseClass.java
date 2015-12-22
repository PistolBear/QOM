package characterClasses;

import java.util.ArrayList;


public abstract class BaseClass 
{
	protected String m_name = "Commoner";
	
	protected BaseAttackBonus BAB = new BaseAttackBonus();
	protected Save FORT = new Save("FORT"), REF = new Save("REF"), WILL = new Save("WILL");
	
	ArrayList <Skill> AllSkills = new ArrayList<Skill>();
	ArrayList <Skill> ClassSkills = new ArrayList<Skill>();
	
	public int rollSkill(SkillName name)
	{
		int total = 0;
		
		
		if (ClassSkills.contains(name))
		{
			total += 3;
		}
		
		return total;
	}
	
}
