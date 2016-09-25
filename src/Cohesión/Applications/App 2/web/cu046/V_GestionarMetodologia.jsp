<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="cUBwtpboiYTTVaCpgdWJiQ==">
        <title><bean:message key="V_GestionarMetodologia.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box1970277 {width: 400px; margin: 40px auto; }
        form#1970277 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970277 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970277 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970277 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970277 p#1970280_C {clear: both; width: 400px; }
          form#1970277 p#1970280_C label {clear: both; width: 400px; }
          form#1970277 p#1970280_C input {clear: both; width: 396px; }
          form#1970277 p#1970282_C {clear: both; width: 400px; }
          form#1970277 p#1970282_C label {clear: both; width: 400px; }
          form#1970277 p#1970282_C input {clear: both; width: 396px; }
          form#1970277 p#1970279_C {clear: both; width: 400px; }
          form#1970277 p#1970279_C label {clear: both; width: 400px; }
          form#1970277 p#1970279_C input {clear: both; width: 396px; }
          form#1970277 p#1970278_C {clear: both; width: 400px; }
          form#1970277 p#1970278_C label {clear: both; width: 400px; }
          form#1970277 p#1970278_C input {clear: both; width: 396px; }
          form#1970277 p#1970281_C {clear: both; width: 400px; }
          form#1970277 p#1970281_C label {clear: both; width: 400px; }
          form#1970277 p#1970281_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_GestionarMetodologia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="2"><html:link action="/A_PreEliminarMetodologia.do"><bean:message key="V_GestionarMetodologia.label0"/><%-- Eliminar Metodologia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="2"><html:link action="/A_PreEditarMetodologia.do"><bean:message key="V_GestionarMetodologia.label1"/><%-- Editar Metodologia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="17"><html:link action="/A_CargaMetodologia.do"><bean:message key="V_GestionarMetodologia.label3"/><%-- A_CargaMetodologia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="31"><html:link action="/A_CerrarSesion.do"><bean:message key="V_GestionarMetodologia.label4"/><%-- A_CerrarSesion --%></html:link></cohesion:actor></li>

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
                <div class="box1970277"><html:form
                  action="/A_PreCrearMetodologia.do" method="post">
                  <html:hidden property="idMetodologia"/>
                  <p id="1970282_C"><label for="1970282"><bean:message key="FMetodologia.label1"/><%-- Nombre : --%></label><html:text styleId="1970282" property="nombre" size="30"/></p>
                  <p id="1970279_C"><label for="1970279"><bean:message key="FMetodologia.label2"/><%-- Clasificacion : --%></label><html:text styleId="1970279" property="clasificacion" size="30"/></p>
                  <p id="1970278_C"><label for="1970278"><bean:message key="FMetodologia.label3"/><%-- ProyectoModelo : --%></label><html:select styleId="1970278" property="proyectoModelo"><html:optionsCollection property="listProyecto"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_GestionarMetodologia.label2"/><%-- A_PreCrearMetodologia --%></html:submit>
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