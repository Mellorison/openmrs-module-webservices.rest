/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.web;

/**
 * Constants used by the Rest Web Services
 */
public class RestConstants {
	
	/**
	 * The number of results to limit lists of objects to, if an admin has not defined a global
	 * property
	 * 
	 * @see #MAX_RESULTS_DEFAULT_GLOBAL_PROPERTY_NAME
	 */
	public static Integer MAX_RESULTS_DEFAULT = 50;
	
	/**
	 * The absolute number of results to limit lists of objects to, even if the call requests a
	 * larger list.
	 * 
	 * @see #MAX_RESULTS_ABSOLUTE_GLOBAL_PROPERTY_NAME
	 */
	public static Integer MAX_RESULTS_ABSOLUTE = 100;
	
	//module id or name
	public static final String MODULE_ID = "webservices.rest";
	
	/**
	 * The key of the global property that an admin can set if they want to restrict lists to larger
	 * or smaller numbers than the default
	 * 
	 * @see #MAX_RESULTS_DEFAULT
	 */
	public static String MAX_RESULTS_DEFAULT_GLOBAL_PROPERTY_NAME = MODULE_ID + ".maxResultsDefault";
	
	/**
	 * The key of the global property that an admin can set if they want an absolute limit to the
	 * maximum lists that can be returned in a webservice call
	 * 
	 * @see #MAX_RESULTS_ABSOLUTE
	 */
	public static String MAX_RESULTS_ABSOLUTE_GLOBAL_PROPERTY_NAME = MODULE_ID + ".maxResultsAbsolute";
	
	/**
	 * The key of the global property that an admin can set to restrict ws users based on a range of
	 * IPs. Should be a comma separated list of IP addresses. "*" in any part of it denotes a
	 * wildcard match.
	 */
	public static String ALLOWED_IPS_GLOBAL_PROPERTY_NAME = MODULE_ID + ".allowedips";
	
	/**
	 * The version number for the first rest web services representations
	 */
	public static final String VERSION_1 = "v1";
	
	/**
	 * String that goes before every request. Its in a constant just in case we have to change it at
	 * some point for some strange reason
	 */
	public static String URI_PREFIX;
	
	static {
		RestUtil.setUriPrefix();
	}
	
	/**
	 * An optional request parameter used by methods that return lists of patients to cut down on
	 * the number of potential results
	 * 
	 * @see RequestContext#getLimit()
	 * @see RestUtil#getRequestContext(org.springframework.web.context.request.WebRequest)
	 */
	public static String REQUEST_PROPERTY_FOR_LIMIT = "limit";
	
	/**
	 * An optional request parameter used by methods that return lists of patients to determine how
	 * far into a list to start returning results.
	 * 
	 * @see RequestContext#getStartIndex()()
	 * @see RestUtil#getRequestContext(org.springframework.web.context.request.WebRequest)
	 */
	public static String REQUEST_PROPERTY_FOR_START_INDEX = "startIndex";
	
	/**
	 * An optional request parameter used by rest methods. Will change the properties on the
	 * results. Default is "default"
	 * 
	 * @see RequestContext#getRepresentation()
	 */
	public static String REQUEST_PROPERTY_FOR_REPRESENTATION = "v";
	
	// a ref is just a uuid/uri/display value
	public static String REPRESENTATION_REF = "ref";
	
	// the properties returned on an resource if no special rep is requested
	public static String REPRESENTATION_DEFAULT = "default";
	
	// all properties on the resource are returned
	public static String REPRESENTATION_FULL = "full";
	
	public static String REPRESENTATION_CUSTOM_PREFIX = "custom:";
	
	// The URI prefix through which clients consuming web services will connect
	// to the web application
	public static final String URI_PREFIX_GLOBAL_PROPERTY_NAME = MODULE_ID + ".uriPrefix";
	
	// The dafault value for URI prefix
	public static final String URI_PREFIX_GP_DEFAULT_VALUE = "NEED-TO-CONFIGURE";
	
	//The suffix to be used for all messages codes for logic names of global properties 
	//e.g "webservices.rest.fooBar.label for the 'webservices.rest.fooBar' global property
	public static final String GLOBAL_PROPERTY_LOGICAL_NAME_MESSAGE_CODE_SUFFIX = ".label";
}
