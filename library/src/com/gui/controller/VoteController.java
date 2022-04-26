package com.gui.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class VoteController {
    private static Map<String,Integer> map = new HashMap<>();
    private static   Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       Boolean exitFlag = false;//退出的标记
        System.out.println("1.添加备选人 2.查看投票情况 3.投票 4.退出");
        while (true) {
            System.out.print("请选择操作指令：");
            char flag  = sc.next().charAt(0); //输入 1 2 3 4 的标记
            switch (flag) {
                case '1':addCandidate(); break;
                case '2':viewVote(); break;
                case '3':Vote(); break;
                case '4':exitSys(); exitFlag = true; break;
                default:
                    System.out.println("输入错误，请输入正确的操作指令");
            }
            if (exitFlag) {
                System.out.println("您已退出系统，谢谢使用");
                break;
            }
        }
    }
    private static void exitSys() throws IOException {
        FileWriter fw = new FileWriter("e:\\vote.txt",true);
        StringBuffer str = new StringBuffer();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            str.append(entry.getKey()+":"+entry.getValue()+"\r\n");
        }
        fw.write(str.toString());
        fw.close();
    }

    private static void Vote() {
        System.out.println("请输入要投票的人的姓名：");
        boolean flag = false;
        String name = "";
       do{
           name  = sc.next();
           if(!map.containsKey(name)){ // 判断是否存在该备选人
               System.out.println("没有此投票人，请重新输入");
               flag = true;
           }else {
               flag = false;
           }
       }while (flag);
        map.put(name,map.get(name)+1);
        System.out.println("投票后的票数为："+map.get(name));
    }

    private static void viewVote() {
        if(map.size() == 0){
            System.out.println("暂无投票人");
        }else {

            System.out.println("投票情况如下：");
           for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }

    private static void addCandidate() {
        String name = "";
        int  startVote = 0;
        boolean flag = false;
        int index = 0;
        do{
            System.out.println("请输入需要被投票的人的姓名：");
            name = sc.next();
        for (String s : map.keySet()) {
            if(s.equals(name)){
                System.out.println("该人已经在备选人中，请重新输入");
                flag = true;
                break;
             }
            index++;
          }
            System.out.println(index);
        if(index == map.size() ){
            flag = false;
        }
        }
        while (flag);
        System.out.println("请输入"+name+"的起始投票数：");
        startVote = sc.nextInt();
        map.put(name,startVote);
    }
}
