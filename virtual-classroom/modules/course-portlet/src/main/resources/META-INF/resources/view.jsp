<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="course.caption"/></b>
	<h2>Hello World!</h2>
	
	<!-- Modo poco práctico Sin clases -->
	<%-- <liferay-portlet:renderURL var="editURL">
	<liferay-portlet:param name="mvcPath" value="/edit.jsp"/>
	</liferay-portlet:renderURL>
	
	<aui:a href="<%= editURL %>">Editar</aui:a> --%>
	
	<liferay-portlet:renderURL var="editURL">
	<liferay-portlet:param name="mvcRenderCommandName" value="edit-course"/>
	<liferay-portlet:param name="backURL" value="<%= currentURL %>"/>
	</liferay-portlet:renderURL>
	
	<aui:a href="<%= editURL %>">Editar</aui:a>

	
	
	
</p>