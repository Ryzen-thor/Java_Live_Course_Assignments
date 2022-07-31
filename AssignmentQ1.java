class IneuronPattern{
	int row = 9;
	void printPattern() {
//		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				//pattern for I
				
				if(j==0) {
					System.out.print("*");
				}
				
			}
			System.out.print(" ");
			
			for(int j=0;j<row;j++) {
				//pattern for N
				if(j==0 || j==row-1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j=0;j<row;j++) {
				//pattern for E
				if(j==0 || i==row-1 || i==0 || i==row/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<row;j++) {
				//pattern for U
				if(j==0 &&i<row-1 || j==row-1 && i<row-1 || i==row-1 && j>0 && j<row-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<row;j++) {
				//pattern for R
				if(j==0 || i==0 && j<row-1 || i==row/2 && j<row-1 || j==row-1 && i>0 && i<row/2 || i-j==2 && i>row/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<row;j++) {
				//pattern for R
				if(i==0 && j>0 && j<row-1 || j==0 && i>0 && i<row-1 || j==row-1 && i>0 && i<row-1 || i==row-1 && j>0 && j<row-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
		    System.out.print(" ");
			
			for(int j=0;j<row;j++) {
				//pattern for N
				if(j==0 || j==row-1 || j==i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}

class NumberPattern{
	int row = 5;
	
	void showPattern() {
		for(int i =1;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(i);
			}
			System.out.println();
			}
	}
}

public class AssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing INEURON
		IneuronPattern pattern = new IneuronPattern();
		pattern.printPattern();
		
		NumberPattern numberPattern = new NumberPattern();
		numberPattern.showPattern();
	}

}
