package cond.ex;

public class ScoreEx2 {
  public static void main(String[] args) {
    int distance = 40;

    if(distance <= 1) {
      System.out.println("도보를 이용하세요.");
    }else if (distance <=5) {
      System.out.println("자전거를 이용하세요.");
    }else if( distance <= 50) {
      System.out.println("자동차를 이용하세요.");
    }else if(distance <= 200) {
      System.out.println("비행기를 이용하세요.");
    }
  }
}
