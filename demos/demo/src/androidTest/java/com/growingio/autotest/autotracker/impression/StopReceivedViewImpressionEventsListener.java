/*
 * Copyright (C) 2020 Beijing Yishu Technology Co., Ltd.
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

package com.growingio.autotest.autotracker.impression;

import com.google.common.truth.Truth;
import com.growingio.autotest.help.MockEventsApiServer;

import org.json.JSONArray;
import org.json.JSONException;

final class StopReceivedViewImpressionEventsListener extends MockEventsApiServer.OnReceivedEventListener {
    @Override
    protected void onReceivedCustomEvents(JSONArray jsonArray) throws JSONException {
        Truth.assertWithMessage("Received View Impression Events").fail();
    }
}
