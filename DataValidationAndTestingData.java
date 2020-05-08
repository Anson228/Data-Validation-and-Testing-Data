
package data.validation.and.testing.data;
import java.util.Scanner;
public class DataValidationAndTestingData {
    
    public static int morethan6(String str){
        int n1 = str.length();
        if (n1 <= 6 ){
            System.out.println("There is an error. Please enter again.");
        }
        else{
             System.out.println("Congratulations.You can enter the next step.");
        }
        return n1;
    }
    
    public static int lowercase(String str1){
        int low = str1.indexOf("a");
        if (low < 0 ){
            System.out.println("There is an error. Please enter again.");
        }
        else{
             System.out.println("Congratulations.You can enter the next step.");
        }
        return low;
    }
    
    public static boolean withoutz(String str){
        int chars = str.length();
        String str2 = str.toUpperCase();
        int find = str2.indexOf("Z");
        boolean vaild = false;
        if (chars >= 5 && chars <= 15){
            if (find >= 0){
                System.out.println("There is an error. Please enter again.");
            }
            else{
                vaild = true;
                System.out.println("Congratulations.You can enter the next step.");
            }
        }
        else{
            System.out.println("There is an error. Please enter again.");
        }
        return vaild;
    }
    
    public static boolean int5to500(String str){
        int value = 0;
        try{
                value = Integer.parseInt(str);
                if (value >= 5 && value <=500){
                    System.out.println("Congratulations.You can enter the next step.");
                    return false;
                }
                else{
                    System.out.println("There is an error. Please enter again.");
                    return true;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Sorry,that is not vaild input");
                System.out.println("Please enter again");
                return true;
            }
        
    }
    
    public static boolean negative(String str){
        int value = 0;
        try{
                value = Integer.parseInt(str);
                if (value < 0){
                    System.out.println("Congratulations.You can enter the next step.");
                    return true;
                }
                else{
                    System.out.println("There is an error. Please enter again.");
                    return false;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Sorry,that is not vaild input");
                System.out.println("Please enter again");
                return false;
            }
    }
    
    public static boolean positiveandodd(String str){
        int value = 0,value1;
        try{
                value = Integer.parseInt(str);
                value = value / 2;
                value1 = Math.round(value);
                value = value - value1;
                if (value == 0){
                    System.out.println("Congratulations.You can enter the next step.");
                    return false;
                }
                else{
                    System.out.println("There is an error. Please enter again.");
                    return true;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Sorry,that is not vaild input");
                System.out.println("Please enter again");
                return true;
            }
    }
    
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        String[] str = new String[3];
        int n1 = 0,low = -1;
        boolean vaild = false;
        
        System.out.println("please enter a string that is greater than 6 characters long.");
        while (n1 <= 6){
        str[0] = keyInput.nextLine();
        n1 = morethan6(str[0]);
        }
        System.out.println("Please enter a string that contains at least one lowercase “a”.");
        while(low < 0){
        str[1] = keyInput.nextLine();
        low = lowercase(str[1]);
    }
        System.out.println("Please enter a string that is between 5 and 15 characters long, and does not contain the letter “z”.");
        do{
            str[2] = keyInput.nextLine();
            vaild = withoutz(str[2]);
        }while(vaild == false);
        
        System.out.println("Please enter an integer between 5 and 500.");
        while(vaild == true){
            str[0] = keyInput.nextLine();
            vaild = int5to500(str[0]);
        }
        System.out.println("Please enter a negative integer.");
        while (vaild == false){
            str[0] = keyInput.nextLine();
            vaild = negative(str[0]);
        }
        System.out.println("Please enter a positive, odd integer.");
        while(vaild == true){
            str[0] = keyInput.nextLine();
            vaild = positiveandodd(str[0]);
        }
    }
    
}
