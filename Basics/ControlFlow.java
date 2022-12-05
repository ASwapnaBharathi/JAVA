class ControlFlow {
  public static void main(String args[]) {
    int score = 76;
    char grade = 'A';
    if (score >= 90) {
      grade = 'A';
    } else {
      grade = 'F';
      System.out.println("Fail");
    }
  }
}