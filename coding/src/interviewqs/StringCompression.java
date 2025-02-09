package interviewqs;

public class StringCompression {
    public static void main(String[] args) {
        try {
            String str = "AAABBCCAA";
            String compressed = compressString(str);
            System.out.println(compressed);
        } catch (Exception e) {
            System.err.println("An error :" + e.getMessage());
        }


    }

    private static String compressString(String str) throws Exception {
        if (str == null || str.isEmpty()) {
            throw new Exception("Input String cannot be Null");
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }

        }
        compressed.append(str.charAt(str.length() - 1)).append(count);
        return compressed.toString();
    }
}
