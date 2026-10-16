void main(String[] args) {
    String day="Tuesday";
    String ans=switch(day){
        case "Monday","TuesDay","Wednesdsay","Thursday","Friday"->"Week day";
        default ->"Weekend";
    };
    IO.println(ans);
}