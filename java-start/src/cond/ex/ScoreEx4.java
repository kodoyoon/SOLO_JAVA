package cond.ex;

public class ScoreEx4 {

  public static void main(String[] args) {

    double rating = 9.0;

    if(rating >=9) {
      System.out.println("어바웃 타임을 추천합니다.");
    }else if(rating >= 8) {
      System.out.println("어바웃 타임을 추천합니다.");
      System.out.println("토이 스토리를 추천합니다.");
    }else if(rating >=7.1) {
      System.out.println("어바웃 타임을 추천합니다.");
      System.out.println("토이 스토리를 추천합니다.");
    }else if(rating >=7) {
      System.out.println("어바웃 타임을 추천합니다.");
      System.out.println("토이 스토리를 추천합니다.");
      System.out.println("고질라를 추천합니다");
    }
  }
}
