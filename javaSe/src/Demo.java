import java.util.Arrays;

/**
 * @ClassName Demo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/26/14:43
 */
public class Demo {
    public static void main1(String[] args) {
//        String str1 = "kkk";
//        String str2 = "k2kk";
//        System.out.println(str1 == str2);
//        System.out.println(
//                'a'-0
//        );
//        System.out.println(str1.compareTo(str2));
//        str1.compareToIgnoreCase(str2);


        String[] filenames = {"板书.png", "记事本.txt", "ban.jpg"};
        for (int i = 0; i < filenames.length; i++) {
            if (filenames[i].endsWith(".png") || filenames[i].endsWith(".jpg")) {
                System.out.println(filenames[i].substring(0, filenames[i].length() - 4));
            }
        }


    }

    public static void main2(String[] args) {
        String[] names = {"孙四五", "李明", "孙五"};
        for (String name : names) {
            if (name.startsWith("孙") && name.length() == 2) {
                System.out.println(name);
            }
        }

    }

    public static void main3(String[] args) {
        String s = "https://docs.oracle.com/javase/8/docs/api/java/lang/String.html";

        String[] strings = s.split("api");
        String[] strings1 = strings[strings.length - 1].split("/");
        String[] str = strings1[strings1.length-1].split("\\.");
        System.out.println(str[0]);
        String string = "";
        for (int i = 1; i <= strings1.length-2 ; i++) {
            string += strings1[i] +".";
        }
        System.out.println(string+str[0]);
    }

    public static void main5(String[] args) {
        String s = "package com.peixinchen.javase.learn_string;\n" +
                "\n" +
                "import java.util.Arrays;\n" +
                "import java.util.Scanner;\n" +
                "\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String[] args) {\n" +
                "        long[] array = new long[5];\n" +
                "        Scanner s = new Scanner(System.in);\n" +
                "        for (int i = 0; i < 5; i++) {\n" +
                "            array[i] = s.nextLong();\n" +
                "        }\n" +
                "        System.out.println(Arrays.toString(array));\n" +
                "    }\n" +
                "}";
        String[] strings = s.split("\n");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].trim().startsWith("public class")) {
                if (strings[i].trim().startsWith("package")) {
                    System.out.println(strings[i].substring(8,strings[i].length()-1));
                    continue;
                }
                if (strings[i].trim().startsWith("import")) {
                    System.out.println(strings[i].substring(7,strings[i].length()-2));
                }
            }else {
                System.out.println(strings[i].substring(12,strings[i].length()-1).trim());
            }
        }




    }
    static  String s ;
    public static void main(String[] args) {

        System.out.println(s);
    }
}
