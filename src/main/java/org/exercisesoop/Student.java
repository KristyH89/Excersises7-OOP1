package org.exercisesoop;

public class Student {

    // Private fields
    private int studentId;
    private String name;
    private int age;
    private String major;

    // Constructor
    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;

        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
        if (major == null || major.isEmpty()) {
            throw new IllegalArgumentException("Major cannot be empty");
        }
        this.major = major;
    }

    // Getters
    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getMajor(){
        return major;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age = age;
    }

    public void setMajor(String major) {
        if (major == null || major.isEmpty()) {
            throw new IllegalArgumentException("Major cannot be empty");
        }
        this.major = major;
    }
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age + ", Major: " + major;
    }

}

/*
+---------------------------+
|         Student           |
+---------------------------+
| - studentId: int          |
| - name: String            |
| - age: int                |
| - major: String           |
+---------------------------+
| + Student(id, name, age, major) |
| + getStudentId(): int     |
| + getName(): String       |
| + getAge(): int           |
| + getMajor(): String      |
| + setName(name): void     |
| + setAge(age): void       |
| + setMajor(major): void   |
| + toString(): String      |
+---------------------------+
 */