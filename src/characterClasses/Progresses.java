package characterClasses;

/**
 * Represents a multiplier that has a specific progression speed.
 * <p>
 * This means the value returned from getLevelMultiplier is a number (float)
 * that when multiplied by the number of Levels a class has, will give you a
 * value determined by that class's ruleset. For instance:
 * <p>
 * ProgressionSpeed of a <strong>Fighter</strong>'s Base Attack Bonus
 * (<strong>BAB</strong>) is <strong>FULL</strong>, meaning it is equal to his
 * level ( Fighter's Level == BAB). So getLevelMultiplier() called on a
 * Fighter's BAB object should return a 1, so that the class's getAttack (or
 * whatever client needs it) will be able to take the Level multiply it by that
 * number. If the class were instead a Rogue, and a client needed the value of
 * the BAB, it would instead get Level * .75, because a Rogue's BAB progression
 * should be 3/4 of Level. A character client with multiple classes will ask
 * each of its classes who have levels to give them their values individually
 * and compile those into a final BAB. So,
 * <p>
 * a Fighter 3 / Rogue 4 will have a BAB of 6 <strong>(Fighter's 3 Levels * 1) +
 * (Rogue's 4 Levels * .75) = 6</strong>.
 */
public interface Progresses
{
   abstract void setProgression(ProgressionSpeed a);
   public abstract int getBonusBasedOnLevel(int level);

}
