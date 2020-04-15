package Gen;

public class AscendingOrder {
	
	public static void main(String[] args) {
		String[] arr={"BE","BTECH","MBA","MCOM","MPHIL"};
		
		boolean flag= true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i].compareTo(arr[i-1])<0) {
				//System.out.println(arr[i].compareTo(arr[i-1]));
				flag=false;
			} 
		}
		System.out.println(flag);

	}

}
