package characterClasses;

/**
 * Used for having a uniform progression of something
 */
public enum ProgressionSpeed 
{
   // Arbitrary, probably not used
   SLOW(10), MSLOW(20), MEDIUM(30), MFAST(40), FAST(50), NONE(0),  NEW(-1),

   /** BAB == Level (Fighters, Rangers) <br> Usually has d10 or d12 HD */
   FULL(1.0f), 
   /** BAB == 3/4 * Level (Monks, Rogues) <br> Usually has d8 HD */
   THREEQUARTERS(.75f), 
   /** BAB == 1/2 Level (Wizards, Sorcerers) <br> Usually has d6 HD */
   HALF(.5f), 
   
   // Saves  
   POOR(.333f), 
   /**GOOD saves also add static +2 after the calculation*/
   GOOD(.5f), MODERATE(.44f);

   float m_speedValue;

   ProgressionSpeed(float speed)
   {
      m_speedValue = speed;

   }

   public float getMultiplier()
   {
      return m_speedValue;
   }

   public void setCustomMultiplier(float a)
   {
      // Can only set if it's a 0 or special number
      if (m_speedValue == -1 || m_speedValue == 0)
      {
         m_speedValue = a;
      }
   }
}
