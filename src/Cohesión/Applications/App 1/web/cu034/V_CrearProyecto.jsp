<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="V_CrearProyecto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="_js/jquery.ui.datepicker-es.js"></script>
        <style type="text/css">
        div#box2023689 {width: 400px; margin: 40px auto; }
        form#2023689 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2023689 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2023689 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2023689 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2023689 p#2023692_C {clear: both; width: 400px; }
          form#2023689 p#2023692_C label {clear: both; width: 400px; }
          form#2023689 p#2023692_C input {clear: both; width: 396px; }
        div#box1970636 {width: 400px; margin: 40px auto; }
        form#1970636 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970636 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970636 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970636 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970636 p#1970638_C {clear: both; width: 400px; }
          form#1970636 p#1970638_C label {clear: both; width: 400px; }
          form#1970636 p#1970638_C input {clear: both; width: 396px; }
          form#1970636 p#1970646_C {clear: both; width: 400px; }
          form#1970636 p#1970646_C label {clear: both; width: 400px; }
          form#1970636 p#1970646_C input {clear: both; width: 396px; }
          form#1970636 p#1970640_C {clear: both; width: 400px; }
          form#1970636 p#1970640_C label {clear: both; width: 400px; }
          form#1970636 p#1970640_C input {clear: both; width: 396px; }
          form#1970636 p#1970647_C {clear: both; width: 400px; }
          form#1970636 p#1970647_C label {clear: both; width: 400px; }
          form#1970636 p#1970647_C input {clear: both; width: 396px; }
          form#1970636 p#1970644_C {clear: both; width: 400px; }
          form#1970636 p#1970644_C label {clear: both; width: 400px; }
          form#1970636 p#1970644_C input {clear: both; width: 396px; }
          form#1970636 p#1970637_C {clear: both; width: 400px; }
          form#1970636 p#1970637_C label {clear: both; width: 400px; }
          form#1970636 p#1970637_C input {clear: both; width: 396px; }
          form#1970636 p#1970643_C {clear: both; width: 400px; }
          form#1970636 p#1970643_C label {clear: both; width: 400px; }
          form#1970636 p#1970643_C input {clear: both; width: 396px; }
          form#1970636 p#1970642_C {clear: both; width: 400px; }
          form#1970636 p#1970642_C label {clear: both; width: 400px; }
          form#1970636 p#1970642_C input {clear: both; width: 396px; }
          form#1970636 p#1970641_C {clear: both; width: 400px; }
          form#1970636 p#1970641_C label {clear: both; width: 400px; }
          form#1970636 p#1970641_C input {clear: both; width: 396px; }
          form#1970636 p#1970645_C {clear: both; width: 400px; }
          form#1970636 p#1970645_C label {clear: both; width: 400px; }
          form#1970636 p#1970645_C input {clear: both; width: 396px; }
          form#1970636 p#1970639_C {clear: both; width: 400px; }
          form#1970636 p#1970639_C label {clear: both; width: 400px; }
          form#1970636 p#1970639_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
<script type="text/javascript">
jQuery(function($) {
  $( "#1970637" ).datepicker();
  $( "#1970643" ).datepicker();

  $( "#ayuda" )
    .button({ icons: {primary:'ui-icon-info'} })
    .click(function() {
      $("<div></div>").load(this.href).dialog({title: "Ayuda"});
      return false;
    });});</script>        <div id="header">
            <div id="title"><bean:message key="V_CrearProyecto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/A_CerrarSesion.do"><bean:message key="V_CrearProyecto.label2"/><%-- Cerrar Sesion --%></html:link></li>

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

                  <html:submit styleClass="button"><bean:message key="V_CrearProyecto.label0"/><%-- Buscar --%></html:submit>
                </html:form></div>
                <div class="box1970636"><html:form
                  action="/A_CrearProyecto.do" method="post">
                  <html:hidden property="idProyecto"/>
                  <p id="1970646_C"><label for="1970646"><bean:message key="FProyecto.label1"/><%-- Nombre : --%></label><html:text styleId="1970646" property="nombre" size="30"/></p>
                  <p id="1970640_C"><label for="1970640"><bean:message key="FProyecto.label2"/><%-- TiempoEstimado : --%></label><html:text styleId="1970640" property="tiempo_Estimado" size="30"/></p>
                  <p id="1970647_C"><label for="1970647"><bean:message key="FProyecto.label3"/><%-- Area : --%></label><html:text styleId="1970647" property="area" size="30"/></p>
                  <p id="1970644_C"><label for="1970644"><bean:message key="FProyecto.label4"/><%-- Descripcion : --%></label><html:text styleId="1970644" property="descripcion" size="30"/></p>
                  <p id="1970637_C"><label for="1970637"><bean:message key="FProyecto.label5"/><%-- FechaDeInicio : --%></label><html:text styleId="1970637" property="fecha_de_Inicio" size="30"/></p>
                  <p id="1970643_C"><label for="1970643"><bean:message key="FProyecto.label6"/><%-- FechaDeFin : --%></label><html:text styleId="1970643" property="fecha_de_Fin" size="30"/></p>
                  <p id="1970642_C"><label for="1970642"><bean:message key="FProyecto.label7"/><%-- Costo : --%></label><html:text styleId="1970642" property="costo" size="30"/></p>
                  <p id="1970641_C"><label for="1970641"><bean:message key="FProyecto.label8"/><%-- Encargado : --%></label><html:text styleId="1970641" property="encargado" size="30"/></p>
                  <p id="1970645_C"><label for="1970645"><bean:message key="FProyecto.label9"/><%-- Metodologia : --%></label><html:select styleId="1970645" property="metodologia"><html:optionsCollection property="listMetodologia"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_CrearProyecto.label1"/><%-- Crear Proyecto --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=V_CrearProyecto">Ayuda</a></li></ul></div>
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