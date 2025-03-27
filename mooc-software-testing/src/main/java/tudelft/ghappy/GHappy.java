package tudelft.ghappy;

public class GHappy {
    public boolean gHappy(String str) {
        assert str != null;

        if (!str.contains("g")) return false; // Si no hay 'g', no puede ser "gHappy"

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if ((i > 0 && str.charAt(i - 1) == 'g') || (i + 1 < str.length() && str.charAt(i + 1) == 'g')) {
                    continue; // La 'g' está correctamente emparejada
                }
                return false; // Se encontró una 'g' solitaria
            }
        }
        return true;
    }
}
