/*
 *  Copyright (C) [SonicCloudOrg] Sonic Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.cloud.sonic.driver.ios.service;

import org.cloud.sonic.driver.common.models.BaseElement;
import org.cloud.sonic.driver.common.models.ElementRect;
import org.cloud.sonic.driver.common.tool.SonicRespException;

/**
 * @author Eason
 * web element interface
 */
public interface IOSElement extends BaseElement {

    void click() throws SonicRespException;

    void sendKeys(String text) throws SonicRespException;

    void sendKeys(String text,int frequency) throws SonicRespException;

    void clear() throws SonicRespException;

    String getText() throws SonicRespException;

    byte[] screenshot() throws SonicRespException;
}
