import java.util.ArrayList;

class ArrayList1{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nithin");
        names.add("Chandhini");
        names.add("Thankam");
        names.add("Neethu");
        names.add("Mani");


        for(String name : names){
            System.out.println(name);
        }
    }
}