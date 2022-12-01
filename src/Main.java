public class Main {
    public static void main(String[] args) {
        dogs();
        cats();
        auto();
    }
        public static void dogs() {
            Dog dog = new Dog();
            dog.name = "Bult";
            dog.animal = "Pet";
            dog.brain = "clever";
            dog.agress = "agressive";
            Dog.Agressive();
            System.out.println(dog.name + "\n" + dog.animal + "\n" + dog.brain + "\n" + dog.agress + "\n");
        }
        public static void cats() {
            Cat cat = new Cat();
            cat.name = "Pupsic";
            cat.animal = "Good";
            cat.brain = "mean";
            cat.agress = "dangerous";
            Cat.Running();
            System.out.println(cat.name + "\n" + cat.animal + "\n" + cat.brain + "\n" + cat.agress + "\n");
        }
        public static void auto(){
        Auto auto = new Auto();
        auto.marka = "Mersedes S-class";
        auto.salon = "classic";
        auto.agress = "Bomb";
        auto.color = "White";
        Auto.Fastest();
        System.out.println(auto.marka+"\n"+auto.salon+"\n"+auto.agress+"\n"+auto.color);
    }
}