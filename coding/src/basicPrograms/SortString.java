package basicPrograms;

public class SortString {
    public static void main(String[] args) {
        String a = "praveen";
        char[] chA = a.toCharArray();
        for (int i = 0; i < chA.length; i++) {
            for (int j = 0; j < chA.length; j++) {
                if (chA[i] < chA[j]) {
                    char temp = chA[i];
                    chA[i] = chA[j];
                    chA[j] = temp;
                }
            }
        }
        System.out.println(chA);
    }
}
