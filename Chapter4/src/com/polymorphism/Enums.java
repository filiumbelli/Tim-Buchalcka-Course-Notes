package com.polymorphism;

public class Enums {
    public static void main(String[] args) {
        Fruits[] fruits = Fruits.values();
        for (Fruits f : fruits) {
            System.out.println("Fruit: " + f.name());
            System.out.println("Code: " + f.getFruit());
        }
        System.out.println(People.Serdar.getNumber());
        // Enum can be generated as key values
        //
        People[] people = People.values();
        for (People person : people) {
            System.out.println(person.name());
            System.out.println(person.ordinal());
        }
        Books[] books = Books.values();

        for(Books book : books){
            // send the enum value
            System.out.println(book.getAuthors());
            // send the  enum name
            System.out.println(book.name());
            // send the enum position
            System.out.println(book.ordinal());
        }
    }

    enum Fruits {
        Banana("b"), Apple("a");
        private String action;

        private String getFruit() {
            return this.action;
        }

        Fruits(String action) {
            this.action = action;
        }
    }

    enum People {
        Zeynep(3), Serhat(2), Serdar(1);
        private int num;
        private String age;

        People(int num) {
            this.num = num;
        }

        public int getNumber() {
            return this.num;
        }

    }
    enum Books{
        Cow("jl"),wf("jl"),mec("cdb");
        private String author;

        public String getAuthors(){
            return this.author;
        }
        Books(String author){
            this.author = author;
        }
    }
}
