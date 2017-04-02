package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zdo.ZdoResponse;

/**
 * User Descriptor Conf value object class.
 * <p>
 * The User_Desc_conf is generated by a remote device in response to a
 * User_Desc_set directed to the remote device. This command shall be unicast to
 * the originator of the User_Desc_set command.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class UserDescriptorConf extends ZdoResponse {
    /**
     * Default constructor.
     */
    public UserDescriptorConf() {
        clusterId = 0x8014;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("UserDescriptorConf");
        builder.append(super.toString());
        return builder.toString();
    }

}