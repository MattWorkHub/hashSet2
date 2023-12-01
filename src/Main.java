import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        hashCreation("1","4","7");
    }
    public static void hashCreation(String part1, String part2, String part3){
        HashSet<String> list = new HashSet<String>();
        HashNumbers add1 = new HashNumbers("5");

        list.add(part1);
        list.add(part2);
        list.add(part3);
        list.add(add1.number);

        for(String i : list) {
            System.out.println(i);
        }
        System.out.println("Hashset length is : " + list.toArray().length);
    }
}