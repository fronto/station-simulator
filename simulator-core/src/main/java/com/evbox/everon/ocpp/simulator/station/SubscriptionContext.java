package com.evbox.everon.ocpp.simulator.station;

import lombok.Value;

@Value
public class SubscriptionContext<REQ, RES> {
    Subscriber<REQ, RES> subscriber;
    REQ request;
}
