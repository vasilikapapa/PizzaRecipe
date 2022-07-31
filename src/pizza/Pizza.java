/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.Scanner;

/**
 *
 * @author Vasilika
 */
public class Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaIngredients pizza=new PizzaIngredients();
        Recipe pizzaRecipe=new Recipe();
        String choice;
        Scanner input=new Scanner(System.in);
        String a="a";
        String b="b";
        // TODO code application logic here
        System.out.println("--------------Welcome----------------");
        System.out.println("---------Create Your Pizza-------------");
        System.out.println("Please choose one crust option:");
        System.out.println("a."+pizza.getCrust(a)+"     "+"b."+pizza.getCrust(b));
        System.out.print("Enter choice: ");
        choice=input.next();
        pizzaRecipe.setRecipe(pizza.getCrust(choice));
        System.out.println("You chose: " + choice + "." + pizza.getCrust(choice)+" 1");
        System.out.println("--------------------------------------------");
         System.out.println("Please choose one sauce option:");
        System.out.println("a."+pizza.getSauce(a)+"     "+"b."+pizza.getSauce(b));
        System.out.print("Enter choice: ");
        choice=input.next();
         pizzaRecipe.printAmount(pizza.getSauce(choice));
          System.out.print("Enter choice: ");
        pizzaRecipe.setRecipe(pizza.getSauce(choice));
        System.out.println("You chose: " + choice + "." + pizza.getSauce(choice));
        System.out.println("--------------------------------------------");
         System.out.println("--------------------------------------------");
         boolean go=true;
          int count=2;
         do{
            
         System.out.println("Please choose one ingredient:");
         pizza.printIngredients();
        System.out.print("Enter choice: ");
        choice=input.next();
         
         pizzaRecipe.printAmount(pizza.getIngredients(choice.charAt(0)));
       
        pizzaRecipe.setRecipe(pizza.getIngredients(choice.charAt(0)));
        System.out.println("You chose: " + choice + "." + pizza.getIngredients(choice.charAt(0))+" "+ pizzaRecipe.getAmount(count));
       System.out.println("Would you like to add another ingredient:");
               System.out.println("a. continue         b.finished");
              System.out.println("Enter choice:");
              choice=input.next();
              if(choice.equals("b"))
                  go=false;  
              count ++;
              System.out.println("--------------------------------------------");
         }while (go);
         System.out.println("--------------------------------------------");
        pizzaRecipe.printRecipe();
        
    }
    
}
