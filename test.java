import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test {

//    Take 2 different size of unsorted arrays containing duplicate elements, then merge the arrays without duplication in a sorted manner.
public static void main(String[] args) {
    int [] array1 ={ 4,2,6,3,7,3};
    int[] array2 ={1,4,5,2,8,5};

    int[] mergeArray = mergeAndSortArray(array1,array2);
    System.out.println("Merged and sorted array without duplicate"+ Arrays.toString(mergeArray));
}

    private static int[] mergeAndSortArray(int[] array1, int[] array2) {
    // main logic
        Set<Integer> set = new HashSet<>();
        for(int num :array1) set.add(num);
        for(int num :array2) set.add(num);

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
