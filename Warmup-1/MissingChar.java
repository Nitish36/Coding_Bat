package codingbat;

public class MissingChar {
	public static String missingChar(String str, int n) {
		String front = str.substring(0,n);
		String back = str.substring(n+1,str.length());
		  
		  return front+back;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingChar("kitten",1));
	}

}
