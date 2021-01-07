package Products;

import java.util.Scanner;

public class StockDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag1 = true;
        boolean flag2 = true;
        StockManager stockManager = new StockManager();
        while (flag2) {
            if (flag1) {
                System.out.println("欢迎使用库存管理系统");
                System.out.println("请继续操作");
                flag1 = false;
            }
            System.out.println("1 : 添加货物");
            System.out.println("2 : 查询货物");
            System.out.println("3 : 查询库存");
            System.out.println("4 : 增加库存");
            System.out.println("5 : 查询低库存货物");
            System.out.println("6 : 显示所有货物");
            System.out.println("7 : 退出登录");
            System.out.println("其余键 : 关闭系统");
            switch (in.nextInt()) {
                case 1 :
                    System.out.println("请依次输入产品的ID 、 库存和名称");
                    stockManager.addProduct(new Product(in.nextInt(), in.nextInt(), in.next()));
                    break;
                case 2 :
                    System.out.println("请选择通过ID还是名称查询");
                    System.out.println("1 : ID查询");
                    System.out.println("2 : 名称查询");
                    Product s;
                    int n;
                    switch (in.nextInt()) {
                        case 1 :
                            System.out.println("请输入要查找产品ID");
                            while (true) {
                                s = stockManager.findProduct(in.nextInt());
                                if (s == null) {
                                    System.out.println("ID错误 ，请输入正确ID:");
                                }else {
                                    s.toStringAll();
                                    break;
                                }
                            }
                            break;
                        case 2 :
                            System.out.println("请输入要查找产品名称");
                            while (true) {
                                s = stockManager.findProductByName(in.next());
                                if (s == null) {
                                    System.out.println("名称错误 ，请输入正确名称:");
                                }else {
                                    s.toStringAll();
                                    break;
                                }

                            }
                            break;
                    }
                    break;
                case 3 :
                    System.out.println("请输入要查找库存的产品ID");
                    int c = stockManager.numberInStock(in.nextInt());
                    if (c < 0) {
                        System.out.println("仓库中无该产品。");
                    }else System.out.println("当前库存为： " + c);
                    break;
                case 4 :
                    System.out.println("请输入要增加库存的产品ID及要增加的库存量");
                    stockManager.delivery(in.nextInt(), in.nextInt());
                    break;
                case 5 :
                    System.out.println("请输入危险库存线");
                    stockManager.printLowStockProducts(in.nextInt());
                    break;
                case 6 :
                    stockManager.printProductDetails();
                    break;
                case 7 :
                    flag1 = true;
                    System.out.println("====================");
                    break;
                default :
                    flag1 = flag2 = false;
            }
        }
    }
}
