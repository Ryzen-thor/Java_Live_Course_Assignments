
public class AssignmentQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=8;
		int col = row*2-1;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j>i && j<col-i-1 )
				System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
