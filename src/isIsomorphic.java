import java.util.HashMap;

class isIsomorphic {
  public static boolean is_Isomorphic(String s, String t) {    
    if (s.length() == 0 || s == null || t.length() == 0 || t == null)
      return false;
    
    if (s.length() != t.length())
      return false;
    
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    
    for (int i=0;i< s.length();i++)
    {
      char c1 = s.charAt(i); //f
      char c2 = t.charAt(i); //g

      if (map.containsKey(c1))
      {
        if (map.get(c1) != c2)
          return false;
      }
      else
      {
        if (map.containsValue(c2))
          return false;
        
        map.put(c1, c2);
      }
      
    }  
    return true;
  }

  public static void main(String[] args) {

    System.out.println(is_Isomorphic("kff", "egg"));

  }

}
