public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bult";
        dog.animal = "Pet";
        dog.brain = "clever";
        dog.agress = "agressive";
        Dog.Agressive();


        System.out.println(dog.name + "\n" + dog.animal + "\n" + dog.brain + "\n" + dog.agress + "\n");

        Cat cat = new Cat();
        cat.name = "Pupsic";
        cat.animal = "Good";
        cat.brain = "mean";
        cat.agress = "dangerous";
        Cat.Running();
        System.out.println(cat.name+"\n"+cat.animal+"\n"+cat.brain+"\n"+cat.agress+"\n");


        Auto auto = new Auto();
        auto.marka = "Mersedes S-class";
        auto.salon = "classic";
        auto.agress = "Bomb";
        auto.color = "Wite";
        Auto.Fastest();

        System.out.println(auto.marka+"\n"+auto.salon+"\n"+auto.agress+auto.color);
    }
}