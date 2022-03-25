package creditCardChecker.com.web.service;

public class CreditCardCheckerProxy implements creditCardChecker.com.web.service.CreditCardChecker {
  private String _endpoint = null;
  private creditCardChecker.com.web.service.CreditCardChecker creditCardChecker = null;
  
  public CreditCardCheckerProxy() {
    _initCreditCardCheckerProxy();
  }
  
  public CreditCardCheckerProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreditCardCheckerProxy();
  }
  
  private void _initCreditCardCheckerProxy() {
    try {
      creditCardChecker = (new creditCardChecker.com.web.service.CreditCardCheckerServiceLocator()).getCreditCardChecker();
      if (creditCardChecker != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)creditCardChecker)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)creditCardChecker)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (creditCardChecker != null)
      ((javax.xml.rpc.Stub)creditCardChecker)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public creditCardChecker.com.web.service.CreditCardChecker getCreditCardChecker() {
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    creditCardChecker.main(args);
  }
  
  public int getSize(long d) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.getSize(d);
  }
  
  public int getDigit(int number) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.getDigit(number);
  }
  
  public boolean isValid(long number) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.isValid(number);
  }
  
  public long getPrefix(long number, int k) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.getPrefix(number, k);
  }
  
  public int sumOfDoubleEvenPlace(long number) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.sumOfDoubleEvenPlace(number);
  }
  
  public boolean prefixMatched(long number, int d) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.prefixMatched(number, d);
  }
  
  public int sumOfOddPlace(long number) throws java.rmi.RemoteException{
    if (creditCardChecker == null)
      _initCreditCardCheckerProxy();
    return creditCardChecker.sumOfOddPlace(number);
  }
  
  
}