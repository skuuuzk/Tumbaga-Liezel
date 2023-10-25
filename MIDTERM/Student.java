import java.util.Scanner;

public class Student{
   
   private String firstName;
   private String middleName;
   private String lastName;
   private String suffix;
   
   public Student(String firstName, String middleName, String lastName, String suffix){
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.suffix = suffix;
   }

   public String getFirstName(){
      return firstName;
   }
   
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   
   public String getMiddleName(){
      return middleName;
   }
   
   public void setMiddleName(String middleName){
      this.middleName = middleName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public void setSuffix(String suffix){
      this.suffix = suffix;
   }
   
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("First Name: ");
      String firstName = scan.nextLine();
      
      System.out.print("Middle Name: ");
      String middleName = scan.nextLine();
      
      System.out.print("Last Name: ");
      String lastName = scan.nextLine();
      
      System.out.print("Suffix: ");
      String suffix = scan.nextLine();
      
      Student student = new Student(firstName, middleName, lastName, suffix);

   }
}
