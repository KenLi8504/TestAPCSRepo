public class Demo{
  public static String arrToString(int[] arr){
  int a = arr.length;
  if (a == 0){
    return "{}";
  }
  String b = "{" + arr[0];
  for (int i = 1; i < a; i++){
    b = b + ", " + arr[i];
  }
  b = b + "}";
  return b;
}
  public static String arrayDeepToString (int [][]arr) {
    int m = 0;
    String a = "{";
    for (int row = 0; row < arr.length; row ++){
        a = a + (arrToString(arr[row]));
        if (row != arr.length - 1){
          a = a + ", ";
        }
      }
    a = a + "}";
    return a;
  }

  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = 0; j <= (n-i); j++){
         System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void main(String [] args) {
    if (args.length != 0){
      printLoop(Integer.parseInt(args[0]));
    }
    else {printLoop(5);}
    int [] [] a = {{9,6,1},{3,4,5},{43,2,1}};
    System.out.println(arrayDeepToString(a) );
  }
}
