package typeCasting;

public class TypeCastingOFPrimitiveDataTypes {

	public static void main(String[] args) {

		// UpCasting - Automatic --> Smaller to Larger

		int intValue = 100;
		long longValue = intValue;
		System.out.println(longValue); // 100

		float floatValue = 22.5F; // F is a literal
		double doubleValue = floatValue; // float is smaller than double
		System.out.println(doubleValue); // 22.5

		// DownCasting - Manual --> Larger to Smaller

		long longValue1 = 9990;
		int intValue1 = (int) longValue1;
		System.out.println(intValue1); // 9990
		// Here we are converting larger value in to smaller value manually.
		// Then assigning to smaller value.

		double doubleValue1 = 125.55;
		float floatValue1 = (float) doubleValue1;
		System.out.println(floatValue1);

		// Integer to Decimal
		int i = 355;
		double d = i;
		System.out.println(d); // 355.0

		// Decimal to Integer
		// There is problem with DownCasting,
		// we can't convert the actual decimal value into integer value
		double d1 = 86.3;
		int i1 = (int) d1;
		System.out.println(i1); // 86 instead of 86.3
		// Here, 86 is printed instead of 86.3, Not printing actual value
		// 'Round Up' or 'Round Down' NOT applicable here, only trimming the decimal part.
		
		double d2 = 55.7;
		int i2 = (int) d2;
		System.out.println(i2);  // (Round Down) to 55, trimming the decimal part.

	}

}
