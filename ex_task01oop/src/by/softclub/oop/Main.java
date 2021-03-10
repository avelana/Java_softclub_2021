package by.softclub.oop;
// https://www.baeldung.com/java-stack-heap
import by.softclub.oop.entity.User;

import java.util.Arrays;

public final class Main {
    static final int USER_NUMBER = 4;
    static final int START_AGE_OF_USER = 19;
    static final String MESSAGE = "Стандартная сортировка:\n";

    private Main() {
    }

    // в этом классе сортируем массивы и списки
    // объектов с помощь. интерфейсов Comparable
    public static void main(final String[] args) {

        // создаем массив объектов
        User[] userArray = new User[USER_NUMBER];
        final int age = START_AGE_OF_USER;
        int i = 0;
        userArray[i++] = new User("Ivan", age);
        userArray[i++] = new User("Peter", age - 1);
        userArray[i++] = new User("Helen", age + 2);
        userArray[i] = new User("Alexander", age - 2);

        // сортируем массив с помощью интерфейса Comparable
        Arrays.sort(userArray);
        System.out.println(MESSAGE + Arrays.toString(userArray));
    }
}
