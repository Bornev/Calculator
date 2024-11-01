
public class ArrayUtils {
    /**
     * Метод сравнения двух массивов любого типа
     * @param array1 первый массив
     * @param array2 второй массив
     * @return true, если массивы идентичны, иначе false
     */
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверяем длину
        if (array1.length != array2.length) {
            return false;
        }

        // Проверяем элементы
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
