package codingbat;

public class BackAround {
	public String backAround(String str) {
		  int n = str.length();
		  String back="";
		  if(n==1)
		  {
		    return str+str+str;
		  }
		  else
		  {
		    back = str.substring(n-1,n);
		    return back+str+back;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
