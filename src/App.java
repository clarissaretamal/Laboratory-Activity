public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */

     //approaching overloading
    //method for Overloading
    //addition of 2 numbers
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    //addition of 3 numbers
    private static int computeSum(int num1, int num2,int num3){
        return num1 + num2 + num3;
    }
    
     /**
     * 
     * Create method that returns the greater integer value
     */
    private static int greaterValue(int num1, int num2){
    
        if(num1>num2){
         return  num1;
        }
        else{
        return   num2;
        }
     }
 
     /**
      * 
      * Create method that returns the greater double value
      */
     private static double greaterValue(double num1, double num2){
        if(num1>num2){
            return  num1;
           }
           else{
           return   num2;
           }
     }
    
 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        

        System.out.println("*******************************************************");
        System.out.println("The sum of "+8+" and "+5+ " = " + App.sum2(8, 5));
        System.out.println("The sum of "+10+","+20+" and "+50+ " = " + App.sum3(10, 20,50));
        System.out.println("*******************************************************");

        //Using Overloading
        System.out.println("Computing two numbers 10 and 20 = " + App.computeSum(10, 20));
        System.out.println("Computing three numbers 10 and 20 and 30 = " + App.computeSum(10, 20, 30));


        System.out.println("*******************************************************");

        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));
        System.out.println("*******************************************************");

    }
}