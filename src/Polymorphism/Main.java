
package Polymorphism;


public class Main {
    
        public static void main(String[] args){
            Polymorphism_Subjects my_subjects = new Polymorphism_Subjects (" jungkuk");
            Polymorphism_Science my_science = new Polymorphism_Science ("lester pangit");
             Polymorphism_Filipino my_filipino = new Polymorphism_Filipino ("Wows");
             
             //jkjjk
             my_subjects.nagyawyaw();
             my_science.singit();
             my_filipino.kasaba();
             
             System.out.println("-------------------------");
             my_subjects.nagsabasaba();
             my_science.SubjectsLearning();
             my_filipino.SubjectsLearning();
        }
        
        
        
    }

