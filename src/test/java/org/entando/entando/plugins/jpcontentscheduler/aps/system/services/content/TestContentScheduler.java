package org.entando.entando.plugins.jpcontentscheduler.aps.system.services.content;

import org.entando.entando.plugins.jpcontentscheduler.aps.ApsPluginBaseTestCase;
import org.entando.entando.plugins.jpcontentscheduler.aps.system.services.content.model.ContentThreadConfig;
import org.entando.entando.plugins.jpcontentscheduler.aps.system.services.content.parse.ContentThreadConfigDOM;

import com.agiletec.aps.system.exception.ApsSystemException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestContentScheduler extends ApsPluginBaseTestCase {

	@Autowired
	private IContentSchedulerManager contentScheduler;

	@Test
	public void testMe() throws ApsSystemException {
		assertTrue(null != contentScheduler);
		ContentThreadConfig config = contentScheduler.getConfig();
		ContentThreadConfigDOM dd = new ContentThreadConfigDOM();
		String xml = dd.createConfigXml(config);
		System.out.println(xml);
	}

}
