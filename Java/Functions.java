class Functions{
    public static void main(String[] args) {
        ReverseString("Hello");

        // We cannot access String like this because strings are objects in java
        // System.out.println(str[0]); 
    }

    public static void ReverseString(String str){
        int left=0;
        int right=str.length()-1;
        char []original=str.toCharArray();
        while (left<right) {
           char temp=original[left];
           original[left]=original[right];
           original[right]=temp;
           left++;
           right--;
        }

        System.out.println(String.valueOf(original));

    }
}