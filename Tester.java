public class Tester {
  public static void main (String[] args) {
    SuperArray words = new SuperArray();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for (int i = 0; i < alphabet.length(); i++) {
      words.add(alphabet.substring(i, i+1));
    }
    for (int i = 0; i < words.size(); i++) {
      System.out.print(words.get(i));
    }
    System.out.println("");
    for (int i = 0; i < words.size() - 1; i++) {
      words.set(i, words.get(i+1));
    }
    words.set(words.size()-1, "a");
    for (int i = 0; i < words.size(); i++) {
      System.out.print(words.get(i));
    }
  }
}
