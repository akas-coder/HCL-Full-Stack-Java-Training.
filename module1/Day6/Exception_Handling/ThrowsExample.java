package Day6.Exception_Handling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    static void calculate() throws IOException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    public static void main(String[] args) throws IOException {
        try {
            calculate();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Pragram is Finished");

    }
}

