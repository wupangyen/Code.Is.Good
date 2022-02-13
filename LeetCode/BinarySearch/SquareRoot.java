package binarySearch;

public class SquareRoot {
	public static void main(String[]args) {
		int v = 36;
		
		int res = FindSquareRoot(v);
		System.out.print(res);
		
	}
	public static int FindSquareRoot(int val) {
		int ans = -1;
		
		int left = 0;
		int right = val;
		
		
		while(left <= right) {
			
			int mid = left + (right - left)/2;
			
			if(mid * mid <= val) {
				ans = mid;
				left = mid + 1;
			}else {
				right = mid - 1;
			}
			
		}
		
		return ans;
	}

}
