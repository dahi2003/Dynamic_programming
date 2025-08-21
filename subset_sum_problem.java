public class subset_sum_problem {
    public static void main(String[] args) {
       int []arr={2,3,7,8,9};
       int sum=11;
       boolean [][]t=new boolean[arr.length+1][sum+1];
       for(int i=0;i<arr.length;i++){
           t[i][0]=true;
       }for(int j=0;j<=sum;j++){
           t[0][j]=false;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                   t[i][j]=(t[i-1][j-arr[i-1]] || t[i-1][j]);
               }else{
                   t[i][j]=t[i-1][j];
               }
           }
       }
        System.out.println(t[arr.length][sum]);
    }
}
