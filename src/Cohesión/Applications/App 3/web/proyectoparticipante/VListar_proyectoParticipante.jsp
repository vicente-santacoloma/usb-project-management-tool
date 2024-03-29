<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VListar_proyectoParticipante.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>

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
            <div id="title"><bean:message key="VListar_proyectoParticipante.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APreCrear_proyectoParticipante.do"><bean:message key="VListar_proyectoParticipante.label1"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreBuscar_proyectoParticipante.do"><bean:message key="VListar_proyectoParticipante.label2"/><%-- Buscar --%></html:link></li>
                    <li><html:link action="/APreListar_proyectoParticipante.do"><bean:message key="VListar_proyectoParticipante.label3"/><%-- Listar --%></html:link></li>

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
<div id="tabs">
<ul>
  <li><a href="#tab-1"><bean:message key="VListar_proyectoParticipante.label0"/><%-- Elementos de ProyectoParticipante --%></a></li>

</ul>
  <div id="tab-1">
  <% request.setAttribute("_vacio", new Object[0]);%>
  <h2></h2>
  <table border="1">
      <thead>
          <tr>
              <th><bean:message key="VListar_proyectoParticipante.label0.3"/><%-- FechaIngreso --%></th>
              <th><bean:message key="VListar_proyectoParticipante.label0.1"/><%-- Proyecto --%></th>
              <th><bean:message key="VListar_proyectoParticipante.label0.2"/><%-- Participante --%></th>

          </tr>
      </thead>
      <tbody>
          <logic:iterate id="proyectoParticipante" collection="${empty L_ProyectoParticipante ? _vacio : L_ProyectoParticipante}">
              <tr>
                  <td><html:link action="/APre_proyectoParticipante.do" paramId="idProyectoParticipante" paramName="proyectoParticipante" paramProperty="idProyectoParticipante">${empty proyectoParticipante.fechaIngreso ? "Editar" : proyectoParticipante.fechaIngreso}</html:link></td>
                  <td>${empty proyectoParticipante.proyecto ? "" : proyectoParticipante.proyecto.nombre}</td>
                  <td>${empty proyectoParticipante.participante ? "" : proyectoParticipante.participante.nombre}</td>

              </tr>
          </logic:iterate>
      </tbody>
  </table>
  </div>

</div>                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VListar_proyectoParticipante">Ayuda</a></li></ul></div>
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