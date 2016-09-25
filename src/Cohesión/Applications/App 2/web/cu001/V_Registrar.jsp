<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="HCN1IDNFlc0Z5Ov6/xUv5g==">
        <title><bean:message key="V_Registrar.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <script type="text/javascript" src="_js/jquery.ui.datepicker-es.js"></script>
        <style type="text/css">
        div#box2021044 {width: 400px; margin: 40px auto; }
        form#2021044 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#2021044 p {float: left; margin: 0; padding: 0; display: inline; }
        form#2021044 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#2021044 input {float: left; margin: 0; padding: 0; display: inline; }
          form#2021044 p#2021048_C {clear: both; width: 400px; }
          form#2021044 p#2021048_C label {clear: both; width: 400px; }
          form#2021044 p#2021048_C input {clear: both; width: 396px; }
          form#2021044 p#2021051_C {clear: both; width: 400px; }
          form#2021044 p#2021051_C label {clear: both; width: 400px; }
          form#2021044 p#2021051_C input {clear: both; width: 396px; }
          form#2021044 p#2021069_C {clear: both; width: 400px; }
          form#2021044 p#2021069_C label {clear: both; width: 400px; }
          form#2021044 p#2021069_C input {clear: both; width: 396px; }
          form#2021044 p#2021072_C {clear: both; width: 400px; }
          form#2021044 p#2021072_C label {clear: both; width: 400px; }
          form#2021044 p#2021072_C input {clear: both; width: 396px; }
          form#2021044 p#2021075_C {clear: both; width: 400px; }
          form#2021044 p#2021075_C label {clear: both; width: 400px; }
          form#2021044 p#2021075_C input {clear: both; width: 396px; }
          form#2021044 p#2021054_C {clear: both; width: 400px; }
          form#2021044 p#2021054_C label {clear: both; width: 400px; }
          form#2021044 p#2021054_C input {clear: both; width: 396px; }
          form#2021044 p#2021058_C {clear: both; width: 400px; }
          form#2021044 p#2021058_C label {clear: both; width: 400px; }
          form#2021044 p#2021058_C input {clear: both; width: 396px; }
          form#2021044 p#2021061_C {clear: both; width: 400px; }
          form#2021044 p#2021061_C label {clear: both; width: 400px; }
          form#2021044 p#2021061_C input {clear: both; width: 396px; }
          form#2021044 p#2021066_C {clear: both; width: 400px; }
          form#2021044 p#2021066_C label {clear: both; width: 400px; }
          form#2021044 p#2021066_C input {clear: both; width: 396px; }

        </style>

    </head>
    <body>
<script type="text/javascript">
jQuery(function($) {
  $( "#2021069" ).datepicker();

});</script>        <div id="header">
            <div id="title"><bean:message key="V_Registrar.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="63"><html:link action="/A_PreRegistrar.do"><bean:message key="V_Registrar.label1"/><%-- A_PreRegistrar --%></html:link></cohesion:actor></li>

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
                <div class="box2021044"><html:form
                  action="/A_Registrar.do" method="post">
                  <p id="2021048_C"><label for="2021048"><bean:message key="F_RegistrarUsuario.label0"/><%-- nombre_oblig --%></label><html:text styleId="2021048" property="nombre" size="30"/></p>
                  <p id="2021051_C"><label for="2021051"><bean:message key="F_RegistrarUsuario.label1"/><%-- apellido_oblig --%></label><html:text styleId="2021051" property="apellido" size="30"/></p>
                  <p id="2021069_C"><label for="2021069"><bean:message key="F_RegistrarUsuario.label2"/><%-- fechaNacimiento --%></label><html:text styleId="2021069" property="fechaNacimiento" size="30"/></p>
                  <p id="2021072_C"><label for="2021072"><bean:message key="F_RegistrarUsuario.label3"/><%-- carnet --%></label><html:text styleId="2021072" property="carnet" size="30"/></p>
                  <p id="2021075_C"><label for="2021075"><bean:message key="F_RegistrarUsuario.label4"/><%-- area --%></label><html:text styleId="2021075" property="area" size="30"/></p>
                  <p id="2021054_C"><label for="2021054"><bean:message key="F_RegistrarUsuario.label5"/><%-- correoElect_oblig --%></label><html:text styleId="2021054" property="correoElectronico" size="30"/></p>
                  <p id="2021058_C"><label for="2021058"><bean:message key="F_RegistrarUsuario.label6"/><%-- correoElectConfi_oblig --%></label><html:text styleId="2021058" property="correoElectronicoConfirmacion" size="30"/></p>
                  <p id="2021061_C"><label for="2021061"><bean:message key="F_RegistrarUsuario.label7"/><%-- clave_oblig --%></label><html:text styleId="2021061" property="clave" size="30"/></p>
                  <p id="2021066_C"><label for="2021066"><bean:message key="F_RegistrarUsuario.label8"/><%-- claveConf_oblig --%></label><html:text styleId="2021066" property="claveConfirmacion" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="V_Registrar.label0"/><%-- A_Registrar --%></html:submit>
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