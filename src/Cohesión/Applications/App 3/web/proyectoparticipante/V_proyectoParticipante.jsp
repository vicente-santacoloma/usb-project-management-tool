<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_proyectoParticipante.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="_js/jquery.ui.datepicker-es.js"></script>
        <style type="text/css">
        div#box1970747 {width: 400px; margin: 40px auto; }
        form#1970747 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970747 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970747 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970747 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970747 p#1970749_C {clear: both; width: 400px; }
          form#1970747 p#1970749_C label {clear: both; width: 400px; }
          form#1970747 p#1970749_C input {clear: both; width: 396px; }
          form#1970747 p#1970752_C {clear: both; width: 400px; }
          form#1970747 p#1970752_C label {clear: both; width: 400px; }
          form#1970747 p#1970752_C input {clear: both; width: 396px; }
          form#1970747 p#1970748_C {clear: both; width: 400px; }
          form#1970747 p#1970748_C label {clear: both; width: 400px; }
          form#1970747 p#1970748_C input {clear: both; width: 396px; }
          form#1970747 p#1970751_C {clear: both; width: 400px; }
          form#1970747 p#1970751_C label {clear: both; width: 400px; }
          form#1970747 p#1970751_C input {clear: both; width: 396px; }
          form#1970747 p#1970750_C {clear: both; width: 400px; }
          form#1970747 p#1970750_C label {clear: both; width: 400px; }
          form#1970747 p#1970750_C input {clear: both; width: 396px; }
          form#1970747 p#1970753_C {clear: both; width: 400px; }
          form#1970747 p#1970753_C label {clear: both; width: 400px; }
          form#1970747 p#1970753_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
<script type="text/javascript">
jQuery(function($) {
  $( "#1970753" ).datepicker();

  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_proyectoParticipante.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_proyectoParticipante.cond1"/>";</script><html:link action="/AElim_proyectoParticipante.do" paramId="idProyectoParticipante" paramName="idProyectoParticipante" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_proyectoParticipante.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_proyectoParticipante.do"><bean:message key="V_proyectoParticipante.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreBuscar_proyectoParticipante.do"><bean:message key="V_proyectoParticipante.label3"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_proyectoParticipante.do"><bean:message key="V_proyectoParticipante.label4"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APre_participantes.do" paramId="idParticipantes" paramName="idParticipantes"><bean:message key="V_proyectoParticipante.label5"/><%-- Participantes --%></html:link></li>

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
                <div class="box1970747"><html:form
                  action="/AAct_proyectoParticipante.do" method="post">
                  <html:hidden property="idProyectoParticipante"/>
                  <p id="1970752_C"><label for="1970752"><bean:message key="FProyectoParticipante.label1"/><%-- Proyecto : --%></label><html:select styleId="1970752" property="proyecto"><html:optionsCollection property="listProyecto"/></html:select></p>
                  <p id="1970751_C"><label for="1970751"><bean:message key="FProyectoParticipante.label3"/><%-- Participante : --%></label><html:select styleId="1970751" property="participante"><html:optionsCollection property="listParticipantes"/></html:select></p>
                  <p id="1970753_C"><label for="1970753"><bean:message key="FProyectoParticipante.label5"/><%-- FechaIngreso : --%></label><html:text styleId="1970753" property="fechaIngreso" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_proyectoParticipante.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_proyectoParticipante">Ayuda</a></li></ul></div>
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