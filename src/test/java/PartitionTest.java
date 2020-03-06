import org.junit.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartitionTest {
    @Test
    public void should_get_sublists_with_size_equal_to_the_size_demanded(){
        //GIVEN
        List<Integer> liste = Arrays.asList(1,2,3,4,5,6);
        int taille = 2;
        //WHEN
        Partition partition = new Partition();
        List<List<Integer>> lists= partition.splitList(liste,taille);

        //THEN
        for ( List<Integer> l : lists) {
            Assert.assertEquals(taille, l.size());
        }

    }

    @Test
    public void should_get_our_list_when_we_concatenate_all_sublists(){
        //GIVEN
        List<Integer> liste = Arrays.asList(1,2,3,4,5,6);

        //WHEN
        Partition partition = new Partition();
        List<List<Integer>> lists= partition.splitList(liste,2);

        //THEN
        List<Integer> newListe = lists.stream().flatMap(List::stream).collect(Collectors.toList());
        Assert.assertEquals(liste,newListe);
    }
}
