<%--
    Lic.
--%>

<%@tag description="Checking for actor's rights." pageEncoding="UTF-8"
import="proyectos.CohesionActor"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="actors" required="true"%>
<% Object actor = session.getAttribute(CohesionActor.SESSION_ATTRIBUTE);
String att = (String)jspContext.getAttribute("actors");
   if (att.matches("[0-9]+")
   && actor!=null
   && actor instanceof CohesionActor
   && ((CohesionActor)actor).hasRights(Integer.parseInt(att))) { %>
<jsp:doBody/>
<% } %>