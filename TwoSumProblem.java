public class TwoSumProblem{


//two pointer approach
private static int[] twoSum(int ar[], int target){

int start=0;
int end=ar.length-1;
int [] result = new int[2];

	Arrays.sort(ar);
for(int i =0;i<ar.length-1;i++){

	if(ar[start]+ar[end] == target){
		 result[0]=start;
		 result[1]=end;
	}
	else if (ar[start]+ar[end]>target)
		--end;
		else
			++start;
	}

	return result;
	}

	private static int[] twoSumHashing(int ar[],int target){

		Map<Integer,Integer> map = new Hashmap<Integer,Integer>();
		for(int i =0;i<ar.length;i++)
		{
			int diff = target - ar[i];
			if(!map.contains(diff)){
				map.put(ar[i],i);
				}
				else{
					//return the index of the elements
		}


		}

public static void main(String args[]){

	int ar[] = {2,7,11,15};
	int target = 9;
	 twoSum(ar,target);


	}
}