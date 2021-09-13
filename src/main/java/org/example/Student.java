package org.example;

import java.util.Objects;

public final class Student {
    private final int age;
    private final Group group;
    private final String name;

    public Student(int age, Group group, String name) {
        Objects.requireNonNull(group);
        this.age = age;
        Group cloneGroup = new Group();
        cloneGroup.setGroupName(group.getGroupName());
        this.group = cloneGroup;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Group getGroup() {
        Group cloneGroup = new Group();
        cloneGroup.setGroupName(this.group.getGroupName());
        return cloneGroup;
    }

    public String getName() {
        return name;
    }

    public Student setAge(int age) {
        return new Student(age, this.group, this.name);
    }

    public Student setGroup(Group group) {
        return new Student(this.age, group, this.name);
    }

    public Student setName(String name) {
        return new Student(this.age, this.group, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(group, student.group) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, group, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", group=" + group +
                ", name='" + name + '\'' +
                '}';
    }
}
