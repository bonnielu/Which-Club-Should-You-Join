/*File Name: Club_join.java
 * To ask for the student's interests, hobbies, and subjects, using if, else if and else to recommend at least two clubs
 * Author: Bonnie Lu
 * Date: September. 18, 2017
 */

import java.util.Scanner;  
 
class Club_join { 
   
    public static void main(String args[]) 
    { 
     
      Scanner myScanner = new Scanner(System.in); 
      
      int answer1;
      int answer2;
      int answer3;
      int answer4;
      int answer5;
      int option = 0;
      System.out.println ("This program will narrow down two clubs for you. Please enter in the number associated with each answer");
      
      //Question1
      System.out.println ("Are you willing to go through tryouts or a written application and interview process?");
      System.out.println ("(1) Yes. (2) No.");
      answer1 = myScanner.nextInt();
      
      //Question2
      System.out.println ("Do you enjoy working indoors or outdoors?");
      System.out.println ("(1) Indoors. (2) Outdoors.");
      answer2 = myScanner.nextInt();
        
      //Question3
      System.out.println ("Do you enjoy public speaking?");
      System.out.println ("(1) Yes. (2) No.");
      answer3 = myScanner.nextInt();
        
      //Question4
      System.out.println ("Thank you, please indicate what you are comfortable with.");
      System.out.println ("(1) Working individually. (2) Working in a group or in partners.");
      answer4 = myScanner.nextInt();
      
      //Question5
      System.out.println ("Thank you. Next, please indicate your interest");
      System.out.println ("(1) STEM  (2) Literacy, Music and Arts  (3) Business  (4) Sports  (5) Charity");
      answer5 = myScanner.nextInt();
       
      if (answer1 == 1) //Willing to go through interview
      {
        if (answer2 == 1) //Enjoys working indoors
        {
          if (answer3 == 1) //Likes public speaking
          {
            if ((answer4 == 1 || answer4 == 2) && (answer5 == 1)) //Interested in STEM
            {
              System.out.println ("Based off of your results, HOSA and Chemistry Contest Club might be good clubs for you");
            }
            else if ((answer4 == 1 || answer4 == 2) && (answer5 == 2)) //Interested in Literacy, Music, Arts
            {
              System.out.println ("Based off of your results, Law Club and Public Speaking might be good clubs for you");
            }
            else if ((answer4 == 1 || answer4 == 2) && (answer5 == 3)) //Interested in Business
            {
              System.out.println ("Based off of your results, Bayview Investors and Entrepreneurship club might be good clubs for you");
            } 
            else if ((answer4 == 1 || answer4 == 2) && (answer5 == 4)) //Interested in sports
            {
              System.out.println ("Based off of your results, Bayview's swimming and Badminton team might be a good option.");
            }
            else if ((answer4 == 1 || answer4 == 2) && (answer5 == 5)) //Interested in charity clubs
            {
             System.out.println ("Based off of your results, please consider Me to We or A Mile and A Miracle");
            }
            else
           {
             option = 1; //No clubs that match the exact choices
           }
          }
          else //Does not like public speaking
          {
            if ((answer4 == 2 || answer4 ==1) && (answer5 == 1)) //Interested in STEM
            {
             System.out.println ("Based off of your results, please consider Robotics or ComTech");
            }
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 2)) //Interested in Literacy, Music, Arts
            {
              System.out.println ("Based off of your results, Debate and Model UN might be good clubs for you");
            }
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 3)) //Interested in Business
            {
              System.out.println ("Based off of your results, DECA and FBLA might be good clubs for you");
            } 
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 4)) //Interested in sports
            {
              System.out.println ("Based off of your results, Bayview's basketball and volleyball team might be a good option.");
            }
            else if ((answer5 == 2 || answer4 == 1) && (answer5 == 5)) //Interested in charity clubs
            {
              System.out.println ("Based off of your results, AIDE Committee or Red Cross might be a good club for you");
            }
            else
           {
             option = 1; //No clubs that match the exact choices
           }
          }
        }
        else //Prefers working outdoors
        {
         if (answer4 == 1 || answer4 == 2) //Likes to work either individually or in a group
         {
           if (answer5 == 4) //Interested in sports
           {
             System.out.println ("Based off of your results, Bayview's field hockey and track and field team might be a good option.");
           }
           else if (answer5 == 5) //Interested in charity
           {
             System.out.println ("Based off of your results, A Mile A Miracle and Relay for Life may be a good option.");
           }
           else
           {
             option = 1; //No clubs that match the exact choices
           }
         }
        }
      }
      else //Not willing to go through an interview or tryout
      {
        if (answer2 == 1) //Enjoys working indoors
        {
          if (answer3 == 1) //Enjoys public speaking
          {
            if ((answer4 == 1 || answer4 == 2) && (answer5 == 1)) //Interested in STEM
            {
              System.out.println ("Based off of your results, Engineering and ComTech might be good clubs for you");
            }
            else if ((answer4 == 1 || answer4 == 2) && (answer5 == 2)) //Interested in Literacy, Music, Arts
            {
              System.out.println ("Based off of your results, Drama club and School Play might be good clubs for you");
            }
            else if ((answer4 == 1 || answer4 == 2) && (answer5 == 3 || answer5 == 4)) //Interested in Business
            {
              option = 1;
            } 
            else if ((answer4 == 1 || answer4 ==2) && (answer5 == 5)) //Interested in charity clubs
            {
              System.out.println ("Based off of your results, Me to We and Red Cross might be a good option");
            } else
            {
              option = 1;
            }
            
          }
          else //Does not enjoy public speaking   
          {
            if ((answer4 == 2 || answer4 ==1) && (answer5 == 1)) //Interested in STEM
            {
             System.out.println ("Based off of your results, please consider Astronomy club and Computer Club");
            }
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 2)) //Interested in Literacy, Music, Arts
            {
              System.out.println ("Based off of your results, Art Club and K-Pop Dance might be good clubs for you");
            }
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 3)) //Interested in Business
            {
              option = 1;
            } 
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 4)) //Interested in sports
            {
              option = 1;
            }
            else if ((answer4 == 2 || answer4 == 1) && (answer5 == 5)) //Interested in charity clubs
            {
              System.out.println ("Based off of your results, CAP or Free the Children might be a good club for you");
            }
            else
           {
             option = 1; //No clubs that match the exact choices
           }
          }
        }  
        else //Prefers working outdoors
        {
           if (answer4 == 1 || answer4 == 2) //Likes to work either individually or in a group
         {
           if (answer5 == 4) //Interested in sports
           {
             System.out.println ("Based off of your results, Bayview's skiing and Cross Country team might be a good option.");
           }
           else if (answer5 == 5) //Interested in charity
           {
             System.out.println ("Based off of your results, Eco Team or A Mile a Miracle may be a good option.");
           }
           else
           {
             option = 1; //No clubs that match the exact choices
           }
         }
        }
      }
    
     if (option == 1)
     {
       System.out.println ("There are currently no available clubs that fit this exact criteria. Consider starting your own club!");
     }
    }
  }                        