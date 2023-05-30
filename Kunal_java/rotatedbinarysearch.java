public class rotatedbinarysearch{
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
    }
       static int binarySearch(int[] nums, int target)
{
        int pivot = findpivot(nums);
        if(pivot==-1){

            pivto 
        }
}    
    
    
    static int findpivot(int[] arr){
        int start = 0;
        int end= arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
        }if(mid > start  && arr[mid]<arr[mid-1]){
                 return mid-1;
        }if(arr[mid]<= arr[start]){
                  end= mid -1;

        }else{
            start = mid +1;
        }
    }
    return -1;
}
}