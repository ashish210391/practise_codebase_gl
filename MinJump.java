public class MinJump{



private static int minJump(int ar[],int n){

	Integer [] dp = new Integer[n+1];
	dp[n]=0;

	for(int i =n-1;i>=0;i--){

			if(ar[i]>0){

					int min = Integer.MAX_VALUE;
					for(int j=i+1;j<=i+ar[i] && j<dp.length;j++){

							if(dp[j]!=null){
								min = Math.min(min,dp[j]);
							}

						}
			if(min!=Integer.Max_VALUE){

					dp[i]=min+1;
		}
				}
		}


}

public static void main(String args[]){


}
}
