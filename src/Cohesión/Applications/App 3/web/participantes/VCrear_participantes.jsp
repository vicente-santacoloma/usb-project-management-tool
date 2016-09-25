<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VCrear_participantes.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1970449 {width: 400px; margin: 40px auto; }
        form#1970449 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970449 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970449 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970449 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970449 p#1970451_C {clear: both; width: 400px; }
          form#1970449 p#1970451_C label {clear: both; width: 400px; }
          form#1970449 p#1970451_C input {clear: both; width: 396px; }
          form#1970449 p#1970453_C {clear: both; width: 400px; }
          form#1970449 p#1970453_C label {clear: both; width: 400px; }
          form#1970449 p#1970453_C input {clear: both; width: 396px; }
          form#1970449 p#1970450_C {clear: both; width: 400px; }
          form#1970449 p#1970450_C label {clear: both; width: 400px; }
          form#1970449 p#1970450_C input {clear: both; width: 396px; }
          form#1970449 p#1970452_C {clear: both; width: 400px; }
          form#1970449 p#1970452_C label {clear: both; width: 400px; }
          form#1970449 p#1970452_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="VCrear_participantes.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APreBuscar_participantes.do"><bean:message key="VCrear_participantes.label1"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_participantes.do"><bean:message key="VCrear_participantes.label2"/><%-- Listar --%></html:link></li>

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
                <div class="box1970449"><html:form
                  action="/ACrear_participantes.do" method="post">
                  <html:hidden property="idParticipantes"/>
                  <p id="1970453_C"><label for="1970453"><bean:message key="FParticipantes.label1"/><%-- Nombre : --%></label><html:text styleId="1970453" property="nombre" size="30"/></p>
                  <p id="1970450_C"><label for="1970450"><bean:message key="FParticipantes.label2"/><%-- Usuario : --%></label><html:text styleId="1970450" property="usuario" size="30"/></p>
                  <p id="1970452_C"><label for="1970452"><bean:message key="FParticipantes.label3"/><%-- Clave : --%></label><html:text styleId="1970452" property="clave" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="VCrear_participantes.label0"/><%-- Crear --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VCrear_participantes">Ayuda</a></li></ul></div>
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