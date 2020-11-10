import java.util.Arrays;
public class Tester {
  public static void main (String[] args) {
    SuperArray words = new SuperArray();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < alphabet.length(); i++) {
      words.add(alphabet.substring(i, i+1));
    }
    // for (int i = 0; i < words.size(); i++) {
    //   System.out.print(words.get(i));
    // }
    // System.out.println("");
    // for (int i = 0; i < words.size() - 1; i++) {
    //   words.set(i, words.get(i+1));
    // }
    // words.set(words.size()-1, "a");
    // for (int i = 0; i < words.size(); i++) {
    //   System.out.print(words.get(i));
    // }
    // System.out.println("");
    // SuperArray a = new SuperArray();
    // System.out.println(a.isEmpty());
    // System.out.println(words.isEmpty());
    // System.out.println(a);
    // System.out.println(words);
    // System.out.println(words.contains("a"));
    // System.out.println(words.contains("aa"));
    // String b = null;
    // System.out.println(words.contains(b));
    // words.add(3, "asdf");
    // System.out.println(words);
    // System.out.println(words.remove(0));
    // System.out.println(words);
    // System.out.println(words.indexOf("c"));
    // System.out.println(Arrays.toString(words.toArray()));
    try {
      SuperArray test = new SuperArray(-1);
    } catch (IllegalArgumentException e){
      e.printStackTrace();
    }

    try {
      System.out.println(words.get(3));
      System.out.println(words.get(-5));
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }

    try {
      System.out.println(words.get(27));
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      System.out.println(words.set(0, "ab"));
      System.out.println(words.set(-1, "a"));
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      words.add(26, "a");
      System.out.println(words);
      words.add(30, "asdf");
      System.out.println(words);
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }
    try {
      words.remove(5);
      System.out.println(words);
      words.remove(-5);
      System.out.println(words);
    } catch (IndexOutOfBoundsException e){
      e.printStackTrace();
    }
  }
}
