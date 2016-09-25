<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VCrear_rol_metodologia.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1970922 {width: 400px; margin: 40px auto; }
        form#1970922 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970922 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970922 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970922 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970922 p#1970926_C {clear: both; width: 400px; }
          form#1970922 p#1970926_C label {clear: both; width: 400px; }
          form#1970922 p#1970926_C input {clear: both; width: 396px; }
          form#1970922 p#1970927_C {clear: both; width: 400px; }
          form#1970922 p#1970927_C label {clear: both; width: 400px; }
          form#1970922 p#1970927_C input {clear: both; width: 396px; }
          form#1970922 p#1970925_C {clear: both; width: 400px; }
          form#1970922 p#1970925_C label {clear: both; width: 400px; }
          form#1970922 p#1970925_C input {clear: both; width: 396px; }
          form#1970922 p#1970924_C {clear: both; width: 400px; }
          form#1970922 p#1970924_C label {clear: both; width: 400px; }
          form#1970922 p#1970924_C input {clear: both; width: 396px; }
          form#1970922 p#1970923_C {clear: both; width: 400px; }
          form#1970922 p#1970923_C label {clear: both; width: 400px; }
          form#1970922 p#1970923_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="VCrear_rol_metodologia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APre_metodologia.do" paramId="idMetodologia" paramName="idMetodologia"><bean:message key="VCrear_rol_metodologia.label1"/><%-- Metodologia --%></html:link></li>

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
                <div class="box1970922"><html:form
                  action="/ACrear_rol.do" method="post">
                  <html:hidden property="idRol"/>
                  <p id="1970927_C"><label for="1970927"><bean:message key="FRol.label1"/><%-- Descripcion : --%></label><html:textarea styleId="1970927" property="descripcion" cols="60" rows="10"></html:textarea></p>
                  <p id="1970925_C"><label for="1970925"><bean:message key="FRol.label2"/><%-- Metodologia : --%></label><html:select styleId="1970925" property="metodologia"><html:optionsCollection property="listMetodologia"/></html:select></p>
                  <p id="1970923_C"><label for="1970923"><bean:message key="FRol.label4"/><%-- Nombre : --%></label><html:text styleId="1970923" property="nombre" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="VCrear_rol_metodologia.label0"/><%-- Crear --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VCrear_rol_metodologia">Ayuda</a></li></ul></div>
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