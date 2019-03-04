package com.perion.forum1.lombok;

public class LombokExample {


    public static void main(String[] args) {

        Person1 person1 = new Person1();
        person1.setFirstName("John");
        person1.setLastName("Smith");
        person1.setAge(1);
        System.out.println(person1);

        /* ***************************************** */

       Person2 person2 = new Person2("John", "Smith", 1);
        System.out.println(person2);

        /* ***************************************** */

        Person3 person3 = new Person3();
        person3.setFirstName("John");
        person3.setLastName("Smith");
        person3.setAge(1);
        System.out.println(person3);

        /* ***************************************** */

        Person4 person4 = new Person4("John", "Smith", 1);
        System.out.println(person4);

        /* ***************************************** */

        Person5 person5 = new Person5("John", "Smith", 1);
        System.out.println(person5);

        /* ***************************************** */

        Person6 person6 = new Person6();
        person6.setFirstName("John");
        person6.setLastName("Smith");
        person6.setAge(1);
        System.out.println(person6);

        /* ***************************************** */

        Person7 person7 = Person7.builder()
                .firstName("John")
                .lastName("Smith")
                .age(1)
                .build();
        System.out.println(person7);

    }
}
