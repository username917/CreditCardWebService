<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCreditCardCheckerProxyid" scope="session" class="creditCardChecker.com.web.service.CreditCardCheckerProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCreditCardCheckerProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleCreditCardCheckerProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleCreditCardCheckerProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        creditCardChecker.com.web.service.CreditCardChecker getCreditCardChecker10mtemp = sampleCreditCardCheckerProxyid.getCreditCardChecker();
if(getCreditCardChecker10mtemp == null){
%>
<%=getCreditCardChecker10mtemp %>
<%
}else{
        if(getCreditCardChecker10mtemp!= null){
        String tempreturnp11 = getCreditCardChecker10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String d_1id=  request.getParameter("d16");
        long d_1idTemp  = Long.parseLong(d_1id);
        int getSize13mtemp = sampleCreditCardCheckerProxyid.getSize(d_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getSize13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String number_2id=  request.getParameter("number21");
        int number_2idTemp  = Integer.parseInt(number_2id);
        int getDigit18mtemp = sampleCreditCardCheckerProxyid.getDigit(number_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getDigit18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 23:
        gotMethod = true;
        String number_3id=  request.getParameter("number26");
        long number_3idTemp  = Long.parseLong(number_3id);
        boolean isValid23mtemp = sampleCreditCardCheckerProxyid.isValid(number_3idTemp);
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(isValid23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
break;
case 28:
        gotMethod = true;
        String number_4id=  request.getParameter("number31");
        long number_4idTemp  = Long.parseLong(number_4id);
        String k_5id=  request.getParameter("k33");
        int k_5idTemp  = Integer.parseInt(k_5id);
        long getPrefix28mtemp = sampleCreditCardCheckerProxyid.getPrefix(number_4idTemp,k_5idTemp);
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getPrefix28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
break;
case 35:
        gotMethod = true;
        String number_6id=  request.getParameter("number38");
        long number_6idTemp  = Long.parseLong(number_6id);
        int sumOfDoubleEvenPlace35mtemp = sampleCreditCardCheckerProxyid.sumOfDoubleEvenPlace(number_6idTemp);
        String tempResultreturnp36 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sumOfDoubleEvenPlace35mtemp));
        %>
        <%= tempResultreturnp36 %>
        <%
break;
case 40:
        gotMethod = true;
        String number_7id=  request.getParameter("number43");
        long number_7idTemp  = Long.parseLong(number_7id);
        String d_8id=  request.getParameter("d45");
        int d_8idTemp  = Integer.parseInt(d_8id);
        boolean prefixMatched40mtemp = sampleCreditCardCheckerProxyid.prefixMatched(number_7idTemp,d_8idTemp);
        String tempResultreturnp41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(prefixMatched40mtemp));
        %>
        <%= tempResultreturnp41 %>
        <%
break;
case 47:
        gotMethod = true;
        String number_9id=  request.getParameter("number50");
        long number_9idTemp  = Long.parseLong(number_9id);
        int sumOfOddPlace47mtemp = sampleCreditCardCheckerProxyid.sumOfOddPlace(number_9idTemp);
        String tempResultreturnp48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sumOfOddPlace47mtemp));
        %>
        <%= tempResultreturnp48 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>