package assiment1;
/*a. short to byte 
b. char to short
c. int to char
d. long to int
e. float to long
f. double to float*/

public class datatypesintodatatypes {
	
	public static void main(String[] args) {
		//a. short to byte 
		
		short h = 85;
		byte byteFormShort = (byte)h;
		System.out.println(byteFormShort);
		
		//b. char to short
		char j ='k';
		short shortFormchar = (short)j;
		System.out.println(shortFormchar);
		
		//c. int to char
		int k = 52;
		char charFormchar = (char)k;
		System.out.println(charFormchar);
		
		//d. long to int
		long l = 9859561454l;
		int intFormLong = (int)l;
		System.out.println(intFormLong);
		
		//e. float to long
		float p = 2656.26F;
		float floatFormLong = (long) p;
		System.out.println(floatFormLong);
		
		//f. double to float
		double o = 26.265d;
		float floatFormdouble = (float) o;
		System.out.println(floatFormdouble);
	}
	

}
