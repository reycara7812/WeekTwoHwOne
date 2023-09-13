package zooproject;

public class Animal {
    public String animalName;
    public long  population;
    public double animalWeight[];

    public String animalSound;
    //These are the variables or properties for the class

    public Animal(String animalName,long  population,String animalSound,double[] animalWeight){
        this.animalName=animalName;
        this.population=population;
        this.animalSound=animalSound;
        this.animalWeight=animalWeight; //these is a construction sets a of rule or instrctuions on
        // how the object is created if all the info is not there it wont print (parameter)
    }

    public void printAnimalSound(){
        System.out.println("The " + animalName + " makes this sound "+ animalSound);} //method or
    // funtion that can be called at anytime

    public void printAnimalWeight(){
        System.out.println("Theses are the weights for " + animalName );

        for (int i = 0; i < animalWeight.length; i++){ //for loop that makes the array print it selfout the reason that
            //is so
             System.out.println(animalWeight[i]);
         }

    }

    }


