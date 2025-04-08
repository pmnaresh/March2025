package com.practice.logical;

 public class JavaStringsQuiz {
    public static void main(String[] args) {
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";
        String str4 = "Java";

        System.out.println(str1 == str2); //false
        System.out.println(str3 == str4); //true
        System.out.println(str1 == str3);// false
        
        
        
//        Why is String immutable in Java?
// String immutability ensures security, thread-safety, caching, and performance.
//Used in class loading, network connections, and as keys in maps — mutation could break logic.
//It enables String Pooling — avoiding duplicate objects.

//        		 Q2: Can you give examples of other immutable classes in Java?
//        		Wrapper classes: Integer, Float, Double, Byte, Short, Long, Boolean, Character
//        		Big classes: BigInteger, BigDecimal
//        		Others: java.time package classes like LocalDate, LocalTime, LocalDateTime, ZonedDateTime

//        		 Q3: Can we create our own immutable class? What are the rules?
//        		Yes. To create a custom immutable class:
//        		Make the class final.
//        		Make all fields private final.
//        		Don't provide setters.
//        		Initialize fields only in the constructor.
//        		Avoid exposing mutable objects directly (return copies).


    }
}

