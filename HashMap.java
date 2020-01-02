 import java.util.*;

 public class HashMap{
     public static void main (String[] args) {
      Scanner scan=new Scanner(System.in);
      HashMap<String, Integer> map = new HashMap<>();
      int n = scan.nextInt();
      scan.nextLine();
      for(int i=0;i<n;i++){
          String theString = scan.nextLine();
          String[] splittedString = theString.split(", ?");
          String itemName = splittedString[0];
          int itemCost = Integer.parseInt(splittedString[1]);
          double itemDiscount = Double.parseDouble(splittedString[2]);
          itemDiscount = (itemDiscount / 100) * itemCost;
          itemCost = (int)itemDiscount;
          map.put(itemName,itemCost);
      }
      System.out.println(map);
      int min = Collections.min(map.values());
      List<String> itemsToBuy= new ArrayList<String>();
      
      map.forEach((k, v) -> {
          if(v == min) {
        	  System.out.println(k);
          }
      });
      //System.out.println(itemsToBuy);
     }
 }