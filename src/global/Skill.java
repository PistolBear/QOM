package global;

import java.util.ArrayList;

import dice.DiceBag;
import dice.Rollable;

public class Skill implements Rollable
{
	protected SkillName m_skillName;
	protected String description;

	protected int rank;
	protected Ability keyAbility;

	protected int armorPenalty = 0;
	protected boolean isArmorPenalized = false;
	protected boolean useUntrained = false;
	
	protected ArrayList<Skill> m_synergySkills;
	protected Modifier miscellaneousMod;
	
	
	
	@Override
	public int roll() 
	{
		int totalSynergyScore = 0;
		for (Skill s : m_synergySkills)
		{
			totalSynergyScore += s.getSynergy(this);
		}
		return DiceBag.roll(20) + rank + keyAbility.getModifier() + miscellaneousMod.get() + (useUntrained ? 0 : -4) + (isArmorPenalized ? armorPenalty : 0) + totalSynergyScore;
	}
	
	public int getSynergy(Skill other)
	{
		if (other.rank >= 5)
		{
			if (m_synergySkills.contains(other.m_skillName))
			{
				return 2;
			}
		}
		
		return 0;
	}
	
	/**
	 * Should be called any time ACP is changed.
	 * @param penalty
	 */
	public void updateArmorPenalty(int penalty)
	{
		armorPenalty = penalty;
		
		// Cannot have a negative armor penalty
		if (armorPenalty < 0)
		{
			armorPenalty = 0;
		}
	}
}
