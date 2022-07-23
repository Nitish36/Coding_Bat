package codingbat;

public class Front22 {
	public String front22(String str) {
		   int n = str.length();
				  String front="";
				  if(n==1 || str=="")
				  {
				    return str+str+str;
				  }
				  else
				  {
				    front = str.substring(0,2);
				    return front+str+front;
				  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
