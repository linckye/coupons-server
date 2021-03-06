package pers.linckye.coupons.server.client.models;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Map;

/**
 * @author linckye 2018-10-08
 */
@Data
@Accessors(chain = true)
public class AddGrabCouponRequest
        implements Serializable {

    private static final long serialVersionUID = 1310207104255006646L;

    private String couponType;

}
