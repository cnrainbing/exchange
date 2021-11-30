package com.lmxdawn.dubboapi.res.wallet;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel
public class CoinSimpleDubboRes implements Serializable {
    @ApiModelProperty(value = "币种ID自增")
    private Long id;

    @ApiModelProperty(value = "币种别名")
    private String name;

    @ApiModelProperty(value = "币种全称")
    private String coinName;

    @ApiModelProperty(value = "币种单位")
    private String symbol;
}