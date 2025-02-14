package interviewqs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RGBSorter {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("G", "B", "R", "R", "G", "B");
        char[] charColors = {'G', 'B', 'R', 'G', 'B', 'R', 'G', 'R', 'B'};


        List<String> sortedColor = colors.stream().sorted(Comparator.comparingInt(c -> getOrder(c))).collect(Collectors.toList());
        System.out.println(sortedColor);

        sortColorsApproachTwo(charColors);
        System.out.println("Sorted colors: " + Arrays.toString(charColors));

    }


    private static int getOrder(String color) {
        switch (color) {
            case "R":
                return 0;
            case "G":
                return 1;
            case "B":
                return 2;
            default:
                return 3;
        }
    }

    private static void sortColorsApproachTwo(char[] charColors) {
        int left = 0, mid = 0, right = charColors.length - 1;

        while (mid <= right) {
            switch (charColors[mid]) {
                case 'R':
                    swap(charColors, left, mid);
                    left++;
                    mid++;
                    break;
                case 'G':
                    mid++; // Keep green in the middle
                    break;
                case 'B':
                    swap(charColors, mid, right);
                    right--;
                    break;
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


