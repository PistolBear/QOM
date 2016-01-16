package characterRaces;

import global.Activates;
import global.Additional;
import global.BonusFeat;
import global.Language;
import global.Prerequisites;
import global.Size;

import java.util.HashSet;

import pathmaker.out.Helpers;

public class Race implements IRace
{
	HashSet<RacialAbilityModifier> m_abilMods = new HashSet<RacialAbilityModifier>();
	private Size m_size;
	private int m_speed;
	private HashSet<Language> m_langauges;
	private HashSet<Object> m_traits;

	/** 
	 * Sets default values so there's less boilerplate in the public ctor 
	 */
	protected Race()
	{
		// Default values that apply to most races.
		m_size = Size.MEDIUM;
		m_speed = 30;
		m_langauges.add(Language.COMMON);
		m_traits.add(new BonusFeat(Prerequisites.NONE));
		m_traits.add(new RacialTrait(Activates.ON_LEVELING, Additional.skillRank(1, Prerequisites.NONE)));
		
	}
	
	/**
	 * Constructor used with NPC's that have setRace() method
	 * @param name
	 */
	public Race(RaceNames name) 
	{
		switch(name)
		{
			// Core
		case CORE: 
		case HUMAN:
			m_abilMods.add(Helpers.chooseAbility("Human Racial Ability Bonus: ", 2));
			
			break;
		case ELF:
			break;
		case HALF_ELF:
			break; 
		case HALF_ORC:
			break; 
		case HALFLING:
			break; 
		case GNOME:
			break; 
		case DWARF:
			break;
			
			// Popular
		case POPULAR: 
		case ORC:
			break;
		case GOBLIN:
			break; 
		case AASIMAR:
			break; 
		case TIEFLING:
			break; 
		case RATFOLK:
			break; 
		case KOBOLD:
			break;
			
			// Monstrous
		case MONSTROUS: 
		case TROLL:
			break; 
		case CENTAUR:
			break; 
		case CHURR:
			break; 
		case GARGOYLE:
			break; 
		case HARPY:
			break; 
		case LAVA_CHILD:
			break; 
		case MAENAD:
			break; 
		case MINOTAUR:
			break; 
		case GIRTABLILU:
			break; 
			
			// Miscellany
		case OTHER:
		default:
		
		}
	}

	@Override
	public RaceNames getRaceName() 
	{
		return null;
	}

	@Override
	public String getDescription() 
	{
		return null;
	}

}
