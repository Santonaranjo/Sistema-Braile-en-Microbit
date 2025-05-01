import java.util.Scanner;

public class BrailleTraductor {

    // Representación en texto de Braille para las letras A-Ñ-O-Z (27 letras incluyendo la Ñ)
    static String[] braille = {
        "A: ● .\n   . .",  // A
        "B: ● .\n   ● .",  // B
        "C: ● ●\n   . .",  // C
        "D: ● ●\n   . ●",  // D
        "E: ● .\n   . ●",  // E
        "F: ● ●\n   ● .",  // F
        "G: ● ●\n   ● ●",  // G
        "H: ● .\n   ● ●",  // H
        "I: . ●\n   ● .",  // I
        "J: . ●\n   ● ●",  // J
        "K: ● .\n   . .\n   ● .",  // K
        "L: ● .\n   ● .\n   ● .",  // L
        "M: ● ●\n   . .\n   ● .",  // M
        "N: ● ●\n   . ●\n   ● .",  // N
        "Ñ: ● ●\n   ● ●\n   . ●",  // Ñ (representación inventada para este ejemplo)
        "O: ● .\n   . ●\n   ● .",  // O
        "P: ● ●\n   ● .\n   ● .",  // P
        "Q: ● ●\n   ● ●\n   ● .",  // Q
        "R: ● .\n   ● ●\n   ● .",  // R
        "S: . ●\n   ● .\n   ● .",  // S
        "T: . ●\n   ● ●\n   ● .",  // T
        "U: ● .\n   . .\n   ● ●",  // U
        "V: ● .\n   ● .\n   ● ●",  // V
        "W: . ●\n   ● ●\n   . ●",  // W
        "X: ● ●\n   . .\n   ● ●",  // X
        "Y: ● ●\n   . ●\n   ● ●",  // Y
        "Z: ● .\n   . ●\n   ● ●"   // Z
    };

    static String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

    public static int obtenerIndice(char letra) {
        return letras.indexOf(letra);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su nombre: ");
        String mensaje = scanner.nextLine().toUpperCase();

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            int pos = obtenerIndice(c);
            if (pos >= 0 && pos < braille.length) {
                System.out.println("\nLetra: " + c);
                System.out.println(braille[pos]);
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo entre letras
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("\nCaracter no reconocido: " + c);
            }
        }

        scanner.close();
    }
}
