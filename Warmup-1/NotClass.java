package codingbat;

public class NotClass {
	public String notString(String str) {
		  if(str.length()>=3 && str.substring(0,3).equals("not"))
		  {
		      return str;
		  }
		  else
		  {
		     return "not "+str;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
