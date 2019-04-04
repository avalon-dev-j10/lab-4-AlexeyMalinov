package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 * Абстрактное представление об объекте, отвечающем за
 * сортировку структурированных объектов.
 *
 * <p>Для сортировки структурированных объектов необходимо
 * иметь возможность сравнивать объекты.
 *
 * @see Comparable
 * @see Comparator
 */
public interface Sort {

    /**
     * Выполняет сортировку переданного массива объектов.
     *
     * @param array массив, подлежащий сортировке
     */
    void sort(Object[] array);

    /**
     * Выполняет сортировку массива сравниваемых объектов.
     *
     * @param array массив, подлежащий сортировке
     */
    void sort(Comparable[] array);

    /**
     * Выполняет сортировку массива объектов с
     * использованием переданного объекта типа
     * {@link Comparator}.
     *
     * @param array массив, подлежащий сортировке
     * @param comparator объект, используемый для сравнения
     *                   элементов массива {@code array}
     */
    void sort(Object[] array, Comparator comparator);

    /**
     * Выполняет перестановку элементов массива
     * @param array
     * @param i индекс первого элемента
     * @param j индекс второго элемента
     */
    default void swap(Object[]array, int i, int j){
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
