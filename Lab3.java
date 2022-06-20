public class Lab3 {
    public static void main(String[] args){
        System.out.println("Hello, world!");

        System.out.println("C3 is " + 1117 % 3 + " so C3 is StringBuilder;");
        System.out.println("C17 is " + 1117 % 17 + " so C17 task is Відсортувати слова заданого тексту \nза кількістю входжень визначеного символу в них.");

        //обираємо символ (1 штука)
        StringBuffer symbol = new StringBuffer("k");
        if (symbol.length() > 1) {
            throw new IllegalArgumentException("Там ж написано, 1 штука!");
        }

        StringBuffer text = new StringBuffer("erjh dk0kk xl(sж;elk kkkkk y1fkjfkkk!!!! k kkkk11kk/kkkkkkk");
        System.out.println(text);




        //Прибраємо цифри, розділові знаки та спецсимволи, зайві пробіли
        String[] words = text.toString().replaceAll("[\\p{P}|\\s]+", "").split(" ");
        //text = new StringBuffer(text.toString().replaceAll("[\\.|,|\\?|!\\s]+", " "));
        //text.append(" ");
        //System.out.println("Після прибирання: " + words);
        Arrays.sort();
        /*int n = text.length();

        Arrays.sort(text, Comparator.comparing(String::length));

        ArrayList<String> sorted = new ArrayList<>();
        for (int i=0; i<= text[text.length-1].lenght(); i++)*/


        /*//впихуємо кожне слово у ArrayList і тепер у нас є списочок з окремих слів
        int from = 0, to;
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                to = i;
                words.add(text.substring(from, to));
                from = i + 1;
            }
        }

        System.out.println(words);

        ArrayList<String> sorted = new ArrayList<>();
*/




        /*Collections.sort(words);
        System.out.println(words);
        */

        //Якщо хочеться в іншому порядку
        /*Collections.reverse(words);
        System.out.println(words);
        */


    }
}

