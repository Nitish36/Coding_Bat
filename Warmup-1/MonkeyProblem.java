package codingbat;

public class MonkeyProblem {
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if(aSmile == true && bSmile == true)
		  {
		    return true;
		  }
		  if(aSmile == false && bSmile == false)
		  {
		    return true;
		  }
		  if(aSmile == true && bSmile == false)
		  {
		    return false;
		  }
		  if(aSmile == false && bSmile == true)
		  {
		    return false;
		  }
		  return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(monkeyTrouble(true,true));
	}

}
