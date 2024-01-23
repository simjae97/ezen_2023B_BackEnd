package day15.step3;

public class Step3 {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.sound(); // 멍멍

        Cat cat = new Cat();
        cat.sound(); //야옹

        Animal dog1 = new Dog();
        animalSound(dog1);

        animalSound(new Cat());
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }
}