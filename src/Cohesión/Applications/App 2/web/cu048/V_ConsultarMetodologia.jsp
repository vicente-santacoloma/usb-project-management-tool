<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" 
%><%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" 
%><%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" 
%><%@ taglib tagdir="/WEB-INF/tags" prefix="cohesion"
%><%@ page contentType="text/html;charset=ISO-8859-1"
%><html:html>
    <head meta-id="aldE9BWkT7UkH4/oqTMs4A==">
        <title><bean:message key="V_ConsultarMetodologia.title"/></title>
        <link rel="stylesheet" type="text/css" href="_css/style.css"/>
    </head>
    <body>
        <div id="header">
            <div id="title"><bean:message key="V_ConsultarMetodologia.title"/></div>
            <div id="menu">
                <ul id="nav">
                    <li><cohesion:actor actors="17"><html:link action="/A_CargaMetodologia.do"><bean:message key="V_ConsultarMetodologia.label0"/><%-- A_CargaMetodologia --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="31"><html:link action="/A_CerrarSesion.do"><bean:message key="V_ConsultarMetodologia.label1"/><%-- A_CerrarSesion --%></html:link></cohesion:actor></li>
                    <li><cohesion:actor actors="1"><html:link action="/A_PreCambiarEdoMetodologia.do"><bean:message key="V_ConsultarMetodologia.label2"/><%-- Cambiar estado de metodologia --%></html:link></cohesion:actor></li>

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