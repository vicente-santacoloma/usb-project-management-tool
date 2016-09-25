<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="Xdruh5AMM8ODFoGRZqnghQ==">
        <title><bean:message key="V_CrearArtefacto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
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
        <div id="header">
            <div id="title"><bean:message key="V_CrearArtefacto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="31"><html:link action="/A_CerrarSesion.do"><bean:message key="V_CrearArtefacto.label2"/><%-- Cerrar Sesion --%></html:link></cohesion:actor></li>

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
                  action="/A_CrearArtefacto.do" method="post">
                  <html:hidden property="idArtefacto"/>
                  <p id="1970110_C"><label for="1970110"><bean:message key="F_Artefacto.label1"/><%-- Titulo : --%></label><html:text styleId="1970110" property="titulo" size="30"/></p>
                  <p id="1970109_C"><label for="1970109"><bean:message key="F_Artefacto.label2"/><%-- Tamano : --%></label><html:text styleId="1970109" property="tamano" size="30"/></p>
                  <p id="1970113_C"><label for="1970113"><bean:message key="F_Artefacto.label3"/><%-- Contenido : --%></label><html:text styleId="1970113" property="contenido" size="30"/></p>
                  <p id="1970114_C"><label for="1970114"><bean:message key="F_Artefacto.label4"/><%-- Actividad : --%></label><html:select styleId="1970114" property="actividad"><html:optionsCollection property="listActividad"/></html:select></p>

                  <html:submit styleClass="button"><bean:message key="V_CrearArtefacto.label0"/><%-- Crear Artefacto --%></html:submit>
                </html:form></div>
                <div class="box2023689"><html:form
                  action="/A_PreBusqueda.do" method="post">
                  <p id="2023692_C"><label for="2023692"><bean:message key="FBusqueda.label0"/><%-- Buscar --%></label><html:text styleId="2023692" property="palabras" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_CrearArtefacto.label1"/><%-- Busqueda --%></html:submit>
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