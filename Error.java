public class Error {
    public static void main(String[] args) {
      final double PI = 3.14; //finalで定数宣言
      int pie = 5;
      System.out.println("半径" + pie + "cmのパイの面積は、");
      System.out.println(pie * pie * PI);
      System.out.println("パイの半径を倍にします");
      PI = 10; //ここでエラーになる
      System.out.println("半径" + pie + "cmのパイの面積は、");
      System.out.println(pie * pie * PI);
    }
  }
  