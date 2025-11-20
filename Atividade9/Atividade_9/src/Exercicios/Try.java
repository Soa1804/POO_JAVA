package Exercicios;

public class Try {

    public static void main(String[] args) {

        // Primeiro bloco try-catch
        try {

            throw new BoinkEx(); 
            
        } catch (BoinkEx bo) {
            System.out.println("Catch: BoinkEx");
        } catch (BarEx ba) {
            System.out.println("Catch: BarEx");
        } catch (BiffEx bi) {
            System.out.println("Catch: BiffEx");
        } catch (FooEx o) {
            System.out.println("Catch: FooEx");
        } catch (BazEx z) {
            System.out.println("Catch: BazEx");
        }


        // Segundo bloco try-catch
        try {
            throw new BiffEx();

        } catch (BiffEx bi) {
            System.out.println("Catch: BiffEx ou BoinkEx");
        } catch (FooEx f) {
            System.out.println("Catch: FooEx ou BarEx");
        } catch (BazEx z) {
            System.out.println("Catch: BazEx");
        }
    }
}
