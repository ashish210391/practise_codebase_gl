public class ThreeSumProblem{


private static boolean threeSum(int ar[],int target){

	int len = ar.length-1;
	Arrays.sort(ar);
	int start = 1;
	int end  = len;
	for(int i=0;i<=len-2;i++){
			if(twoSum(ar,-ar[i],i+1,end){
				return true;

		}
	}

private static boolean twoSum(int ar[],int sum, int start, int end){

		for(int i = start, i<=end;i++){

			int curr_sum = ar[i]+ar[start]+ar[end];
			if(curr_sum>sum) end--;
			else if(curr_sum<sum) start++;
			else{
				return true;
		}

		return false;

	}




public static void main(String args[]){



	}

}