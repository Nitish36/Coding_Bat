package codingbat;

public class ComboStr {
	public String comboString(String a, String b) {
		  if(b.length()>a.length())
		  {
		    return a+b+a;
		  }
		  else
		  {
		    return b+a+b;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
