class Solution {
    public static boolean hasDuplicate(int[] arr) {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
             {
                if(arr[j]==arr[i])
                {
                  return true;
                }
             }
        }
       return false;    
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]nums=new int[size];
        if(hasDuplicate(nums))
        {
           System.out.println("true");
        }
         System.out.println("false");
    }
}
