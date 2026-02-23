public class CmdArgs {
    public static void main(String[] args) {
        
        if(args.length>0){
            String Name=args[0];
            int age=Integer.parseInt(args[1]);
            char firstLetter=args[2].charAt(0);
            boolean isActive=Boolean.getBoolean(args[3]);
            float salary=Float.parseFloat(args[4]);

            System.out.println("Name:"+Name);
            System.out.println("Age:"+age);
            System.out.println("Names FirstLetter:"+firstLetter);
            System.out.println("isActive:"+isActive);
            System.out.println("Salary:"+salary);
        }
        else 
            System.out.println("No args Found");
    }
}