<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_actividadArtefacto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1969668 {width: 400px; margin: 40px auto; }
        form#1969668 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1969668 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1969668 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1969668 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1969668 p#1969671_C {clear: both; width: 400px; }
          form#1969668 p#1969671_C label {clear: both; width: 400px; }
          form#1969668 p#1969671_C input {clear: both; width: 396px; }
          form#1969668 p#1969673_C {clear: both; width: 400px; }
          form#1969668 p#1969673_C label {clear: both; width: 400px; }
          form#1969668 p#1969673_C input {clear: both; width: 396px; }
          form#1969668 p#1969669_C {clear: both; width: 400px; }
          form#1969668 p#1969669_C label {clear: both; width: 400px; }
          form#1969668 p#1969669_C input {clear: both; width: 396px; }
          form#1969668 p#1969672_C {clear: both; width: 400px; }
          form#1969668 p#1969672_C label {clear: both; width: 400px; }
          form#1969668 p#1969672_C input {clear: both; width: 396px; }
          form#1969668 p#1969670_C {clear: both; width: 400px; }
          form#1969668 p#1969670_C label {clear: both; width: 400px; }
          form#1969668 p#1969670_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="V_actividadArtefacto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_actividadArtefacto.cond1"/>";</script><html:link action="/AElim_actividadArtefacto.do" paramId="idActividadArtefacto" paramName="idActividadArtefacto" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_actividadArtefacto.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadArtefacto.do"><bean:message key="V_actividadArtefacto.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreListar_actividadArtefacto.do"><bean:message key="V_actividadArtefacto.label3"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APre_artefacto.do" paramId="idArtefacto" paramName="idArtefacto"><bean:message key="V_actividadArtefacto.label4"/><%-- Artefacto --%></html:link></li>

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
                <div class="box1969668"><html:form
                  action="/AAct_actividadArtefacto.do" method="post">
                  <html:hidden property="idActividadArtefacto"/>
                  <p id="1969673_C"><label for="1969673"><bean:message key="FActividadArtefacto.label1"/><%-- Actividad : --%></label><html:select styleId="1969673" property="actividad"><html:optionsCollection property="listActividad"/></html:select></p>
                  <p id="1969672_C"><label for="1969672"><bean:message key="FActividadArtefacto.label3"/><%-- Artefacto : --%></label><html:select styleId="1969672" property="artefacto"><html:optionsCollection property="listArtefacto"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_actividadArtefacto.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_actividadArtefacto">Ayuda</a></li></ul></div>
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