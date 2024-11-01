public class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Возвращает первый элемент пары
     * @return первый элемент
     */
    public F getFirst() {
        return first;
    }

    /**
     * Возвращает второй элемент пары
     * @return второй элемент
     */
    public S getSecond() {
        return second;
    }

    /**
     * Переопределение метода toString()
     * @return строковое представление пары
     */
    @Override
    public String toString() {
        return "Pair{" +
               "first=" + first +
               ", second=" + second +
               '}';
    }
}