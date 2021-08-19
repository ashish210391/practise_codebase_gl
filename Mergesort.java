class MergeSort{
	
	
	private static mergeSort(int ar[],int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			mergeSort(ar,low,mid);
			mergeSort(ar,mid+1,high);
			merge(ar,low,mid,high);
	
	}
	
	private static merge(int ar[],int low,int mid,int high){
		
		
		int i = low;
		int j = mid+1;
		int k =0;
		
		int temp[] = new int[high+1];
		while(i<=mid && j <=high){
			
		if(ar[i]<ar[j]){
		{
			temp[k]=ar[i];
			++k;
			++i;
		
		}
		else{
		
			temmp[k]=ar[j];
			++k;
			++j;
		}
			
		}
	
		if(i<=mid){
		while(i<=mid){
			temp[k]=ar[i];
			++k;
			++i;
		}
		}
		if( j<=high){
			while(j<=high){
				temp[k]=ar[j];
				++k;
				++j;
			}
			}
			
			for(int c= low ;c<=high;c++){
				ar[c]=temp[k];
				++k;
				}
				
	}
	
	
	public static void main(String args[]){
		}
