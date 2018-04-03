import java.util.*;
//import java.io.*;

public class ScannerFactory{
  private static Scanner keyboardScanner;
  public static Scanner getKeyboardScanner()
    {
      if (keyboardScanner == null)
        keyboardScanner = new Scanner(System.in);
      return keyboardScanner;
    }
}
