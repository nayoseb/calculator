import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        // TODO...
        double one;
        double two;

        String sign = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("값1 : ");
        one = scan.nextInt();

        System.out.print("부호 : ");
        sign =scan.next();

        System.out.print("값2 : ");
        two = scan.nextInt();



        if (sign.equals("+")){
            System.out.println(one+"+"+two+"="+add(one,two));
        }
        else if (sign.equals("-")){
            System.out.println(one+"-"+two+"="+sub(one, two));
        }
        else if (sign.equals("*")){
            System.out.println(one+"*"+two+"="+multi(one, two));
        }
        else if (sign.equals("/")){
            System.out.println(one+"+"+two+"="+div(one, two));
        }
        else {
            System.out.println("입력값 오류");
        }


    }



    public static double add(double a, double b) {
        //Todo
        return 0;
    }

    public static double sub(double a, double b) {
        //Todo
        return 0;
    }

    public static double div(double a, double b) {
        //Todo
        return 0;
    }

    public static double multi(double a, double b) {
        return a * b;
    }
}
