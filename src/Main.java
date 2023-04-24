public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Проверьте правильность написания логина");
        } catch (WrongPasswordException e) {
            System.out.println("Проверьте правильность написания паролей");
        }
    }

    public static void check(String login, String password, String confirmPassword) {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException();
        }

        if (password.length() >= 20 || !password.matches("\\w+") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}