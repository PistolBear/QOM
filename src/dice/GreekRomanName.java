package dice;

import java.util.Random;

public class GreekRomanName 
{
	/** Not intended for instantiation */
	private GreekRomanName() {}
	
	public static String genName() 
	{
		String [] nameList = {
		"Zeus        ".trim(),
		"Jupiter     ".trim(),
		"Poseidon    ".trim(),
		"Neptune     ".trim(),
		"Hades       ".trim(),
		"Pluto       ".trim(),
		"Hestia      ".trim(),
		"Vesta       ".trim(),
		"Hera        ".trim(),
		"Juno        ".trim(),
		"Ares        ".trim(),
		"Mars        ".trim(),
		"Athena      ".trim(),
		"Minerva     ".trim(),
		"Apollo      ".trim(),
		"Aphrodite   ".trim(),
		"Venus       ".trim(),
		"Hermes      ".trim(),
		"Mercury     ".trim(),
		"Artemis     ".trim(),
		"Diana       ".trim(),
		"Hephaestus  ".trim(),
		"Vulcan      ".trim()
		};
		
		int name = new Random().nextInt(nameList.length);
		
		return nameList[name];
	}
}