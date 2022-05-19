package codingbat;

public class StringE {
	public boolean stringE(String str) {
		  int ctr=0;
		  char ch;
		  for(int i=0;i<str.length();i++)
		  {
		      ch = str.charAt(i);
		      if(ch == 'e')
		      {
		          ctr++;
		      }
		  }
		  if(ctr>0 && ctr<=3)
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
