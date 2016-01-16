package characterClasses;

import global.ProgressionSpeed;

public class FighterClass extends BaseClass
{

   public FighterClass()
   {
      super();
      m_name = "Fighter";

      BAB.setProgression(ProgressionSpeed.FULL);
      FORT.setProgression(ProgressionSpeed.GOOD);
      REF.setProgression(ProgressionSpeed.POOR);
      WILL.setProgression(ProgressionSpeed.POOR);
      
      m_hitDieSize = 10;
      
      setClassFeatures();
   }

   @Override
   public void setClassFeatures()
   {
      m_classFeatures = 
               "Fighter"
               + "The following are class features of the fighter.\n\n"

               + "Weapon and Armor Proficiency\n"
               + "A fighter is proficient with all simple and martial weapons and with all armor (heavy, light, and medium) and shields (including tower shields).\n\n"

               + "Bonus Feats\n"
               + "At 1st level, and at every even level thereafter, a fighter gains a bonus feat in addition to those gained from normal advancement (meaning that the fighter gains a feat at every level). These bonus feats must be selected from those listed as Combat Feats, sometimes also called �fighter bonus feats.�\n"
               + "Upon reaching 4th level, and every four levels thereafter (8th, 12th, and so on), a fighter can choose to learn a new bonus feat in place of a bonus feat he has already learned. In effect, the fighter loses the bonus feat in exchange for the new one. The old feat cannot be one that was used as a prerequisite for another feat, prestige class, or other ability. A fighter can only change one feat at any given level and must choose whether or not to swap the feat at the time he gains a new bonus feat for the level.\n\n"

               + "Bravery (Ex)\n"
               + "Starting at 2nd level, a fighter gains a +1 bonus on Will saves against fear. This bonus increases by +1 for every four levels beyond 2nd.\n\n"

               + "Armor Training (Ex)\n"
               + "Starting at 3rd level, a fighter learns to be more maneuverable while wearing armor. Whenever he is wearing armor, he reduces the armor check penalty by 1 (to a minimum of 0) and increases the maximum Dexterity bonus allowed by his armor by 1. Every four levels thereafter (7th, 11th, and 15th), these bonuses increase by +1 each time, to a maximum �4 reduction of the armor check penalty and a +4 increase of the maximum Dexterity bonus allowed.\n"
               + "In addition, a fighter can also move at his normal speed while wearing medium armor. At 7th level, a fighter can move at his normal speed while wearing heavy armor.\n\n"

               + "Weapon Training (Ex)\n"
               + "Starting at 5th level, a fighter can select one group of weapons, as noted below. Whenever he attacks with a weapon from this group, he gains a +1 bonus on attack and damage rolls.\n"
               + "Every four levels thereafter (9th*, 13th, and 17th), a fighter becomes further trained in another group of weapons. He gains a +1 bonus on attack and damage rolls when using a weapon from this group. In addition, the bonuses granted by previous weapon groups increase by +1 each. For example, when a fighter reaches 9th level, he receives a +1 bonus on attack and damage rolls with one weapon group and a +2 bonus on attack and damage rolls with the weapon group selected at 5th level. Bonuses granted from overlapping groups do not stack. Take the highest bonus granted for a weapon if it resides in two or more groups.\n"
               + "* Beginning at 9th level, instead of selecting an additional fighter weapon group, a fighter can choose an advanced weapon training option for one fighter weapon group that he previously selected with the weapon training class feature. Source PPC:WMH\n"
               + "A fighter also adds this bonus to any combat maneuver checks made with weapons from this group. This bonus also applies to the fighter's Combat Maneuver Defense when defending against disarm and sunder attempts made against weapons from this group.\n\n"

               + "Weapon groups are defined as follows (GMs may add other weapons to these groups, or add entirely new groups):\n"
               + "Axes: bardiche, battleaxe, collapsible kumade, dwarven waraxe, gandasa, greataxe, handaxe, heavy pick, hooked axe, knuckle axe, kumade, light pick, mattock, orc double axe, pata, throwing axe, and tongi.\n"
               + "Blades, Heavy: Ankus, dueling sword, bastard sword, chakram, double chicken saber, double walking stick katana, elven curve blade, estoc, falcata, falchion, flambard, greatsword, great terbutje , katana, khopesh, klar, longsword, nine-ring broadsword, nodachi, scimitar, scythe, seven-branched sword, shotel, temple sword, terbutje, and two-bladed sword.\n"
               + "Blades, Light: bayonet, butterfly knife, butterfly sword, chakram, dagger, Deer horn knife, gladius, hunga munga, kama, katar, kerambit, kukri, machete, madu, manople, pata, quadrens, rapier, sawtooth sabre, scizore, shortsword, sica, sickle, starknife, swordbreaker dagger, sword cane, wakizashi, and war razor.\n"
               + "Bows: composite longbow, composite shortbow, longbow, and shortbow.\n"
               + "Close: bayonet, brass knuckles, cestus, dan bong, emei piercer, fighting fan, gauntlet, heavy shield, iron brush, katar, light shield, madu, mere club, punching dagger, rope gauntlet, sap, scizore, spiked armor, spiked gauntlet, spiked shield, tekko-kagi, tonfa, unarmed strike, wooden stake, and wushu dart.\n"
               + "Crossbows: double crossbow, hand crossbow, heavy crossbow, launching crossbow, light crossbow, heavy repeating crossbow, light repeating crossbow, and tube arrow shooter.\n"
               + "Double: bo staff, chain spear, dire flail, double walking stick katana, double-chained kama, dwarven urgrosh, gnome hooked hammer, kusarigama, orc double axe, quarterstaff, two-bladed sword, and weighted spear.\n"
               + "Firearms: all one-handed, two-handed, and siege firearms.\n"
               + "Flails: battle poi, bladed scarf, chain spear, dire flail, double chained kama, flail, flying blade, gnome pincher, halfling rope-shot, heavy flail, kusarigama, kyoketsu shoge, meteor hammer, morningstar, nine-section whip, nunchaku, sansetsukon, scorpion whip, spiked chain, urumi, and whip.\n"
               + "Hammers: aklys, battle aspergillum, club, greatclub, heavy mace, light hammer, light mace, mere club, planson, taiaha, tetsubo, wahaika, and warhammer.\n"
               + "Monk: bo staff, brass knuckles, butterfly sword, cestus, dan bong, deer horn knife, double chained kama, double chicken saber, emei piercer, fighting fan, hanbo, jutte, kama, kusarigama, kyoketsu shoge, lungshuan tamo, monk's spade, nine-ring broadsword, nine-section whip, nunchaku, quarterstaff, rope dart, sai, sansetsukon, seven-branched sword, shang gou, shuriken, siangham, temple sword, tiger fork, tonfa, tri-point double-edged sword, unarmed strike, urumi, and wushu dart.\n"
               + "Natural: unarmed strike and all natural weapons, such as bite, claw, gore, tail, and wing.\n"
               + "Polearms: bardiche, bec de corbin, bill, crook, glaive, glaive-guisarme, guisarme, halberd, hooked lance, lucerne hammer, mancatcher, monk's spade, naginata, nodachi, ranseur, rhomphaia, tepoztopilli, and tiger fork.\n"
               + "Siege engines: Ballista, bombard, catapult, corvus, firedrake, firewyrm, gallery, ram, siege tower, springal, trebuchet, and all other siege engines.\n"
               + "Spears: amentum, boar spear, chain spear, elven branched spear, javelin, harpoon, lance, longspear, orc skull ram, pilum, planson, shortspear, sibat, spear, tiger fork, trident, and weighted spear.\n"
               + "Thrown: aklys, amentum, atlatl, blowgun, bolas, boomerang, brutal bolas, chakram, club, dagger, dart, deer horn knife, halfling sling staff, harpoon, hunga munga, javelin, lasso, kestros, light hammer, net, poisoned sand tube, rope dart, shortspear, shuriken, sibat, sling, sling glove, spear, starknife, throwing axe, throwing shield, trident, and wushu dart.\n\n"

               + "Armor Mastery (Ex)\n"
               + "At 19th level, a fighter gains Damage Reduction 5/� whenever he is wearing armor or using a shield.\n\n"

               + "Weapon Mastery (Ex)\n"
               + "At 20th level, a fighter chooses one weapon, such as the longsword, greataxe, or longbow. Any attacks made with that weapon automatically confirm all critical threats and have their damage multiplier increased by 1 (�2 becomes �3, for example). In addition, he cannot be disarmed while wielding a weapon of this type.\n\n"

               + "Advanced Weapon Training\n"
               + "Source PPC:WMH\n"
               + "Highly skilled and experienced fighters can gain advanced weapon training, learning techniques and applications of the weapon training class feature that give them special benefits in exchange for specializing in a smaller number of fighter weapon groups.\n"
               + "Beginning at 9th level, instead of selecting an additional fighter weapon group, a fighter can choose an advanced weapon training option for one fighter weapon group that he previously selected with the weapon training class feature. The fighter's weapon training bonus still increases for weapons from all fighter weapon groups he previously selected with weapon training. Some advance weapon training options can be selected only if the fighter meets the option's prerequisites.\n\n"

               + "Advanced weapon training options function only when the fighter is wielding a weapon from the associated group, unless otherwise noted, and use his weapon training bonus for the associated weapon group. Any bonuses on attack rolls and damage rolls granted by advanced weapon training apply only on attack rolls and damage rolls from weapons in the associated group. A fighter with an archetype that replaces weapon training cannot select advanced weapon training options.\n\n"

               + "Abundant Tactics (Ex) The fighter adds his weapon training bonus to the number of times per day he can use a combat feat he has that allows a limited number of daily uses, such as the Stunning Fist feat.\n"
               + "Armed Bravery (Ex) The fighter applies his bonus from bravery to Will saving throws. In addition, the DC of Intimidate checks to demoralize him increases by an amount equal to twice his bonus from bravery. The fighter must have the bravery class feature in order to select this option.\n"
               + "Combat Competence (Ex) For any weapon in the associated weapon group with which the fighter is not proficient, the penalty on attack rolls taken as a result of not being proficient is reduced by an amount equal to the fighter's weapon training bonus with that weapon group. Once the penalty is reduced to 0, the fighter becomes proficient with such weapons.\n"
               + "Combat Maneuver Defense (Ex) When the fighter is wielding weapons from the associated weapon group, his weapon training bonus applies to his CMD against all combat maneuvers attempted against him, instead of just against disarm and sunder combat maneuvers.\n"
               + "Dazzling Intimidation (Ex) The fighter applies his weapon training bonus to Intimidate checks and can attempt an Intimidate check to demoralize an opponent as a move action instead of a standard action. If he has the Dazzling Display feat, he can use it as a standard action instead of a full-round action.\n"
               + "Defensive Weapon Training (Ex) The fighter gains a +1 shield bonus to his Armor Class. The fighter adds half his weapon's enhancement bonus (if any) to this shield bonus. When his weapon training bonus for weapons from the associated fighter weapon group reaches +4, this shield bonus increases to +2. This shield bonus is lost if the fighter is immobilized or helpless.\n"
               + "Fighter's Finesse (Ex) The fighter gains the benefits of the Weapon Finesse feat with all melee weapons that belong to the associated fighter weapon group (even if they cannot normally be used with Weapon Finesse). The fighter must have the Weapon Finesse feat before choosing this option.\n"
               + "Fighter's Reflexes (Ex) The fighter applies his weapon training bonus to Reflex saving throws. He loses this bonus when he is flat-footed or denied his Dexterity bonus to AC.\n"
               + "Fighter's Tactics (Ex) All of the fighter's allies are treated as if they had the same teamwork feats as the fighter for the purpose of determining whether the fighter receives a bonus from his teamwork feats. His allies do not receive any bonuses from these feats unless they actually have the feats themselves. The allies' positioning and actions must still meet the prerequisites listed in the teamwork feat for the fighter to receive the listed bonus.\n"
               + "Focused Weapon (Ex) The fighter selects one weapon for which he has Weapon Focus and that belongs to the associated fighter weapon group. The fighter can deal damage with this weapon based on the damage of the warpriest's sacred weapon class feature, treating his fighter level as his warpriest level. The fighter must have Weapon Focus with the selected weapon in order to choose this option.\n"
               + "Inspiring Confidence (Ex) A number of times per day equal to his highest weapon training bonus as a swift action, the fighter can allow one ally within 30 feet to attempt a new saving throw against an ongoing fear effect that causes the ally to cower or to become frightened, panicked, or shaken. If the ally succeeds at the save, the effect ends. A fighter can use this option even when not wielding a weapon from the associated weapon group.\n"
               + "Trained Grace (Ex) When the fighter uses Weapon Finesse to make a melee attack with a weapon, using his Dexterity modifier on attack rolls and his Strength modifier on damage rolls, he doubles his weapon training bonus on damage rolls. The fighter must have Weapon Finesse in order to choose this option.\n"
               + "Trained Initiative (Ex) As long as he is wielding a weapon from the associated weapon group or is able to draw such a weapon (even if he is not currently wielding it), the fighter applies his weapon training bonus to initiative checks. In addition, if he has the Quick Draw feat and has a weapon from the appropriate weapon group that isn't hidden, he can draw that weapon as a free action as part of making an initiative check.\n"
               + "Trained Throw (Ex) When the fighter makes a ranged attack with a thrown weapon and applies his Dexterity modifier on attack rolls and his Strength modifier on damage rolls, he doubles his weapon training bonus on damage rolls. Unless he has the Throw Anything feat, the fighter can choose only the thrown fighter weapon group with this option. If he has Throw Anything, the fighter can choose any fighter weapon group with this option and apply this option's benefits to any weapon from that group that he throws.\n"
               + "Versatile Training (Ex) The fighter can use his base attack bonus in place of his ranks in two skills of his choice that are associated with the fighter weapon group he has chosen with this option (see below). The fighter need not be wielding an associated weapon to use this option. When using versatile training, the fighter substitutes his total base attack bonus (including his base attack bonus gained through levels in other classes) for his ranks in these skills, but adds the skill's usual ability score modifier and any other bonuses or penalties that would modify those skills. Once the skills have been selected, they cannot be changed and the fighter can immediately retrain all of his skill ranks in the selected skills at no additional cost in money or time. In addition, the fighter adds all skills chosen with this option to his list of class skills. A fighter can choose this option up to two times. The Bluff and Intimidate skills are associated with all fighter weapon groups. The various fighter weapon groups also have the following associated skills: axes (Climb, Survival), bows (Knowledge [engineering], Perception), close (Sense Motive, Stealth), crossbows (Perception, Stealth), double (Acrobatics, Sense Motive), firearms (Perception, Sleight of Hand), flails (Acrobatics, Sleight of Hand), hammers (Diplomacy, Ride), heavy blades (Diplomacy, Ride), light blades (Diplomacy, Sleight of Hand), monk (Acrobatics, Escape Artist), natural (Climb, Fly, Swim), polearms (Diplomacy, Sense Motive), siege engines (Disable Device, Profession [driver]), spears (Handle Animal, Ride), and thrown (Acrobatics, Perception).\n"
               + "Weapon Mastery The fighter gains a weapon mastery feat as a bonus feat, even when not wielding a weapon from the appropriate weapon group. He must meet all of the feat's prerequisites.\n"
               + "Weapon Sacrifice (Ex) When damage would cause the fighter or an adjacent ally to be knocked unconscious or killed, as a swift or immediate action the fighter can instead direct the damage to a weapon from the associated weapon group that he is wielding. The original target takes no damage, but the weapon receives only half its normal hardness. The fighter can use this option a number of times per day equal to the fighter's weapon training bonus with the associated weapon group. He cannot use this option with unarmed attacks.\n"
               + "Weapon Specialist (Ex) The fighter selects a number of combat feats that he knows equal to his weapon training bonus with the associated weapon group. The selected feats must be ones that require the fighter to choose a type of weapon (such as Weapon Focus and Weapon Specialization), and the fighter must have chosen weapons that belong to the associated fighter weapon group. The fighter is treated as having the selected feats for all the weapons in the associated weapon group that are legal choices for those feats. The fighter is also considered to have those feats with these weapons for the purpose of meeting prerequisites.\n";
   }
   
}
