package corejava.algo;

public class RecPattern {

	
	
	
	public static void printPattern(int n,int i)
	{
		if(n==0) return;
		if(i<n) {
			System.out.print("*");
			printPattern(n, i+1);
		}
		else {
			System.out.println();
			printPattern(n-1, 0);
		}
	}
	
	public static void printPattern2(int n,int i,int k) {
		if(n==0) return ;
		
		if(k<=i) {
			System.out.print("*");
			printPattern2(n, i, k+1);
		}
		else {
		System.out.println();
		printPattern2(n-1,i+1,0);
		}
	}
	
	public static void main(String[] args) {
		
		//printPattern(5, 0);
		
		printPattern2(5, 0, 0);
	}
}
