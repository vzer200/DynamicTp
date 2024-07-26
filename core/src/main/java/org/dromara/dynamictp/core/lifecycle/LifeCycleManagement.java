/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Copyright (c) 2007-2020 VMware, Inc. or its affiliates.  All rights reserved.
//
// This software, the RabbitMQ Java client library, is triple-licensed under the
// Mozilla Public License 2.0 ("MPL"), the GNU General Public License version 2
// ("GPL") and the Apache License version 2 ("ASL"). For the MPL, please see
// LICENSE-MPL-RabbitMQ. For the GPL, please see LICENSE-GPL2.  For the ASL,
// please see LICENSE-APACHE2.
//
// This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND,
// either express or implied. See the LICENSE file for specific language governing
// rights and limitations of this software.
//
// If you have any questions regarding licensing, please contact us at
// info@rabbitmq.com.

/*
 * Modifications Copyright 2015-2020 VMware, Inc. or its affiliates. and licenced as per
 * the rest of the RabbitMQ Java client.
 */

/*
 * Written by Doug Lea with assistance from members of JCP JSR-166
 * Expert Group and released to the public domain, as explained at
 * https://creativecommons.org/licenses/publicdomain
 */

package org.dromara.dynamictp.core.lifecycle;

/**
 * Interface for managing the lifecycle of a component.
 * Provides methods to start, stop, and check the running state of a component,
 * as well as handling auto startup and shutdown phases.
 *
 * @author vzer200
 * @since 1.0.0
 */
public interface LifeCycleManagement {

    /**
     * Starts the component.
     */
    void start();

    /**
     * Stops the component.
     */
    void stop();

    /**
     * Checks if the component is running.
     *
     * @return true if the component is running, false otherwise
     */
    boolean isRunning();

    /**
     * Stops the component with a callback.
     *
     * @param callback the callback to execute after stopping
     */
    void stop(Runnable callback);

    /**
     * Checks if the component is set to auto startup.
     *
     * @return true if the component is set to auto startup, false otherwise
     */
    boolean isAutoStartup();

    /**
     * Gets the phase of the component.
     *
     * @return the phase of the component
     */
    int getPhase();

    /**
     * Performs internal shutdown operations.
     */
    void shutdownInternal();
}