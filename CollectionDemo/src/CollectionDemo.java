import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------------");
        list.add("我");
        list.add("爱");
        list.add("邓伦");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        for(String f:list){
            System.out.println(f);
        }
        list.remove("我");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        for(String f:list){
            System.out.println(f);
        }
    }
}
