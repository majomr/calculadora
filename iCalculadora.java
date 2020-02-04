/*
Maria Jose Morales 19145
Jose Abraham
Hoja de trabajo 2
Clase: interfaz calculadora
 */

import java.io.IOException;
import java.net.URISynaxException;

public interface iCalculadora{
  void init() throws IOException, URISyntaxException;
  int sum(int a, int b);
  int subtraction(int a, int b);
  int division(int a, int b);
  int multiply(int a, int b);
  boolean isInt(String value);
  void manageOperator(String operator);
}
