import java.util.*;
class BinarySearchA{
    public  static int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                low=mid+1;
            } else if(arr[mid]>target){
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={4,3,2,1,8,7,6};
        int target=1;
        Arrays.sort(arr);
        int result=binarysearch(arr,target);
        if(result==-1){
            System.out.println("target not found");
        } else {
        System.out.println("Index " +result);
        }
    }
}