package com;

import java.io.*;
import java.net.Socket;

/**
 * Hello world!
 */
public class App implements InterfaceDemo{
    @Override
    public void SayInterfaceName() {
        System.out.println(interfaceName);
    }

    public static void main(String[] args) {
//        Person p1 = new Person("xiaoxin",5,"student");
//        Animal a1 = new Animal("xiaobai","dog");
//        a1.whoHaveAnimal(p1);
//
//        String s1 = "111";
//        String s2 = new String("111");
//        s1="222";
//        s2="222";
//        System.out.println(s1==s2);
//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for (; ; ) {
//            try {
//                c = (char) br.read();
//                if (c != 'q') {
//                    System.out.println(c);
//                } else {
//                    break;
//                }
//            } catch (Exception e) {
//                System.out.println(e.toString());
//            }
//        }
//
//        File f = new File("E:\\111");
//        System.out.println(f);
//        deleteFolder(f);
//        try {
//            int[] array = new int[2];
//            System.out.println(array[2]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown " + e);
//        }

        //模拟银行取钱
//        CheckingAccount ca = new CheckingAccount(101);
//        ca.deposit(500);
//        System.out.println("卡余额:" + ca.getBalance());
//        try {
//            ca.withdraw(200);
//            System.out.println("卡余额:" + ca.getBalance());
//            ca.withdraw(600);
//            System.out.println("卡余额:" + ca.getBalance());
//
//        } catch (InsufficientFundsException e){
//            System.out.println("您还差"+e.getAmount());
//            e.printStackTrace();
//        }
//
//        show(new Cat());
//        show(new Dog());
//        Animal cat = new Cat();
//        cat.sayName("咖啡猫");
//        Cat cat1 =new Cat();
//        System.out.println(cat1.WELCOME_STATEMENT_TAG);
//        List arrayList = new ArrayList();
//        arrayList.add("aaaa");
//        arrayList.add(100);
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            String item = arrayList.get(i).toString();
//            System.out.println("item = " + item);
//        }

////        序列化,想一个文件里面写数据
//        People p = new People("zhangsan", 20, 171, 65.5f);
//        try {
//            FileOutputStream fo = new FileOutputStream("E:\\项目\\fileout\\111.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fo);
//            out.writeObject(p);
//            out.close();
//            System.out.println("序列化成功");
//            fo.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        反序列化
//        try {
//            FileInputStream fi = new FileInputStream(new File("E:\\项目\\fileout\\111.txt"));
//            ObjectInputStream in = new ObjectInputStream(fi);
////            System.out.println(in.readObject());//com.People@5fd0d5ae
//            People p1 = (People) in.readObject();
//            //EOFException就是文件或串流已经到底了,你却还继续读它,就会包此例外
//            System.out.println(p1.getName());
//            in.close();
//            fi.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        客户端
        String serverName = "localhost";
        int port = 8888;
        try {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket socket = new Socket(serverName, port);
            System.out.println("远程主机地址：" + socket.getRemoteSocketAddress());
            //获取输出流
            OutputStream out = socket.getOutputStream();
            DataOutputStream dataOut = new DataOutputStream(out);
            dataOut.writeUTF("hello from "+socket.getRemoteSocketAddress());

//            获取输入流
            InputStream in = socket.getInputStream();
            DataInputStream dataIn=new DataInputStream(in);
            System.out.println("后去服务器返回数据："+dataIn.readUTF());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//

    public static void show(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            ((Cat) a).work();
        } else if (a instanceof Dog) {
            ((Dog) a).work();
        }
    }

//    public static void deleteFolder(File f) {
//        File[] files = f.listFiles();//获取所有文件和文件夹
//        if (files != null) {
//            for (int i = 0; i < files.length; i++) {
//                if (files[i].isDirectory()) {
//                    deleteFolder(files[i]);
//                } else {
//                    files[i].delete();
//                }
//            }
//        }
//        f.delete();
//    }
}
