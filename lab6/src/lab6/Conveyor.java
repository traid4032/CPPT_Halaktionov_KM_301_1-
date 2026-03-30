package lab6;

/**
 * Параметризований клас, що реалізує конвеєр
 * @param <T> тип елементів, що зберігаються в конвеєрі
 */
class Conveyor<T extends Comparable<T>> {
    private Object[] elements;
    private int capacity;
    private int size;
    private int front;
    private int rear;

    /**
     * Конструктор класу Conveyor
     * @param capacity максимальна місткість конвеєра
     */
    public Conveyor(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    /**
     * Додати елемент в кінець конвеєра
     * @param element елемент для додавання
     * @throws IllegalStateException якщо конвеєр повний
     */
    public void add(T element) {
        if (isFull()) {
            throw new IllegalStateException("Conveyor is full");
        }
        rear = (rear + 1) % capacity;
        elements[rear] = element;
        size++;
    }

    /**
     * Видалити та повернути елемент з початку конвеєра
     * @return видалений елемент
     * @throws IllegalStateException якщо конвеєр порожній
     */
    @SuppressWarnings("unchecked")
    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Conveyor is empty");
        }
        T element = (T) elements[front];
        elements[front] = null;
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    /**
     * Знайти мінімальний елемент у конвеєрі
     * @return мінімальний елемент
     * @throws IllegalStateException якщо конвеєр порожній
     */
    @SuppressWarnings("unchecked")
    public T findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Conveyor is empty");
        }

        T min = (T) elements[front];
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            T current = (T) elements[index];
            if (current.compareTo(min) < 0) {
                min = current;
            }
        }
        return min;
    }

    /**
     * Перевірити чи є конвеєр порожнім
     * @return true якщо конвеєр порожній, false в іншому випадку
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Перевірити чи є конвеєр повним
     * @return true якщо конвеєр повний, false в іншому випадку
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Отримати поточний розмір конвеєра
     * @return кількість елементів у конвеєрі
     */
    public int size() {
        return size;
    }

    /**
     * Вивести вміст конвеєра
     * @return рядок, що представляє вміст конвеєра
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conveyor[");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            sb.append(elements[index]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
