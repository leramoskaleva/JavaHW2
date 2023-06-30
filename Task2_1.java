package HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2_1 {
    public static void main(String[] args) throws IOException {

        int[] array = new int[] { 5, 3, 8, 1 };

        Logger logger = Logger.getLogger(Task2_1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "Логирование для задания 1: ");
        logger.info("Было " + Arrays.toString(array));

        Sort(array);
        System.out.println(sortedarr(array));
        logger.info("Стало " + Arrays.toString(array));

    }

    public static void Sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }

    private static String sortedarr(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(array[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}
