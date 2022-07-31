
public class AssignmentQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=20,col=20;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j==0 || i==0 || i==row-1 || j<=col/2-i || i>row/2 && j<=i-row/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
