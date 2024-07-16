
public class SquareHollowPattern {

	
	public static  void printpattern(int n) {
		int i , j;
		// outer loop for row (i)
		for(i = 0;i<n;i++) {
			// inner loop for column(j)
			for(j=0;j<n;j++) {
				
				if(i==0 ||  j==0 ||i==n-1 ||j==n-1) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			 System.out.println();
			
		}
		
	}
	public static void main(String args[]) {
	 int n = 6;
		printpattern(n);
	}
	
}
