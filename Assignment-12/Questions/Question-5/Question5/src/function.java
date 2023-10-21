


 interface Check<T> {
	 abstract boolean Compare(T x , T y);
}

public class function {

	static <T> int countIf(T [] arr, T key, Check <T> c)
	   {
		   int count=0;
		   for(int i=0;i<arr.length;i++)
		   {
			  if(c.Compare(arr[i], key))
				  count++;
		   }
		   return count;
	   }
		public static void main(String[] args) {
			
			
			Integer [] arr = {44,77,99,22,55,66};
			Integer key = 50;
			int cnt = countIf(arr,key,(x,y)->x>y);
			System.out.println("Count="+cnt);
		
			Double [] arr1 = {4.4,5.5,9.9,2.2,5.5,6.6,5.5};
			Double key1 = 5.5;
			
			cnt=countIf(arr1, key1, (a,b)->a.equals(b));
			System.out.println(cnt);		
			
			
		}

	
	
	
	
	
	
}








