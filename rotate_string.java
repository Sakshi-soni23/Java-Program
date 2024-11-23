public class rotate_string {
    public static void main(String[] args) {
int [] nums ={1,2,3,4,5,6,7,8};
int target =0;
int i=0;
boolean found =false;
        while (i < nums.length) {
            if (nums[i] == target) {
                System.out.println(i);
                found = true;
                break; // Exit the loop once the target is found
            }
            i++;
        }

// If the loop completes without finding the target, print -1
        if (!found) {
            System.out.println(-1);
        }

    }
}
