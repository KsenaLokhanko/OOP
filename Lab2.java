public class Lab2 {
    public static void main(String[] args) {
        System.out.println("C5 is " + 1117 % 5 + " so C5 is  C=A+B ");
        System.out.println("C7 is " + 1117 % 7 + " so C7 is long ");
        System.out.println("C11 is " + 1117 % 11 + " so task is знайти суму найбільших елементів в стовпцях матриці з парними номерами \nта найменших елементів в стовпцях матриці з непарними номерами");

        CalcClass calc = new CalcClass();
        calc.call_outA();
        calc.call_outB();
        calc.check_addition();
        calc.matrc();
        calc.additional();
    }
}
