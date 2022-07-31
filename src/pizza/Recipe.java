/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vasilika
 */
public class Recipe {
    ArrayList<String> recipe;
    ArrayList<String> amount=new ArrayList<>();
   
   
    
    

    public Recipe() {
        this.recipe = new ArrayList<>();
        this.amount.add("1");
    }
    public void setRecipe(String ingredient)
    {
      this.recipe.add(ingredient);
    }
     public void setAmount(String amount)
    {
      this.amount.add(amount);
    }
    public String getRecipe(int l)
    {
        return this.recipe.get(l);
    }
    public String getAmount(int l)
    {  
         return this.amount.get(l);
     
    }
    public void printAmount(String ingredient)
    {Scanner input=new Scanner(System.in);
    String choice;
    if(!ingredient.equals("no red sauce")&&!ingredient.equals("ham chunks"))
    System.out.println("Please choose one amount:");
     
    
        if (ingredient.equals("red sauce")||ingredient.equals("tofu")|| ingredient.equals("pizza cheese")) 
        { System.out.println("a. 1/4 cup           b.1/2 cup");
         System.out.print("Enter choice: ");
        choice=input.next();
        this.setAmount("1/"+4/((choice.charAt(0)+3)%10+1) + "cup");
        }
        else
            if (ingredient.equals("diced onion")||ingredient.equals("diced green pepper")|| ingredient.equals("sliced mushroom") || ingredient.equals("diced jalapenos"))
            {    System.out.println("a. 1/8 cup           b.1/4 cup");
             System.out.print("Enter choice: ");
            choice=input.next();
            this.setAmount("1/"+8/((choice.charAt(0)+3)%10+1) + "cup");
            
            }else 
               if (ingredient.equals("pepperoni")||ingredient.equals("pinepple chunks"))
        {     System.out.println("a. 2 pieces           b.3 pieces        c. 4 pieces");
         System.out.print("Enter choice: ");
        choice=input.next();
        this.setAmount(((choice.charAt(0)+3)%10)+2 + "pieces"); 
    }
               else if (ingredient.equals("sardines"))
{System.out.println("a. 1 Sardine           b. 2 Sardines     c. 3 Sardines    d.4 Sardines");
 System.out.print("Enter choice: ");
        choice=input.next();
        this.setAmount(((choice.charAt(0)+3)%10)+1 + "Sardines"); }
else if(ingredient.equals("ham chunks"))
{
       this.setAmount("4");
}
else if(ingredient.equals("dry red pepper"))
        {
            System.out.println("a. generous sprinkle           b. 2     c. 3    d.4 ");
             System.out.print("Enter choice: ");
        choice=input.next();
        if(((choice.charAt(0)+3)%10)==0)
        this.setAmount( "generous sprinkle");
        else
        this.setAmount(((choice.charAt(0)+3)%10)+2 + "generous sprinkle"); 
        }
    else if(ingredient.equals("dry basil"))
        {
            System.out.println("a. generous sprinkle           b. 2  ");
             System.out.print("Enter choice: ");
        choice=input.next();
        if(((choice.charAt(0)+3)%10)==0)
        this.setAmount( "generous sprinkle");
        else
        this.setAmount( "1 generous sprinkle"); 
        }
    else
        this.setAmount( "-"); }
    public void printRecipe()
    {
       
         char bullet='a';
         for(int i=0;i<this.recipe.size();i++)
         {System.out.println(String.format(bullet+"."+"%-20s %s" , this.recipe.get(i), this.amount.get(i) ));
         bullet++;
         }
         
     
                  
        }
    }

