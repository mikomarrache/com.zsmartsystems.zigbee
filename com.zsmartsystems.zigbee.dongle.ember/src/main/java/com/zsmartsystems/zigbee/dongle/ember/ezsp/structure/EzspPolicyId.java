/**
 * Copyright (c) 2014-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.structure;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the Ember Enumeration <b>EzspPolicyId</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public enum EzspPolicyId {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     * Controls trust center behavior.
     */
    EZSP_TRUST_CENTER_POLICY(0x0000),

    /**
     * Controls how external binding modification requests are handled.
     */
    EZSP_BINDING_MODIFICATION_POLICY(0x0001),

    /**
     * Controls whether the Host supplies unicast replies.
     */
    EZSP_UNICAST_REPLIES_POLICY(0x0002),

    /**
     * Controls whether pollHandler callbacks are generated.
     */
    EZSP_POLL_HANDLER_POLICY(0x0003),

    /**
     * Controls whether the message contents are included in the messageSentHandler callback.
     */
    EZSP_MESSAGE_CONTENTS_IN_CALLBACK_POLICY(0x0004),

    /**
     * Controls whether the Trust Center will respond to Trust Center link key requests.
     */
    EZSP_TC_KEY_REQUEST_POLICY(0x0005),

    /**
     * Controls whether the Trust Center will respond to application link key requests.
     */
    EZSP_APP_KEY_REQUEST_POLICY(0x0006),

    /**
     * Controls whether ZigBee packets that appear invalid are automatically dropped by the
     * stack. A counter will be incremented when this occurs.
     */
    EZSP_PACKET_VALIDATE_LIBRARY_POLICY(0x0007),

    /**
     * Controls whether the stack will process ZLL messages.
     */
    EZSP_ZLL_POLICY(0x0008);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, EzspPolicyId> codeMapping;

    private int key;

    private EzspPolicyId(int key) {
        this.key = key;
    }

    private static void initMapping() {
        codeMapping = new HashMap<Integer, EzspPolicyId>();
        for (EzspPolicyId s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    /**
     * Lookup function based on the EmberStatus type code. Returns null if the
     * code does not exist.
     *
     * @param i
     *            the code to lookup
     * @return enumeration value of the alarm type.
     */
    public static EzspPolicyId getEzspPolicyId(int i) {
        if (codeMapping == null) {
            initMapping();
        }

        if (codeMapping.get(i) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(i);
    }

    /**
     * Returns the EZSP protocol defined value for this enum
     *
     * @return the EZSP protocol key
     */
    public int getKey() {
        return key;
    }
}
