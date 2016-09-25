<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_CreacionActividad.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="_js/jquery.ui.datepicker-es.js"></script>
        <style type="text/css">
        div#box1969518 {width: 400px; margin: 40px auto; }
        form#1969518 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1969518 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1969518 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1969518 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1969518 p#1969524_C {clear: both; width: 400px; }
          form#1969518 p#1969524_C label {clear: both; width: 400px; }
          form#1969518 p#1969524_C input {clear: both; width: 396px; }
          form#1969518 p#1969523_C {clear: both; width: 400px; }
          form#1969518 p#1969523_C label {clear: both; width: 400px; }
          form#1969518 p#1969523_C input {clear: both; width: 396px; }
          form#1969518 p#1969528_C {clear: both; width: 400px; }
          form#1969518 p#1969528_C label {clear: both; width: 400px; }
          form#1969518 p#1969528_C input {clear: both; width: 396px; }
          form#1969518 p#1969527_C {clear: both; width: 400px; }
          form#1969518 p#1969527_C label {clear: both; width: 400px; }
          form#1969518 p#1969527_C input {clear: both; width: 396px; }
          form#1969518 p#1969525_C {clear: both; width: 400px; }
          form#1969518 p#1969525_C label {clear: both; width: 400px; }
          form#1969518 p#1969525_C input {clear: both; width: 396px; }
          form#1969518 p#1969526_C {clear: both; width: 400px; }
          form#1969518 p#1969526_C label {clear: both; width: 400px; }
          form#1969518 p#1969526_C input {clear: both; width: 396px; }
          form#1969518 p#1969519_C {clear: both; width: 400px; }
          form#1969518 p#1969519_C label {clear: both; width: 400px; }
          form#1969518 p#1969519_C input {clear: both; width: 396px; }
          form#1969518 p#1969520_C {clear: both; width: 400px; }
          form#1969518 p#1969520_C label {clear: both; width: 400px; }
          form#1969518 p#1969520_C input {clear: both; width: 396px; }
          form#1969518 p#1969522_C {clear: both; width: 400px; }
          form#1969518 p#1969522_C label {clear: both; width: 400px; }
          form#1969518 p#1969522_C input {clear: both; width: 396px; }
          form#1969518 p#1969521_C {clear: both; width: 400px; }
          form#1969518 p#1969521_C label {clear: both; width: 400px; }
          form#1969518 p#1969521_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
<script type="text/javascript">
jQuery(function($) {
  $( "#1969527" ).datepicker();
  $( "#1969525" ).datepicker();

});</script>        <div id="header">
            <div id="title"><bean:message key="V_CreacionActividad.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_PreCreacionActividad.do"><bean:message key="V_CreacionActividad.label1"/><%-- Creacion Actividad --%></html:link></li>

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
                <div class="box1969518"><html:form
                  action="/A_CrearActividad.do" method="post">
                  <html:hidden property="idActividad"/>
                  <p id="1969523_C"><label for="1969523"><bean:message key="FActividad.label1"/><%-- Descripcion : --%></label><html:text styleId="1969523" property="descripcion" size="30"/></p>
                  <p id="1969528_C"><label for="1969528"><bean:message key="FActividad.label2"/><%-- Avance : --%></label><html:text styleId="1969528" property="avance" size="30"/></p>
                  <p id="1969527_C"><label for="1969527"><bean:message key="FActividad.label3"/><%-- FechaInicio : --%></label><html:text styleId="1969527" property="fechaInicio" size="30"/></p>
                  <p id="1969525_C"><label for="1969525"><bean:message key="FActividad.label4"/><%-- FechaFin : --%></label><html:text styleId="1969525" property="fechaFin" size="30"/></p>
                  <p id="1969526_C"><label for="1969526"><bean:message key="FActividad.label5"/><%-- Superactividad : --%></label><html:select styleId="1969526" property="superactividad"><html:optionsCollection property="listActividad"/></html:select></p>
                  <p id="1969520_C"><label for="1969520"><bean:message key="FActividad.label7"/><%-- Proyecto : --%></label><html:select styleId="1969520" property="proyecto"><html:optionsCollection property="listProyecto"/></html:select></p>
                  <p id="1969521_C"><label for="1969521"><bean:message key="FActividad.label9"/><%-- TiempoEstimado : --%></label><html:text styleId="1969521" property="tiempoEstimado" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_CreacionActividad.label0"/><%-- Crear Actividad --%></html:submit>
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