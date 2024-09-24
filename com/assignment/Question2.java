package com.assignment;

public class Question2 {
    public static void main(String[] args) {
        new Question2().conversion(new Question2().casting(65.0));
    }
    
    public byte casting(double DOUBLE){
        float FLOAT=(float)DOUBLE;
        long LONG=(long)FLOAT;
        int INT=(int)LONG;
        char CHAR=(char)INT;
        short SHORT=(short)CHAR;
        byte BYTE=(byte)SHORT;
        System.out.println("Type Casting");
        System.out.println("Double: "+DOUBLE);
        System.out.println("Float: "+FLOAT+"f");
        System.out.println("Long: "+LONG+"l");
        System.out.println("Int: "+INT);
        System.out.println("Char: "+CHAR);
        System.out.println("Short: "+SHORT);
        System.out.println("Byte: "+BYTE);
        
        return BYTE;
    }

    void conversion(byte BYTE){
        short SHORT=BYTE;
        char CHAR=(char)SHORT;
        int INT=CHAR;
        long LONG=INT;
        float FLOAT=LONG;
        double DOUBLE=FLOAT;
        System.out.println();
        System.out.println("Type Conversion");
        System.out.println("Byte: "+BYTE);
        System.out.println("Short: "+SHORT);
        System.out.println("Char: "+CHAR);
        System.out.println("Int: "+INT);
        System.out.println("Long: "+LONG+"l");
        System.out.println("Float: "+FLOAT+"f");
        System.out.println("Double: "+DOUBLE);
    }
}
