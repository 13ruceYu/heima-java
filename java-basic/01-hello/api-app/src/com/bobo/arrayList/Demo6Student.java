package com.bobo.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo6Student {
    public static void main(String[] args) {
        // target: 学生搜索
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("1", "whh", 12, "class1"));
        students.add(new Student("2", "lsd", 13, "class2"));
        students.add(new Student("3", "zks", 12, "class1"));
        students.add(new Student("4", "ldz", 11, "class2"));
        students.add(new Student("5", "lgs", 10, "class1"));

        System.out.println("id\t\tname\t\tage\t\tclassName");
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你想搜索的学生的 id：");
            String id = sc.next();
            Student s = getStudentById(students, id);
            if (s == null) {
                System.out.println("sorry, not found");
            } else {
                System.out.println("id\t\tname\t\tage\t\tclassName");
                System.out.println(s.getId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
            }
        }


    }

    public static Student getStudentById(ArrayList<Student> students, String id) {
        Student res = null;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getId().equals(id)) {
                res = s;
                break;
            }
        }

        return res;
    }
}
