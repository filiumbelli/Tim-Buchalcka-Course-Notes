package com.book;

public class GenericMethods {
    public static void main(String[] args) {
        String[] strng = {"bliyebv","hakskdasd","kaksdaksd","kakakak","titi","z"};
        Pair pair = ArrayMax.minmax(strng);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        String middle = ArrayMax.<String>getMiddle("This","is","a fascinating","interestingo");
        System.out.println(middle);
        Integer middle2 = ArrayMax.<Integer>getMiddle(1251,125919,55,8383,669496);
        System.out.println(middle2);
        Integer[] arra = {1,5,2,6,9,88,2,5,2,-15};
        Pair values = ArrayMax.minMaxGeneric(arra);
        System.out.println(values.getFirst());
        System.out.println(values.getSecond());
    }
}
