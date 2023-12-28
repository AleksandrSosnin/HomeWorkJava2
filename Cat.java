class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }


    public boolean isSatiety() {
        return satiety;
    }


    public String getName() {
        return name;
    }


    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не поел. В тарелке недостаточно еды.");
        }
    }
}