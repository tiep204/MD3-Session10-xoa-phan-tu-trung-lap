import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 3, 5, 2, 1));
        List<Integer> integerList = new ArrayList<>();
        for (Integer num : list) {
            if (!integerList.contains(num)){
                integerList.add(num);
            }
        }
        System.out.println(integerList);
    }
}