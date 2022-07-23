package codingbat;

public class FrontBack {
	public static String frontBack(String str) {
		  String front=" ",middle=" ",back=" ";
		  if(str.length()==1 || str=="")
		  {
		    return str;
		  }
		  else
		  {
		     front = str.substring(0,1);
		     middle = str.substring(1,str.length()-1);
		     back = str.substring(str.length()-1,str.length());
		     return back+middle+front;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontBack("a"));
	}

}
