<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_artefacto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1970108 {width: 400px; margin: 40px auto; }
        form#1970108 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970108 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970108 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970108 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970108 p#1970112_C {clear: both; width: 400px; }
          form#1970108 p#1970112_C label {clear: both; width: 400px; }
          form#1970108 p#1970112_C input {clear: both; width: 396px; }
          form#1970108 p#1970110_C {clear: both; width: 400px; }
          form#1970108 p#1970110_C label {clear: both; width: 400px; }
          form#1970108 p#1970110_C input {clear: both; width: 396px; }
          form#1970108 p#1970109_C {clear: both; width: 400px; }
          form#1970108 p#1970109_C label {clear: both; width: 400px; }
          form#1970108 p#1970109_C input {clear: both; width: 396px; }
          form#1970108 p#1970113_C {clear: both; width: 400px; }
          form#1970108 p#1970113_C label {clear: both; width: 400px; }
          form#1970108 p#1970113_C input {clear: both; width: 396px; }
          form#1970108 p#1970114_C {clear: both; width: 400px; }
          form#1970108 p#1970114_C label {clear: both; width: 400px; }
          form#1970108 p#1970114_C input {clear: both; width: 396px; }
          form#1970108 p#1970111_C {clear: both; width: 400px; }
          form#1970108 p#1970111_C label {clear: both; width: 400px; }
          form#1970108 p#1970111_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
<script type="text/javascript">
jQuery(function($) {
  $("#tabs").tabs({ spinner: 'Buscando los datos...',  selected: -1, collapsible: true });
  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_artefacto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_artefacto.cond1"/>";</script><html:link action="/AElim_artefacto.do" paramId="idArtefacto" paramName="idArtefacto" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_artefacto.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_artefacto.do"><bean:message key="V_artefacto.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreBuscar_artefacto.do"><bean:message key="V_artefacto.label3"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_artefacto.do"><bean:message key="V_artefacto.label4"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadArtefacto_artefacto.do" paramId="idArtefacto_super" paramName="idArtefacto_super"><bean:message key="V_artefacto.label6"/><%-- + Usos --%></html:link></li>

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
                <div class="box1970108"><html:form
                  action="/AAct_artefacto.do" method="post">
                  <html:hidden property="idArtefacto"/>
                  <p id="1970110_C"><label for="1970110"><bean:message key="FArtefacto.label1"/><%-- Titulo : --%></label><html:text styleId="1970110" property="titulo" size="30"/></p>
                  <p id="1970109_C"><label for="1970109"><bean:message key="FArtefacto.label2"/><%-- Tamano : --%></label><html:text styleId="1970109" property="tamano" size="30"/></p>
                  <p id="1970113_C"><label for="1970113"><bean:message key="FArtefacto.label3"/><%-- Contenido : --%></label><html:text styleId="1970113" property="contenido" size="30"/></p>
                  <p id="1970114_C"><label for="1970114"><bean:message key="FArtefacto.label4"/><%-- Actividad : --%></label><html:select styleId="1970114" property="actividad"><html:optionsCollection property="listActividad"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_artefacto.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

<div id="tabs">
<ul>
  <li><a href="#tab-1"><bean:message key="V_artefacto.label5"/><%-- Usos --%></a></li>

</ul>
  <div id="tab-1">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_artefacto.label5.0"/><%-- IdActividadArtefacto --%></th>
              <th><bean:message key="V_artefacto.label5.1"/><%-- Actividad --%></th>
              <th><bean:message key="V_artefacto.label5.2"/><%-- Artefacto --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="actividadArtefacto" collection="${empty L_ActividadArtefacto ? _vacio : L_ActividadArtefacto}">
              <tr>
                  <td><html:link action="/APre_actividadArtefacto.do" paramId="idActividadArtefacto" paramName="actividadArtefacto" paramProperty="idActividadArtefacto">${empty actividadArtefacto.idActividadArtefacto ? "Editar" : actividadArtefacto.idActividadArtefacto}</html:link></td>
                  <td>${empty actividadArtefacto.actividad ? "" : actividadArtefacto.actividad.fechaInicio}</td>
                  <td>${empty actividadArtefacto.artefacto ? "" : actividadArtefacto.artefacto.titulo}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>

</div>                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_artefacto">Ayuda</a></li></ul></div>
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