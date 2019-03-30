package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * Класс компаратор сравнивающий возраст людей
 */
public class stringReversComparator implements Comparator {

    /**
     * Выполняет сравнение строк
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof String && o2 instanceof String){
            String string1 = (String) o1;
            String string2 = (String) o2;
            return string2.compareTo(string1);
        }
        return -1;
    }
}
