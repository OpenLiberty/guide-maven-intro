// tag::copyright[]
/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial implementation
 *******************************************************************************/
// end::copyright[]
package io.openliberty.guides.hello.it;

// tag::import[]
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
// end::import[]

// tag::EndpointIT[]
public class EndpointIT {
    private static String siteURL;

    @BeforeAll
    public static void init() {
        // tag::URL[]
        String port = System.getProperty("http.port");
        String war = System.getProperty("war.name");
        siteURL = "http://localhost:" + port + "/" + war + "/" + "servlet";
        // end::URL[]
    }

    // tag::Test[]
    @Test
    // end::Test[]
    public void testServlet() throws Exception {
        HttpClient client = new HttpClient();

        GetMethod method = new GetMethod(siteURL);
        // tag::link[]
        try {
            int statusCode = client.executeMethod(method);

            assertEquals(HttpStatus.SC_OK, statusCode, "HTTP GET failed");

            String response = method.getResponseBodyAsString(1000);

            assertTrue(response.contains("Hello! How are you today?"),
                "Unexpected response body");
        } finally {
            method.releaseConnection();
        }
        // end::link[]
    }
}
// end::EndpointIT[]
