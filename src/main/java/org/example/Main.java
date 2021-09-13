package org.example;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("MSKD 228");
        group.setGroupName("MSKD 229");

        Student student = new Student(22, group, "Serhiy");

        System.out.println("Name " + student.getName() + " Group " + student.getGroup().getGroupName() +
                " Age " + student.getAge());

        student.setAge(30);
        student.setGroup(new Group("Navuhodonosor"));
        student.setName("Pavel");

        System.out.println("Name " + student.getName() + " Group " + student.getGroup().getGroupName() +
                " Age " + student.getAge());

        group.setGroupName("Alaska");

        System.out.println("Name " + student.getName() + " Group " + student.getGroup().getGroupName() +
                " Age " + student.getAge());

        student.getGroup().setGroupName("Roses");

        System.out.println("Name " + student.getName() + " Group " + student.getGroup().getGroupName() +
                " Age " + student.getAge());

    }
}
