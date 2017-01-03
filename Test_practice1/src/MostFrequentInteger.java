import java.util.HashMap;

//Find the most frequent integer in an array

public class MostFrequentInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{4,4,4,4,5,2,2,4,1,5,6};
		
		//Using just arrays and loops
		/*int count = 1;
		int tempCount = 0;
		int num = 0;
		for(int i =0; i< a.length-1; i++){
			num = a[i];
			
			for(int j = 1; j<a.length; j++){
				
				if(num == a[j]){
					count ++;
				}
				if(tempCount < count){
					tempCount = count;
				}
			}
			count = 0;
		}
		System.out.println("TempCount is " +tempCount);*/
		
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		int tempNum = 0;
		
		for(int i = 0; i<a.length; i++){
			
			tempNum = a[i];
			
			if(m.containsKey(tempNum)){
				m.put(tempNum, m.get(tempNum)+1);
				
			}
			else
				m.put(tempNum, 1);
			
		}
		
		System.out.println(m.toString());
	}

}
