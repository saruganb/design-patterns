public class BasicAuthenticationHandler extends AuthenticationHandler {

  public BasicAuthenticationHandler(AuthenticationHandler authenticationHandler) {
    super(authenticationHandler);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("basicAuth")){
      System.out.println("initializing basic auth");
    }
    else{
      super.handleRequest(requestType);
    }
  }

}
