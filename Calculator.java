public class Calculator {
    /**
     * Статический метод сложения для любых числовых типов
     * @param a первый операнд
     * @param b второй операнд
     * @return результат сложения
     */
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    /**
     * Статический метод умножения для любых числовых типов
     * @param a первый операнд
     * @param b второй операнд
     * @return результат умножения
     */
    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    /**
     * Статический метод деления для любых числовых типов
     * @param a первый операнд
     * @param b второй операнд
     * @return результат деления
     */
    public static <T extends Number> double divide(T a, T b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a.doubleValue() / b.doubleValue();
    }

    /**
     * Статический метод вычитания для любых числовых типов
     * @param a первый операнд
     * @param b второй операнд
     * @return результат вычитания
     */
    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}