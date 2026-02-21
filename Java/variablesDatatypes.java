class variablesDatatypes{
    public static void main(String[] args) {
        // intgerTypes();
        textTypes();   
        // decimalTypes();
        
        // Boolean is to store boolean type of data size of boolean is 1 Byte
        boolean isActive=true;
        System.out.println("isActive:"+isActive);
    }

    public static void intgerTypes(){
          // Integers Types
        System.out.println("-------------------------Integer Datatypes------------------------");

        // Byte is used to store integer type of data the size of byte is 1 Byte Range is -128 to 127
        byte age=23;
        System.out.println("Age:"+age);
        System.out.println("Minimum value that byte can hold is: "+Byte.MIN_VALUE);
        System.out.println("Maximum value that byte can hold is: "+Byte.MAX_VALUE);
        

        // Short used to store integer type of data the size of short is 2 Byte Range is -32,768 to 32,767
        short year=2026;
        System.out.println("Year:"+year);
        System.out.println("Minimum value that short can hold is: "+Short.MIN_VALUE); //OR math.pow(2,-15)
        System.out.println("Minimum value that short can hold is: "+Short.MAX_VALUE);

        // int can handle 4byte of integer 
        int salary=200000;
        System.out.println("Salary:"+salary);
        System.out.println("Minimum value that integer can hold is: "+(int)(-Math.pow(2,31))); //OR math.pow(2,-32)
        System.out.println("Minimum value that integer can hold is: "+Integer.MAX_VALUE+" "+Integer.MIN_VALUE);

        // long can handle 8 byte of intger
        long lightSpeed=1_07_92_52_851;
        System.out.println("Light Speed:"+lightSpeed+" Km/h");
        System.out.println("Long Max Value:"+Long.MAX_VALUE);
        System.out.println("Long Min Value:"+Long.MIN_VALUE);

    }

    public static void textTypes(){
          // Integers Types
        System.out.println("-------------------------Text Storing Datatypes------------------------");

        // Charcter used to store one charcter the size of char is 2Byte stores UNICODE Charcters
        char charcter='$';
        System.out.println("Charcter:"+charcter);
        System.out.println("Size of Char is: "+Character.BYTES);
        

        // String stores the sequence of charcters String in java is immutable the size of string is 
        String  Name="Mahantesh";
        System.out.println("String Name:"+Name);

        // StringBuilder also stores sequence of charcters but stingBuilders are mutable and not thread safe
        StringBuilder str=new StringBuilder("String of StringBuilder");
        System.out.println("String is :"+str);


        // StringBuffer is same as stingBuilders but stringBUffer is thread safe
        StringBuffer str2=new StringBuffer("String of StringBUffer");
        System.out.println("String is:"+str2);
      

    }

    public static void decimalTypes(){

        // float used to store the floting point numbers the size of float is 4 Bytes
        float PI=3.142f; // Default it stores double data to store float you have to explicitly tell compiler by appending f
        System.out.println("Pi value is:"+PI);

        // double used to decimal data with more precision the size of double is 8 Bytes
        double piWithPrecision=(double)22/7;
        System.out.println("Pi vlaue with more precision is:"+piWithPrecision);
    }
}