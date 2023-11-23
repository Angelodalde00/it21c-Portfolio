
package Polymorphism;


public class Polymorphism_Filipino extends Polymorphism_Subjects {
    Polymorphism_Filipino(String name){
        super(name);
    }
    //Local ni
    void kasaba(){
        System.out.println(name + "Kuyawan");
        
    }
    //yeah
    public void SubjectsLearning(){
        System.out.println("Buotan" + name);
    }
}

