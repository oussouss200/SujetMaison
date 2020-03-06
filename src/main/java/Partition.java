import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partition {

    public List<List<Integer>> splitList(List<Integer> liste, int taille) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i = 0; i < liste.size(); i += taille) {
            int end = Math.min(liste.size(), i + taille);
            lists.add(liste.subList(i,end));
        }
        return  lists;
    }

    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(1,2,3,4,5,6,7,8);
        Partition partition = new Partition();
        partition.splitList(liste,3).forEach(System.out::println);
    }
}
