package lab6;

/**
 * Клас для тестування конвеєра
 */
public class ConveyorDriver {
    /**
     * Головний метод програми
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Тестування з продуктами
        Conveyor<Product> productConveyor = new Conveyor<>(5);

        try {
            // Додавання продуктів
            productConveyor.add(new Product("Apple", 0.2));
            productConveyor.add(new Product("Banana", 0.3));
            productConveyor.add(new Product("Orange", 0.15));

            System.out.println("Продуктовий конвеєр: " + productConveyor);
            System.out.println("Мінімальна вага продукту: " + productConveyor.findMin());

            // Видалення продукту
            Product removedProduct = productConveyor.remove();
            System.out.println("Видалений товар: " + removedProduct);
            System.out.println("Оновлений товарний конвеєр: " + productConveyor);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Тестування з деталями
        Conveyor<Part> partConveyor = new Conveyor<>(3);

        try {
            // Додавання деталей
            partConveyor.add(new Part("A123", 3));
            partConveyor.add(new Part("B456", 1));
            partConveyor.add(new Part("C789", 2));

            System.out.println("Конвеєр деталей: " + partConveyor);
            System.out.println("Частина мінімального пріоритету: " + partConveyor.findMin());

            // Спроба додати елемент у повний конвеєр
            partConveyor.add(new Part("D012", 4));
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
