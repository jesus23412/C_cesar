import java.io.IOException;
import java.util.C_canner;

public class C_cesar {
    public static void main(String[] args) throws IOException {
        C_canner C_c = new C_canner(System.in);
        String tex, codigo, r;
        char opcion;
        C_cesar v = new C_cesar();
            do {
                System.out.print("Introduce un texto: ");
                tex = C_c.nextLine();
            } while (tex.isEmpty());
            do {
                System.out.print("Introduce el codigo: ");
                codigo = C_c.nextLine();
            } while (codigo.isEmpty());  

            if(v.validarCodigo(codigo) && v.validatex(tex)){
                System.out.println("texto cifrado: " + C_cesar(tex, codigo));
            }
            else{
                System.out.println("Error, valores incorrectos");
            }
    }
    public boolean validatex(String t){
        int valorAC_cII=0;
        for(int i=0 ; i<t.length() ; i++){
            char c=t.charAt(i);
            valorAC_cII=(int) c;
            if(valorAC_cII<97 || valorAC_cII > 122){
                return false;
            }
        }
        return true;
    }
    public boolean validarCodigo(String c) {
                int c2;
		try
                {
                    c2=Integer.parseInt(c);
                    return true;
                }catch(Exception e){
                    return false;
                }
	}
    public static String C_cesar(String tex, String c) {
        StringBuilder cifrado = new StringBuilder();
        int codigo=Integer.parseInt(c);
        codigo = codigo % 26;
        for (int i = 0; i < tex.length(); i++) {
            if (tex.charAt(i) >= 'a' && tex.charAt(i) <= 'z') {
                if ((tex.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (tex.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (tex.charAt(i) + codigo));
                }
            } else if (tex.charAt(i) >= 'A' && tex.charAt(i) <= 'Z') {
                if ((tex.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (tex.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (tex.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
}