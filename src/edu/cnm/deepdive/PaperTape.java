package edu.cnm.deepdive;

public class PaperTape {

  public static void main(String[] args) {
    int[] values = parseInts(args);
    long total = sum(values);
    System.out.printf("Total = %,d%n", total);

  }

  private static int[] parseInts(String[] args){
    int[] vals = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      vals[i] = Integer.parseInt(args[i]);
    }
    return vals;
  }

  private static long sum(int[] data){
    long total = 0;
    for(int val : data){
      total += val;
    }
    return total;
  }
}
