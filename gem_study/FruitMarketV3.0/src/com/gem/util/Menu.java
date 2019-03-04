package com.gem.util;

import com.gem.dao.FruitDAO;
import com.gem.dao.impl.FruitDAOImpl;
import com.gem.pojo.Fruit;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private FruitDAO fruitDAO;
    Scanner input = new Scanner(System.in);
    public Menu(){
        fruitDAO = new FruitDAOImpl();
    }

    public void printMenu() {
        System.out.println("     <<<欢迎使用水果超市库存管理系统>>>");
        System.out.println("||================================|$|");
        System.out.println("|| 1.展示所有水果信息 ");
        System.out.println("|| 2.添加水果信息 ");
        System.out.println("|| 3.查询指定水果信息");
        System.out.println("|| 4.修改指定水果信息");
        System.out.println("|| 5.水果下架");
        System.out.println("|| 6.价格排序");
        System.out.println("|| 0.退出管理系统");
        System.out.println("||================================|$|");
        System.out.println("|| 请输入系统菜单序号：");
        System.out.println("||================================|$|");
    }

    public void allFruit() {
        print();
        List<Fruit> fruit = fruitDAO.getAllFruit();
        if(fruit != null) {
            for(Fruit f : fruit) {
                System.out.println(f);
            }
        }
    }

    public void addFruit() {
        System.out.println("请输入水果名:");
        String fruitname = input.next();
        System.out.println("请输入水果价格:");
        double price = input.nextDouble();
        System.out.println("请输入水果库存量:");
        String amount = input.next();
        System.out.println("请输入水果备注信息:");
        String comment = input.next();
        Fruit fruit = new Fruit(0, fruitname, price, amount, comment);
        boolean result = fruitDAO.addFruit(fruit);
        if(result) {
            System.out.println("录入成功！！！");
        }else {
            System.out.println("录入失败！！！");
        }
    }

    public void print() {
        System.out.println("||================================|$|");
        System.out.println("||水果\t价格\t 库存量\t备注");
        System.out.println("||================================|$|");
    }

    public void findFruit() {
        System.out.println("||================================|$|");
        System.out.println("||请输入要查询的水果名:");
        System.out.println("||================================|$|");

        String name = input.next();
        List<Fruit> fruit = fruitDAO.findFruitByName(name);
        if(fruit != null && fruit.size() > 0) {
            print();
            for (Fruit fruit2 : fruit) {
                System.out.println(fruit2);
                break;
            }
        }else {
            System.out.println("查无此水果,请重新输入！！！");
        }
    }

    public void upFruit() {
        allFruit();
        System.out.println("||================================|$|");
        System.out.println("||请输入要修改的水果名:");
        System.out.println("||================================|$|");
        String name = input.next();
        Fruit fruit = fruitDAO.findFruitName(name);
        if(fruit == null) {
            System.out.println("查无此水果！！！");
        }else {
            System.out.println("请输入价格");
            double price = input.nextDouble();
            System.out.println("请输入库存量");
            String amount = input.next();
            System.out.println("请输入备注信息");
            String comment = input.next();
            Fruit newFruit = new Fruit(fruit.getId(), name, price, amount, comment);
            boolean result = fruitDAO.upFruit(newFruit);
            if(result) {
                System.out.println("修改成功！！！");
            }else {
                System.out.println("修改失败！！！");
            }
        }
    }

    public void deleteFruit() {
        allFruit();
        System.out.println("||================================|$|");
        System.out.println("||请输入下架水果名:");
        System.out.println("||================================|$|");
        String name = input.next();
        Fruit fruit = fruitDAO.findFruitName(name);
        if(fruit == null) {
            System.out.println("查无此水果，请重新输入！！！");
        }else {
            boolean result = fruitDAO.delFruit(fruit);
            if(result) {
                System.out.println("下架成功！！！");
            }else {
                System.out.println("下架失败！！！");
            }
        }
    }

    public void ascPrice() {
        List<Fruit> fruit = fruitDAO.ascPrice();
        print();
        if(fruit != null && fruit.size() > 0) {
            for(Fruit fruit1 : fruit) {
                System.out.println(fruit1);
            }
        }
    }

    public void desPrice() {
        List<Fruit> fruit = fruitDAO.desPrice();
        print();
        if(fruit != null && fruit.size() > 0) {
            for(Fruit fruit1 : fruit) {
                System.out.println(fruit1);
            }
        }
    }

    public void printPriceMenu() {
        System.out.println("||================================|$|");
        System.out.println("|| 1 ==> 价格升序排列");
        System.out.println("|| 2 ==> 价格降序排列 ");
        System.out.println("|| 0 ==> 主页菜单");
        System.out.println("||================================|$|");
    }

    public void sortPrice() {
        printPriceMenu();
        boolean flag = true;
        while(flag) {
            int op = input.nextInt();
            if(op == 1) {
                ascPrice();
            }else if(op == 2){
                desPrice();
            }else if(op == 0){
                printMenu();
                break;
            }else {
                System.out.println("输入有误!!!");
            }
        }
    }

    public boolean logOut() {
        System.out.println("||================================|$|");
        System.out.println("|| 确认退出系统？ =====>>> [Y|N]");
        System.out.println("||================================|$|");
        String yn = input.next();
        if("Y".equalsIgnoreCase(yn)) {
            return false;
        }else {
            printMenu();
            return true;
        }
    }

}
