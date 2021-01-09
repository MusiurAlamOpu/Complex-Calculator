
package BasicMood;

//import java.lang.Math;


public class BasicOperation {
    
    
    public static double BasicOperations(double number1, double number2, String operator){
        switch(operator){
                case "+": 
                    return number1 + number2;
                case "-": 
                    return number1 - number2;
                case "*":     
                    return number1 * number2;
                case "Percentage": 
                    return (number1*number2)/100;
                case "/":
                    if(number2 == 0){
                        return 0;
                    }
                    return number1 / number2;    
                
        }
        System.out.println("Unknown operator  " + operator);
        return 0;
    }
}
