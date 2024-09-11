package basicProgram;

public class BinaryAdd {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String a = "110";
        String b = "101";
//        String output = "0100";
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry != 0) {
            sb.append(carry);
            String result = sb.reverse().toString();
            System.out.println(result);
        }
    }


}

