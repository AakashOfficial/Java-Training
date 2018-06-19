
public class Literals {

	public static void main(String arg[]){ 
		int ab=87678; 
		String bin=Integer.toBinaryString(ab);
		String oct=Integer.toOctalString(ab); 
		String hx=Integer.toHexString(ab); 
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hx); 
		System.out.printf("\n%d %o %x",ab,ab,ab);
		//From Java 5 System.out.printf("\n%d %o %X",ab,ab,ab);
	//From Java 5 System.out.println(); System.out.println(Math.PI); }
	}

}
