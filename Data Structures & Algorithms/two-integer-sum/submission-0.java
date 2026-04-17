
class Solution {
    public static int[] twoSum(int[] arr, int target) {
       int [] res=new int[2];
       for(int i=0;i<=arr.length-1;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==target)
            {
               res[0]+=i;
               res[1]+=j;
            }
        }
       } 
       return res;
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[]arr=new int[size];
      int target=sc.nextInt();
      int[] res=twoSum(arr,target);
      System.out.println(Arrays.toString(res));
    }
}
