/*
 * Copyright 2015 the original author or authors.
 *
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
 */
package org.springframework.social.oauth1;

import java.io.Serializable;

/**
 * Holds an OAuth token and secret.
 * Used for both the request token and access token.
 * @author Keith Donald
 */
@SuppressWarnings("serial")
public class OAuthToken implements Serializable {

	private final String value;
	
	private final String secret;
	
	/**
	 * Create a new OAuth token with a token value and secret.
	 * @param value the token value
	 * @param secret the token secret
	 */
	public OAuthToken(String value, String secret) {
		this.value = value;
		this.secret = secret;
	}

	/**
	 * The token value.
	 * @return The token value.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * The token secret.
	 * @return The token secret.
	 */
	public String getSecret() {
		return secret;
	}

}
