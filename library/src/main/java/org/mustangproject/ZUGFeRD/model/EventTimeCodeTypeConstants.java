/** **********************************************************************
 *
 * Copyright 2018 Jochen Staerk
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *********************************************************************** */
package org.mustangproject.ZUGFeRD.model;

/**
 * The code shall distinguish between the following entries of the UNTDID 2005 list:
 * - Invoice document issue date
 * - Delivery date, actual
 * - Paid to date
 */
public class EventTimeCodeTypeConstants {
	public static final String INVOICE_DATE = "5";
	public static final String DELIVERY_DATE = "29";
	public static final String PAYMENT_DATE = "72";
}
