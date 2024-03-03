public class Client {

  public static void main(String[] args) {
    AuthenticationHandler auth = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));

    auth.handleRequest("digestAuth");
  }

}
