/**
 * Copyright © 2016-2017 PT VIO Intelligence Authors
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
package org.thingsboard.server.extensions.rest.action;

import lombok.Data;
import org.thingsboard.server.extensions.core.action.template.TemplateActionConfiguration;

@Data
public class RestApiCallPluginActionConfiguration implements TemplateActionConfiguration {
    private boolean sync;
    private String template;
    private String actionPath;
    private int expectedResultCode;
    private String requestMethod;
}
