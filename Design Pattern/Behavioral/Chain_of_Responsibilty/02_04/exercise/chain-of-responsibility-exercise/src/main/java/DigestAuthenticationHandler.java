public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler authenticationHandler) {
    super(authenticationHandler);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("digestAuth")){
      System.out.println("initializing digestAuth");
    }
    else{
      super.handleRequest(requestType);
    }
  }

}
