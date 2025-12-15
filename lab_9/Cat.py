class Cat:
    """
    Клас Cat представляє звичайного кота з базовими характеристиками та функціями.
    """

    def __init__(self, name, weight, age):
        """
        Ініціалізує об'єкт кота.

        :param name: Ім'я кота
        :param weight: Вага кота в кілограмах
        :param age: Вік кота в роках
        """
        self.name = name
        self.weight = weight
        self.age = age
        self.energy_level = 100  # максимальний рівень енергії
        self.is_hungry = False

    def feed(self):
        """
        Годує кота, відновлюючи його енергію.
        """
        self.is_hungry = False
        self.energy_level = min(100, self.energy_level + 30)
        print(f"Кіт {self.name} поїв і став більш енергійним")

    def rest(self):
        """
        Дає коту відпочити, відновлюючи його енергію.
        """
        self.energy_level = min(100, self.energy_level + 50)
        print(f"Кіт {self.name} відпочив і відновив сили")

    def get_status(self):
        """
        Отримує поточний стан кота.

        :return: Рядок із інформацією про стан кота
        """
        hunger_status = "голодний" if self.is_hungry else "ситий"
        return f"Кіт {self.name}: {hunger_status}, енергія: {self.energy_level}/100"
