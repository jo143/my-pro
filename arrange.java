import java.util.Arrays;
import java.util.Collections;
class arrange {
 
  public static void main(String[] args) {
    Integer[] intArray = new Integer[] {
        new Integer(31),
        new Integer(15),
        new Integer(14),
        new Integer(7),
        new Integer(2)
    };

   
    Arrays.sort(intArray, Collections.reverseOrder());
  System.out.println("Int Array Elements in reverse order:");
    for (int i = 0; i < intArray.length; i++)
    {
       System.out.println(intArray[i]);}
  }
}
