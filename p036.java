import java.util.Arrays;

/**
 * 
 * @author gouravrusiya
 *
 */
public class p036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b,bBinary;
		String str ="";
		int sum = 0;
		
		for(int i=1;i<=1000000;i++){
			b = isPalindrome(i);
			
			if(b){
				bBinary = findBinary(i);
				
				if(bBinary){
					//System.out.println(i);
					sum+=i;
				}
			}
		}
		
		System.out.println(sum);
	}
	
	public static boolean isPalindrome(int i){
		String str = "" + i;
		
		StringBuilder s = new StringBuilder(str);
		StringBuilder sRev = new StringBuilder(str);
		sRev.reverse();
		
		if(s.toString().equals(sRev.toString())){
			
			return true;
		}
		return false;
	}

	public static boolean findBinary(int i){
		
		String str = "";
		str = Integer.toBinaryString(i);
		
		//System.out.println(str);
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sRev = new StringBuilder(str);
		sRev.reverse();
		
		if(sb.toString().equals(sRev.toString())){
			
			return true;
		}
		
		return false;
	}
}
