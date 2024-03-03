public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler authenticationHandler) {
    super(authenticationHandler);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("certificateAuth")){
      System.out.println("initializing certificate auth");
    }
    else{
      super.handleRequest(requestType);
    }
  }

}
