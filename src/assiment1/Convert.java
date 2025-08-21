package assiment1;
/*a. byte to short
b. short to char
c. char to int
d. int to long
e. long to float
f. float to double*/

public class Convert {
       public static void main(String[] args) {
    	
    	   //byte to short
    	   
    	   byte a = 54;
    	   short shortFormByte = a;
    	   System.out.println(shortFormByte);
    	   
    	   //short to char
    	   short b = 5455;
    	   char charFormShort = (char)b;
    	   System.out.println(shortFormByte);
    	   
    	   //char to int
    	   char v = 'e';
    	   int intFormchar = v;
    	   System.out.println(intFormchar);
    	   
    	   //int to long
    	   int y = 595;
    	   long longFormint = y;
    	   System.out.println(longFormint);
    	   
    	   //long to float
    	   long z = 595482554l;
    	   float floatFormLong = z;
    	   System.out.println(floatFormLong);
    	   
    	   //float to double
    	   float g = 54.25f;
    	   double doubleFormfloat = g;
    	   System.out.println(doubleFormfloat);
       }
}
