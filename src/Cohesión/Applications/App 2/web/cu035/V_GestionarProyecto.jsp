<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="AwvJXdqRyr2Y/BctVh6ZSQ==">
        <title><bean:message key="V_GestionarProyecto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box2023689 {width: 400px; margin: 40px auto; }
        form#2023689 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2023689 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2023689 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2023689 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2023689 p#2023692_C {clear: both; width: 400px; }
          form#2023689 p#2023692_C label {clear: both; width: 400px; }
          form#2023689 p#2023692_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="V_GestionarProyecto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="31"><html:link action="/A_PreConsultarProyecto.do"><bean:message key="V_GestionarProyecto.label0"/><%-- Consultar Proyecto --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_premodificarProyecto.do"><bean:message key="V_GestionarProyecto.label1"/><%-- Modificar --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_PreInvitarUsuario.do"><bean:message key="V_GestionarProyecto.label2"/><%-- Invitar Usuario --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="4"><html:link action="/A_PreGestionarParticipante.do"><bean:message key="V_GestionarProyecto.label3"/><%-- Gestionar Participante --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="31"><html:link action="/A_CerrarSesion.do"><bean:message key="V_GestionarProyecto.label5"/><%-- Cerrar Sesion --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="28"><html:link action="/A_PreCreacionActividad.do"><bean:message key="V_GestionarProyecto.label6"/><%-- Creacion Actividad --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="28"><html:link action="/A_PreGestionarActividades.do"><bean:message key="V_GestionarProyecto.label7"/><%-- Gestionar Actividades --%></html:link></cohesion:actor></li>

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

                  <html:submit styleClass="button"><bean:message key="V_GestionarProyecto.label4"/><%-- Buscar --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_GestionarProyecto">Ayuda</a></li></ul></div>
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