import java.util.Arrays;

interface IntList {
    void add(int number);
    int get(int index);
}

class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length + array.length / 2);
        }
        array[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
}

class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = number;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }
}

