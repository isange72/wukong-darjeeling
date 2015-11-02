package javax.rtcbench;

import javax.darjeeling.Stopwatch;

public class RTCTestXXTEA {
	// private final static int NUMNUMBERS = 32;

	// public static native void test_xxtea_native();

	// public static void test_xxtea() {
	// 	int numbers[] = new int[NUMNUMBERS]; // Not including this in the timing since we can't do it in C
	// 	final int key[] = new int[] {0, 1, 2, 3};

	// 	// Fill the array
	// 	for (int i=0; i<NUMNUMBERS; i++)
	// 		numbers[i] = (NUMNUMBERS - 1 - i);

	// 	do_btea(numbers, key);

	// 	for (int i=0; i<NUMNUMBERS; i++) {
	// 		System.out.print(" " + numbers[i]);
	// 	}
	// 	System.out.println(" done.");
	// }
	
	// public static void do_btea(int[] v, final int[] key) {
	// 	Stopwatch.resetAndStart();

	// 	final int DELTA = 0x9e3779b9;
	// 	byte n = (byte)v.length; // Setting n to be 8 bit means we can't handle large arrays, but on a sensor node that should be fine)

	// 	int y, z, sum;
	// 	byte p, rounds, e; // Setting p to be 8 bit means we can't handle large arrays, but on a sensor node that should be fine)
	// 	if (n > 1) {          /* Coding Part */
	// 		rounds = (byte)(6 + 52/n);
	// 		sum = 0;
	// 		z = v[n-1];
	// 		do {
	// 			sum += DELTA;
	// 			e = (byte)((sum >>> 2) & 3);
	// 			for (p=0; p<n-1; p++) {
	// 				y = v[p+1]; 
	// 				z = v[p] += (((z>>>5^y<<2) + (y>>>3^z<<4)) ^ ((sum^y) + (key[(p&3)^e] ^ z)));
	// 			}
	// 			y = v[0];
	// 			z = v[n-1] += (((z>>>5^y<<2) + (y>>>3^z<<4)) ^ ((sum^y) + (key[(p&3)^e] ^ z)));
	// 		} while (--rounds != 0);
	// 	} else if (n < -1) {  /* Decoding Part */
	// 		n = (byte)-n;
	// 		rounds = (byte)(6 + 52/n);
	// 		sum = rounds*DELTA;
	// 		y = v[0];
	// 		do {
	// 			e = (byte)((sum >>> 2) & 3);
	// 			for (p=(byte)(n-1); p>0; p--) {
	// 				z = v[p-1];
	// 				y = v[p] -= (((z>>>5^y<<2) + (y>>>3^z<<4)) ^ ((sum^y) + (key[(p&3)^e] ^ z)));
	// 			}
	// 			z = v[n-1];
	// 			y = v[0] -= (((z>>>5^y<<2) + (y>>>3^z<<4)) ^ ((sum^y) + (key[(p&3)^e] ^ z)));
	// 			sum -= DELTA;
	// 		} while (--rounds != 0);
	// 	}
	// 	Stopwatch.measure();
	// }

// #include <stdint.h>
// #define DELTA 0x9e3779b9
// #define MX (((z>>>5^y<<2) + (y>>>3^z<<4)) ^ ((sum^y) + (key[(p&3)^e] ^ z)))

// void btea(uint32_t *v, int n, uint32_t const key[4]) {
// 	uint32_t y, z, sum;
// 	unsigned p, rounds, e;
// 	if (n > 1) {          /* Coding Part */
// 		rounds = 6 + 52/n;
// 		sum = 0;
// 		z = v[n-1];
// 		do {
// 			sum += DELTA;
// 			e = (sum >>> 2) & 3;
// 			for (p=0; p<n-1; p++) {
// 				y = v[p+1]; 
// 				z = v[p] += MX;
// 			}
// 			y = v[0];
// 			z = v[n-1] += MX;
// 		} while (--rounds);
// 	} else if (n < -1) {  /* Decoding Part */
// 		n = -n;
// 		rounds = 6 + 52/n;
// 		sum = rounds*DELTA;
// 		y = v[0];
// 		do {
// 			e = (sum >>> 2) & 3;
// 			for (p=n-1; p>0; p--) {
// 				z = v[p-1];
// 				y = v[p] -= MX;
// 			}
// 			z = v[n-1];
// 			y = v[0] -= MX;
// 			sum -= DELTA;
// 		} while (--rounds);
// 	}
// }
}


