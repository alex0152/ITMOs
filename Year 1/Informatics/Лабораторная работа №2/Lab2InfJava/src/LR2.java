
public class LR2 {

	public static void main(String[] args) {
		getCorrectMessage("1000001");
		getCorrectMessage("0001011");
		getCorrectMessage("1011100");
		getCorrectMessage("0100110");
	}
	
	// Функция для получения правильного сообщения
	public static void getCorrectMessage(String message) {
		// Переменные для хранения синдрома
		String S = "";
		int S1, S2, S3, intS = 0;
		// правильное сообщение
		char[] correctMessage = message.toCharArray();
		// Проверка на длину сообщения
		if (message.length() != 7) {
			System.out.println("Введенное сообщение не имеет 7 символов.");
			return;
		}
		// Проверка на наличие символов, отличных от 0 и 1
		for (char c : correctMessage)
			if (c != '1' && c != '0') {
				System.out.println("Введенное сообщение символы, отличные от 0 и 1.");
				return;
			}
		// Вычисление синдрома
		S1 = Character.getNumericValue(message.charAt(0)) + Character.getNumericValue(message.charAt(2)) +
			 Character.getNumericValue(message.charAt(4)) + Character.getNumericValue(message.charAt(6));
		S2 = Character.getNumericValue(message.charAt(1)) + Character.getNumericValue(message.charAt(2)) +
			 Character.getNumericValue(message.charAt(5)) + Character.getNumericValue(message.charAt(6));
		S3 = Character.getNumericValue(message.charAt(3)) + Character.getNumericValue(message.charAt(4)) +
			 Character.getNumericValue(message.charAt(5)) + Character.getNumericValue(message.charAt(6));
		for (int s : new int[] {S1, S2, S3}) 
			S += s % 2 == 0 ? "0" : "1";
		// Вычисление позиции, в которой есть ошибка
		for (int c = 0, i = 2; i >= 0; c++, i--)
			intS += Character.getNumericValue(reverseString(S).charAt(c)) * Math.pow(2,  i);
		// Проверка на наличие ошибки
		if (intS == 0) System.out.println("Ошибкок в сообщении нет.");
		else {
			System.out.printf("Ошибка в %d-ом символе. Это %s бит.\n", intS, 
			intS == 1 || intS == 2 || intS == 4 ? "проверочный" : "информационный");
			// Исправляем ошибку
			correctMessage[intS - 1] = message.charAt(intS - 1) == '0' ? '1' : '0';
		}
		System.out.println("Правильное сообщение: " + correctMessage[2] + correctMessage[4] + correctMessage[5] + correctMessage[6]);
	}
	
	// Вспомогательная функция для отзеркаливания строки
	public static String reverseString(String str) {
		  return new StringBuilder(str).reverse().toString();
	}

}
