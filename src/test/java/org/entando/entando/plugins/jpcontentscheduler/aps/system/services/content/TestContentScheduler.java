package org.entando.entando.plugins.jpcontentscheduler.aps.system.services.content;

import com.agiletec.aps.BaseTestCase;
import org.entando.entando.plugins.jpcontentscheduler.aps.system.services.content.model.ContentThreadConfig;
import org.entando.entando.plugins.jpcontentscheduler.aps.system.services.content.parse.ContentThreadConfigDOM;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestContentScheduler extends BaseTestCase {

	private IContentSchedulerManager contentScheduler;

	@Test
	void testConfig() throws Exception {
		assertTrue(null != contentScheduler);
		ContentThreadConfig config = contentScheduler.getConfig();
		ContentThreadConfigDOM dd = new ContentThreadConfigDOM();
		String xml = dd.createConfigXml(config);
		System.out.println(xml);
	}

	@BeforeEach
	public void init() throws Exception {
		this.contentScheduler = (IContentSchedulerManager) this.getApplicationContext().getBean("jpcontentschedulerContentSchedulerManager");
	}

}
