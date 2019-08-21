package core.basesyntax;

public class FindNumbers {

    /**
     * Реализуйте метод getAllNumbers(String text) который принимает строку, содержащую буквы,
     * целые числа и иные символы.
     * Требуется: все числа, которые встречаются в строке, поместить в отдельный целочисленный
     * массив, каждый элемент этого массива умножить на 2. Метод должен возвращать этот массив.
     * Пример: если дана строка "data 48 call 9 read13 blank0a", то в массиве должны оказаться
     * числа 96, 18, 26 и 0.
     */
    public int[] getAllNumbers(String text) {
        text = text.replaceAll("[^-?0-9]", " ");
        String[] parts = text.split(" ");
        int length = 0;
        for (String part : parts) {
            if (!(part.equals(""))) {
                length++;
            }
        }
        int[] numbers = new int[length];
        int element = 0;
        while (element < length) {
            for (String part : parts) {
                if (!part.equals("")) {
                    numbers[element] = Integer.parseInt(part) * 2;
                    element++;
                }
            }
        }
        return numbers;
    }
}
