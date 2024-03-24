package com.wang.Bean;

import lombok.*;


import javax.management.ConstructorParameters;
import java.sql.Timestamp;
import java.util.Date;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;
    private Integer goodNo;
    private Integer firstType_id;
    private Integer secType_id;
    private Double inPrice;
    private Double outPrice;
    private Timestamp produceTime;
    private Timestamp shelfTime;
    private String name;
    private String firstType;
    private String secType;

}
