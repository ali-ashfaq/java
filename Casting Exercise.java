package hit.day5;
public class CastingDemo {
	public static void main(String[] args) {
		byte b=10;
		short s=b;
		int i=s;
		long l=i;
		long ll=222;//64 bit
		System.out.println("long value..:"+ll);
		int ii=(int)ll;//32 bit
		System.out.println("int value...:"+ii);
		short ss=(short)ii;//16 bit
		System.out.println("short value...:"+ss);
		byte bb=(byte)ss;//8 bit
		System.out.println("byte value....:"+bb);
		
		double d=235.45;
		System.out.println("double value..:"+d);
		float f=(float)d;
		System.out.println("float value..:"+f);
		
		int myint=(int)f;
		System.out.println(myint);
		
		int myascii=169;
		char mychar=(char)myascii;
		System.out.println((char)169);
		System.out.println(mychar);
		
		int mmm=0;
		System.out.println(mmm);
	}
}
