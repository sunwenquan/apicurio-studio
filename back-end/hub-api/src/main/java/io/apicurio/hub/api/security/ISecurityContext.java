/*
 * Copyright 2017 JBoss Inc
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

package io.apicurio.hub.api.security;

import com.mashape.unirest.request.HttpRequest;

import io.apicurio.studio.shared.beans.User;

/**
 * @author eric.wittmann@gmail.com
 */
public interface ISecurityContext {

    /**
     * Returns the User information for the currently authenticated user.
     */
    public User getCurrentUser();

    /**
     * Called to add security information to the given external API request.  For example, this may take
     * the form of adding an Authorization header to the request with the current bearer token.
     * @param request
     */
    public void addSecurity(HttpRequest request);

}