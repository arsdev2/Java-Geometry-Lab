import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите выражение");
            String expression;
            Double lastResult =  null;
            while( (expression = reader.readLine()) != null) {
                try {
                    double a;
                    int count = 0;
                    if(expression.split(" ").length == 1){
                        throw new NumberFormatException();
                    }
                    if(expression.split(" ").length == 3) {
                        a = Double.parseDouble(expression.split(" ")[0]);
                    }else if(lastResult != null) {
                        a = lastResult;
                        count--;
                    }else{
                        System.out.println("Не было введено значения");
                            break;
                    }
                        double b = Double.parseDouble(expression.split(" ")[count+2]);
                        String operand = expression.split(" ")[count+1];
                        double result;
                        if (operand.equals("+")) {
                            result = a + b;
                        } else if (operand.equals("-")) {
                            result = a - b;
                        } else if (operand.equals("*")) {
                            result = a * b;
                        } else if (operand.equals("/")) {
                            result = a / b;
                        }else if(operand.equals("^")){
                            result = Math.pow(a, b);
                        } else {
                            throw new NumberFormatException();
                        }
                        System.out.println("Результат - " + result);
                        lastResult = result;
                    } catch (NumberFormatException e) {
                        System.out.println("Неправильно введенное выражение");
                    }
            }
        }catch (IOException e){
            System.out.println("Невохможно прочитать выражения");
        }

    }
}
