package codingbat;

public class Front3 {
	public String front3(String str) {
		  String temp="";
		  if(str.length()<3)
		  {
		     temp=str.substring(0,str.length());
		     return temp+temp+temp;
		  }
		  else
		  {
		    temp = str.substring(0,3);
		    return temp+temp+temp;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
