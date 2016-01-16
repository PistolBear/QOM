package global;

public enum SkillName 
{
	Acrobatics 	                (AbilityName.Int),
	Appraise	                (AbilityName.Int),
	Bluff 		                (AbilityName.Cha),
	Climb		                (AbilityName.Str),
	Craft 		                (AbilityName.Int),
	Diplomacy 	                (AbilityName.Cha),
	Disable_Device 	            (AbilityName.Dex),
	Disguise 	                (AbilityName.Cha),
	Escape_Artist	            (AbilityName.Dex),
	Fly 		                (AbilityName.Dex),
	Handle_Animal 	            (AbilityName.Cha),
	Heal 			            (AbilityName.Wis),
	Intimidate 		            (AbilityName.Cha),
	Knowledge_arcana	        (AbilityName.Int),
	Knowledge_dungeoneering		(AbilityName.Int),
	Knowledge_engineering	 	(AbilityName.Int),
	Knowledge_geography	 		(AbilityName.Int),
	Knowledge_history	 		(AbilityName.Int),
	Knowledge_local 			(AbilityName.Int),
	Knowledge_nature 			(AbilityName.Int),
	Knowledge_nobility	 		(AbilityName.Int),
	Knowledge_planes 			(AbilityName.Int),
	Knowledge_religion	 		(AbilityName.Int),
	Linguistics 				(AbilityName.Int),
	Perception 					(AbilityName.Wis),
	Perform 					(AbilityName.Cha),
	Profession 					(AbilityName.Wis),
	Ride 						(AbilityName.Dex),
	Sense_Motive 				(AbilityName.Wis),
	Sleight_of_Hand 			(AbilityName.Dex),
	Spellcraft 					(AbilityName.Int),
	Stealth 					(AbilityName.Dex),
	Survival 					(AbilityName.Wis),
	Swim 						(AbilityName.Str),
	Use_Magic_Device 			(AbilityName.Cha);

	private AbilityName m_ability;
	
	SkillName(AbilityName governingAbility)
	{
		m_ability = governingAbility;
	}
	
	public AbilityName getAbility()
	{
		return m_ability;
	}


}
