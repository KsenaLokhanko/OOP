/* Sorry for my english.
 * This text was written using Google Translate
 */
package lab4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class description "lab4.Main".
 * This is main class of program.
 *
 * @author Lokhanko Kseniia, IO-11
 * @version 0.1 28 Jun 2022
 */
public class Main {

    /**
     * Method for outputting an array.
     * The output text is formatted.
     *
     * @param array an array to be printed.
     */
    private static void printArr(Cosmetic[] array) {
        for (Cosmetic object : array) {
            System.out.format("%s, %s, %s, %.2f$, %d\n", object.getName(), object.getBrand(), object.getCountry(), object.getPrise(), object.getYear());
        }
    }

    /**
     * Method for sorting an array by increasing price.
     * Метод роботи: описано коментарями))
     *
     * @param array an array to be sorted.
     */
    private static void sortPrise(Cosmetic[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //Вважаємо, що перший елемент в кожній підмножині - мінімальний
            float min = array[i].prise;//мінімальне значення(елемента)
            int indexOfMin = i;//індекс мінімального значення(елемента)
            //Шукаємо елемент, що менше ніж min
            for (int j = i + 1; j < array.length; j++) {
                //якщо знаходимо - запмсуємо значення і індекс
                if (array[j].prise < min) {
                    min = array[j].prise;
                    indexOfMin = j;
                }
            }
            /*Якщо знайшовся елемент менший,
            то міняємо його місцями з поточним*/
            if (i != indexOfMin) {
                Cosmetic temp = array[i];
                array[i] = array[indexOfMin];
                array[indexOfMin] = temp;
            }
        }
    }

    /**
     * The main method of this program
     */
    public static void main(String[] args) {
        System.out.println("C11 = " + 1117 % 11 + ";\nTask is 'Визначити клас косметика, який складається як мінімум з 5-и полів'.");

        //створюємо об'єкти для класу Cosmetic
        //name, brand, country, prise, year
        Cosmetic obj1 = new Cosmetic("blush1", "Tom Ford", "Canada", 45.65f, 2022);
        Cosmetic obj2 = new Cosmetic("blush2", "Tom Ford", "USA", 43, 2021);
        Cosmetic obj3 = new Cosmetic("lipstic", "Clarins", "USA", 45.94f, 2022);
        Cosmetic obj4 = new Cosmetic("lip_gloss", "Lancome", "Ukraine", 76.25f, 2020);
        Cosmetic obj5 = new Cosmetic("eye_shadow", "Clarins", "UK", 65.24f, 2020);
        Cosmetic[] cosmetic_array = new Cosmetic[]{obj1, obj2, obj3, obj4, obj5};

        //Перевірка виключних ситуацій
        for (Cosmetic object : cosmetic_array) {
            if (object.prise < 0) {
                System.err.format("%.2f$ - Ціна не може бути від'ємною. Чи ви доплачуватимете?", object.prise);
                return;
            } else if (object.year > 2022) {
                System.err.format("%d - Цей рік ще не настав.", object.year);
                return;
            } else if (object.year < 1800) {
                System.err.format("%d - То дуже давно було, строк придатності вже вийшов.", object.year);
                return;
            }
        }

        //array output
        System.out.println("\nПочатковий масив:");
        printArr(cosmetic_array);

        // sort by price raise
        System.out.println("\nСортований масив за зростанням ціни:");
        sortPrise(cosmetic_array);
        printArr(cosmetic_array);

        // sort algorithm by name in reverse alphabetical order
        System.out.println("\nСортований масив за назвою в зворотньому алфавітному порядку:");
        Comparator<Cosmetic> cosmeticComparator = Comparator.comparing(Cosmetic::getName).reversed();
        Arrays.sort(cosmetic_array, cosmeticComparator);
        printArr(cosmetic_array);
    }
}
