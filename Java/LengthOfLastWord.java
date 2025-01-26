public class LengthOfLastWord{
    public static int length(String s){
            s=s.trim();
    
            int lastSpaceIndex=s.lastIndexOf(' ');
    
            return s.length()-lastSpaceIndex-1;
        }
          public static void main(String[] args) {
            
              String k="Hello World";
              length(k);
      }
}