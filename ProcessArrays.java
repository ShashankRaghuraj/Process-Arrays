import java.util.ArrayList;
//Did isPrime
public class ProcessArrays 
{
  public ProcessArrays()
  {
    //nothing needed here, but made a constructor since it is good practice!
  }
  public void remove(int[] arnold, ArrayList<Integer> albert, int killUs)
  {
    // checks to see if is even
    if(killUs % 2 ==0)
    {
      for(int i = 0 ; i < arnold.length; i++)
      {
        //removes even numbers from arnold
        if(arnold[i] % 2 == 0)
        {
          arnold[i] = -1;
        }
      }
      //removes even numbers from albert
      for(int i = 0 ; i < albert.size(); i++)
      {
        if(albert.get(i) % 2 == 0)
        {
          albert.remove(i);
          i--;
        }
      }
      System.out.println("All even values in arnold and albert have been removed");
    }
    //else, its odd
    else
    {
      for(int i = 0 ; i < arnold.length; i++)
      {
        //removes odd numbers from arnold
        if(arnold[i] % 2 == 1)
        {
          arnold[i] = 0;
        }
      }
      for(int i = 0 ; i < albert.size(); i++)
      {
        //removes all odd numbers from albert
        if(albert.get(i) % 2 == 1)
        {
          albert.remove(i);
          i--;
        }
      }
      System.out.println("All odd values in arnold and albert have been removed");
    }
    System.out.println("Arnold:");
    for(int i : arnold)
    {
      System.out.println(i);
    }
    System.out.println("");
    System.out.println("Albert:");
    for(Integer i : albert)
    {
      System.out.println(i);
    }
  }
  public void sortUs(int[] arnold, ArrayList<Integer> albert)
  {
    //checks to see if there is nothing,
    if(arnold.length == 0)
    {
      System.out.println("Arnold cannot be sorted, not enough values");
    }
    else
    {
      //if it has more values, it does a bubble sort
      //traverse
      for(int i = 0; i < arnold.length; i++)
      {
        for(int j = i+1; j < arnold.length; j++)
        {
          //set var
          int temp = 0;
          if(arnold[i] < arnold[j])
          {
            //set a temp
            temp = arnold[i];
            //switch
            arnold[i] = arnold[j];
            //switch
            arnold[j] = temp;
          }
        }
      }
      System.out.println("arnold has been sorted");
    }
    //checks if nothing in list
    if(albert.size() == 0)
    {
      System.out.println("Albert cannot be sorted, not enough values");
    }
    else
    {
      //traverse array
      for(int i = 0; i < albert.size(); i++)
      {
        //traverse rest of array
        for(int j = i+1; j < albert.size(); j++)
        {
          //set var
          int temp = 0;
          if(albert.get(i) < albert.get(j))
          {
            //set temp
            temp = albert.get(i);
            //switch
            albert.set(i, albert.get(j));
            //switch
            albert.set(j, temp);
          }
        }
      }
      System.out.println("albert has been sorted");
    }
    // System.out.println("Arnold:");
    // for(int i : arnold)
    // {
    //   System.out.println(i);
    // }
    // System.out.println("");
    // System.out.println("Albert:");
    // for(Integer i : albert)
    // {
    //   System.out.println(i);
    // }
  }
  public TwoAnswer sum(int[] arnold, ArrayList<Integer> albert)
  {
    //set vars
    int answer1 = 0;
    int answer2 = 0;
    //traverse arrays
    for(int i : arnold)
    {
      answer1 += i;
    }
    //traverse arrays
    for(int alVal : albert)
    {
      answer2 += alVal;
    }
    //return TwoAnswer object thingy
    return new TwoAnswer(answer1, answer2);
  }
  public TwoAnswer largest(int[][] twoDArray)
  {
    //Did all the logic below in methods maxRowSum, and maxRowColumn
    int answer1 = maxRowSum(twoDArray);
    int answer2 = maxColumnSum(twoDArray);
    return new TwoAnswer(answer1, answer2);
  }
  public int maxRowSum(int[][] twoDArray)
  {
    //Set vals
    int maxSumRow = 0;
    int rowSum = 0;
    //Traverse Array for standard Max
    for(int val : twoDArray[0])
    {
      maxSumRow += val;
    }
    //Traverse all arrays
    for(int[] row : twoDArray)
    {
      for(int val : row)
      {
        rowSum += val;
      }
      //check each time
      if(rowSum > maxSumRow)
      {
        maxSumRow = rowSum;
      }
      //set it back to zero
      rowSum = 0;
    }
    return maxSumRow;
  }
  public int maxColumnSum(int[][] twoDArray)
  {
    //set vars
    int maxColSum = 0;
    int colSum = 0;
    //traverse to find the first max val
    for(int i = 0; i < 1; i++)
    {
      for(int j = 0; j < twoDArray.length; j++)
      {
        maxColSum += twoDArray[i][j];
      }
    }
    //traverse to find the true max val
    for(int i = 0; i < twoDArray[0].length; i++)
    {
      for(int j = 0; j < twoDArray.length; j++)
      {
        colSum += twoDArray[j][i];
      }
      //check
      if(colSum > maxColSum)
      {
        maxColSum = colSum;
      }
      //set
      colSum = 0;
    }
    //return
    return maxColSum;
  }
  public int[] countDigits(int[] arnold, ArrayList <Integer> albert)
  {
    //set array
    int[] countDigitsArr = new int[10];
    //traverses arnold
    for(int val : arnold)
    {
      //if it's zero, it adds to the zero'th spot
      if(val == 0)
      {
        countDigitsArr[0] += 1;
      }
      //else, it does this thing, where it takes the last digit, then adds to it to the array
      else{
        while(val > 0)
        {
          //takes last digit
          countDigitsArr[val % 10] += 1;
          //truncation
          val /= 10;
        }
      }
    }
    //traverses albert
    for(int val : albert)
    {
      //if it's zero it does this thing where it adds to the zero'th spot
      if(val == 0)
      {
        countDigitsArr[0] += 1;
      }
      //else, it does this thing, where it takes the last digit, then adds to it to the array
      while(val > 0)
      {
        //takes last digit
        countDigitsArr[val % 10] += 1;
        //truncation
        val /= 10;
      }
    }
    //return
    return countDigitsArr;
  }
  public void makeMeLaugh()
  {
    System.out.println("If you see a robbery at an Apple Store, does that make you an IWitness?");
  }
  public boolean isPrime(int[] arnold, ArrayList<Integer> albert)
  {
    int totalPeopleSum = sum(arnold, albert).getanswer1() + sum(arnold,albert).getanswer2();
    //checks arnold
    for(int val : arnold)
    {
      for(int i = 2; i <  val; i++)
      {
        if(val % i == 0)
        {
          return false;
        }
      }
    }
    //checks albert
    for(int val : albert)
    {
      for(int i = 2; i <  val; i++)
      {
        if(val % i == 0)
        {
          return false;
        }
      }
    }
    //checks combined arnold and albert
    for(int i = 2; i < totalPeopleSum; i++)
    {
      if(totalPeopleSum % i == 0)
      {
        return false;
      }
    }
    //if it gets through everything, congrats, it is true.
    return true;
  }
}