package com.mycompany.json_action_demo;

import java.util.Scanner;
import org.json.JSONObject; //JSON dependency has to be in the pom.xml file

public class JSON_Action_Demo {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    //create a Json object from the JSONObject class dependency
    JSONObject person = new JSONObject();
    
        System.out.println("====User Registration System====");
    //Validate name
    String name;
    while(true){
    
        System.out.println("Enter name: ");
        name = scanner.nextLine().trim();
        if(!name.isEmpty())
        {
        break;}
        
        System.out.println("Name cannot be empty.");
    }
    
    //Validate Age
    int age;
    while(true){
            System.out.println("Enter age: ");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                if (age > 0 && age < 99)
                {
                    scanner.nextLine();
                    break;
                }else {
                    System.out.println("Age must be between 1 & 98");
                }
            }else
                {
                        System.out.println("Please enter a valid number");
                        scanner.nextLine();
                        }                
            }
    //validate the email
    String email;
    while (true)
    {
        System.out.println("Enter email:");
        email = scanner.nextLine().trim();
        if(email.contains("@") && email.contains("."))
        {
            break;
        }
        System.out.println("Invalid email format");
    }
    //Dynamic input
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        System.out.println("Enter occupation: ");
        String occupation = scanner.nextLine();
   
        //Build JSON object

    person.put("name", name);
    person.put("age", age);
    person.put("email", email);
    person.put("city", city);
    person.put("occupation", occupation);
    
    //Print JSON object
        System.out.println("\nGenerated JSON Object: ");
        System.out.println(person.toString(4));
    
        scanner.close();
    }
    
    
            
}
