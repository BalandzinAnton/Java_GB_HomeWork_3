package HomeWork.HomeWork_3;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Home_Work_3_2 {
    public  static int ARRAY_SIZE = 15;
    public static final Random random = new Random();


    public static void main(String[] args) {
        ArrayList<Integer> listCreate = createArray(ARRAY_SIZE);
        dalArray(listCreate);
    }

    private static void dalArray(ArrayList<Integer> listCreate) {
        ArrayList<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < listCreate.size(); i++) {
            if(listCreate.get(i) % 2 != 0) {
                listResult.add(listCreate.get(i));
            }
        }
        System.out.println(listResult);
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


