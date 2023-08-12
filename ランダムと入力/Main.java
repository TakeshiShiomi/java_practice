package ランダムと入力;

public class Main {
    public static void main(String[] args) {
      System.out.println("ようこそ");
      System.out.println("名前は？");
      String name = new java.util.Scanner(System.in).nextLine();
      System.out.println("歳は？");
      String ageString = new java.util.Scanner(System.in).nextLine();
      int age = Integer.parseInt(ageString);
      int fortune = new java.util.Random().nextInt(4);
      fortune++;
      System.out.println("占い結果");
      System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune +"です");
    }
  }
  
