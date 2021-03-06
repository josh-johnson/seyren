/**
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
package com.seyren.core.store;

import com.seyren.core.domain.Alert;
import com.seyren.core.domain.SeyrenResponse;

public interface AlertsStore {
    
    Alert createAlert(String checkId, Alert alert);
    
    SeyrenResponse<Alert> getAlerts(String checkId, int start, int items);
    
    SeyrenResponse<Alert> getAlerts(int start, int items);
    
    Alert getLastAlertForTargetOfCheck(String graphiteBaseUrl, String target, String checkId);
    
}
