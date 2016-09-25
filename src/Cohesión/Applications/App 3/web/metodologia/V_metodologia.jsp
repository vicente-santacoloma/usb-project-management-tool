<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_metodologia.title"/></title>
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
  $("#tabs").tabs({ spinner: 'Buscando los datos...',  selected: -1, collapsible: true });
  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_metodologia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><script type="text/javascript">var _msg1 = "<bean:message key="V_metodologia.cond1"/>";</script><html:link action="/AElim_metodologia.do" paramId="idMetodologia" paramName="idMetodologia" onclick="if(!confirm(_msg1)) return false;"><bean:message key="V_metodologia.label1"/><%-- Eliminar --%></html:link></li>
                    <li><html:link action="/APreCrear_metodologia.do"><bean:message key="V_metodologia.label2"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreBuscar_metodologia.do"><bean:message key="V_metodologia.label3"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_metodologia.do"><bean:message key="V_metodologia.label4"/><%-- Listar --%></html:link></li>
                    <li><html:link action="/APreCrear_proyecto_metodologia.do" paramId="idMetodologia_super" paramName="idMetodologia_super"><bean:message key="V_metodologia.label6"/><%-- + Proyectos --%></html:link></li>
                    <li><html:link action="/APreCrear_rol_metodologia.do" paramId="idMetodologia_super" paramName="idMetodologia_super"><bean:message key="V_metodologia.label8"/><%-- + Roles --%></html:link></li>

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
                  action="/AAct_metodologia.do" method="post">
                  <html:hidden property="idMetodologia"/>
                  <p id="1970282_C"><label for="1970282"><bean:message key="FMetodologia.label1"/><%-- Nombre : --%></label><html:text styleId="1970282" property="nombre" size="30"/></p>
                  <p id="1970279_C"><label for="1970279"><bean:message key="FMetodologia.label2"/><%-- Clasificacion : --%></label><html:text styleId="1970279" property="clasificacion" size="30"/></p>
                  <p id="1970278_C"><label for="1970278"><bean:message key="FMetodologia.label3"/><%-- ProyectoModelo : --%></label><html:select styleId="1970278" property="proyectoModelo"><html:optionsCollection property="listProyecto"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_metodologia.label0"/><%-- Actualizar --%></html:submit>
                </html:form></div>

<div id="tabs">
<ul>
  <li><a href="#tab-1"><bean:message key="V_metodologia.label5"/><%-- Proyectos --%></a></li>
  <li><a href="#tab-2"><bean:message key="V_metodologia.label7"/><%-- Roles --%></a></li>

</ul>
  <div id="tab-1">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="V_metodologia.label5.1"/><%-- Nombre --%></th>
              <th><bean:message key="V_metodologia.label5.2"/><%-- TiempoEstimado --%></th>
              <th><bean:message key="V_metodologia.label5.3"/><%-- Area --%></th>
              <th><bean:message key="V_metodologia.label5.4"/><%-- Descripcion --%></th>
              <th><bean:message key="V_metodologia.label5.5"/><%-- FechaDeInicio --%></th>
              <th><bean:message key="V_metodologia.label5.6"/><%-- FechaDeFin --%></th>
              <th><bean:message key="V_metodologia.label5.7"/><%-- Costo --%></th>
              <th><bean:message key="V_metodologia.label5.8"/><%-- Encargado --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="proyecto" collection="${empty L_Proyecto ? _vacio : L_Proyecto}">
              <tr>
                  <td><html:link action="/APre_proyecto.do" paramId="idProyecto" paramName="proyecto" paramProperty="idProyecto">${empty proyecto.nombre ? "Editar" : proyecto.nombre}</html:link></td>
                  <td>${proyecto.tiempo_Estimado}</td>
                  <td>${proyecto.area}</td>
                  <td>${proyecto.descripcion}</td>
                  <td>${proyecto.fecha_de_Inicio}</td>
                  <td>${proyecto.fecha_de_Fin}</td>
                  <td>${proyecto.costo}</td>
                  <td>${proyecto.encargado}</td>

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
              <th><bean:message key="V_metodologia.label7.1"/><%-- Descripcion --%></th>
              <th><bean:message key="V_metodologia.label7.4"/><%-- Nombre --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="rol" collection="${empty L_Rol ? _vacio : L_Rol}">
              <tr>
                  <td><html:link action="/APre_rol.do" paramId="idRol" paramName="rol" paramProperty="idRol">${empty rol.descripcion ? "Editar" : rol.descripcion}</html:link></td>
                  <td>${rol.nombre}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>

</div>                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_metodologia">Ayuda</a></li></ul></div>
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