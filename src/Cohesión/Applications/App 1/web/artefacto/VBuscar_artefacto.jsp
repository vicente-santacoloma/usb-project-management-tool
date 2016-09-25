<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head>
        <title><bean:message key="VBuscar_artefacto.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
        <script type="text/javascript" src="_js/jquery-1.4.4.min.js"></script>
        <link type="text/css" href="_css/smoothness/jquery-ui-1.8.10.custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="_js/jquery-ui-1.8.10.custom.min.js"></script>
        <style type="text/css">
        div#box1970106 {width: 400px; margin: 40px auto; }
        form#1970106 {float: left; margin: 0; padding: 0; display: inline; width: 400px; }
        form#1970106 p {float: left; margin: 0; padding: 0; display: inline; }
        form#1970106 label {float: left; margin: 0; padding: 0; display: inline; overflow: hidden; }
        form#1970106 input {float: left; margin: 0; padding: 0; display: inline; }
          form#1970106 p#1970107_C {clear: both; width: 400px; }
          form#1970106 p#1970107_C label {clear: both; width: 400px; }
          form#1970106 p#1970107_C input {clear: both; width: 396px; }

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
            <div id="title"><bean:message key="VBuscar_artefacto.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><html:link action="/APreCrear_artefacto.do"><bean:message key="VBuscar_artefacto.label1"/><%-- Agregar --%></html:link></li>
                    <li><html:link action="/APreListar_artefacto.do"><bean:message key="VBuscar_artefacto.label2"/><%-- Listar --%></html:link></li>

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
                <div class="box1970106"><html:form
                  action="/ABuscar_artefacto.do" method="post">
                  <p id="1970107_C"><label for="1970107"><bean:message key="FArtefactoBuscar.label0"/><%-- Titulo --%></label><html:text styleId="1970107" property="titulo" size="30"/></p>

                  <html:submit styleClass="button"><bean:message key="VBuscar_artefacto.label0"/><%-- Buscar --%></html:submit>
                </html:form></div>

                         </div>
                    </div>
                    <div id="right"><ul id="nav"><li><a id="ayuda" href="tooltip.do?V=VBuscar_artefacto">Ayuda</a></li></ul></div>
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