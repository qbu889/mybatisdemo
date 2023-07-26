package com.example.demo;

/**
 * Demo class
 *
 * @author nol
 * @date 2022/12/14
 */
public class test {
    public static void switchtest2() {
        Integer a = 500;
        Integer b = 600;
        double c = a / b;
        System.out.println(c);

        double a1 = 500;
        double b1 = 600;
        double c1 = a1 / b1;
        System.out.println(c1);

        a = 3;
        a += a *= a;
        System.out.println(a);
    }

    //switch
    public static void switchtest() {
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    public static void comparetest() {

        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

    }

    public static void equals() {

        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        Short a = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));

    }

    private static String subtractOne(String number) {
        // 将字符串转换为整数
        int num = Integer.parseInt(number);
        // 减一操作
        num--;
        // 格式化为两位数的字符串（补零）
        String result = String.format("%02d", num);
        return result;
    }


    public static void main(String[] args) {
//        int j;
//        for (j=13; j > -10; j--) {
//            String lastHour = DateExtUtils.getPreviousHourString();
//            while (Integer.parseInt(lastHour) < 0) {
//                lastHour = subtractOne(lastHour);
//                System.out.println(lastHour);
//            }
//        }


    }


    
}
