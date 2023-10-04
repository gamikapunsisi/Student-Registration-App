package com.example.myapp;


public class ToDo {
    private int id;
    private int age;
    private String gender;
    private String title, description;
    private long started, finished;

    public ToDo(){

    }

    public ToDo(int id, String title, String description, int age, String gender) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.age = age;
        this.gender = gender;

    }

    public ToDo(String title, String description, long started, long finished) {
        this.title = title;
        this.description = description;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public int getAge() { return age ; }
   public void setAge(int age) {this.age = age; }

    public String getGender() { return gender;}
    public void setGender(String gender) { this.gender = gender;}

}