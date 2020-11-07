public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int InitialCapacity) {
    data = new String[InitialCapacity];
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean add(String element) {
    if (size == data.length) resize();
    data[size] = element;
    size += 1;
    return true;
  }
  public String get(int index) {
    if (index < size) return data[index];
    else return null;
  }
  public String set(int index, String element) {
    String old = data[index];
    data[index] = element;
    return old;
  }
  private void resize() {
    String[] ans = new String[data.length*2];
    for (int i = 0; i < size; i++) {
      ans[i] = data[i];
    }
    data = ans;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public String toString(){
    String ans = "[";
    for (int i = 0; i < size; i++) {
      ans += data[i];
      if (i < size - 1) ans += ", ";
    }
    return ans + "]";
  }
  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) return true;
    }
    return false;
  }
  public void clear() {
    data = new String[size];
    size = 0;
  }
  public void add(int index, String element) {
    if (size == data.length) resize();
    for (int i = size - 1; i >= index; i--) {
      data[i+1] = data[i];
    }
    data[index] = element;
    size++;
  }
  public String remove(int index) {
    if (size == data.length) resize();
    String ans = data[index];
    for (int i = index; i < size-1; i++) {
      data[i] = data[i+1];
    }
    data[size-1] = null;
    size--;
    return ans;
  }
  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) return i;
    }
    return -1;
  }
  public String[] toArray() {
    String[] ans = new String[size];
    for (int i = 0; i < size; i++) {
      ans[i] = data[i];
    }
    return ans;
  }
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size();) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
      } else {
        i++;
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray ans = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.indexOf(a.get(i)) > -1) ans.add(a.get(i));
    }
    removeDuplicates(ans);
    return ans;
  }
  public int lastIndexOf(String value) {
    for (int i = size - 1; i >= 0; i--) {
      if (value.equals(data[i])) return i;
    }
    return -1;
  }
  public boolean equals(SuperArray other) {
    if (size != other.size) return false;
    for (int i = 0; i < size; i++) {
      if (! data[i].equals(other.data[i])) return false;
    }
    return true;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray ans = new SuperArray(a.size() + b.size());
    int i = 0;
    for (;i < a.size() && i < b.size(); i++) {
      ans.add(a.get(i));
      ans.add(b.get(i));
    }
    for (;i < a.size() || i < b.size(); i++) {
      if (i < a.size()) ans.add(a.get(i));
      else ans.add(b.get(i));
    }
    return ans;
  }
}
