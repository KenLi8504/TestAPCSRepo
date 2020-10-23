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

  public static int [][] create2DArray(int rows, int cols, int maxValue){
    int [][] NewArray = new int [rows][cols];
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        double a = Math.random();
        int b = (int)(Math.round(a*maxValue));
        NewArray[i][j] = b;
      }
    }
    return NewArray;
  }

  public static int [][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int [][] NewArray = new int [rows][];
    for (int i = 0; i < rows; i++){
      int NumCols = (int)(Math.round(cols*Math.random()));
      NewArray[i] = new int [NumCols];
      for (int j = 0; j < NumCols; j++){
        double a = Math.random();
        int b = (int)(Math.round(a*maxValue));
        NewArray[i][j] = b;
      }
    }
    return NewArray;
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
  }
}
