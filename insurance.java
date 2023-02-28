import java.util.Scanner;

public class insurance{
    public static void main(String[] args) {
        insurance ob = new insurance();
        ob.loop();
    }
void loop (){
   Scanner ob = new Scanner (System.in);
   System.out.println("Enter your name");
   String name = ob.nextLine();
   System.out.println("Enter your married status");
   char mstatus = ob.next().charAt(0);
   if (mstatus=='m'||mstatus=='M'){
    System.out.println(name+" your eligiable for insurance");
   }
   else if(mstatus=='u'||mstatus=='U'){
    System.out.println(name+" Enter your gender");
    char gender =ob.next().charAt(0);
    System.out.println(name+" Enter your age");
    int age = ob.nextInt();
        if (gender=='m'||gender=='M'){
            if (age>=21 && age<=100){
                System.out.println("your eligiable");
            }
            else{
                System.out.println("your not elidiable");
            }

        }
        else if (gender=='f'||gender=='F'){
            if (age>=18 && age<=100){
                System.out.println("your eligiable");
            }
            else{
                System.out.println("your not eligiable");
            }

        }
        else {
            System.out.println("Enter the correct value");
        }
   }
   else {
    System.out.println("please Enter the correct value");
   } 




}

}
