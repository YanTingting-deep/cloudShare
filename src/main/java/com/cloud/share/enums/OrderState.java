package com.cloud.share.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderState {
    PLACEORDER("已下单", 0),
    DELIVER("已发货", 1),
    SIGNFOR("已签收",2);
    final String name;
    final int value;
}