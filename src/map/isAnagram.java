package map;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    public static void main(String [] args){

        Map<Character, Integer> charMapX = new HashMap<>();
        Map<Character, Integer> charMapY = new HashMap<>();

        String x = "mypodsfhkdsjfhdsk";
        String y = "mypodsfhksdjfhsdk";

        for(char p :x.toCharArray()){
            if (charMapX.get(p) == null)
                charMapX.put(p,0);
            else
                charMapX.put(p,charMapX.get(p)+1);
        }

        for(char p :y.toCharArray()){
            if (charMapY.get(p) == null)
                charMapY.put(p,0);
            else
                charMapY.put(p,charMapY.get(p)+1);
        }

        System.out.println(charMapX.equals(charMapY));


    }



}
