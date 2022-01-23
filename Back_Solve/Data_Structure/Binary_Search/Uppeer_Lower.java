package Binary_Search;

/*
 * ���� Ž������ Ȱ��Ǵ� �Ǵٸ� ���
 * 
 * ���� Ž���� ������ ���ο��� Ư������ ��Ȯ�ϰ� ã�°��̸� 
 * Upper bound & Lower bound �� �ΰ����� ����� ����Ž������ ������ �� �˰����̴�.
 * �� �ΰ��� ����� �ߺ��� �ڷᰡ ���� �� ����� ������ ����̸� 
 * lower�� ��� ������ ���ο��� k���� ���ų� ū ���� ������ ����,
 * uppper�� k������ ū���� ������ ��ġ�� �������ش�
 * 
 */

public class Uppeer_Lower {
	
	// ���� �츮�� ���� �ƴ� ����Ž���� ����̴�
	static int BinarySearch(int [] arr, int k) {
		int start  = 0 ;
		int end = arr.length-1;
		int mid;
		
		while(start<=end) {
			mid = (start + end )/2;
			if(arr[mid]==k) {
				return arr[mid];
			}
			else if(k < arr[mid]) {
				end = mid-1;
			}
			else if(k>arr[mid]) {
				start = mid+1;
			}
			
		}
		return 0;
	}
	
	/*
	 * ������ lower bound
	 * �־��� ������ ũ�ų� ���� ���� ó������ ������ �κ��� ����
	 */
	static int LowerBound(int [] arr, int k) {
		int start = 0;
		int end = arr.length;
		while(start < end) {
			final int mid = start + (end-start)/2;
			if(k<=arr[mid]) {
				end = mid;
			}
			else {
				start = mid +1;
			}
		}
		return start;
	}
	
	/*
	 * upper bound 
	 * 
	 */
	
	static int UpperBound(int [] arr, int  k) {
		
		// ���۰��� ����
		int start =0 ;
		int end = arr.length;
		
		
		// �ݺ��� ����
		while(start < end) {
			final int mid  = start + (end- start)/2;
			
			// k�� �迭�� �߾�
			if(k >= arr[mid]) {
				start = mid +1;
			}
			else {
				end = mid;
			}
			
		}
		return start;
	}
	
}
