public class type2 {
    public static void main(String[] args){
        byte b=42;
        char c ='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result = (f*b)+(i/c)-(d*s);
        
        //f*b ---> float 
        //i/c --> int 
        //d*s -->double

        // float +int - double---> double 


        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println("Result: " + result);
        System.out.println((f*b)+ " + " +(i/c)+ " + "+(d*s));
    }
}