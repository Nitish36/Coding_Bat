package codingbat;

public class ExtraEnd {
	public String extraEnd(String str) {
		  int n = str.length();
		  String copy = str.substring(n-2,n);
		  return copy+copy+copy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
