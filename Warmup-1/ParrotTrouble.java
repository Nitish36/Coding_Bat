package codingbat;

public class ParrotTrouble {
	public boolean parrotTrouble(boolean talking, int hour) {
		  if(talking == true && (hour<7 || hour>20))
		  {
		    return true;
		  }
		  if(talking == false && (hour<7 || hour>20))
		  {
		    return false;
		  }
		  if(talking == true && hour>=7 || hour<=20)
		  {
		    return false;
		  }
		  return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
