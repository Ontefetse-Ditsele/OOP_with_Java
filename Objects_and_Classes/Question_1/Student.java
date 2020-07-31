/*Ontefetse Ditsele
 *
 *09 July 2020
*/
class Student{

   private String firstName;
   private String middleName;
   private String lastName;
   
   public void setNames(String first,String middle,String last){
      firstName  = first;
      middleName = middle;
      lastName   = last;
   }
   
   public String getFullName(){
      String fullName = firstName+" "+ middleName.charAt(0) +". " + lastName;  
      return fullName;
   }
}