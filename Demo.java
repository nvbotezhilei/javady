package Average;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Average average1 = new Median();
        Average average2 = new ArithmeticAverage();
        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1 : 计算平均值");
            System.out.println("2 : 计算中位数");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("请输入需计算数据个数");
                    int s = in.nextInt();
                    for (int i = 0; i < s;i++) {
                        System.out.println("请输入数据");
                        average2.add(in.nextDouble());
                    }
                    if (average2.getArrayList().isEmpty()) {
                        System.out.println("容器为空，无法计算");
                    }else System.out.println("算术平均数为 : " + average2.compute());
                    average2.clear();
                    break;
                case 2:
                    System.out.println("请输入需计算数据个数");
                    int m = in.nextInt();
                    for (int i = 0; i < m;i++) {
                        System.out.println("请输入数据");
                        average1.add(in.nextDouble());
                    }
                    if (average1.getArrayList().isEmpty()) {
                        System.out.println("容器为空，无法计算");
                    }else System.out.println("中位数为 : " + average1.compute());
                    average1.clear();
                    break;
            }
        }
    }
}
