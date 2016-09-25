<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_IniciarSesion.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box2018659 {width: 400px; margin: 40px auto; }
        form#2018659 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2018659 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2018659 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2018659 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2018659 p#2018661_C {clear: both; width: 400px; }
          form#2018659 p#2018661_C label {clear: both; width: 400px; }
          form#2018659 p#2018661_C input {clear: both; width: 396px; }
          form#2018659 p#2018664_C {clear: both; width: 400px; }
          form#2018659 p#2018664_C label {clear: both; width: 400px; }
          form#2018659 p#2018664_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_IniciarSesion.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="124"><html:link action="/A_PreIniciarSesion.do"><bean:message key="V_IniciarSesion.label1"/><%-- Pre Iniciar Sesion --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="64"><html:link action="/A_PreRecuperarContrasena.do"><bean:message key="V_IniciarSesion.label2"/><%-- Recuperar Contrasena --%></html:link></cohesion:actor></li>

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
                <div class="box2018659"><html:form
                  action="/A_IniciarSesion.do" method="post">
                  <p id="2018661_C"><label for="2018661"><bean:message key="FIniciarSesion.label0"/><%-- Usuario --%></label><html:text styleId="2018661" property="usuario" size="30"/></p>
                  <p id="2018664_C"><label for="2018664"><bean:message key="FIniciarSesion.label1"/><%-- Clave --%></label><html:password styleId="2018664" property="clave" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_IniciarSesion.label0"/><%-- Iniciar Sesion --%></html:submit>
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