from Cat import Cat


class ExperimentalCat(Cat):
    """
    Клас ExperimentalCat розширює функціональність базового класу Cat,
    додаючи можливість проведення експериментів та відстеження їх кількості.
    """

    def __init__(self, name, weight, age, max_experiments):
        """
        Ініціалізує об'єкт піддослідного кота.

        :param name: Ім'я кота
        :param weight: Вага кота в кілограмах
        :param age: Вік кота в роках
        :param max_experiments: Максимальна кількість експериментів
        """
        super().__init__(name, weight, age)
        self.max_experiments = max_experiments
        self.experiments_conducted = 0
        self.needs_rest = False

    def conduct_experiment(self):
        """
        Проводить експеримент з котом, враховуючи його стан та обмеження.

        :return: True, якщо експеримент проведено успішно, False - якщо експеримент неможливий
        """
        if self.needs_rest:
            print(f"Кіт {self.name} потребує відпочинку перед наступним експериментом")
            return False

        if self.experiments_conducted >= self.max_experiments:
            print(f"Досягнуто максимальну кількість експериментів для кота {self.name}")
            return False

        if self.energy_level < 30:
            print(f"У кота {self.name} замало енергії для експерименту")
            return False

        self.energy_level -= 30
        self.experiments_conducted += 1
        self.is_hungry = True

        # Кожні 2 експерименти коту потрібен відпочинок
        if self.experiments_conducted % 2 == 0:
            self.needs_rest = True

        print(f"Проведено експеримент з котом {self.name}")
        return True

    def rest(self):
        """
        Дає коту відпочити, знімаючи потребу у відпочинку.
        """
        super().rest()
        self.needs_rest = False

    def get_status(self):
        """
        Отримує розширений статус піддослідного кота.

        :return: Рядок із детальною інформацією про стан кота
        """
        basic_status = super().get_status()
        rest_status = "потребує відпочинку" if self.needs_rest else "готовий до експерименту"
        return f"{basic_status}, експериментів: {self.experiments_conducted}/{self.max_experiments}, стан: {rest_status}"
