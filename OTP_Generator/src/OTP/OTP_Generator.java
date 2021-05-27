package OTP;
import java.util.*;

public class OTP_Generator {
 static char[] OTP(int len) {
	System.out.println("Generating OTP using random(): ");
	System.out.println("You OTP is: ");
	String numbers= "0123456789";
	Random rndm_method= new Random();
	char[] OTP= new char[len];
	for(int i=0; i<len; i++) {
		OTP[i]=numbers.charAt(rndm_method.nextInt(numbers.length()));
	}
	 
	 return OTP;
 }
 public static void main(String args[]) {
	 int length= 4;
	 System.out.println(OTP(length));
 }
}
