<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VCrear_rolParticipante_participantes.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1971136 {width: 400px; margin: 40px auto; }
        form#1971136 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1971136 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1971136 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1971136 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1971136 p#1971137_C {clear: both; width: 400px; }
          form#1971136 p#1971137_C label {clear: both; width: 400px; }
          form#1971136 p#1971137_C input {clear: both; width: 396px; }
          form#1971136 p#1971141_C {clear: both; width: 400px; }
          form#1971136 p#1971141_C label {clear: both; width: 400px; }
          form#1971136 p#1971141_C input {clear: both; width: 396px; }
          form#1971136 p#1971139_C {clear: both; width: 400px; }
          form#1971136 p#1971139_C label {clear: both; width: 400px; }
          form#1971136 p#1971139_C input {clear: both; width: 396px; }
          form#1971136 p#1971138_C {clear: both; width: 400px; }
          form#1971136 p#1971138_C label {clear: both; width: 400px; }
          form#1971136 p#1971138_C input {clear: both; width: 396px; }
          form#1971136 p#1971140_C {clear: both; width: 400px; }
          form#1971136 p#1971140_C label {clear: both; width: 400px; }
          form#1971136 p#1971140_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="VCrear_rolParticipante_participantes.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APre_participantes.do" paramId="idParticipantes" paramName="idParticipantes"><bean:message key="VCrear_rolParticipante_participantes.label1"/><%-- Participantes --%></html:link></li>

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
                <div class="box1971136"><html:form
                  action="/ACrear_rolParticipante.do" method="post">
                  <html:hidden property="idRolParticipante"/>
                  <p id="1971141_C"><label for="1971141"><bean:message key="FRolParticipante.label1"/><%-- Rol : --%></label><html:select styleId="1971141" property="rol"><html:optionsCollection property="listRol"/></html:select></p>
                  <p id="1971138_C"><label for="1971138"><bean:message key="FRolParticipante.label3"/><%-- Participante : --%></label><html:select styleId="1971138" property="participante"><html:optionsCollection property="listParticipantes"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="VCrear_rolParticipante_participantes.label0"/><%-- Crear --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VCrear_rolParticipante_participantes">Ayuda</a></li></ul></div>
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