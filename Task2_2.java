package HW2;

//3) Реализовать простой калькулятор
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task2_2.class.getName());
        FileHandler fh = new FileHandler("log2.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "Логирование для задания 2: ");
        StringBuilder strbld = new StringBuilder();

        Scanner inputRead = new Scanner(System.in);
        int n1;
        int n2;
        int result;
        char oper;

        System.out.print("Введите первое число: ");
        n1 = inputRead.nextInt();
        System.out.print("Выберете операцию: +, - , * , / ");
        oper = inputRead.next().charAt(0);
        System.out.print("Введите второе число: ");
        n2 = inputRead.nextInt();
        boolean correct = true;

        strbld.append(n1)
                .append(oper)
                .append(n2)
                .append("=");

        switch (oper) {
            case '+':
                result = n1 + n2;
                strbld.append(result);
                logger.info(strbld.toString());
                break;
            case '-':
                result = n1 - n2;
                strbld.append(result);
                logger.info(strbld.toString());
                break;
            case '*':
                result = n1 * n2;
                strbld.append(result);
                logger.info(strbld.toString());
                break;
            case '/':
                result = n1 / n2;
                strbld.append(result);
                logger.info(strbld.toString());
                break;
            default:
                result = 0;
                correct = false;
                logger.log(Level.WARNING, "Неверная операция! " + oper);
        }
        strbld.delete(0, strbld.length());
    }
    // System.out.println(correct ? "Итого: " + result : "Неверная операция!");
}
