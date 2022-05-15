package codingbat;

public class LoneTeen {
	public boolean loneTeen(int a, int b) {
		  boolean aTeen = (a>=13 && a<=19);
		  boolean bTeen = (b>=13 && b<=19);
		  
		  return ((aTeen && !bTeen)||(!aTeen && bTeen));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
