import java.util.Arrays;

//Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{3,7,4,6,1,2,9,5,6,7,8,8,5};
		
		//O(n^2) time
	/*	for(int i = 0; i< a.length; i++){
			for(int j = 1; j< a.length; j++){
				if(a[i] + a[j] == 10){
					System.out.println(a[i] +" + " + a[j] + "= " +(a[i]+a[j]));
				}
			}
		} 
    */
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int i = 0;
		int j = a.length -1;
		while(i < j){
			
			if(a[i] + a[j] == 10){
				System.out.println(a[i] +" + " + a[j] + "= " +(a[i]+a[j]));
			    i++;
			}
			else if(a[i] + a[j] < 10)
				i++;
			else if(a[i]+a[j] > 10){
				j--;
			}
			
		}
	}

}
