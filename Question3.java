package Assignment_1_Arrays;
class BinarySearch{
    public int binarySearch(int[]arr,int target){
        int st=0;
        int en=arr.length-1;
        while (st<=en){
            int mid=st+(en-st)/2;
            if (target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                st=mid+1;
            }
            else{
                en=mid-1;
            }
        }
        return st;
    }
}
public class Question3 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int target = 6;

        BinarySearch b=new BinarySearch();
        System.out.println(b.binarySearch(nums,target));

    }
}
