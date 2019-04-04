package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * Класс компаратор сравнивающий возраст людей
 */
public class stringReversComparator implements Comparator {

    /**
     * Выполняет сравнение строк
     *
     * @param object1
     * @param object2
     * @return
     */
    @Override
    public int compare(Object object1, Object object2) {
        if (object1 instanceof String && object2 instanceof String) {
            return ((String) object2).compareTo((String) object1);
        }
        return -1;
    }
}
