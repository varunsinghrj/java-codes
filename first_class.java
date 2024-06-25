class Animal{
    String sound;
    String eat;

    public String setSound() {
       return sound;
    }
    public String setEat() {
       return eat;
    }
}
class first_class {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.sound = "Barking";
        dog.eat = "Eating";

        System.out.println(dog.setSound());
        System.out.println(dog.setEat());
    }
}
