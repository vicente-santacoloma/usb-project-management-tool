<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VCrear_metodologia.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
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
<script type="text/javascript">
jQuery(function($) {

  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="VCrear_metodologia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APreBuscar_metodologia.do"><bean:message key="VCrear_metodologia.label1"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_metodologia.do"><bean:message key="VCrear_metodologia.label2"/><%-- Listar --%></html:link></li>

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
                  action="/ACrear_metodologia.do" method="post">
                  <html:hidden property="idMetodologia"/>
                  <p id="1970282_C"><label for="1970282"><bean:message key="FMetodologia.label1"/><%-- Nombre : --%></label><html:text styleId="1970282" property="nombre" size="30"/></p>
                  <p id="1970279_C"><label for="1970279"><bean:message key="FMetodologia.label2"/><%-- Clasificacion : --%></label><html:text styleId="1970279" property="clasificacion" size="30"/></p>
                  <p id="1970278_C"><label for="1970278"><bean:message key="FMetodologia.label3"/><%-- ProyectoModelo : --%></label><html:select styleId="1970278" property="proyectoModelo"><html:optionsCollection property="listProyecto"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="VCrear_metodologia.label0"/><%-- Crear --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VCrear_metodologia">Ayuda</a></li></ul></div>
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