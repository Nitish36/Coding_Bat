package codingbat;

public class PosNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		  if(a<0 && b<0 && negative == true)
		  {
		    return true;
		  }
		  if(a<0 && b>0 && negative == false)
		  {
		    return true;
		  }
		  if(a>0 && b<0 && negative == false)
		  {
		    return true;
		  }
		  return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
