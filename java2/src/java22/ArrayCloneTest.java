package java22;



public class ArrayCloneTest {
	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.println("복사된 arr2");
		for(int a:arr2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		
		arr2[3]=0;
		
		System.out.println("변경된 arr2");
		for(int a:arr2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		
	}
}
;