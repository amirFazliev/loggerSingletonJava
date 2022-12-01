import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка.\nВведите размер списка:\nВведите верхнюю границу для значений:");
        int sizeList = scanner.nextInt();
        int sizeMax = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> listInt = createList(sizeList,sizeMax);
        listInt.forEach(s -> System.out.print(s + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации.\nВведите порог для фильтра:");
        int filterInt = scanner.nextInt();
        Filter filter = new Filter(filterInt);

        List<Integer> listIntFilter = filter.filterOut(listInt);
        listIntFilter.forEach(s -> System.out.print(s + " "));
        System.out.println();

        logger.log("Завершаем программу");
    }

    public static List<Integer> createList (int size, int max) {
        ArrayList<Integer> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i<size; i++) {
            resultList.add(random.nextInt(max));
        }
        return resultList;
    }
}