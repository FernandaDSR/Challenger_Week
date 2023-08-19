package Question_03;

public class Cal {

  public static double evalueteExpression(String expression) {
      String[] tokens = expression.split("[+\\-]");
      String[] operators = expression.split("[0-9.]+");

      double result = Double.parseDouble(tokens[0]);


      for (int i = 1; i < tokens.length; i++) {

          double operand = Double.parseDouble(tokens[i]);
          char operator = operators[i].charAt(0);

          if (operator == '+') {
              result += operand;
          } else if (operator == '-') {
              result -= operand;
          }
      }
      return result;
  }

}
