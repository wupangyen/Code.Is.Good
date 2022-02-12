package binarySearch;

public class FindPeak {
  // given array increase and then decreases find maximum 
	
	public static void main(String[]args) {
		// 2,3,4,6,9,12,11,8,6,9,1
		// check if mid is greater than first elem 
		// 2,3,4,6,9,12,11,8,6,9,1
		// T T T T T T   F F F F F 
		
		// if mid > elem[mid + 1]
		int[] arr = new int[7];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 11;
		arr[5] = 10;
		arr[6] =7;
		
		int res = FindMax(arr);
		System.out.print(res);
		
	}
	
	
	
	public static int FindMax(int[] arr) {
		int ans = -1;
		
		
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left)/2;
			
			if( mid == 0 || arr[mid] > arr[mid - 1] ) {
				ans = mid;
				
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
				
			
			
		}
		
		return ans;
	}

}
