/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.rivetlogic.service.PeopleDirectoryServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.rivetlogic.service.PeopleDirectoryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PeopleDirectoryServiceHttp
 * @see com.rivetlogic.service.PeopleDirectoryServiceUtil
 * @generated
 */
public class PeopleDirectoryServiceSoap {
	/**
	* Search for all the portal users
	*
	* @param keywords If keyword is empty string it will search all the users
	* @param start Page beginning
	* @param end Page end
	* @return
	* @throws PortalException
	* @throws com.liferay.portal.kernel.exception.SystemException
	* @throws SystemException
	*/
	public static com.rivetlogic.service.data.PeopleDirectoryResult search(
		java.lang.String keywords, int start, int end)
		throws RemoteException {
		try {
			com.rivetlogic.service.data.PeopleDirectoryResult returnValue = PeopleDirectoryServiceUtil.search(keywords,
					start, end);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	/**
	* Retrieves all the system users
	*
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public static com.rivetlogic.service.data.PeopleDirectoryResult fetchAll()
		throws RemoteException {
		try {
			com.rivetlogic.service.data.PeopleDirectoryResult returnValue = PeopleDirectoryServiceUtil.fetchAll();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	/**
	* Retrieves all the system users from the given date
	*
	* @return
	* @throws SystemException
	* @throws PortalException
	*/
	public static com.rivetlogic.service.data.PeopleDirectoryResult usersFetchByDate(
		java.sql.Timestamp modifiedDate, int start, int end)
		throws RemoteException {
		try {
			com.rivetlogic.service.data.PeopleDirectoryResult returnValue = PeopleDirectoryServiceUtil.usersFetchByDate(modifiedDate,
					start, end);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	/**
	* Get the count of active users
	*
	* @return
	* @throws PortalException
	* @throws SystemException
	*/
	public static int getActiveUsersCount() throws RemoteException {
		try {
			int returnValue = PeopleDirectoryServiceUtil.getActiveUsersCount();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PeopleDirectoryServiceSoap.class);
}