package gitDemo1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 ar  = new Test1();
		Integer[] array1 = {105 ,90 ,1, 1, 0, 90, 37, 1, 37, 37, 42};
	 
		ar.freqOfElements(array1);

	}
	public void freqOfElements(Integer[] array1) {
		
		for(int i=0; i<array1.length; i++) {
			int count = 1;
			for(int j=i+1; j<array1.length; j++) {
				if(array1[i] == array1[j]) {
					count++;
					array1[j]= -1;
					
				}
				
			}
			if(array1[i]!=-1) {
			System.out.println("Frequency of "+array1[i]+" is now "+count);
		}}
		
	}

}
