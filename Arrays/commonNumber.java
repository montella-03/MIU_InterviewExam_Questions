package Mius;

public class Commennumberof2arrey {



    public static void main(String[] args) {
        int[] ff=null;
        int[] ss={1,5,4,2,2};
        int[] ans=f(ff,ss);
        for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
        }
    }
    public static int[] f(int[] first,int[] secund){
        int[] temp=new int[first.length];
        int count=0;
        if(first==null || secund==null){
            return null;
        }
        for(int i=0;i<first.length;i++){
                for(int j=0;j<secund.length;j++){
                    if(first[i]==secund[j]){
                        temp[count]=first[i];
                        count++;
                    }
                }
        }
        int[] result=new int[count];
        for(int i=0;i<count;i++){
            result[i]=temp[i];
        }
        return result;
    } 
}
