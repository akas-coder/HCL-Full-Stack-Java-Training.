package Day7.Switch;

public class SwitchImpl {
    public static void main(String[] args) {
        String day="Tuesday";
        String ans=switch(day){
            case "Monday","TuesDay","Wednesdsay","Thursday","Friday"->"Week day";
            default ->"Weekend";
        };
        System.out.println(ans);
    }
}
