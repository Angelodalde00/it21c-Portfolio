

package Polymorphism;



public class Polymorphism_Science extends Polymorphism_Subjects {
    Polymorphism_Science(String name){
        super(name);
    }
    //Local ni
    void singit(){
        System.out.println(name + "Wanito");
        
    }
    //yeah
    public void SubjectsLearning(){
        System.out.println("Naka sab an" + name);
    }
}
