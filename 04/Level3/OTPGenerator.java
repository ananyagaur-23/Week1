import java.util.*;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        boolean allUnique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + allUnique);
    }
}
