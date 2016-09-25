<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VCrear_rolActividad.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1971012 {width: 400px; margin: 40px auto; }
        form#1971012 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1971012 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1971012 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1971012 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1971012 p#1971017_C {clear: both; width: 400px; }
          form#1971012 p#1971017_C label {clear: both; width: 400px; }
          form#1971012 p#1971017_C input {clear: both; width: 396px; }
          form#1971012 p#1971016_C {clear: both; width: 400px; }
          form#1971012 p#1971016_C label {clear: both; width: 400px; }
          form#1971012 p#1971016_C input {clear: both; width: 396px; }
          form#1971012 p#1971015_C {clear: both; width: 400px; }
          form#1971012 p#1971015_C label {clear: both; width: 400px; }
          form#1971012 p#1971015_C input {clear: both; width: 396px; }
          form#1971012 p#1971014_C {clear: both; width: 400px; }
          form#1971012 p#1971014_C label {clear: both; width: 400px; }
          form#1971012 p#1971014_C input {clear: both; width: 396px; }
          form#1971012 p#1971013_C {clear: both; width: 400px; }
          form#1971012 p#1971013_C label {clear: both; width: 400px; }
          form#1971012 p#1971013_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="VCrear_rolActividad.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APreListar_rolActividad.do"><bean:message key="VCrear_rolActividad.label1"/><%-- Listar --%></html:link></li>

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
                <div class="box1971012"><html:form
                  action="/ACrear_rolActividad.do" method="post">
                  <html:hidden property="idRolActividad"/>
                  <p id="1971016_C"><label for="1971016"><bean:message key="FRolActividad.label1"/><%-- Rol : --%></label><html:select styleId="1971016" property="rol"><html:optionsCollection property="listRol"/></html:select></p>
                  <p id="1971014_C"><label for="1971014"><bean:message key="FRolActividad.label3"/><%-- Actividad : --%></label><html:select styleId="1971014" property="actividad"><html:optionsCollection property="listActividad"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="VCrear_rolActividad.label0"/><%-- Crear --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VCrear_rolActividad">Ayuda</a></li></ul></div>
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