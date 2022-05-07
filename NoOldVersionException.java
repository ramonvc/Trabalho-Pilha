public class NoOldVersionException extends Exception {
    public void printStackTrace() {
        System.out.println("Não há nenhum registro de versão anterior");
    }
}
