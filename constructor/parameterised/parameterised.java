public class parameterised
 {
 String empName; // contains employee name
 int empId; // stores employee id
 
 parameterised(String name, int id)//  two parameters
 {
     empName = name;// initializing
     empId = id;
 }
 void printInfo()
 {
     System.out.println("Employee name is: " + empName + ", and id is: " + empId);
 }
 public static void main(String argvs[])
 {  
     parameterised e1 = new parameterised("Ajay", 12345);
     parameterised e2 = new parameterised("Amar", 26789);
     e1.printInfo();
     e2.printInfo();
 }
 }
