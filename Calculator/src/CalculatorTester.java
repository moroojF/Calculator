
public class CalculatorTester {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperandOne(5);
		c.setOperation("%");
		c.setOperandTwo(2);
		c.performOperation();
		System.out.format("The result is: %.2f", c.getResults());

	}
}
