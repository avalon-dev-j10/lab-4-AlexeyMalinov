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
	    String[] strings = new String[20];
	    strings[0] = "Pushkin";
	    strings[1] = "Lermontov";
	    strings[2] = "Tolstoy";
	    strings[3] = "Bunin";
	    strings[4] = "Doctoevskiy";
	    strings[5] = "Mayakovskiy";
	    strings[6] = "Gorkiy";
	    strings[7] = "Chernishevskiy";
	    strings[8] = "Chehov";
	    strings[9] = "Krilov";
	    strings[10] = "Ostrovskiy";
	    strings[11] = "Kuprin";
	    strings[12] = "Ahmatova";
	    strings[13] = "Gogol";
	    strings[14] = "Zoshchenko";
	    strings[15] = "Tsvetaeva";
	    strings[16] = "Kropotkin";
	    strings[17] = "Solzhenitsyn";
	    strings[18] = "Nabokov";
	    strings[19] = "Tvardovsky";

	    /*
	     * Массив из 20 объектов класса User реализующих интерфейс Person
	     */
		Random random = new Random();
	    Person[] persons = new Person[20];
	    persons[0] = new User("Ivan",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[1] = new User("Alexandr",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[2] =new User("Alexey",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[3] =new User("Nikolay",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[4] =new User("Sergey",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[5]=new User("Fedor",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[6]=new User("Mihail",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[7]=new User("Artem",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[8]=new User("Dmitriy",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[9]=new User("Egor",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[10]=new User("Danial",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[11]=new User("Maksim",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[12]=new User("Nikita",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
	    persons[13]=new User("Vadim",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
		persons[14]=new User("Ivan",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
		persons[15]=new User("Vlad",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
		persons[16]=new User("Alexandr",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
		persons[17]=new User("Sergey",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
		persons[18]=new User("Artemiy",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
		persons[19]=new User("Konstantin",new Date((1960 + random.nextInt(40)),
				(1+random.nextInt(12)),
				(1+random.nextInt(23))));
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
