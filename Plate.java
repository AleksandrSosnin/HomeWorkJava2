class Plate {
        private int food;
    
        // Конструктор для создания объекта Тарелка с начальным количеством еды
        public Plate(int food) {
            this.food = food;
        }
    
        // Метод для уменьшения количества еды в тарелке
        public boolean decreaseFood(int amount) {
            if (amount <= food) {
                food -= amount;
                return true;
            } else {
                return false;
            }
        }
    
        // Метод для добавления еды в тарелку
        public void addFood(int amount) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды в тарелку. Теперь в тарелке: " + food);
        }
    
        // Метод для вывода информации о тарелке
        public void info() {
            System.out.println("В тарелке: " + food + " еды.");
        }
    }

