public class ConvertSingleArray {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,3,4},{3,4,5,6},{4,5,6,7}};
        int totalcount=0;
       /*   for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Hi");
                totalcount++;
            }
         }*/
        for(int i=0;i<arr.length;i++)
        {
            totalcount = totalcount + arr[i].length;
        }
        System.out.println(totalcount);
        int outArr [] = new  int[totalcount];
        int k = 0;
        for(int x=0;x<arr.length;x++)
        {
            for(int y=0;y<arr[x].length;y++)
            {
              outArr[k] = arr[x][y];
              k++;
            }
        }
        for(int s=0;s<totalcount;s++)
        {
            System.out.println(outArr[s] + " ");
        }
    }
}
