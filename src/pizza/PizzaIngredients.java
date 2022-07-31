/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Vasilika
 */
public final class PizzaIngredients {
    private String [] crust;
    private String [] sauce;
    private String [] ingredients;
    
    
   public PizzaIngredients(){
   this.setCrust();
   this.setSauce();
   this.setIngredients();
   
   }
   public void setCrust()
   {
      this.crust=new String[]{"crust","gluten-free"}; 
      
   }
    public void setSauce()
   {
      this.sauce=new String[]{"red sauce","no red sauce"}; 
      
   }
     public void setIngredients()
   {
      this.ingredients=new String[]{"diced onion","diced jalapenos","diced green pepper","slioced mushroom","sardines","pinepple chunks","tofu","ham chunks","dry red pepper","dry basil"}; 
      
      
   }
     public String getCrust(String a)
     {  if (a.equals("a"))
         return this.crust[0];
     else
         return this.crust[1];
     }
     public String getSauce(String a)
     {  if (a.equals("a"))
         return sauce[0];
     else
         return sauce[1];
     }
     public String getIngredients(char a)
     {
         int n=((int)a+3)%10;
         return this.ingredients[n];
         
     }
     public void printIngredients()
     { char bullet='a';
         for(String element : this.ingredients)
         {System.out.print(String.format("%-25s" , bullet+"."+ element ));
         bullet++;
         if((((bullet+3)%10)%3)==0)
             System.out.println();
         }
         System.out.println();
         
     }
}
