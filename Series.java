import java.io.*;
 

     
   
    static double Series(int n)
    {
      double i, s = 0.0;
      for (i = 1; i <= n; i++)
          s = s + 1/i;
      return s;
    }
  
    
    
    public static void main(String args[])
    {
     int n = Integer.parseInt(System.getenv("val"));
        int n = 5;
        System.out.printf("Sum is %f", sum(n));
         
    }
}
