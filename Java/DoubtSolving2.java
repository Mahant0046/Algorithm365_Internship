class DoubtSolving2{
    public static void main(String[] args) {
        printNumbers(10);
        // printNumbersUpto100(2);
    }

    public static void printNumbers(int n){

        if(n>0 && n<Integer.MAX_VALUE)
            for(int i=1;i<=n;i++){
                for(int j=1;j<=10;j++){
                    System.out.print(i*j+" ");
                }
                System.out.println();
            }
        else
            System.out.println("Number Should not be Negitive");
    }


    // public static void printNumbersUpto100(int input){
    //     if (input>0 && input<Integer.MAX_VALUE) {
    //         for(int iteration=1;iteration<=input;iteration++){
    //             for(int strat=iteration;strat<=100;strat++){
    //                 System.out.print(strat+" ");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     else 
    //         System.out.println("Number should not be negative");
    // }
    // OR
    public static void printNumbersUpto100(int input){
        if (input>0 && input<Integer.MAX_VALUE) {
            for(int iteration=1;iteration<=input;iteration++){
                StringBuilder sb=new StringBuilder();
                for(int strat=iteration;strat<=100;strat++){
                    sb.append(strat);
                    sb.append(" ");
                }
                sb.append("\n");
                System.out.println(sb);
            }
            
        }
        else 
            System.out.println("Number should not be negative");
    }

}

