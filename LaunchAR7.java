 //Program for finding largest and smallest element in an array
public class LaunchAR7 {

	public static int getLargest(int numbers[]) {
		// TODO Auto-generated method stub
       int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;
       
       
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				 largest =numbers[i];
				
			}
			if (numbers[i]<smallest) {
				smallest =numbers[i];
			}
		}
		System.out.println("smallest number is: "+smallest);
		return largest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int numbers[] = {2,3,4,9,8,10,1,7};
		int largest =getLargest(numbers);
		
		
		
		System.out.println("largest number is: "+largest);
		
		
		
	}
	

}
