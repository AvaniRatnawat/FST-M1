package activities;

public class Activity2 {
    public static void main(String[] args) {

        int numbers[] = {10, 77, 10, 54, -11, 10};

        int addnum = 10;
        int sum = 30;

        Boolean result = checkSum(numbers, addnum, sum);
        System.out.println("Result is :: "+result);
    }

    public static Boolean checkSum(int numbers[], int addnum, int sum ) {
        int temp = 0;
        for(int x:numbers) {
            if(x == 10)
                temp = temp+x;

            if(temp > sum)
                break;
        }

        return (temp == sum);

    }
}
