package task4;

public class Solution3 {
    static String [] weeknames={"Sunday","Monday","Thursday","Wednesday","Friday","Saturday"};
    public String getMessage(){
        return "Please Enter the Index range(0-6) only";
    }
    public static void main(String[] args) {
        Solution3 solution3=new Solution3();
        try {
            System.out.println(Solution3.weeknames[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(solution3.getMessage());
        }

    }
}
