package segitiga;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author AGUS PRAMANA
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan alas segitiga: ");
        double alas = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = Double.parseDouble(reader.readLine());  
        double luas = 0.5 * alas * tinggi; 
        System.out.println("Luas segitiga adalah: " + luas);
    }
    
}
