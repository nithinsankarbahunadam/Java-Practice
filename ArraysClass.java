import java.util.Arrays;
public class ArraysClass {

    public static void main(String[] args) {

        //one-dimensional array

        int[] array = {13, 25, 321, 44, 56};

        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }

        //methods of the Arrays class
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 321));
        System.out.println(Arrays.equals(array, new int[]{13, 25, 321,
                44, 56}));
        int[] copy = Arrays.copyOf(array, 3);   
        System.out.println(Arrays.toString(copy));
        int[] copyRange = Arrays.copyOfRange(array, 1, 4);
        System.out.println(Arrays.toString(copyRange));
        Arrays.fill(array, 0);
        System.out.println(Arrays.toString(array));
        Arrays.parallelSort(copyRange);
        System.out.println(Arrays.toString(copyRange));
        Arrays.parallelPrefix(copyRange, (x, y) -> x + y);
        System.out.println(Arrays.toString(copyRange));
        Arrays.setAll(copyRange, i -> i * 2);
        System.out.println(Arrays.toString(copyRange));
        Arrays.stream(copyRange).forEach(System.out::println);
        System.out.println(Arrays.stream(copyRange).sum());
        System.out.println(Arrays.stream(copyRange).average().orElse(0));
        System.out.println(Arrays.stream(copyRange).min().orElse(0));
        System.out.println(Arrays.stream(copyRange).max().orElse(0));
        System.out.println(Arrays.stream(copyRange).count());
        System.out.println(Arrays.stream(copyRange).distinct().count());
        System.out.println(Arrays.stream(copyRange).filter(x -> x > 2).count());
        System.out.println(Arrays.stream(copyRange).map(x -> x * 2).sum());
        System.out.println(Arrays.stream(copyRange).sorted().toArray());
        System.out.println(Arrays.stream(copyRange).boxed().toArray(Integer[]::new));
            
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
        Arrays.parallelPrefix(array, (x, y) -> x + y);
        System.out.println(Arrays.toString(array));
        Arrays.setAll(array, i -> i * 2);
        System.out.println(Arrays.toString(array));
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(Arrays.stream(array).sum());
        System.out.println(Arrays.stream(array).average().orElse(0));
        System.out.println(Arrays.stream(array).min().orElse(0));
    }
    
}
