<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="IDQfqIW81cYhbhcH1SJ3OA==">
        <title><bean:message key="V_RecuperarContrasena.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box2023302 {width: 400px; margin: 40px auto; }
        form#2023302 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2023302 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2023302 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2023302 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2023302 p#2023304_C {clear: both; width: 400px; }
          form#2023302 p#2023304_C label {clear: both; width: 400px; }
          form#2023302 p#2023304_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_RecuperarContrasena.title"/></div>
            <div id="menu">
                <ul id="nav">
                </ul>
            </div>
        </div>
        <div id="body_wrapper">
            <div id="body">
                <div id="split">
                    <div class="top"></div>
                    <div id="left">
                        <div class="content">
                            ${empty msg ? "" : msg}
                <div class="box2023302"><html:form
                  action="/A_RecuperarContrasena.do" method="post">
                  <p id="2023304_C"><label for="2023304"><bean:message key="FRecuperarContrasena.label0"/><%-- Usuario --%></label><html:text styleId="2023304" property="usuario" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_RecuperarContrasena.label0"/><%-- A_RecuperarContrasena --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"></div>
                    <div class="clearer"></div>
                    <div class="bottom"></div>
                </div>
                <div class="clearer"></div>
            </div>
            <div class="clearer"></div>
        </div>
        <div id="end_body"></div>
        <div id="footer"> <bean:message key="bottom.label"/> </div>
        
    </body>
</html:html>