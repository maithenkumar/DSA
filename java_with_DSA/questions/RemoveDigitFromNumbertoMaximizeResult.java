package questions;

public class RemoveDigitFromNumbertoMaximizeResult {
    public static void main(String[] args) {
        System.out.println(removeDigit("1231", '1'));

    }

    public static String removeDigit(String number, char digit) {
        String ans = "";
        int time = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit && time == 0) {
                time += 1;

            } else {

                ans += number.charAt(i);
            }

        }
        return ans;

    }
}
