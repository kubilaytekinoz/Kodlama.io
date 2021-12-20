public class EmailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.print("Mail Atıldı : " + message);
    }
}
