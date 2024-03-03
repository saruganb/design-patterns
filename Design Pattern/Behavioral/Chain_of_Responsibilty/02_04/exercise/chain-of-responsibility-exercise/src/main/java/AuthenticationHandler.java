public abstract class AuthenticationHandler {
  private AuthenticationHandler next;

  public AuthenticationHandler(AuthenticationHandler authenticationHandler){
    this.next = authenticationHandler;
  }
  public void handleRequest(String requestType) {
      if(requestType != null) next.handleRequest(requestType);
  }

}
