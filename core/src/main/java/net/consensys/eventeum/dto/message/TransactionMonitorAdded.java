/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.consensys.eventeum.dto.message;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import net.consensys.eventeum.model.TransactionMonitoringSpec;

@NoArgsConstructor
public class TransactionMonitorAdded extends AbstractMessage<TransactionMonitoringSpec> implements Serializable {

    public static final String TYPE = "TRANSACTION_MONITOR_ADDED";

    public TransactionMonitorAdded(TransactionMonitoringSpec spec) {
        super(spec.getId(), TYPE, spec);
    }
}
