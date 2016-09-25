<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_actividad.title"/></title>
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
  $("#tabs").tabs({ spinner: 'Buscando los datos...',  selected: -1, collapsible: true });  $( "#1969527" ).datepicker();
  $( "#1969525" ).datepicker();

  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_actividad.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_actividad.cond1"/>";</script><html:link action="/AElim_actividad.do" paramId="idActividad" paramName="idActividad" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_actividad.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_actividad_actividad.do" paramId="idActividad_super" paramName="idActividad_super"><bean:message key="V_actividad.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APre_actividad.do" paramId="idActividad" paramName="idActividad"><bean:message key="V_actividad.label3"/><%-- Actividad --%></html:link></li>
                    <li><html:link action="/APre_proyecto.do" paramId="idProyecto" paramName="idProyecto"><bean:message key="V_actividad.label4"/><%-- Proyecto --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadParticipante_actividad.do" paramId="idActividad_super" paramName="idActividad_super"><bean:message key="V_actividad.label6"/><%-- + Participantes --%></html:link></li>
                    <li><html:link action="/APreCrear_rolActividad_actividad.do" paramId="idActividad_super" paramName="idActividad_super"><bean:message key="V_actividad.label8"/><%-- + Roles --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadPre_actividad.do" paramId="idActividad_super" paramName="idActividad_super"><bean:message key="V_actividad.label10"/><%-- + Prerequisitos --%></html:link></li>
                    <li><html:link action="/APreCrear_actividad_actividad.do" paramId="idActividad_super" paramName="idActividad_super"><bean:message key="V_actividad.label12"/><%-- + Sucesores --%></html:link></li>

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
                  action="/AAct_actividad.do" method="post">
                  <html:hidden property="idActividad"/>
                  <p id="1969523_C"><label for="1969523"><bean:message key="FActividad.label1"/><%-- Descripcion : --%></label><html:text styleId="1969523" property="descripcion" size="30"/></p>
                  <p id="1969528_C"><label for="1969528"><bean:message key="FActividad.label2"/><%-- Avance : --%></label><html:text styleId="1969528" property="avance" size="30"/></p>
                  <p id="1969527_C"><label for="1969527"><bean:message key="FActividad.label3"/><%-- FechaInicio : --%></label><html:text styleId="1969527" property="fechaInicio" size="30"/></p>
                  <p id="1969525_C"><label for="1969525"><bean:message key="FActividad.label4"/><%-- FechaFin : --%></label><html:text styleId="1969525" property="fechaFin" size="30"/></p>
                  <p id="1969526_C"><label for="1969526"><bean:message key="FActividad.label5"/><%-- Superactividad : --%></label><html:select styleId="1969526" property="superactividad"><html:optionsCollection property="listActividad"/></html:select></p>
                  <p id="1969520_C"><label for="1969520"><bean:message key="FActividad.label7"/><%-- Proyecto : --%></label><html:select styleId="1969520" property="proyecto"><html:optionsCollection property="listProyecto"/></html:select></p>
                  <p id="1969521_C"><label for="1969521"><bean:message key="FActividad.label9"/><%-- TiempoEstimado : --%></label><html:text styleId="1969521" property="tiempoEstimado" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_actividad.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

<div id="tabs">
<ul>
  <li><a href="#tab-3"><bean:message key="V_actividad.label5"/><%-- Participantes --%></a></li>
  <li><a href="#tab-4"><bean:message key="V_actividad.label7"/><%-- Roles --%></a></li>
  <li><a href="#tab-5"><bean:message key="V_actividad.label9"/><%-- Prerequisitos --%></a></li>
  <li><a href="#tab-6"><bean:message key="V_actividad.label11"/><%-- Sucesores --%></a></li>

</ul>
  <div id="tab-3">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_actividad.label5.3"/><%-- TiempoParticipacion --%></th>
              <th><bean:message key="V_actividad.label5.2"/><%-- Participante --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="actividadParticipante" collection="${empty L_ActividadParticipante ? _vacio : L_ActividadParticipante}">
              <tr>
                  <td><html:link action="/APre_actividadParticipante.do" paramId="idActividadParticipante" paramName="actividadParticipante" paramProperty="idActividadParticipante">${empty actividadParticipante.tiempoParticipacion ? "Editar" : actividadParticipante.tiempoParticipacion}</html:link></td>
                  <td>${empty actividadParticipante.participante ? "" : actividadParticipante.participante.nombre}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>
  <div id="tab-4">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_actividad.label7.0"/><%-- IdRolActividad --%></th>
              <th><bean:message key="V_actividad.label7.1"/><%-- Rol --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="rolActividad" collection="${empty L_RolActividad ? _vacio : L_RolActividad}">
              <tr>
                  <td><html:link action="/APre_rolActividad.do" paramId="idRolActividad" paramName="rolActividad" paramProperty="idRolActividad">${empty rolActividad.idRolActividad ? "Editar" : rolActividad.idRolActividad}</html:link></td>
                  <td>${empty rolActividad.rol ? "" : rolActividad.rol.descripcion}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>
  <div id="tab-5">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_actividad.label9.0"/><%-- IdActividadPre --%></th>
              <th><bean:message key="V_actividad.label9.2"/><%-- Actividad --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="actividadPre" collection="${empty L_ActividadPre ? _vacio : L_ActividadPre}">
              <tr>
                  <td><html:link action="/APre_actividadPre.do" paramId="idActividadPre" paramName="actividadPre" paramProperty="idActividadPre">${empty actividadPre.idActividadPre ? "Editar" : actividadPre.idActividadPre}</html:link></td>
                  <td>${empty actividadPre.actividad ? "" : actividadPre.actividad.fechaInicio}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>
  <div id="tab-6">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_actividad.label11.1"/><%-- Descripcion --%></th>
              <th><bean:message key="V_actividad.label11.2"/><%-- Avance --%></th>
              <th><bean:message key="V_actividad.label11.3"/><%-- FechaInicio --%></th>
              <th><bean:message key="V_actividad.label11.4"/><%-- FechaFin --%></th>
              <th><bean:message key="V_actividad.label11.9"/><%-- Proyecto --%></th>
              <th><bean:message key="V_actividad.label11.11"/><%-- TiempoEstimado --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="actividad" collection="${empty L_Actividad ? _vacio : L_Actividad}">
              <tr>
                  <td><html:link action="/APre_actividad.do" paramId="idActividad" paramName="actividad" paramProperty="idActividad">${empty actividad.descripcion ? "Editar" : actividad.descripcion}</html:link></td>
                  <td>${actividad.avance}</td>
                  <td>${actividad.fechaInicio}</td>
                  <td>${actividad.fechaFin}</td>
                  <td>${empty actividad.proyecto ? "" : actividad.proyecto.nombre}</td>
                  <td>${actividad.tiempoEstimado}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>

</div>                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_actividad">Ayuda</a></li></ul></div>
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