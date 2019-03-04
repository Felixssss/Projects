package com.gem.util;

import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            String op = input.next();
            switch (op) {
                case "1":
                    menu.allFruit();
                    break;
                case "2":
                    menu.addFruit();
                    break;
                case "3":
                    menu.findFruit();
                    break;
                case "4":
                    menu.upFruit();
                    break;
                case "5":
                    menu.deleteFruit();
                    break;
                case "6":
                    menu.sortPrice();
                    break;
                case "0":
                    flag = menu.logOut();
                    break;
                default:
                    System.out.println("输入有误！！！");
                    break;
            }
        }
        System.out.println("|| 感想使用水果管理系统 ||");
    }

}
