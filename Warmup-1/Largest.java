package codingbat;

public class Largest {
	public int intMax(int a, int b, int c) {
		  if(a>b && a>c)
		  {
		    return a;
		  }
		  else if(b>c && b>a)
		  {
		    return b;
		  }
		  else
		  {
		    return c;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
