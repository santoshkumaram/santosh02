package OopsConcept;

class Employee {
    private String name;
    private int age;
    private int Roll;
    private String Design;
  
    public String getName() 
    { return name; }
  
    public void setName(String name) 
    { this.name = name; }
  
    public int getAge() 
    { return age; }
  
    public void setAge(int age) 
    { this.age = age; }
    
    public int getRoll() 
    { return Roll; }
  
    public void setRoll(int Roll)
    { this.Roll =Roll; }
    
    public String getDesign() 
    { return Design; }
    
    public void setDesign(String Design)
    { this.Design = Design; }
    
  }
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee EMP = new Employee();
	        EMP.setName("Santosh");
	        EMP.setAge(30);
	        EMP.setRoll(28);
	        EMP.setDesign("Tester");
	        
	        System.out.println("EMPLOYEE NAME IS: " + EMP.getName());
	        System.out.println("EMPLOYEE AGE IS: " + EMP.getAge());
	        System.out.println("EMPLOYEE ROLL NO IS: " + EMP.getRoll());
	        System.out.println("EMPLOYEE DESIGN IS: " + EMP.getDesign());

	    
	        
	        }



}
