<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_actividadParticipante.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1969788 {width: 400px; margin: 40px auto; }
        form#1969788 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1969788 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1969788 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1969788 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1969788 p#1969792_C {clear: both; width: 400px; }
          form#1969788 p#1969792_C label {clear: both; width: 400px; }
          form#1969788 p#1969792_C input {clear: both; width: 396px; }
          form#1969788 p#1969790_C {clear: both; width: 400px; }
          form#1969788 p#1969790_C label {clear: both; width: 400px; }
          form#1969788 p#1969790_C input {clear: both; width: 396px; }
          form#1969788 p#1969794_C {clear: both; width: 400px; }
          form#1969788 p#1969794_C label {clear: both; width: 400px; }
          form#1969788 p#1969794_C input {clear: both; width: 396px; }
          form#1969788 p#1969791_C {clear: both; width: 400px; }
          form#1969788 p#1969791_C label {clear: both; width: 400px; }
          form#1969788 p#1969791_C input {clear: both; width: 396px; }
          form#1969788 p#1969793_C {clear: both; width: 400px; }
          form#1969788 p#1969793_C label {clear: both; width: 400px; }
          form#1969788 p#1969793_C input {clear: both; width: 396px; }
          form#1969788 p#1969789_C {clear: both; width: 400px; }
          form#1969788 p#1969789_C label {clear: both; width: 400px; }
          form#1969788 p#1969789_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
<script type="text/javascript">
jQuery(function($) {

  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_actividadParticipante.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_actividadParticipante.cond1"/>";</script><html:link action="/AElim_actividadParticipante.do" paramId="idActividadParticipante" paramName="idActividadParticipante" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_actividadParticipante.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadParticipante.do"><bean:message key="V_actividadParticipante.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreBuscar_actividadParticipante.do"><bean:message key="V_actividadParticipante.label3"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_actividadParticipante.do"><bean:message key="V_actividadParticipante.label4"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APre_participantes.do" paramId="idParticipantes" paramName="idParticipantes"><bean:message key="V_actividadParticipante.label5"/><%-- Participantes --%></html:link></li>
                    <li><html:link action="/APre_actividad.do" paramId="idActividad" paramName="idActividad"><bean:message key="V_actividadParticipante.label6"/><%-- Actividad --%></html:link></li>

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
                <div class="box1969788"><html:form
                  action="/AAct_actividadParticipante.do" method="post">
                  <html:hidden property="idActividadParticipante"/>
                  <p id="1969790_C"><label for="1969790"><bean:message key="FActividadParticipante.label1"/><%-- Actividad : --%></label><html:select styleId="1969790" property="actividad"><html:optionsCollection property="listActividad"/></html:select></p>
                  <p id="1969791_C"><label for="1969791"><bean:message key="FActividadParticipante.label3"/><%-- Participante : --%></label><html:select styleId="1969791" property="participante"><html:optionsCollection property="listParticipantes"/></html:select></p>
                  <p id="1969789_C"><label for="1969789"><bean:message key="FActividadParticipante.label5"/><%-- TiempoParticipacion : --%></label><html:text styleId="1969789" property="tiempoParticipacion" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_actividadParticipante.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_actividadParticipante">Ayuda</a></li></ul></div>
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