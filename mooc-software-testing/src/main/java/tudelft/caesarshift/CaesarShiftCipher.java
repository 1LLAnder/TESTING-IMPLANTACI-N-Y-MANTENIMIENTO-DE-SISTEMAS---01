package tudelft.caesarshift;

public class CaesarShiftCipher {
    public String encrypt(String message, int shift) {
        if (message.isEmpty()) {
            return "invalid";
        }

        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int alphabetLength = alphabet.length();
        shift = shift % alphabetLength;

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int index = alphabet.indexOf(currentChar);

            if (index == -1) {
                return "invalid"; // Solo se admiten caracteres en minúscula dentro del alfabeto
            }

            int newIndex = (index + shift + alphabetLength) % alphabetLength;
            sb.append(alphabet.charAt(newIndex));
        }

        return sb.toString();
    }
}

