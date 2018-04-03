public class ExamBuilder {
  
  public static void build()
    {
      System.out.println("\nWelcome to the Exam Builder.");
      String input = "";
      Scanner s = ScannerFactory.getKeyboardScanner();
      while (input.toLowerCase().equals("exit") == false)
        {
        System.out.println("Select one of the following options by typing its number in and then pressing the enter/return key:");
        System.out.println("1:\tCreate exam from keyboard");
        System.out.println("2:\tLoad exam from file");
        System.out.println("3:\tTake exam by keyboard");
        System.out.println("4:\tTake exam by file");
        System.out.println("\t--Type 'exit' and then press enter/return to quit.\n");
        input = s.nextLine();
        }
      
      
      
      
      
      System.out.println("Exiting Exam App.");
      }
}
