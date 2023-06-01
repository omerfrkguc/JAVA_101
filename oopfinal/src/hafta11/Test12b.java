
package hafta11;

public class Test12b {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        } catch (Exception ex) {
            System.out.println("Hata");
        }
    }
}