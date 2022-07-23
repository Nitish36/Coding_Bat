package codingbat;

public class Diff21 {
	public int diff21(int n) {
		  int temp=0;
		  if(n<21)
		  {
		    temp = n-21;
		    return Math.abs(temp);
		  }
		  else
		  {
		    temp = n-21;
		    return (temp*2);
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
