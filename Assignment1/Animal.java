public class Animal {
    void makeSound()
    {
        System.out.print("hi");

    }
    
}
class Dog extends Animal{
    void makeSound()
    {
        System.out.print("hi");
    }

}
class Cat extends Animal{
    void makeSound()
    {
        System.out.print("hi");
    }
}
class Main{
    public static void main(String args[])
    {
        Dog dog=new Dog();
        Cat cat=new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}