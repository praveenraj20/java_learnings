package hackerRank;

public class LexicographicalSubstrings {
    public static void main(String[] args) {

        String str = "lieutenant";
        int num = 3;
        String smallest = str.substring(0, num);
        String largest = str.substring(0, num);
        for (int i = 0; i <= str.length() - num; i++) {
            String subStr = str.substring(i, i + num);
            if (subStr.compareTo(smallest) < 0) {
                smallest = subStr;
            }
            if (subStr.compareTo(largest) > 0) {
                largest = subStr;
            }
        }
        System.out.println("smallest Lexico String " + smallest);
        System.out.println("Largest Lexico String " + largest);
    }
}
