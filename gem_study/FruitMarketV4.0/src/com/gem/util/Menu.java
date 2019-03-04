package com.gem.util;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.gem.dao.mapper.FruitMapper;
import com.gem.pojo.Fruit;
import org.apache.ibatis.session.SqlSession;

public class Menu {

    Scanner input = new Scanner(System.in);


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

    public void getAllFruit() throws IOException {
        print();
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);
        List<Fruit> fruit = mapper.getAllFruit();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1);
        }
    }


    public void addFruit() throws IOException {
        System.out.println("请输入水果名:");
        String fruitname = input.next();
        System.out.println("请输入水果价格:");
        double price = input.nextDouble();
        System.out.println("请输入水果库存量:");
        String amount = input.next();
        System.out.println("请输入水果备注信息:");
        String comment = input.next();
        Fruit fruit = new Fruit(0, fruitname, price, amount, comment);
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);
        boolean result = mapper.addFruit(fruit);
        session.commit();
        session.close();
        if (result) {
            System.out.println("录入成功！！！");
        } else {
            System.out.println("录入失败！！！");
        }
    }

    public void print() {
        System.out.println("||================================|$|");
        System.out.println("|| 水果\t 价格\t 库存\t 备注");
        System.out.println("||================================|$|");
    }

    public void findFruit() throws IOException {
        System.out.println("||================================|$|");
        System.out.println("||请输入要查询的水果名:");
        System.out.println("||================================|$|");
        String fruitname = input.next();
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);
        Fruit fruit = mapper.findFruitName(fruitname);
        if (fruit != null) {
            print();
            System.out.println(fruit);
        } else {
            System.out.println("没有此水果");
        }

    }

    public void upFruit() throws IOException {
        getAllFruit();
        System.out.println("||================================|$|");
        System.out.println("||请输入要修改的水果名:");
        System.out.println("||================================|$|");
        String fruitname = input.next();
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);
        Fruit fruit = mapper.findFruitName(fruitname);

        if (fruit == null) {
            System.out.println("查无此水果！！！");
        } else {
            System.out.println("请输入价格");
            double price = input.nextDouble();
            System.out.println("请输入库存量");
            String amount = input.next();
            System.out.println("请输入备注信息");
            String comment = input.next();

            Fruit newFruit = new Fruit(fruit.getId(), fruitname, price, amount, comment);
            boolean fruit1 = mapper.upFruit(newFruit);

            session.commit();
            session.close();
            if (fruit1) {
                System.out.println("修改成功！！！");
            } else {
                System.out.println("修改失败！！！");
            }
        }
    }

    public void deleteFruit() throws IOException {
        getAllFruit();
        System.out.println("||================================|$|");
        System.out.println("||请输入下架水果名:");
        System.out.println("||================================|$|");
        String fruitname = input.next();
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);

        int row = mapper.delFruit(fruitname);
        session.commit();
        session.close();
        if (row > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }

    }

    public void ascPrice() throws IOException {
        print();
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);
        List<Fruit> fruit = mapper.ascPrice();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1);
        }
    }

    public void descPrice() throws IOException {
        print();
        SqlSession session = MyBatisUtil.getSqlSession();
        FruitMapper mapper = session.getMapper(FruitMapper.class);
        List<Fruit> fruit = mapper.descPrice();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1);
        }
    }

    public void printPriceMenu () {
        System.out.println("||================================|$|");
        System.out.println("|| 1 ==> 价格升序排列");
        System.out.println("|| 2 ==> 价格降序排列 ");
        System.out.println("|| 0 ==> 主页菜单");
        System.out.println("||================================|$|");
        }

    public void sortPrice () throws IOException {
        printPriceMenu();
        boolean flag = true;
        while (flag) {
            int op = input.nextInt();
            if (op == 1) {
                ascPrice();
            } else if (op == 2) {
                descPrice();
            } else if (op == 0) {
                printMenu();
                break;
            } else {
                System.out.println("输入有误!!!");
            }
        }
    }
    public boolean logOut () {
        System.out.println("||================================|$|");
        System.out.println("|| 确认退出系统？ =====>>> [Y|N]");
        System.out.println("||================================|$|");
        String yn = input.next();
        if ("Y".equalsIgnoreCase(yn)) {
            return false;
        } else {
            printMenu();
            return true;
        }
    }
}
