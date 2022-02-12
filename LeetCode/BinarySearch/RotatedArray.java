package binarySearch;

public class RotatedArray {
	
	// Goal Find the smallest elem in the shifted Array
	
	// first we need to find how many index is being shifted 
	
	public static void main(String[]args) {
		
		int[] arr = new int[7];
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 5;
		arr[3] = 6;
		arr[4] = 0;
		arr[5] = 1;
		arr[6] = 2;
		
		
		int res = FindSmallest(arr);
		System.out.print(res);

		
	}
	
	public static int FindSmallest(int[] arr) {
		
		int ans = -1;
		int left = 0;
		int right = arr.length - 1;
		
		// array before shifted [0,1,2,3,4,5,6]
		// rotated array [4,5,6,0,1,2,3]
		
		
		
		// left = 0;
		
		// right = 6;
		// mid = 3;
		// 0 < 3
		// right = 3
		// 
		
		
		

		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			
			// compare the middle elem with the last elem
			// because in a sorted array this should never be 
			//true
			if(arr[mid] > arr[right]) {
				
				
				left = mid + 1;
				
			}
			else {
				ans = mid;
				right = mid - 1;
			}
			
		}
		
		
		
		return ans;
		
	}
	
	

}
