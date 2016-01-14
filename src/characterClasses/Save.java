package characterClasses;

public class Save implements Progresses
{
   String m_name = null;
   ProgressionSpeed m_progressSpeed = ProgressionSpeed.NEW;
   
   public Save(String string)
   {
      m_name = string;
   }

   @Override
   public void setProgression(ProgressionSpeed a)
   {
      m_progressSpeed = a;
   }

   public int getBonusBasedOnLevel(int level)
   {
      int retval = 0;

      if (m_progressSpeed.toString().equals("GOOD"))
      {
         retval = 2;
      }
      retval += (m_progressSpeed.getMultiplier() * (float) level);
      
      return retval;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
      result = prime * result + ((m_progressSpeed == null) ? 0 : m_progressSpeed.hashCode());
      return result;
   }

   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Save other = (Save) obj;
      if (m_name == null)
      {
         if (other.m_name != null)
            return false;
      }
      else if (!m_name.equals(other.m_name))
         return false;
      if (m_progressSpeed != other.m_progressSpeed)
         return false;
      return true;
   }

   public Object getProgression()
   {
      return m_progressSpeed.toString();
   }

   
}
