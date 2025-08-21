class knapsack{
    public static void main(String[] args) {
       int []wt={1,3,4,5};
       int n=wt.length;
       int []val={1,4,5,7};
       int w=7;
       int [][]t=new int[n+1][w+1];
       for(int i=0;i<=n;i++){
           for(int j=0;j<=w;j++){
               if(i==0||j==0){
                   t[i][j]=0;
               }
                else if(wt[i-1]<=j){
                   t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                 }else{
                     t[i][j]=t[i-1][j];
       }}}
        System.out.println("The max value;"+t[n][w]);
    }
}