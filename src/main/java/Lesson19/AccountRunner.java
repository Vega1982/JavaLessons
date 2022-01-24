package Lesson19;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class AccountRunner {
    @SneakyThrows
    public static void main(String[] args) {
        // Для простоты логика вызова будет в двух отдельных методах
        // Это вызов для физ. лица:
        individualDoing();

        // Это вызов для юр. лица:
        entitylDoing();


    }

    private static void individualDoing() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // Создадим объект счёта класса физ. лица
        IndividualAccount individualAccount = new IndividualAccount();

        // Получим доступ к приватной переменной класса ФЛ
        Field individualBalanceField = individualAccount.getClass().getDeclaredField("balance");
        individualBalanceField.setAccessible(true);

        // Выведем исходное значение баланса ФЛ
        System.out.println("Исходное значение баланса ФЛ: ");
        //Для этого получим доступ к приватному методу класса ФЛ и запустим его
        Method methodPrint = individualAccount.getClass().getDeclaredMethod("print");
        methodPrint.setAccessible(true);
        methodPrint.invoke(individualAccount);

        // Установим значение переменной 5000
        individualBalanceField.set(individualAccount, BigDecimal.valueOf(5000));

        //Снова получим доступ к приватному методу класса ФЛ и запустим его
        System.out.println("Значение баланса ФЛ после корректировки: ");
        Method anotherMethodPrint = individualAccount.getClass().getDeclaredMethod("print");
        anotherMethodPrint.setAccessible(true);
        anotherMethodPrint.invoke(individualAccount);
    }

    private static void entitylDoing() throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        // Создадим объект счёта класса юр. лица
        EntityAccount entityAccount = new EntityAccount();

        // Получим доступ к приватной переменной класса ЮЛ
        Field entityBalanceField = entityAccount.getClass().getDeclaredField("balance");
        entityBalanceField.setAccessible(true);

        // Выведем исходное значение баланса ФЛ
        System.out.println("Исходное значение баланса ЮЛ: ");
        //Для этого получим доступ к приватному методу класса ЮЛ и запустим его
        Method methodPrint = entityAccount.getClass().getDeclaredMethod("print");
        methodPrint.setAccessible(true);
        methodPrint.invoke(entityAccount);

        // Установим значение переменной 10_000_000
        entityBalanceField.set(entityAccount, BigDecimal.valueOf(10000000));

        //Снова получим доступ к приватному методу класса ЮЛ и запустим его
        System.out.println("Значение баланса ЮЛ после корректировки: ");
        Method anotherMethodPrint = entityAccount.getClass().getDeclaredMethod("print");
        anotherMethodPrint.setAccessible(true);
        anotherMethodPrint.invoke(entityAccount);
    }
}
