package codingbat;

public class StartHi {
	public boolean startHi(String str) {
		   if(str=="" || str.length()==1)
		  {
		    return false;
		  } 
		  else if(str.substring(0,2).equals("hi"))
		  {
		    return true;
		  }
		  else
		  {
		    return false;  
		  }
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
