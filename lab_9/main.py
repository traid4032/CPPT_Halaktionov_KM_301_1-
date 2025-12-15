from ExperimentalCat import ExperimentalCat

if __name__ == "__main__":
    # Створюємо піддослідного кота
    test_cat = ExperimentalCat("Мурзик", 4.5, 3, 5)

    # Виводимо початковий стан
    print("\n1. Початковий стан:")
    print(test_cat.get_status())

    # Годуємо кота
    print("\n2. Годування кота:")
    test_cat.feed()
    print(test_cat.get_status())

    # Проводимо перший експеримент
    print("\n3. Перший експеримент:")
    test_cat.conduct_experiment()
    print(test_cat.get_status())

    # Кіт відпочиває
    print("\n4. Відпочинок:")
    test_cat.rest()
    print(test_cat.get_status())

    # Проводимо ще два експерименти
    print("\n5. Ще два експерименти підряд:")
    test_cat.conduct_experiment()
    test_cat.rest()
    test_cat.conduct_experiment()
    print(test_cat.get_status())

    # Спроба експерименту без відпочинку
    print("\n6. Спроба експерименту без відпочинку:")
    test_cat.conduct_experiment()

    # Даємо коту відпочити
    print("\n7. Тривалий відпочинок:")
    test_cat.rest()
    print(test_cat.get_status())

    # Годуємо кота знову
    print("\n8. Повторне годування:")
    test_cat.feed()
    print(test_cat.get_status())

    # Проводимо останні експерименти
    print("\n9. Останні експерименти:")
    test_cat.conduct_experiment()
    test_cat.rest()
    test_cat.conduct_experiment()
    print(test_cat.get_status())

    # Спроба провести експеримент після досягнення ліміту
    print("\n10. Спроба експерименту після досягнення ліміту:")
    test_cat.conduct_experiment()

    # Перевіряємо фінальний стан
    print("\n11. Фінальний стан кота:")
    print(test_cat.get_status())

    # Виводимо всі атрибути об'єкта
    print("\n12. Всі атрибути кота:")
    print(f"Ім'я: {test_cat.name}")
    print(f"Вага: {test_cat.weight} кг")
    print(f"Вік: {test_cat.age} років")
    print(f"Рівень енергії: {test_cat.energy_level}/100")
    print(f"Максимум експериментів: {test_cat.max_experiments}")
    print(f"Проведено експериментів: {test_cat.experiments_conducted}")
    print(f"Потребує відпочинку: {test_cat.needs_rest}")
    print(f"Голодний: {test_cat.is_hungry}")
