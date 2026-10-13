package Day6;

public class GenericExample <K,V>{
    K key;
    V value;
    GenericExample(K key, V value){
        this.key=key;
        this.value=value;
    }
     public void getPair(){
        System.out.println("Key :"+key+" Value: "+value);
        //return key+" "+value;
    }
    void setPair(K key, V value){
    }
    public static void main(String[] args) {
        GenericExample<Integer,String>g1=new GenericExample<>(1,"Akash");
        g1.getPair();
        GenericExample<Integer,String>g2=new GenericExample<>(2,"Vikas");
        g2.getPair();
        GenericExample<String,String>g3=new GenericExample<>("Aditya","Kumar");
        g3.getPair();

    }
}

