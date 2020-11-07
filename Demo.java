public class Demo{
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    // words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    // words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    // words.add("una");    words.add("ebi");     words.add("toro");
    words.add("kani");words.add("kani");words.add("kani");words.add("kani");words.add("kani");
    words.add("kani");words.add("kani");words.add("kani");words.add("kani");words.add("kani");
    words.add("kani");
    words.add("kani");words.add("kani");words.add("kani");words.add("kani");words.add("kani");

    System.out.println(words);
    SuperArray.removeDuplicates(words);
    System.out.println(words);
    String thing = "91223404429";
    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    for (int i = 0; i < 6; i++) {
      a.add(thing.substring(i, i+1));
    }
    for (int i = 6; i < thing.length(); i++) {
      b.add(thing.substring(i, i+1));
    }
    System.out.println(SuperArray.zip(a, b));
  }
}
