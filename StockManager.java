package Products;

import java.util.ArrayList;

public class StockManager {
    private ArrayList<Product> arrayList = new ArrayList<>();
    public void printProductDetails() {
        for(Product s : arrayList) {
            s.toStringAll();
            System.out.println("====================");
        }
    }
    public Product findProduct(int number) {
        boolean flag = false;
        int index = 0;
        for (Product s : arrayList) {
            if (s.getNumber() == number) {
                flag = true;
                break;
            } else index++;
        }
        if (flag) {
            return arrayList.get(index);
        } else {
            return null;
        }
    }
    public int numberInStock(int number) {
        Product product;
        product = findProduct(number);
        if(product == null) {
            return -1;
        } else return product.getStock();
    }
    public void delivery(int number, int count) {
        Product product;
        product = findProduct(number);
        if(product == null) {
            System.out.println("ID错误 ， 仓库中无该产品！");
        }else product.increaseQuantity(count);
    }
    public void printLowStockProducts(int count) {
        for (Product s : arrayList) {
            if (s.getStock() < count) {
                s.toStringAll();
                System.out.println("====================");
            }
        }
    }
    public void addProduct(Product s) {
        if(findProduct(s.getNumber()) == null) {
            arrayList.add(s);
        }else System.out.println("该产品已在仓库中。");
    }
    public Product findProductByName(String name) {
        int index = 0;
        boolean flag = false;
        for (Product s : arrayList) {
                if (s.getName().equals(name)) {
                    flag = true;
                    break;
                }else {
                    index++;
                }
        }
        if (flag) {
            return arrayList.get(index);
        }else {
            return null;
        }
    }

}
