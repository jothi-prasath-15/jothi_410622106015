package jothi;

public class PrimitiveTypesExample {
    public static void main(String[] args) {
        // Declaration and initialization of primitive types
        int intValue = 10;
        long longValue = 1000L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159;
        char charValue = 'A';
        boolean booleanValue = true;
        byte byteValue = 100;
        short shortValue = 1000;

        longValue = intValue;
        doubleValue = floatValue;
        doubleValue = intValue; 

        
        intValue = (int) longValue;
        floatValue = (float) doubleValue;
        charValue = (char) intValue;
        byteValue = (byte) shortValue;
        shortValue = (short) intValue;

        // Printing the values
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
    }
}
