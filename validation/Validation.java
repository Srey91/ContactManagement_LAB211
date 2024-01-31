/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author 84898
 */
public class Validation {
    public String getString (String string)
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter " + string  + ": ");
       
       while (true)
       {
            String result = sc. nextLine();
           
           if (result.isEmpty())
           {
               System.out.println(string + " can't empty!!!");
               System.out.println("Enter " + string + " again: ");
           }else 
               return result;
       }
   }
    
    public int getAnyInteger (String string)
   {
       while (true)
       {
           try 
           {
                int number  = Integer.parseInt(getString(string)); 
                return number;
                
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
    
    public int getInteger (String string)
   {
       while (true)
       {
           try 
           {
                int number  = Integer.parseInt(getString(string)); 
                return number;
                
           }catch (NumberFormatException e)
           {
               System.out.println("ID is digit!!!");
           }
       }
   }
    

    public String getPhone() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Please input Phone flow");
            System.out.println(". 1234567890");
            System.out.println(". 123-456-7890 ");
            System.out.println(". 123-456-7890 x1234");
            System.out.println(". 123-456-7890 ext1234");
            System.out.println(". (123)-456-7890");
            System.out.println(". 123.456.7890");
            System.out.println(". 123.456.7890");
            System.out.print("Enter Phone: ");      
            String phone = sc.nextLine();

            Pattern p = Pattern.compile("[0-9]{10}");
            Pattern p1 = Pattern.compile("([0-9]{3})-[0-9]{3}-[0-9]{4}");
            Pattern p2 = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}");
            Pattern p3 = Pattern.compile("([0-9]{3})-[0-9]{3}-[0-9]{4}");
            Pattern p4 = Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{4}");
            Pattern p5 = Pattern.compile("([0-9]{3}) [0-9]{3} [0-9]{4}");
            
            if (p.matcher(phone).find() || p1.matcher(phone).find() || p2.matcher(phone).find() || p3.matcher(phone).find() || 
                    p4.matcher(phone).find() || p5.matcher(phone).find()) 
            {
                return phone;
            } else 
            {
                System.out.println("Phone invalid!!!");
            }
        }
    }

}
