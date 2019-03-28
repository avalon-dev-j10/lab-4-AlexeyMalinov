package ru.avalon.java.dev.j10.labs.sorter;

import ru.avalon.java.dev.j10.labs.Sort;

import java.util.Comparator;

/**
 * Пузырьковая сортировка
 */

public class BubbleSort implements Sort {

    Comparator bubbleSortDefaultComparator = new BubbleSortDefaultComparator();

    /**
     * Компаратор пузырьковой сортировки по умолчанию
     */
    static class BubbleSortDefaultComparator implements Comparator {

        /**
         * Выполняет сравнение двух объектов
         * В случаи, если объекты сравнимы (реализуют интерфейс Comparable),
         * то при сравнении используется метод compareTo, если объекты не сравнимы,
         * то объекты приводятся к типу String сравниваются как строки
         * @param o1 первый объект
         * @param o2 второй объект
         * @return
         */
        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Comparable && o2 instanceof Comparable) {
                return (((Comparable) o1).compareTo(o2));
            } else {
                return (o1.toString().compareTo(o2.toString()));
            }
        }
    }

    /**
     * {@inheritDoc}
     * @param array массив, подлежащий сортировке
     */
    @Override
    public void sort(Object[] array) {
        sort(array, bubbleSortDefaultComparator);
    }

    /**
     * {@inheritDoc}
     * @param array массив, подлежащий сортировке
     */
    @Override
    public void sort(Comparable[] array) {
        sort(array, bubbleSortDefaultComparator);
    }

    /**
     * {@inheritDoc}
     * @param array массив, подлежащий сортировке
     * @param comparator объект, используемый для сравнения
     */
    @Override
    public void sort(Object[] array, Comparator comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[i], array[j]) > 0) {
                    swap(array, i, j);
                }
            }
        }
    }
}

