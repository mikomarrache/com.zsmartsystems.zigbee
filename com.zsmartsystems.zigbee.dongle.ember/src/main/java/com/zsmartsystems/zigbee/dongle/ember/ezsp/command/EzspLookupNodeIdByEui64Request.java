/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>lookupNodeIdByEui64</b>.
 * <p>
 * Returns the node ID that corresponds to the specified EUI64. The node ID is found by searching
 * through all stack tables for the specified EUI64.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspLookupNodeIdByEui64Request extends EzspFrameRequest {
    public static final int FRAME_ID = 0x60;

    /**
     * The EUI64 of the node to look up.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress eui64;

    /**
     * Serialiser used to serialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspLookupNodeIdByEui64Request() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * The EUI64 of the node to look up.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current eui64 as {@link IeeeAddress}
     */
    public IeeeAddress getEui64() {
        return eui64;
    }

    /**
     * The EUI64 of the node to look up.
     *
     * @param eui64 the eui64 to set as {@link IeeeAddress}
     */
    public void setEui64(IeeeAddress eui64) {
        this.eui64 = eui64;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeEmberEui64(eui64);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(83);
        builder.append("EzspLookupNodeIdByEui64Request [networkId=");
        builder.append(networkId);
        builder.append(", eui64=");
        builder.append(eui64);
        builder.append(']');
        return builder.toString();
    }
}
