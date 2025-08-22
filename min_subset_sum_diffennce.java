import java.util.ArrayList;

public class min_subset_sum_diffennce {
    static int min_diff(int []arr,int sum){
        boolean[][]t=new boolean[arr.length+1][sum+1];
         for(int i=0;i<=arr.length;i++){
             t[i][0]=true;
         }for(int j=1;j<=sum;j++){
             t[0][j]=false;
        }
         for(int i=1;i<=arr.length;i++){
             for(int j=1;j<=sum;j++){
                 if(arr[i-1]<=j){
                     t[i][j]=(t[i-1][j-arr[i-1]] || t[i-1][j]);
                 }else{
                     t[i][j]= t[i-1][j];
             }
         }
        }

        ArrayList<Integer>v=new ArrayList<>();
         for(int j=0;j<=sum/2;j++){
             if(t[arr.length][j]==true){
                 v.add(j);
             }
         }
         int mn=Integer.MAX_VALUE;
         for(int i=0;i<v.size();i++){
             mn=Math.min(mn,sum-2*v.get(i));
         }
         return mn;
    }
    public static void main(String[] args) {
        int []arr={1,2,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(min_diff(arr,sum));
    }
}
