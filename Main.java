public class Main {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 7),
                new Cat("Васька", 10)
        };


        Plate plate = new Plate(15);


        plate.info();


        for (Cat cat : cats) {
            cat.eat(plate);
        }


        for (Cat cat : cats) {
            System.out.println(cat.isSatiety() ? cat.getName() + " сыт." : cat.getName() + " голоден.");
        }
    }
}