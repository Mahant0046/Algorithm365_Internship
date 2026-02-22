public class Loops {
    public static void main(String[] args) {
        
        int terms=10;
        int sum=0;

        // Odd Natural Numbers and Their Sum
        for (int i = 0; i <terms; i++) {
            int odd=(2*i)+1;
            sum+=odd;
            System.out.print(odd+" ");
        }
        System.out.println();
        System.out.println(sum);

        PrintStarGridConcatApproach(4);
    }

     public static void PrintStarGridConcatApproach(int gridSize)
    {   
        for (int count=1; count <= gridSize; count++)
        {
            StringBuilder line = new StringBuilder();
            for (int row=1; row<= gridSize; row++)
            {
                line.append("*");
            }
            System.out.println(line.toString());
        }
    }
}
