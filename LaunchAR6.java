//Linear Search

public class LaunchAR6 {
   
	public static int LinearSearch(int numbers[], int key) {
		 
		   for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]==key) {
				return i;
			}
		}
		   return-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int numbers[]= {2,4,8,10,12,14,16};
       int key=20;
    
       
      int index=LinearSearch(numbers, key);
    		   if (index==-1) {
				System.out.println("NOT FOUND");
			}
       else {
		System.out.println("key is at index: "+index);
	}
		
	}

}
                                                                                                                                                                     