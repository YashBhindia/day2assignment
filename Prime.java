class Prime{
 
    public static void main(String[] args){
 
       int a = 12;
     
       if(a>=2 && a<=100)
       {
           for(int i=1; i<=a; i++)
           {
              if(a%i==0)
              {
                 System.out.println(i);
              }
           }
       }
       else
       {
          System.out.println("Invalid number");
       }
   } 

}