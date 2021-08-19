public class MaxSubarraySumKadaneAlgorithm{


private static int maxSubarraySum(int ar[]){


	int curr_sum=ar[0];
	int overall_Sum =ar[0];
	int len = ar.length-1;
	for(int i=1;i<=len;i++){
			curr_sum=curr_sum>0?curr_sum+ar[i]:ar[i];
			overall_sum = Math.max(overall_sum,curr_sum);
		}

	}
public static void main(String args []){




	}



}