/*
Maria Jose Morales 19145
Jose Abraham
Hoja de trabajo 2
Clase: calculadora
 */

public class Calculadora implements iCalculadora{
    private int counter = 0;
    private boolean broke = false;
    private Stack<Integer> temporalStack = new Stack<>();
    private ArrayList<String> validOperators = new ArrayList<>();
  
    public Calculadora(){
        validOperators.add("+");
        validOperators.add("-");
        validOperators.add("*");
        validOperators.add("/");
    }
    
    public void init() throws IOException, URISyntaxException {
        List<String> strings = Files.readAllLines(Path.of(Calculator.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()+"datos.txt"));
        Stack<String> values = new Stack<>();
        for(String line; strings){
            values.addAll(Arrays.asList(line.split(" ")));
        }
        for (int i =0; i < values.size(); i++){
            if(!isInt(values.get(i))){
                manageOperator(values.get(i));
            }
            if(broke){
                return;
            }
        }
        if (!broke && temporalStack.size() == 1){
            System.out.println("El resultado final es: " + temporalStack.pop());
        }else if(!broke){
            System.out.println("No hay suficientes operadores para realizar la operacion deseada");
        }
    }
    
    public int sum(int a, int b){
        return a+b;
    }
    
    public int subtraction(int a, int b){
        return a-b;
    }
    
    public int division(int a, int b){
        return a/b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }
    
    public boolean isInt(String value){
        try{
            int element = Integer.parseInt(value);
            temporalStack.push(element);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    public void manageOperator(String operator){
        if (validOperators.contains(operator)){
            if (temporalStack.size() == 2){
                int b == temporalStack.pop();
                int a == temporalStack.pop();
                if (operator.equalsIgnoreCase("+")){
                    int sum = sum(b, a);
                    temporalStack.push(sum);
                }else if (operator.equalsIgnoreCase("-")){
                    temporalStack.push(subtraction(a, b));
                }else if (operator.equalsIgnoreCase("-")){
                    temporalStack.push(division(a, b));
                }else{
                    temporalStack.push(multiply(a, b));
            }
        }else{
                System.out.println("Hay un operador de mas");
                broke = true;
            }
    }else{
            System.out.println("Ha ingresado un valor invalido " + operator);
            broke = true;
        }
}
}
