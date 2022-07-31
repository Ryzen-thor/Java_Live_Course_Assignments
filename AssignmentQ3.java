
public class AssignmentQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int row=n*2-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(  i==0 || j==0 || i==row-1 || j==row-1 || i>0 && j<=row/2-i || j>=row/2+i ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
