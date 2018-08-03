
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
            
            System.out.println("\nIf..ELSE..");
            if(a < 5){
                System.out.println("isi variable a: "+ a);
                System.out.println("nilai a kurang dari 5");
            } else System.out.println("nilai a lebih atau sama dengan 5");
            
            System.out.println("\nIF..ELSE IF..ELSE>> 1");
            if(a<5) {
                System.out.println("nilai a kurang dari 5");
            } else if(a == 5) {
                System.out.println("nilai a sama dengan 5");
            } else
                System.out.println("nilai a lebih dari 5");
            
            System.out.println("\nIF..ELSE IF..ELSE.. 2");
            if(a<2) {
                System.out.println("nilaia kurang dari 2");   
            } else if(a<4) {
                System.out.println("nilai a kurang dari 4");
            } else if(a<6) {
                System.out.println("nilai a kurang dari 6");
            } else if(a == 6) {
                System.out.println("nilai a sama dengan 6");
            } else {
                System.out.println("nilai a lebih dari 6");
            }
            
            
            
        }
                
                
        
        
        
    }
    
}
