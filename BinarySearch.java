public class BinarySearch { 

    public static int binarySearch(int[] arr, int x) {
        int len = arr.length;
        int s =0, e = len-1;
        int m;
        while(s<=e){
            m = (s+e)/2;
            if(x<arr[m]){
               e=m-1; 
            }else if(x>arr[m]){
               s=m+1; 
            }else{
                return m;
            }
        }
        return -1;
    }

}