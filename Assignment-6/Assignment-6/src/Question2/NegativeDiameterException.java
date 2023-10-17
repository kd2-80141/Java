package Question2;


	public class NegativeDiameterException extends RuntimeException {
		public void displayError() {
			System.out.println("The diameter cannot be negative");
		}

}
