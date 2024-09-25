package practical6Bweek7Inlab1;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	@Override
    public T min(T[] array) {
        T minValue = array[0];
        for (T value : array) {
            if (value.compareTo(minValue) < 0) {
                minValue = value;
            }
        }
        return minValue;
    }

    @Override
    public T max(T[] array) {
        T maxValue = array[0];
        for (T value : array) {
            if (value.compareTo(maxValue) > 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
