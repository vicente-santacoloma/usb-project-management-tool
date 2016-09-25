<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_participantes.title"/></title>
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
  $("#tabs").tabs({ spinner: 'Buscando los datos...',  selected: -1, collapsible: true });
  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_participantes.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_participantes.cond1"/>";</script><html:link action="/AElim_participantes.do" paramId="idParticipantes" paramName="idParticipantes" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_participantes.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_participantes.do"><bean:message key="V_participantes.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreBuscar_participantes.do"><bean:message key="V_participantes.label3"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_participantes.do"><bean:message key="V_participantes.label4"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APreCrear_rolParticipante_participantes.do" paramId="idParticipantes_super" paramName="idParticipantes_super"><bean:message key="V_participantes.label6"/><%-- + Roles --%></html:link></li>
                    <li><html:link action="/APreCrear_proyectoParticipante_participantes.do" paramId="idParticipantes_super" paramName="idParticipantes_super"><bean:message key="V_participantes.label8"/><%-- + Proyectos --%></html:link></li>
                    <li><html:link action="/APreCrear_actividadParticipante_participantes.do" paramId="idParticipantes_super" paramName="idParticipantes_super"><bean:message key="V_participantes.label10"/><%-- + Actividades --%></html:link></li>

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
                  action="/AAct_participantes.do" method="post">
                  <html:hidden property="idParticipantes"/>
                  <p id="1970453_C"><label for="1970453"><bean:message key="FParticipantes.label1"/><%-- Nombre : --%></label><html:text styleId="1970453" property="nombre" size="30"/></p>
                  <p id="1970450_C"><label for="1970450"><bean:message key="FParticipantes.label2"/><%-- Usuario : --%></label><html:text styleId="1970450" property="usuario" size="30"/></p>
                  <p id="1970452_C"><label for="1970452"><bean:message key="FParticipantes.label3"/><%-- Clave : --%></label><html:text styleId="1970452" property="clave" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_participantes.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

<div id="tabs">
<ul>
  <li><a href="#tab-1"><bean:message key="V_participantes.label5"/><%-- Roles --%></a></li>
  <li><a href="#tab-2"><bean:message key="V_participantes.label7"/><%-- Proyectos --%></a></li>
  <li><a href="#tab-3"><bean:message key="V_participantes.label9"/><%-- Actividades --%></a></li>

</ul>
  <div id="tab-1">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_participantes.label5.0"/><%-- IdRolParticipante --%></th>
              <th><bean:message key="V_participantes.label5.1"/><%-- Rol --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="rolParticipante" collection="${empty L_RolParticipante ? _vacio : L_RolParticipante}">
              <tr>
                  <td><html:link action="/APre_rolParticipante.do" paramId="idRolParticipante" paramName="rolParticipante" paramProperty="idRolParticipante">${empty rolParticipante.idRolParticipante ? "Editar" : rolParticipante.idRolParticipante}</html:link></td>
                  <td>${empty rolParticipante.rol ? "" : rolParticipante.rol.descripcion}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>
  <div id="tab-2">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_participantes.label7.3"/><%-- FechaIngreso --%></th>
              <th><bean:message key="V_participantes.label7.1"/><%-- Proyecto --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="proyectoParticipante" collection="${empty L_ProyectoParticipante ? _vacio : L_ProyectoParticipante}">
              <tr>
                  <td><html:link action="/APre_proyectoParticipante.do" paramId="idProyectoParticipante" paramName="proyectoParticipante" paramProperty="idProyectoParticipante">${empty proyectoParticipante.fechaIngreso ? "Editar" : proyectoParticipante.fechaIngreso}</html:link></td>
                  <td>${empty proyectoParticipante.proyecto ? "" : proyectoParticipante.proyecto.nombre}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>
  <div id="tab-3">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_participantes.label9.3"/><%-- TiempoParticipacion --%></th>
              <th><bean:message key="V_participantes.label9.1"/><%-- Actividad --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="actividadParticipante" collection="${empty L_ActividadParticipante ? _vacio : L_ActividadParticipante}">
              <tr>
                  <td><html:link action="/APre_actividadParticipante.do" paramId="idActividadParticipante" paramName="actividadParticipante" paramProperty="idActividadParticipante">${empty actividadParticipante.tiempoParticipacion ? "Editar" : actividadParticipante.tiempoParticipacion}</html:link></td>
                  <td>${empty actividadParticipante.actividad ? "" : actividadParticipante.actividad.fechaInicio}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>

</div>                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_participantes">Ayuda</a></li></ul></div>
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