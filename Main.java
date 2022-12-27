package Practice;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        checking_the_amount(2, 18);
        checking_sign(0);
        checking_sign_2(-10);
        copier("рандомный текст", 3);
        System.out.println(leapYearCheck(2100));
        replace();
        number_7();
        number_8();
    }

    private static void checking_the_amount(int number_1, int number_2) {
        int sum = number_1 + number_2;
        if(sum >= 10 && sum <= 20){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static void checking_sign(int digit){
        if(digit >= 0){
            System.out.println("число положительное");
        }else {
            System.out.println("число отрицательное");
        }
    }

    private static void checking_sign_2(int digit){
        if(digit >= 0){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }
    private static void copier(String text, int digit){
        for (int i = digit; i > 0; i--) {
            System.out.println(text);
        }
    }

    public static boolean leapYearCheck(int year){
        if((year % 4 == 0)&&(year % 100 != 0)){
            return true;
        } else if(year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }

    private static void replace() {
        System.out.print("[");
        int[] mas_1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mas_1.length; i++) {
            if (mas_1[i] == 1) {
                mas_1[i] = 0;
            } else {
                mas_1[i] = 1;
            }
        }
        for (int j = 0; j < mas_1.length; j++) {
            if (j != mas_1.length - 1) {
                System.out.print(mas_1[j] + ", ");
            } else {
                System.out.print(mas_1[j] + "]");
            }
        }
    }

    private static void number_7(){
        int[] mas =  new int[100];
        for (int i = 0; i < 100; i++) {
            mas[i] = i+1;
        }
        System.out.println();
        System.out.print(Arrays.toString(mas));
    }

    private static void number_8(){
        int[] mas =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6){
                mas[i] = mas[i] * 2;
            }
        }
        System.out.println();
        System.out.print(Arrays.toString(mas));
    }
}
