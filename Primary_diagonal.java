public class Primary_diagonal {
    static void first(int arr[][],int n)
        {
        int mat[] = new int[3];
         n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    //System.out.println(arr[i][j]);
                    for(int a=0;a<mat.length;a++)
                    {
                        mat[a] = arr[i][j];
                        System.out.print(" "+mat[a]);
                    }
                    //System.out.println(" "+mat[]);
                }
            }
        }

       // System.out.print(mat);
    }
    public static void main(String[] args)
    {
        int n=3;
        int a[][]=
                {{1,2,3},
                 {4,5,6},
                 {7,8,9}};
        first(a,n);
    }
}
