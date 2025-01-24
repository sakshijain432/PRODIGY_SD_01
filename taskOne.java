import java.util.*;

public class taskOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temp value");
        double temp = sc.nextDouble();

        System.out.println("Select input unit ");
        System.out.println("1.Celsius");
        System.out.println("2.Kelvin");
        System.out.println("3.Fahrenheit");
        int Iunit=sc.nextInt();
        

        System.out.println("Select output unit ");
        System.out.println("1.Celsius");
        System.out.println("2.Kelvin");
        System.out.println("3.Fahrenheit");
        int Ounit = sc.nextInt();
        


        double finalTemp =0;

        if(Iunit == 1){
            if(Ounit == 1){
                finalTemp = temp;
            }
            else if(Ounit == 2){
                System.out.println("Celsius to Kelvin");
                finalTemp = temp + 273.15;
            }
            else if(Ounit == 3){
                System.out.println("Celsius to Fahrenheit");
                finalTemp = (temp*9/5)+32;
            }
        }

        else if(Iunit == 2){
            if(Ounit == 1){
                System.out.println("Kelvin to Celsius");
                finalTemp = temp-273.15;
            }
            else if(Ounit == 2){
                System.out.println("Kelvin to Kelvin");
                finalTemp = temp;
            }
            else if(Ounit == 3){
                System.out.println("Kelvin to Fahrenheit");
                finalTemp = ((temp-273.15)*9/5)+32;
            }
        }

        else if(Iunit == 3){
            if(Ounit == 1){
                System.out.println("Fahrenheit to Celsius");
                finalTemp = (temp-32)*5/9;
            }
            else if(Ounit == 2){
                System.out.println("Fahrenheit to Kelvin");
                finalTemp = (temp-32)*5/9 + 273.15;
            }
            else if(Ounit == 3){
                System.out.println("Fahrenheit to Fahrenheit");
                finalTemp = temp;
            }
        }
        else{
            System.out.println("Invalid Input Unit");
            return;
        }
        System.out.println("Converted Temperature is : "+finalTemp);
        
    }
}