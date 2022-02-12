package binarySearch;

public class LowerBound {
	
	public static void main(String[]args) {
		
		int[] arr = new int[8];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 7;
		arr[5] = 8;
		arr[6] = 9;
		arr[7] = 10;
		
		int target = 2;
		int res = FindLowerBound(arr,target);
		
		System.out.print(res);
		
		
		

	}
	
	// Goal find first value >= x 
	
	// [1,2,4,6,7,8,9,10]  x = 5
	
	// left = 0
	// right = 7
	// mid = 0 + 7/2
	// mid = 3
	public static int FindLowerBound(int[] arr, int target) {
		
		int left = 0;
		int right = arr.length - 1;
		int ans = -1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if( arr[mid] >= target) {
				ans = mid;
				right = mid - 1;
				
				
			}else {
				left = mid + 1;
			}
			
		}
		
		
		return ans;
	}


}
