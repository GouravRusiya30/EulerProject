/**
 * 
 * @author gouravrusiya
 *
 */
public class p030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int sum = 0;
		long count = 0L;
		
		for(int i=2;i<=999999;i++){
			
			int x = i;
			sum = 0;
			
			while(x!=0){
				int rem  = (x%10);
				int p = (int)Math.pow(rem,5);
				sum += p;
				
				x = (x/10);
			}
			
			if(sum==i)
				count += i;
		}
		System.out.println(count);
		long endTime = System.currentTimeMillis();
		//System.out.println("Time = "+(endTime-startTime)+" ms");
	}

}
