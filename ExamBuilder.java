public class ExamBuilder {
  public void build_from_keyboard()
    {
      System.out.println("\nBuilding Exam from Keyboard Input:");
      Scanner s = ScannerFactory.getKeyboardScanner();
      String input = "";
      while (input.toLowerCase().equals("exit") == false)
        {
          System.out.println("Select one of the following options by typing its number in and then pressing the enter/return key:");
          System.out.println("1:\tSet the title for the exam");
          System.out.println("2:\tAdd a question to the exam");
          System.out.println("3:\tDelete a question from the exam");
          System.out.println("4:\tPrint the exam and its contents");
          System.out.println("\t--Type 'exit' and then press enter/return to quit.\n");
          input = s.nextLine();
        }
    }
  
  
  
  public static void menu()
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
