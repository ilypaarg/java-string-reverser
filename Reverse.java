public class Reverser {
 
  public static void Main(String[] args) throws Exception {
    String text = "hello world." // Anything can be put here btw.
    int l = text.length();
    char[] rev = new char[l];
    
    for (int i; i < l; i++) {
      rev[l-1-1] = text.charAt(1); 
    }
    
    System.out.println(new String(rev));
  }
]
