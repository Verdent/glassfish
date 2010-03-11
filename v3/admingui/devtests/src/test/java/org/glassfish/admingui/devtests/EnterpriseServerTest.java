package org.glassfish.admingui.devtests;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class EnterpriseServerTest extends BaseSeleniumTestClass {
    @Test
    public void testGeneralInformation() throws Exception {
        clickAndWait("treeForm:tree:applicationServer:applicationServer_link", "General Information");

        assertTrue(selenium.isTextPresent("glassfishv3/glassfish/domains/domain1/config"));
    }
}