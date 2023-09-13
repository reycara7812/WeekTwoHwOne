package zooproject;

public  class Main {

    public static void main(String[] args) {
        double dogWeight[]={12.22,12.3,123,90};
        double catWeight[]={12,12.3,123,90};
        double humanWeight[]={12,12.3,123,100};
        Animal dog = new Animal("Dog",300,"Woof woof",dogWeight);
        Animal human = new Animal("Human",700000000,"Hello",catWeight)  ;
        Animal cat = new Animal("cat",400,"meow meow",humanWeight);

        dog.printAnimalSound();
        dog.printAnimalWeight();
        human.printAnimalSound();
        human.printAnimalWeight();
        cat.printAnimalSound();
        cat.printAnimalWeight();


    };
}
