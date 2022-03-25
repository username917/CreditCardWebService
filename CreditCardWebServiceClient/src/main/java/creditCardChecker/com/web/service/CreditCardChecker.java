/**
 * CreditCardChecker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package creditCardChecker.com.web.service;

public interface CreditCardChecker extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public int getSize(long d) throws java.rmi.RemoteException;
    public int getDigit(int number) throws java.rmi.RemoteException;
    public boolean isValid(long number) throws java.rmi.RemoteException;
    public long getPrefix(long number, int k) throws java.rmi.RemoteException;
    public int sumOfDoubleEvenPlace(long number) throws java.rmi.RemoteException;
    public boolean prefixMatched(long number, int d) throws java.rmi.RemoteException;
    public int sumOfOddPlace(long number) throws java.rmi.RemoteException;
}
