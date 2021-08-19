class QuickSort{


private static int partition(int ar[], int low, int high){

	int i = low+1;
	int pivot = low;
	int j = high;

	while(i<j){

		while(ar[i]<ar[pivot]) i++;
		while(ar[j]>ar[pivot]) --j;
		swap(ar,i,j);
		}
	swap(ar,pivot,j);
	return j;
}


private static void quickSort(int ar[],int low,int high){

	if(low<high){
		int j = partition(ar,low,high);
		quickSort(ar,low,j);
		quickSort(ar,j+1,high);
}


private static swap(int ar[],int first, int second){

	int temp = ar[first];
	ar[first]=ar[second];
	ar[second]=temp;
}



public static void main(String args[]){


	int ar[]={10,16,8,12,15,6,3,9,5};
	quickSort(ar,0,ar.length-1);
	Arrays.Stream(ar).forEach(System.out::println);
}