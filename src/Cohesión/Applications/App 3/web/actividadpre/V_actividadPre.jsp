<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_actividadPre.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1969984 {width: 400px; margin: 40px auto; }
        form#1969984 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1969984 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1969984 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1969984 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1969984 p#1969985_C {clear: both; width: 400px; }
          form#1969984 p#1969985_C label {clear: both; width: 400px; }
          form#1969984 p#1969985_C input {clear: both; width: 396px; }
          form#1969984 p#1969987_C {clear: both; width: 400px; }
          form#1969984 p#1969987_C label {clear: both; width: 400px; }
          form#1969984 p#1969987_C input {clear: both; width: 396px; }
          form#1969984 p#1969988_C {clear: both; width: 400px; }
          form#1969984 p#1969988_C label {clear: both; width: 400px; }
          form#1969984 p#1969988_C input {clear: both; width: 396px; }
          form#1969984 p#1969986_C {clear: both; width: 400px; }
          form#1969984 p#1969986_C label {clear: both; width: 400px; }
          form#1969984 p#1969986_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="V_actividadPre.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_actividadPre.cond1"/>";</script><html:link action="/AElim_actividadPre.do" paramId="idActividadPre" paramName="idActividadPre" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_actividadPre.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadPre.do"><bean:message key="V_actividadPre.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreListar_actividadPre.do"><bean:message key="V_actividadPre.label3"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APre_actividad.do" paramId="idActividad" paramName="idActividad"><bean:message key="V_actividadPre.label4"/><%-- Actividad --%></html:link></li>

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
                <div class="box1969984"><html:form
                  action="/AAct_actividadPre.do" method="post">
                  <html:hidden property="idActividadPre"/>
                  <p id="1969987_C"><label for="1969987"><bean:message key="FActividadPre.label1"/><%-- Prerequisito : --%></label><html:select styleId="1969987" property="prerequisito"><html:optionsCollection property="listActividad"/></html:select></p>
                  <p id="1969986_C"><label for="1969986"><bean:message key="FActividadPre.label3"/><%-- Actividad : --%></label><html:select styleId="1969986" property="actividad"><html:optionsCollection property="listActividad"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_actividadPre.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_actividadPre">Ayuda</a></li></ul></div>
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