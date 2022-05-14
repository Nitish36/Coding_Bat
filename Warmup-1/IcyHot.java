package codingbat;

public class IcyHot {
	public boolean icyHot(int temp1, int temp2) {
		  if(temp1>100 && temp2<0){return true;}
		  if(temp1<0 && temp2>100){return true;}
		  if(temp1>0 && temp2>100){return false;}
		  if(temp1>100 && temp2>0){return false;}
		  return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
