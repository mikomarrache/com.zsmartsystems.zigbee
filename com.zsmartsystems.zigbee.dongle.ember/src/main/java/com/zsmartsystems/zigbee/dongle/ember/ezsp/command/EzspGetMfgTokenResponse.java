/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;

/**
 * Class to implement the Ember EZSP command <b>getMfgToken</b>.
 * <p>
 * Retrieves a manufacturing token from the Flash Information Area of the NCP (except for
 * EZSP_STACK_CAL_DATA which is managed by the stack).
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetMfgTokenResponse extends EzspFrameResponse {
    public static final int FRAME_ID = 0x0B;

    /**
     * The manufacturing token data.
     * <p>
     * EZSP type is <i>uint8_t[]</i> - Java type is {@link int[]}
     */
    private int[] tokenData;

    /**
     * Response and Handler constructor
     */
    public EzspGetMfgTokenResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        int tokenDataLength = deserializer.deserializeUInt8();
        tokenData= deserializer.deserializeUInt8Array(tokenDataLength);
    }

    /**
     * The manufacturing token data.
     * <p>
     * EZSP type is <i>uint8_t[]</i> - Java type is {@link int[]}
     *
     * @return the current tokenData as {@link int[]}
     */
    public int[] getTokenData() {
        return tokenData;
    }

    /**
     * The manufacturing token data.
     *
     * @param tokenData the tokenData to set as {@link int[]}
     */
    public void setTokenData(int[] tokenData) {
        this.tokenData = tokenData;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(101);
        builder.append("EzspGetMfgTokenResponse [networkId=");
        builder.append(networkId);
        builder.append(", tokenData=");
        for (int cnt = 0; cnt < tokenData.length; cnt++) {
            if (cnt > 0) {
                builder.append(' ');
            }
            builder.append(String.format("%02X", tokenData[cnt]));
        }
        builder.append(']');
        return builder.toString();
    }
}
