public class Loops2 {
    public static void main(String[] args) {
        // int []arr={1,9,2,4,5,3};
        // printStarsForArray(arr);
        // PrintStarGridSkipEven(10);
        // PrintStarsOnlyAtBorders(10);
        //PrintPyramid(4);
        PrintInvertedPyramid(4);
    }

    public static void printStarsForArray(int []arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void PrintStarGridSkipEven(int gridSize){
        for (int count=1; count <= gridSize; count++)
        {
            StringBuilder line = new StringBuilder();
            for (int row=1; row<= gridSize; row++)
            {
                // How to check if row value is even
                /* 
                if (row % 2 == 0)
                {
                    line.append(" ");
                }
                else
                {
                    line.append("*");
                } */
                line.append(row % 2 == 0 ? " " : "*");
            }
            System.out.println(line.toString());    
        }
    }

    public static void PrintStarsOnlyAtBorders(int gridSize){
        for (int row = 1; row <= gridSize; row++) {
            StringBuilder line=new StringBuilder();
             for (int column = 1; column <= gridSize; column++) {
                boolean isStar=row ==1 || row==gridSize || column==1 || column==gridSize;
                line.append(isStar?"* ":"  ");
            }
            System.out.println(line);
        }
    }

    public static void PrintPyramid(int height)
    {
        int countOfStars = 1;
        for (int level=1; level <= height; level++)
        {
            int noOfSpace = height-level;
            StringBuilder line = new StringBuilder();
            for (int count=0; count<noOfSpace; count++)
            {
                line.append(" ");
            }

            for (int count=0; count<countOfStars; count++)
            {
                line.append("*");
            }

            System.out.println(line.toString());
            countOfStars = countOfStars + 2;
        }
    }

     public static void PrintInvertedPyramid(int height)
    {
        int countOfStars = 2*height-1;
        for (int level=1; level <= height; level++)
        {
            int noOfSpace = level-1;
            // int noOfStars = ( height - level ) * 2 + 1; 
            StringBuilder line = new StringBuilder();
            for (int count=0; count<noOfSpace; count++)
            {
                line.append(" ");
            }

            for (int count=0; count<countOfStars; count++)
            {
                line.append("*");
            }

            System.out.println(line.toString());
            countOfStars = countOfStars - 2;
        }
    }
}
