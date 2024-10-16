package searchalgorithms;

//printer file
//unused right now because I use Arrays.toString() casting in Program.java to print

public class Printer {
    // printer class
    public void int_array_printer(int[] sorted_array) {
        for (int i = 0; i < sorted_array.length; i++) {
            String myString = Integer.toString(sorted_array[i]);
            System.out.print(String.format("%s ", myString));
        }
    }
}