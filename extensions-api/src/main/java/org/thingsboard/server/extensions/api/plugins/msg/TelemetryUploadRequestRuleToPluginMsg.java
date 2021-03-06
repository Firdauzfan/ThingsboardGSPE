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
package org.thingsboard.server.extensions.api.plugins.msg;

import org.thingsboard.server.common.data.id.CustomerId;
import org.thingsboard.server.common.data.id.DeviceId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.msg.core.TelemetryUploadRequest;

public class TelemetryUploadRequestRuleToPluginMsg extends AbstractRuleToPluginMsg<TelemetryUploadRequest> {

    private static final long serialVersionUID = 1L;
    private final long ttl;

    public TelemetryUploadRequestRuleToPluginMsg(TenantId tenantId, CustomerId customerId, DeviceId deviceId, TelemetryUploadRequest payload, long ttl) {
        super(tenantId, customerId, deviceId, payload);
        this.ttl = ttl;
    }

    public long getTtl() {
        return ttl;
    }
}
