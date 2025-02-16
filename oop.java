import java.util.*;

public class oop{
    public static void main(String[] args){
                
        Scanner userInput = new Scanner(System.in);
        student student = new student();

        System.out.println("enter student name and id: ");
        String studName = userInput.next();
        int studId = userInput.nextInt();
        
        student.setName(studName);
        student.setId(studId);
    }

    static class student{
        private String name;
        private int id;

        public String getName(){
            return name;
        }

        public void setName(String name){
            if(name != null && !name.trim().isEmpty()){
                this.name = name;
                System.out.println(name);
            }
            else{
                System.out.println("invalid name/ string");
            }
        }

        public int getId(){
            return id;
        }
        public void setId(int id){
            if(id>0 ){
                this.id = id;
                System.out.println(id);
            }
            else{
                System.out.println("invalid id");
            }
        }
        
    }
}