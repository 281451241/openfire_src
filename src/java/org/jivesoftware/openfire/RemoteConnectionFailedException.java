/**
 * $RCSfile$
 * $Revision: 1368 $
 * $Date: 2005-05-23 14:45:49 -0300 (Mon, 23 May 2005) $
 *
 * Copyright (C) 2004-2008 Jive Software. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.openfire;

/**
 * Thrown when something failed verifying the key of a Originating Server with an Authoritative
 * Server in a dialback operation.
 *
 * @author Gaston Dombiak
 */
public class RemoteConnectionFailedException extends Exception {

    public RemoteConnectionFailedException() {
        super();
    }

    public RemoteConnectionFailedException(String msg) {
        super(msg);
    }
}
