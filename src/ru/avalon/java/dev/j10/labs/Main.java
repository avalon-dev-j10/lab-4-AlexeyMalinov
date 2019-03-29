package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.sorter.BubbleSort;

import java.util.Comparator;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
         * Массив из 20 строк, расположенных не
         * по порядку.
         */
        String[] strings = {
                "Pushkin",
                "Lermontov",
                "Tolstoy",
                "Bunin",
                "Doctoevskiy",
                "Mayakovskiy",
                "Gorkiy",
                "Chernishevskiy",
                "Chehov",
                "Krilov",
                "Ostrovskiy",
                "Kuprin",
                "Ahmatova",
                "Gogol",
                "Zoshchenko",
                "Tsvetaeva",
                "Kropotkin",
                "Solzhenitsyn",
                "Nabokov",
                "Tvardovsky",
        };

        /*
         * Массив из 20 объектов класса User реализующих интерфейс Person
         */
        String[] nameOfPerson = {
                "Ivan",
                "Alexandr",
                "Alexey",
                "Nikolay",
                "Sergey",
                "Fedor",
                "Mihail",
                "Artem",
                "Dmitriy",
                "Egor",
                "Danial",
                "Maksim",
                "Nikita",
                "Vadim",
                "Vlad",
                "Artemiy",
                "Konstantin"
        };
        Random random = new Random();
        Person[] persons = new Person[20];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new User(
                    nameOfPerson[random.nextInt(nameOfPerson.length)],
                    new Date(
                            (1960 + random.nextInt(40)),
                            (1 + random.nextInt(12)),
                            (1 + random.nextInt(28)))
            );
        }
        /*
         * Инициализация объекта класса BubbleSort реализующего интерфейс Sort
         */
        Sort sort = new BubbleSort();

        /*
         * Инициализация объекта класса stringReversComparator реализующего интерфейс Comparator
         */
        Comparator comparator = new stringReversComparator();

        /*
         * Сортировка массива объектов типа Person
         */
        sort.sort(persons);

        /*
         * Сортировка массива объектов типа String по возрастанию
         */
        sort.sort(strings);

        /*
         * Сортировка массива объектов типа String по убыванию
         */
        sort.sort(strings, comparator);
    }
}
