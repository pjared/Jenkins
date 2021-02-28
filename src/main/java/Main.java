public class Main {
    static int main(String args[]) {
        String funct = args[0];
        Calculator calc = new Calculator();
        int answer;
        String binAnswer = null;
        if(funct.equals("add")) {
            answer = calc.add(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println("Output: " + answer);
        } else if (funct.equals("subtract")) {
            answer = calc.subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println("Output: " + answer);
        } else if (funct.equals("multiply")) {
            answer = calc.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println("Output: " + answer);
        } else if (funct.equals("divide")) {
            answer = calc.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            System.out.println("Output: " + answer);
        } else if (funct.equals("fib")) {
            answer = calc.fibonacciNumberFinder(Integer.parseInt(args[1]));
            System.out.println("Output: " + answer);
        } else if (funct.equals("binary")) {
            binAnswer = calc.intToBinaryNumber(Integer.parseInt(args[1]));
            System.out.println("Output: " + binAnswer);
        }
        return 0;
    }
}
