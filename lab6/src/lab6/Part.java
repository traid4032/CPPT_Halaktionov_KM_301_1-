package lab6;

/**
 * Клас, що представляє деталь на конвеєрі
 */
class Part implements Comparable<Part> {
    private String code;
    private int priority;

    /**
     * Конструктор класу Part
     * @param code код деталі
     * @param priority пріоритет деталі
     */
    public Part(String code, int priority) {
        this.code = code;
        this.priority = priority;
    }

    /**
     * Отримати код деталі
     * @return код деталі
     */
    public String getCode() {
        return code;
    }

    /**
     * Отримати пріоритет деталі
     * @return пріоритет деталі
     */
    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Part other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Part{code='" + code + "', priority=" + priority + "}";
    }
}
