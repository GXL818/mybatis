package com.gui.controller;

import java.io.*;
import java.util.*;

public class VoteController2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Boolean exitFlag = false;//退出的标记
        System.out.println("1.添加备选人 2.查看投票情况 3.投票 4.退出");
        while (true) {
            System.out.print("请选择操作指令：");
            char flag = sc.next().charAt(0); //输入 1 2 3 4 的标记
            switch (flag) {
                case '1':
                    addCandidate();
                    break;
                case '2':
                    viewVote();
                    break;
                case '3':
                    Vote();
                    break;
                case '4':
                    exitFlag = true;
                    break;
                default:
                    System.out.println("输入错误，请输入正确的操作指令");
            }
            if (exitFlag) {
                System.out.println("您已退出系统，谢谢使用");
                break;
            }
        }
    }
    private static void Vote() throws Exception {
        Map<String, String> map = getVote();
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
        map.put(name,String.valueOf(Integer.parseInt(map.get(name))+1));
        System.out.println("投票后的票数为："+map.get(name));
        FileWriter fw = new FileWriter("e:\\vote.txt",false);
        StringBuffer str = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str.append(entry.getKey()+":"+entry.getValue()+"\r\n");
        }
        fw.write(str.toString());
        fw.close();
    }

    private static void viewVote() throws  Exception {
        Map<String, String> map = getVote();
        if (map.size() == 0) {
            System.out.println("暂无投票信息");
        }
        else {
            for (Map.Entry<String, String> map1 : map.entrySet()) {
                System.out.println(map1.getKey() + ":" + map1.getValue());
            }
        }
    }

    private static void addCandidate() throws Exception {
        Map<String, String> map = getVote();
            String name = "";
            int startVote = 0;
            boolean flag = false;
            int index = 0;
        do{
            System.out.println("请输入需要被投票的人的姓名：");
            name = sc.next();
            for (String s : map.keySet()) {
                if(s.equals(name)){
                    System.out.println("该人已经在备选人中，请重新输入");
                    flag = true;
                    break;}
                index++;
            }
            System.out.println(index+":"+map.size());
            if(index == map.size() ){
                flag = false;
            }
            index = 0;
        }while (flag);
        System.out.println("请输入"+name+"的起始投票数：");
        startVote = sc.nextInt();
        FileWriter fw = new FileWriter("e:\\vote.txt",true);
        StringBuffer str = new StringBuffer();
        str.append(name+":"+startVote+"\n");
        fw.write(str.toString());
        fw.flush(); // 如果不flush的话 在缓冲区的数据会拿不到
        fw.close();
    }

    public static Map<String, String> getVote() throws  Exception {
        Map<String, String> map = new HashMap<String, String>();
        File file = new File("e:\\vote.txt");
        if(!file.exists()) {
        file.createNewFile();
        }
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String tempString = null;
        // 一次读入一行，直到读入null为文件结束
        while ((tempString = reader.readLine()) != null) {
            String[] strArray = tempString.split(":");
        map.put(strArray[0], strArray[1]);
    }
    return map;
    }
}
