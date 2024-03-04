package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        Set setNumbers = createHashSet(numbers);
        System.out.println(setNumbers);

        Integer toAdd = 5;
        setNumbers.add(toAdd);
        System.out.println(setNumbers);

        Iterator<Integer> iterator =  setNumbers.iterator();

        while (iterator.hasNext()){
            Integer element = iterator.next();
            if (element.equals(toAdd)){
                System.out.println("The elmenet " + element + " is equal to " + toAdd + ", so it will be removed.");
                iterator.remove();
            }
        }
        System.out.println(setNumbers);
    }

    public static HashSet createHashSet(Integer[] object) {
        HashSet<Integer> result = new HashSet(Arrays.asList(object));

        return result;
    }
}
