package week3;

import java.lang.reflect.Array;
import javax.naming.Name;

public class Week3_4coding {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
   

// 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
   
   //a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
   
   int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};{ 
    }; System.out.println(ages[ages.length-1] - ages[0]);
    
  //b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
    
    int[] newAges = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 40};{ 
    }; System.out.println(newAges[newAges.length-1] - ages[0]);
   
            
//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	
     int sum = 0;
     
     for (int number : newAges) {
         sum += number;
     int average = sum / newAges.length;
     System.out.println("The average age " + average);
         
  }        

//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

	//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	
     String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};{
     }    
       sum = 0;
       for (int i = 0; i < names.length; i++) {
          sum += names[i].length();
       } 
       int  average = sum / names.length;
        System.out.println("The average number of letters per name " + average);
     
      
     //b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	// for (int i = 0; i < names.length; i++) {
       
    String allNames = "";
    for (int i = 0; i < names.length; i++) {
      allNames += names[i] + " ";
  }
  System.out.println("All the names together " + allNames);
 
  
  
//3.	How do you access the last element of any array? 
     // array[array.length - 1] 
     
//4.	How do you access the first element of any array?
     // array[0]
     
     
//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.       
     
		int[] nameLengths = new int[names.length];
				
		for (int i = 0; i < names.length; i++){
		nameLengths[i] = names[i].length();
		}
		
				
//6 	6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
			}
			System.out.println("The sum of all the elements in nameLengths[] = " + sum);
		
		
					
		
			
//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).			

  System.out.println(Concatenate("Hello", 3));

//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

  System.out.println("Return a full name: " + getFullName("Elizabeth", "Taylor"));




//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

  
  if(isGreaterthan(ages))
  {
     System.out.println("Sum is greater than 100");
  }
  else{
     System.out.println("Sum is not greater than 100");
  }
  

//10.	Write a method that takes an array of double and returns the average of all the elements in the array.

  double[] doubleArr = {0.5, 3.0, 335.2114, 1256.1};
 
  System.out.println("calculateAverage() returns => " + calculateAverage(doubleArr));
  

//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

 
  double[] firstarray = new double[]{2.5,8.0,7.3,4,19.2,0.90};
  double avgarr = calculateAverage(firstarray);
  System.out.println("Average of array of double is " + avgarr);
  // check if first array have average greater than second.
   double[] firstarray1 = new double[]{1.0,6.0,2.3,5.0,20.5};
  if(isAvgGreater(firstarray,firstarray1))
  {
     System.out.println("Average of first array is greater than second ");
  }
  else{
     System.out.println("Average of first array is less than second ");
  }
 
 
 

//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

 
  if(willBuyDrink(true,12.00))
  {
     System.out.println("You can buy Drink");
  }
  else{
     System.out.println("You cannot buy Drink!!");
  }
  
  
//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

  
  System.out.println("The smallest number in the newAges Array " + findSmallestNumber(newAges));

  } 			
 // Method for question 7: 

  public static String Concatenate(String word,int n){
      String answer="";
      for(int i=0;i<n;i++)
      {
          answer+=word;
      }
      
      return answer;
  
  
  }

 // Method for question 8 
  
  public static String getFullName(String firstName, String lastName) {
	       return firstName + " " + lastName;
	   }

   	

//Method for question 9
  public static boolean isGreaterthan(int arr[])
  {
      // call calculatesum method to calculate the sum.
      int sum = calculatesum(arr);
      // if greater than 100 return true
      if(sum > 100)
      {
          return true;
      }
      // else return false.
      return false;
  }       
    
 //Method for question 10      
  public static double calculateAverage(double[] array) {
  double sum = 0;
  for (double number : array) {
      sum += number;
 }
  return sum / array.length;
  
  }
 //Method for question 11          
  public static boolean isAvgGreater(double array1[], double array2[]) {
    
    double avg1 = calculateAverage(array1);
    double avg2 = calculateAverage(array2);
    if(avg1>avg2)
    {
        return true;
    }
    return false;
  
  
  
  }
 //Method for question 12
  public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket)
  {
      // if it is hot outside and money in pocket is greater than 10.50 return true.
      if(isHotOutside == true && moneyInPocket > 10.50)
      {
          return true;
      }
      return false;
  
  }
 //Method for question 13
  
  public static int findSmallestNumber(int[] numbers) {
    int smallest = numbers[0];
    for (int number : numbers) {
        if (number < smallest) {
            smallest = number;
        }
    }
    return smallest;
}
  
//method to calculate sum of array elements.
  public static int calculatesum(int arr[])
  {
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
          sum+=arr[i];
      }
      return sum;
  } 
		
  
}
