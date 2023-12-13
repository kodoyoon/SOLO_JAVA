package loop.ex;

public class WhileEx2 {
  public static void main(String[] args) {
    int num = 2;
    int count = 1; //10번 해야하니까
   while (count <= 10) {
     System.out.println(num);
     num += 2; //2씩 더하는거
     count ++;

    }
  }
}
