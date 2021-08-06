import java.util.Scanner;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;
import java.io.FileReader;
import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;


public class houseRandomizer
{ 

   public static void main(String args[]) throws IOException
   {
   
   //finding number of members
   int numMembers = 0;
   int numHouses = 5;
   
   File file = new File("");
   Scanner scan = new Scanner(file);
   
   while(scan.hasNext())
   {
      numMembers+=1;
   }
   
   //assigning each member to a random number
   Map<String,String> map = new TreeMap<String,String>();    
   
   int num = 0;
   ArrayList <Integer> list = new ArrayList<Integer>();
   
   while(scan.hasNext())
   {
      String member = scan.nextLine();
      Random rand = new Random();
      
      boolean go = false;
      while(go == false)
      {
         num = rand.nextInt(numHouses);
         list.add(num);
      
         int cnt = 0;
         for(int i=0; i<list.size(); i++)
         {
            cnt = 0;
            if(list.get(i) == num)
            {
               cnt ++;
            }
         }
         if(cnt > (numMembers/numHouses))
         {
            num = rand.nextInt(numHouses);
         }
         else
         {
            go = true;
         }
        }
         if(num ==1)
         {
            map.put(member, "Bach");
         }
         if(num == 1)
         {
            map.put(member, "Brahms");
         }
         if(num == 2)
         {
            map.put(member, "Beethoven");
         }
         if(num == 3)
         {
            map.put(member, "Mozart");
         }
         if(num == 4)
         {
            map.put(member, "Tchaickovsky");
         }
         
      }
         System.out.println(map);
      
   }

   
}