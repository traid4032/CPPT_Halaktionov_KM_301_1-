package lab6;

/**
 * Клас, що представляє продукт на конвеєрі
 */
class Product implements Comparable<Product> {
    private String name;
    private double weight;

    /**
     * Конструктор класу Product
     * @param name назва продукту
     * @param weight вага продукту
     */
    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Отримати назву продукту
     * @return назва продукту
     */
    public String getName() {
        return name;
    }

    /**
     * Отримати вагу продукту
     * @return вага продукту
     */
    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', weight=" + weight + "}";
    }
}
