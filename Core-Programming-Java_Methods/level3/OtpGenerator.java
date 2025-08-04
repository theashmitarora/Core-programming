public class OtpGenerator {

    public static int generateOtp() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areOtpsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOtp();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        boolean unique = areOtpsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes ✅" : "No ❌"));
    }
}
