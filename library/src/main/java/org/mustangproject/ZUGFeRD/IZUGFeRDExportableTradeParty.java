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
package org.mustangproject.ZUGFeRD;

import org.mustangproject.TradeParty;

/**
 * Mustangproject's ZUGFeRD implementation neccessary interface for ZUGFeRD exporter Licensed under the APLv2
 *
 * @author jstaerk
 * @version 2.0.0
 * dated 2020-09-12
 */


public interface IZUGFeRDExportableTradeParty {

	/**
	 * customer identification assigned by the seller
	 *
	 * @return customer identification
	 */
	default String getID() {
		return null;
	}

	/**
	 * customer global identification assigned by the seller
	 *
	 * @return customer identification
	 */
	default String getGlobalID() {
		return null;
	}


  /***
	 * gets the official representation
	 * @return the interface with the attributes of the legal organisation
	 */
	default IZUGFeRDLegalOrganisation getLegalOrganisation()  {
		return null;
	}
	/**
	 * customer global identification scheme
	 *
	 * @return customer identification
	 */
	default String getGlobalIDScheme() {
		return null;
	}


	/**
	 * URIUniversalCommunication scheme (see EAS code list of the ZUGFeRD documentation)
	 * @return null or the EAS code
	 */
	default String getUriUniversalCommunicationIDScheme() {
		return null;
	}
	/**
	 * The URIID of URIUniversalCommunicationID
     * It is used by some countries, i.e. Luxembourg
	 * @return null if not defined or a string (I believe thats just the email address?)
	 */
	default String getUriUniversalCommunicationID() {
		return null;
	}


	default IZUGFeRDExportableContact getContact() {
		return null;
	}

	/**
	 * First and last name of the recipient
	 *
	 * @return First and last name of the recipient
	 */
	String getName();
	/**
	 * Postal code of the recipient
	 *
	 * @return Postal code of the recipient
	 */
	String getZIP();


	/**
	 * VAT ID (Umsatzsteueridentifikationsnummer) of the contact
	 *
	 * @return VAT ID (Umsatzsteueridentifikationsnummer) of the contact
	 */
	default String getVATID() {
		return null;
	}


	/**
	 * two-letter country code of the contact
	 *
	 * @return two-letter iso country code of the contact
	 */
	String getCountry();


	/**
	 * Returns the city of the contact
	 *
	 * @return Returns the city of the recipient
	 */
	String getLocation();


	/**
	 * Returns the street address (street+number) of the contact
	 *
	 * @return street address (street+number) of the contact
	 */
	String getStreet();

	/**
	 * returns additional address information which is display in xml tag "LineTwo"
	 * e.g. "Rear building"
	 *
	 * @return additional address information
	 */
	default String getAdditionalAddress() {
		return null;
	}

	/**
	 * returns additional address information which is display in xml tag "LineThree"
	 * e.g. "Second floor" if LineTwo is already used, e.g. "Rear Building".
	 * This attribute could sometimes be BT-165?
	 *
	 * @return additional address information
	 */
	default String getAdditionalAddressExtension() {
		return null;
	}


	/***
	 * obligatory for sender but not for recipient
	 * @return the tax id as string
	 */
	default String getTaxID() {
		return null;
	}


}
