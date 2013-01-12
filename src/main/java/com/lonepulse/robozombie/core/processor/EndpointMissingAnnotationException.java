package com.lonepulse.robozombie.core.processor;

/*
 * #%L
 * RoboZombie
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.lonepulse.robozombie.core.RoboZombieRuntimeException;

/**
 * <p>This runtime exception is thrown when a required annotation is missing from 
 * the designated endpoint interface.</p>
 * 
 * @version 1.1.1
 * <br><br>
 * @author <a href="mailto:lahiru@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public class EndpointMissingAnnotationException extends RoboZombieRuntimeException {

	
	private static final long serialVersionUID = 4087362624687849076L;

	
	/**
	 * <p>Displays a detailed description along with the stacktrace. 
	 */
	public EndpointMissingAnnotationException(Class<?> endpointInterface, Class<?> missingAnnotation) {
		
		this("Missing annotation " + missingAnnotation.getName() + " on endpoint " + 
			  endpointInterface.getName());
	}
	
	/**
	 * See {@link RuntimeException#RuntimeException()}.
	 */
	public EndpointMissingAnnotationException() {
	}

	/**
	 * See {@link RuntimeException#RuntimeException(String)}.
	 */
	public EndpointMissingAnnotationException(String detailMessage) {
		
		super(detailMessage);
	}

	/**
	 * See {@link RuntimeException#RuntimeException(Throwable)}.
	 */
	public EndpointMissingAnnotationException(Throwable throwable) {
		
		super(throwable);
	}

	/**
	 * See {@link RuntimeException#RuntimeException(String, Throwable)}.
	 */
	public EndpointMissingAnnotationException(String detailMessage, Throwable throwable) {

		super(detailMessage, throwable);
	}
}
