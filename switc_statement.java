package lecture7;

public class switc_statement {
    public static void main(String[] args) {
        int i = 3;

        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater than 3");
                break;
        }// switch has limited use case-------> switch(expression) ---> byte , short, int
         // , char , enumeration
    }
}
// no duplicates cases allowed
// jdk7 -- strings can be used as switch (expression)
// after jdk7 more enhanced
// after jdk17 switch is too much