package com.primerportlet.virtualclassroom.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.primerportlet.virtualclassroom.constants.CoursePortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


@Component(
		immediate = true,
		property = {
			
			"javax.portlet.name=" + CoursePortletKeys.COURSE,
			"mvc.command.name=edit-course"
		},
		service = MVCRenderCommand.class
	)


public class CourseEditRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		renderRequest.setAttribute("clave","ABCD.1234");
		return "/edit.jsp";
	}

}
