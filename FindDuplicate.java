import java.util.Scanner;
public class FindDuplicate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = findDuplicate(arr);
        System.out.println("Duplicate Number is " + res);
    }

    public static int findDuplicate(int[] nums) {
       int slow = nums[0];
       int fast = nums[0];
       
       do{
           slow = nums[slow];
           fast = nums[nums[fast]];
       }while(slow != fast);
        
       fast = nums[0];
       while(slow != fast){
           slow = nums[slow];
           fast = nums[fast];
       }
        return slow;
    }
}