
//example of nested if

public class nestedif {
    public static void main(String[] args) {
        byte number1=10;
        byte number2=5;
        byte number3=18;
        if(number1>number2)
        {
            if(number1>number3) {
                System.out.println("number1 is greater than number2 and number3");
            }
            else
            {
                System.out.println("number3 is greater than number1 and number2");
            }
        }
        else if(number2>number1)
        {
            if(number2>number3) {
                System.out.println("number2 is greater than number1 and number3");
            }
            else
            {
                System.out.println("number3 is greater than number1 and number2");
            }
        }




    }
}
