package activities;

public class Activity8 {

    public static void main(String[] args) {

        try {
            Activity8.exceptionTest("Will print to console");
            //Method call will throw an exception
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Won't execute");
        } catch (CustomException e) {
            System.out.println("Inside catch block : "+e.getMessage());
        }
    }

    //Throws custom exception
    public static void exceptionTest(String e) throws CustomException{
        if(e==null)
            throw new CustomException("Message is null");
        else
            System.out.println(e);
    }
}
