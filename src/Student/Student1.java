package Student;


import Student.Student;

public class Student1 {
    
    public static void main(String[]args) {
        Student student = new Student();
        
        student.name = "Lester Angelo O. Dalde";
        student.section = student.setSection();
        student.motto = student.getMotto();
        
        System.out.println(student.name);
        System.out.println(student.section);
        System.out.println(student.motto);
        
        
    }
}