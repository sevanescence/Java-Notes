public class Main {

  public static void main(String[] args) {
  
    // underscores can be used to divide numbers
    // in expressions to make it easier for the
    // person reading the code to understand. The
    // underscore has no effect on the code itself.
    
    int intMinimum = -2_147_483_648; // short for integer.
    int intMaximum = 2_147_483_647; // cannot be decimal.
    
    byte byteMinimum = -128;
    byte byteMaximum = 127;
    
    short shortMinimum = -32768;
    short shortMaximum = 32767;
    
    long longMinimum = -9_223_372_036_854_775_808L;
    long longMaximum = 9_223_372_036_854_775_807L;
    
    float floatExample = 56.7435f;
    
    // floats and longs end with f and L (respectively).
    // you must write each of their letters at the end of
    // their values in order to define them.
    
    double doubleExample = 25.73344;
    
    char charMinimum = 0;
    char charMaximum = 65536;
    
    // chars are single letters. every letter you know
    // and love is an ASCII number.
    
    boolean isTrue = true;
    boolean isFalse = false;
    
    // Do not use a datatype if you don't need to. Don't use a long
    // just because it's bigger than an integer. The larger your number,
    // the more memory it takes up. You always want your code to be as
    // efficient as possible.
  
  }

}
