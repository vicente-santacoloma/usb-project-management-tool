<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="3WirsDLGdZQMUFxljjHb7w==">
        <title><bean:message key="V_ConsultarPerfil.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <style type="text/css">
        div#box2023689 {width: 400px; margin: 40px auto; }
        form#2023689 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2023689 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2023689 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2023689 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2023689 p#2023692_C {clear: both; width: 400px; }
          form#2023689 p#2023692_C label {clear: both; width: 400px; }
          form#2023689 p#2023692_C input {clear: both; width: 396px; }
        div#box2023915 {width: 400px; margin: 40px auto; }
        form#2023915 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2023915 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2023915 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2023915 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2023915 p#2023918_C {clear: both; width: 400px; }
          form#2023915 p#2023918_C label {clear: both; width: 400px; }
          form#2023915 p#2023918_C input {clear: both; width: 396px; }
          form#2023915 p#2023921_C {clear: both; width: 400px; }
          form#2023915 p#2023921_C label {clear: both; width: 400px; }
          form#2023915 p#2023921_C input {clear: both; width: 396px; }
          form#2023915 p#2023924_C {clear: both; width: 400px; }
          form#2023915 p#2023924_C label {clear: both; width: 400px; }
          form#2023915 p#2023924_C input {clear: both; width: 396px; }
          form#2023915 p#2023928_C {clear: both; width: 400px; }
          form#2023915 p#2023928_C label {clear: both; width: 400px; }
          form#2023915 p#2023928_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_ConsultarPerfil.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="31"><html:link action="/A_gestionarInvitacionProyecto.do"><bean:message key="V_ConsultarPerfil.label1"/><%-- Gestionar invitaciones --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="1"><html:link action="/A_GestionarUsuarios.do"><bean:message key="V_ConsultarPerfil.label2"/><%-- Gestionar usuarios --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="31"><html:link action="/A_PreModificarPerfil.do"><bean:message key="V_ConsultarPerfil.label3"/><%-- Modificar perfil --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="13"><html:link action="/A_PreProyectosParticipante.do"><bean:message key="V_ConsultarPerfil.label4"/><%-- Listar Proyectos --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="31"><html:link action="/A_CerrarSesion.do"><bean:message key="V_ConsultarPerfil.label5"/><%-- Cerrar sesi&oacute;n --%></html:link></cohesion:actor></li>

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
                <div class="box2023689"><html:form
                  action="/A_PreBusqueda.do" method="post">
                  <p id="2023692_C"><label for="2023692"><bean:message key="FBusqueda.label0"/><%-- Buscar --%></label><html:text styleId="2023692" property="palabras" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_ConsultarPerfil.label0"/><%-- Buscar --%></html:submit>
                </html:form></div>
                <div class="box2023915"><html:form
                  action="/A_PreCrearProyecto.do" method="post">
                  <p id="2023918_C"><label for="2023918"><bean:message key="F_CrearProyecto.label0"/><%-- nombreProyecto --%></label><html:text styleId="2023918" property="nombreProyecto" size="30"/></p>
                  <p id="2023921_C"><label for="2023921"><bean:message key="F_CrearProyecto.label1"/><%-- descripcionProy --%></label><html:text styleId="2023921" property="descripcionProy" size="30"/></p>
                  <p id="2023924_C"><label for="2023924"><bean:message key="F_CrearProyecto.label2"/><%-- miembrosAParticipar --%></label><html:text styleId="2023924" property="miembrosAParticipar" size="30"/></p>
                  <p id="2023928_C"><label for="2023928"><bean:message key="F_CrearProyecto.label3"/><%-- duracionAproximada --%></label><html:text styleId="2023928" property="duracionAproximada" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_ConsultarPerfil.label6"/><%-- Crear proyecto nuevo --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"></div>
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