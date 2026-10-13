package Day6.Exception_Handling;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int arr[]={3,6,4};
            System.out.println(arr[3]);

            System.out.println(arr[2]/0);
        }
        catch (ArrayIndexOutOfBoundsException b){
            System.out.println("Array index out of bounds");
        }
        catch (Exception e){
            System.out.println("Cannot divisible by 0");
        }

    }
}
