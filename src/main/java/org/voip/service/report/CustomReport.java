package org.voip.service.report;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.servlet.ModelAndView;

/**
 * Custom report interface which is provide proper view
 *
 * @author malalanayake
 */
public interface CustomReport {

	public ModelAndView getReportTemplate();

	public void wireBeans(BeanFactory beanFactory);
}
