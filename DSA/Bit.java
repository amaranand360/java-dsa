
public class Bit {

    public static void main(String args[]) {
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        System.out.println(bitMask);

        // get bit value
        // if((bitMask & n) == 0) {
        // System. out.println("bit was zero");
        // }
        // else {
        // System. out. println("bit was one");
        // }

        // set to 1 that bit
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // set to 0 that bit clear
        int notBitMarks = ~(bitMask);
        int newNumber = notBitMarks & n;
        System.out.println(newNumber);
    }

}
