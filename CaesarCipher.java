public class CaesarCipher {

		//key value must be between [0,25]
		//String should have no spaces, and all lower case
		public static String encrypt(String input, int key){
			
			int n = input.length();
			String output = "";
			
			for(int i = 0; i < n; i++){
				if(input.charAt(i) + key > 123)
					output += (char) ((input.charAt(i) + key) % 123 + 97);
				else output += (char) (input.charAt(i) + key);
			}
			return output;
		}
		
		//key value must be between [0,25] and match encryption key
		//String should have no spaces, and all lower case
		public static String decrypt(String input, int key){
			
			int n = input.length();
			String output = "";
			
			for(int i = 0; i < n; i++){
				if(input.charAt(i) - key < 97)
					output += (char) ((input.charAt(i) % 96) - key + 122);
				else output += (char) (input.charAt(i) - key);
			}
			return output;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "iamtheverymodelofamodernmajorgeneral";
		String output = encrypt(input, 2);
		
		String outputd = decrypt(output, 2);
		
		System.out.println("Encryption");
		System.out.println(input);
		System.out.println(output);
		
		System.out.println("Decryption");
		System.out.println(outputd);
	}

}
