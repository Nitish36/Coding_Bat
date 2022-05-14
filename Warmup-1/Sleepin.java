package codingbat;

public class Sleepin {
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if(weekday == true && vacation == true)
		  {
		    return true;
		  }
		  if(weekday == true && vacation == false)
		  {
		    return false;
		  }
		  if(weekday == false && vacation == true)
		  {
		    return true;
		  }
		  if(weekday == false && vacation == false)
		  {
		    return true;
		  }
		  return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sleepIn(false,false));
	}

}
