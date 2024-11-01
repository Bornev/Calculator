public class Main {
    public static void main(String[] args) {
        // Демонстрация Calculator
        System.out.println("Calculator демонстрация:");
        System.out.println("Сложение: " + Calculator.sum(5, 3.5));
        System.out.println("Умножение: " + Calculator.multiply(2, 4.2));
        System.out.println("Деление: " + Calculator.divide(10, 2));
        System.out.println("Вычитание: " + Calculator.subtract(7.5, 3));

        // Демонстрация ArrayUtils
        System.out.println("\nArrayUtils демонстрация:");
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};
        Integer[] arr3 = {1, 2, 4};
        System.out.println("Сравнение arr1 и arr2: " + ArrayUtils.compareArrays(arr1, arr2));
        System.out.println("Сравнение arr1 и arr3: " + ArrayUtils.compareArrays(arr1, arr3));

        String[] strArr1 = {"a", "b", "c"};
        String[] strArr2 = {"a", "b", "c"};
        System.out.println("Сравнение строковых массивов: " + ArrayUtils.compareArrays(strArr1, strArr2));

        // Демонстрация Pair
        System.out.println("\nPair демонстрация:");
        Pair<String, Integer> pair1 = new Pair<>("Hello", 42);
        System.out.println(pair1);
        System.out.println("First: " + pair1.getFirst());
        System.out.println("Second: " + pair1.getSecond());
    }
}