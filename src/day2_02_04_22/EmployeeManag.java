package day2_02_04_22;

public class EmployeeManag {

    String name;
    static String org = "Einfochips";
    String email;
    String mobileNo;
    String designation;

    EmployeeManag(String name, String email)
    {
        this.name = name;
        this.email = email;
        designation = "Project Manager";
        
    }

    EmployeeManag(String name, String email, String mobileNo)
    {
        this.name = name;
        this.email =  email;
        this.mobileNo =  mobileNo;
        designation = "Developer";
    }

    void display()
    {
        System.out.println("Employee name: " + name);
        System.out.println("Organization: " + org);
        System.out.println("Designation: " + designation);
        System.out.println("Email: "+ email);
        
        if(mobileNo != null)
        {
            System.out.println("Mobile: " + mobileNo);
        }
    }
    public static void main(String[] args) {
        EmployeeManag e1 = new EmployeeManag("abc", "abc@gmail.com");
        EmployeeManag e2 = new EmployeeManag("abc", "abc@gmail.com", "88888888");

        
        e1.display();
        
        System.out.println();

        e2.display();
        System.out.println();
    }   
}

