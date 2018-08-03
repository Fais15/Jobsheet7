
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
            
            System.out.println("\nNested IF");
            if(a<7) {
                System.out.println("nilai a kurang dari 7");
                if(a>2)
                    System.out.println("nialia a lebih dari 2");
                if(a<4)
                    System.out.println("nilai a kurang dari 4");    
            }
            
            System.out.println("\nSWITCH..CASE");
            switch(a) {
                case 1: System.out.println("nilai a => 1"); break;
                case 2: System.out.println("nilai a => 2"); break;
                case 3:
                case 4: System.out.println("nilai a => 3 atau 4"); break;
                case 5: System.out.println("nilai a => 5"); break;
                default: System.out.println("nilai a bukan antara 1-5");
            }
            
            int nilai;
            System.out.print("\nNilai Anda ? ");
            nilai = scanner.nextInt();
            
            String grade = (nilai<75) ? "belumm kompeten" : "kompeten";
            System.out.println(nilai +  " => " + grade);
            }
        
        
                
                
        
        
        
    }
    
}
