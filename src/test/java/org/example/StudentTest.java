package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    @DisplayName("Check student")
    void setGroup() {
        Group group = new Group("MMM");
        Student student = new Student(30, group, "Iakov");
        assertNotEquals(group, student.getGroup());
    }

    @Test
    void testSetGroup() {
        Group group = new Group("NaNaNa");
        Student student = new Student(35, group, "Matviy");
        assertNotEquals(student.setGroup(new Group("LaLaLa")), student.getGroup().getGroupName());
    }

    @Test
    void setAge() {
        Group group = new Group("DDD");
        Student student = new Student(28, group, "Jora");
        Assertions.assertAll(
                () -> assertNotEquals(student.setAge(25), student.getAge()),
                () -> assertNotEquals(student.setName("Zahar"), student.getName()),
                () -> assertNotEquals(student.setGroup(new Group("RATATA")), student.getGroup().getGroupName()));
    }
}