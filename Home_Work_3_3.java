package HomeWork.HomeWork_3;
// Задан целочисленный список. Найти минимальное, максимальное, среднее значения
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Home_Work_3_3 {
    public  static int ARRAY_SIZE = 21;
    public static final Random random = new Random();


    public static void main(String[] args) {
        ArrayList<Integer> listCreate = createArray(ARRAY_SIZE);
        minMaxMiddle(listCreate);
    }

    private static void minMaxMiddle(ArrayList<Integer> listCreate) {
        //ArrayList<Integer> list = new ArrayList<>(listCreate.size());
        Collections.sort(listCreate);
        int minNumber = listCreate.get(0);
        int maxNumber = listCreate.get(listCreate.size() - 1) ;
        float middle = (listCreate.stream().mapToInt(Integer::valueOf).sum()) / (listCreate.size());
        System.out.println("Min: " + minNumber + " Max: " + maxNumber + " Mid: " + middle);
    }

    private static ArrayList<Integer> createArray(int arraySize) {
        ArrayList<Integer> list = new ArrayList<>(arraySize);
        for (int i = 0; i < arraySize; i++) {
            list.add(random.nextInt(1, 25));
        }
        System.out.println(list);
        return list;
    }
}
