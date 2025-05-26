public class UserAuthenticator {

    public boolean login(String username, String password) {
        // Przykładowa logika logowania (do zastąpienia prawdziwą)
        return "admin".equals(username) && "password".equals(password);
    }
}
