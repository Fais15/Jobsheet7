
package jobsheet7;

public class Jobsheet7 {

    public static void main(String[] args) {
        String identitas = "M Azhar Reza Faishal, XR5, 20";
        System.out.println("identitas:"+identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a= scanner.nextInt();
        
        System.out.println("\nIF.. l");
        if(a < 5) System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIf.. 2");
        if(a == 5) System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIf.. 3");
        if(a > 5) {
            System.out.println("isi variable a :"+ a);
            System.out.println("nilai a lebih dari 5");
            
            
        }
                
                
        
        
        
    }
    
}
