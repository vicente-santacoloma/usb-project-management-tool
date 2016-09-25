<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="Sk5lvounnGGRxLiJrjkXPQ==">
        <title><bean:message key="V_modificarProyecto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="_js/jquery.ui.datepicker-es.js"></script>
        <style type="text/css">
        div#box2021099 {width: 400px; margin: 40px auto; }
        form#2021099 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2021099 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2021099 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2021099 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2021099 p#2021102_C {clear: both; width: 400px; }
          form#2021099 p#2021102_C label {clear: both; width: 400px; }
          form#2021099 p#2021102_C input {clear: both; width: 396px; }
          form#2021099 p#2021107_C {clear: both; width: 400px; }
          form#2021099 p#2021107_C label {clear: both; width: 400px; }
          form#2021099 p#2021107_C input {clear: both; width: 396px; }
          form#2021099 p#2021137_C {clear: both; width: 400px; }
          form#2021099 p#2021137_C label {clear: both; width: 400px; }
          form#2021099 p#2021137_C input {clear: both; width: 396px; }
          form#2021099 p#2021140_C {clear: both; width: 400px; }
          form#2021099 p#2021140_C label {clear: both; width: 400px; }
          form#2021099 p#2021140_C input {clear: both; width: 396px; }
          form#2021099 p#2021143_C {clear: both; width: 400px; }
          form#2021099 p#2021143_C label {clear: both; width: 400px; }
          form#2021099 p#2021143_C input {clear: both; width: 396px; }
          form#2021099 p#2021146_C {clear: both; width: 400px; }
          form#2021099 p#2021146_C label {clear: both; width: 400px; }
          form#2021099 p#2021146_C input {clear: both; width: 396px; }
          form#2021099 p#2021149_C {clear: both; width: 400px; }
          form#2021099 p#2021149_C label {clear: both; width: 400px; }
          form#2021099 p#2021149_C input {clear: both; width: 396px; }
          form#2021099 p#2021161_C {clear: both; width: 400px; }
          form#2021099 p#2021161_C label {clear: both; width: 400px; }
          form#2021099 p#2021161_C input {clear: both; width: 396px; }
          form#2021099 p#2021180_C {clear: both; width: 400px; }
          form#2021099 p#2021180_C label {clear: both; width: 400px; }
          form#2021099 p#2021180_C input {clear: both; width: 396px; }
          form#2021099 p#2021187_C {clear: both; width: 400px; }
          form#2021099 p#2021187_C label {clear: both; width: 400px; }
          form#2021099 p#2021187_C input {clear: both; width: 396px; }
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
  $( "#2021140" ).datepicker();
  $( "#2021143" ).datepicker();

});</script>        <div id="header">
            <div id="title"><bean:message key="V_modificarProyecto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="31"><html:link action="/A_CerrarSesion.do"><bean:message key="V_modificarProyecto.label2"/><%-- Cerrar Sesion --%></html:link></cohesion:actor></li>

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
                <div class="box2021099"><html:form
                  action="/A_modificarProyecto.do" method="post">
                  <p id="2021102_C"><label for="2021102"><bean:message key="F_ModificarProyecto.label0"/><%-- titulo --%></label><html:text styleId="2021102" property="titulo" size="30"/></p>
                  <p id="2021107_C"><label for="2021107"><bean:message key="F_ModificarProyecto.label1"/><%-- tEstimado --%></label><html:text styleId="2021107" property="tiempoEstimado" size="30"/></p>
                  <p id="2021137_C"><label for="2021137"><bean:message key="F_ModificarProyecto.label2"/><%-- descripcion --%></label><html:text styleId="2021137" property="descripcion" size="30"/></p>
                  <p id="2021140_C"><label for="2021140"><bean:message key="F_ModificarProyecto.label3"/><%-- fInicio --%></label><html:text styleId="2021140" property="fechaInicio" size="30"/></p>
                  <p id="2021143_C"><label for="2021143"><bean:message key="F_ModificarProyecto.label4"/><%-- fFin --%></label><html:text styleId="2021143" property="fechaFin" size="30"/></p>
                  <p id="2021146_C"><label for="2021146"><bean:message key="F_ModificarProyecto.label5"/><%-- costo --%></label><html:text styleId="2021146" property="costo" size="30"/></p>
                  <p id="2021149_C"><label for="2021149"><bean:message key="F_ModificarProyecto.label6"/><%-- metodologia --%></label><html:text styleId="2021149" property="metodologia" size="30"/></p>
                  <p id="2021161_C"><label for="2021161"><bean:message key="F_ModificarProyecto.label7"/><%-- actividades --%></label><html:text styleId="2021161" property="actividades" size="30"/></p>
                  <p id="2021180_C"><label for="2021180"><bean:message key="F_ModificarProyecto.label8"/><%-- participantes --%></label><html:text styleId="2021180" property="participantes" size="30"/></p>
                  <p id="2021187_C"><label for="2021187"><bean:message key="F_ModificarProyecto.label9"/><%-- lider --%></label><html:text styleId="2021187" property="lider" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_modificarProyecto.label0"/><%-- Modificar --%></html:submit>
                </html:form></div>
                <div class="box2023689"><html:form
                  action="/A_PreBusqueda.do" method="post">
                  <p id="2023692_C"><label for="2023692"><bean:message key="FBusqueda.label0"/><%-- Buscar --%></label><html:text styleId="2023692" property="palabras" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_modificarProyecto.label1"/><%-- Buscar --%></html:submit>
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