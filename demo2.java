public class demo2 {
    public static void main(String[] args){
        System.out.println("hello world");

        // integer--> byte , short , int , long
        byte b = 5;
        short s = 1000;
        int i = 100000;
        long l = 1000000000L;
        // long = 3412_324_23;  (will print as it is , just only for the readability purpose ) just dont add before and after e

        System.out.println("Integer values -->"+ b + "," + s + "," + i + "," +l);
        // real no.
        float f= 10.54f;//SINGLE PRECISION
        double d = 100.123456789; //DOUBLE PRECISION(STANDARD)

// SCIENTIFIC NOTATION
        double d1 = 6.022e23; // 6.022 * 10^23
        System.out.println("Scientific notation value -->"+ d1);

        System.out.println("Real values -->"+ f + "," + d + "," + d1);
        // character
        char c = 'A'; // 'a'  --> integer --> binary --> valuestore
        System.out.println("Character value -->"+ c);
        //boolean
        boolean bool = true;
        System.out.println("Boolean value -->"+ bool);
// binary (2), octal (8), decimal (10), hexadecimal (16)
        int bin = 0b1010; // binary
        int oct = 062; // octal
        int dec = 10; // decimal
        int hex = 0xA; // hexadecimal(0-15) (0-9, A,B,C,D,E,F   )
        System.out.println("Binary value -->"+ bin);
        System.out.println("Octal value -->"+ oct);
        System.out.println("Decimal value -->"+ dec);
        System.out.println("Hexadecimal value -->"+ hex);
    }
}
// for single line comment use 
/* for multi line commnet use 
line 2 
 line 3 
 line 4 
  */