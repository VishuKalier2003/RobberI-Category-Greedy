/* You are a professional robber planning to rob houses along a street. Each house has a certain amount of money 
stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems 
connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money you 
can rob tonight without alerting the police.
* Eg 1 : houses = [1,2,3,1]                     Output = 4
* Eg 2 : houses = [2,7,9,3,1]                   Output = 12
*/
import java.util.*;
public class RobberI
{
      public int MaximumLoot(int houses[])
      {
            int SumEven = 0, SumOdd = 0;      //*    Variable -> O(1)
            for(int i = 0; i < houses.length; i++)     //! Comparison -> O(N)
            {
                  if(i % 2 == 0)     // Even index houses...
                        SumEven = SumEven + houses[i];
                  else               // Odd index houses...
                        SumOdd = SumOdd + houses[i];
            }
            return SumEven = (SumEven > SumOdd) ? SumEven : SumOdd;
      }
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter number of Houses : ");
            x = sc.nextInt();
            int array[] = new int[x];
            for(int i = 0; i < array.length; i++)
            {
                  System.out.print("Enter loot : ");
                  array[i] = sc.nextInt();
            }
            RobberI robberI = new RobberI();       // Object creation...
            System.out.println("Maximum Possible Loot : "+robberI.MaximumLoot(array));
            sc.close();
      }
}



//! Time Complexity -> O(N)
//* Space Complexity -> O(1)