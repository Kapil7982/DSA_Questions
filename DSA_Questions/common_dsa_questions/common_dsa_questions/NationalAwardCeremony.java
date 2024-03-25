package common_dsa_questions;

public class NationalAwardCeremony {

	public static void main(String[] args) {
		
		int[] arr = {2,0,2,1};
        
		nationalAwardCeremony(arr);
		for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
            System.out.println();
	}

	private static void nationalAwardCeremony(int[] arr) {
		
		int n = arr.length;
	    int left = 0;
        int right = n-1;
        int index = 0;
        
        while(index<=right){
            
            if(arr[index]==0)
            {
                swap(arr,index,left);
                left++;
                index++;
            }
            else if(arr[index]==1)
            {
                 index++;
            }
            else
            {
                swap(arr,index,right);
                right--;
            }
            
        }
	}

	private static void swap(int[] arr, int index, int left) {
		
		int temp = arr[left];
        arr[left] = arr[index];
        arr[index] = temp;
	}

}
