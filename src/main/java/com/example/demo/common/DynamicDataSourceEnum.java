/**
 * 
 */
package com.example.demo.common;

import lombok.Getter;

/**
 * 一主一从两个数据源
 *
 * @author 黄永琦
 * @since 2021-01-12
 * @see
 */
@Getter
public enum DynamicDataSourceEnum {
    MASTER("master"), SLAVE("slave");

    private String dataSourceName;

    DynamicDataSourceEnum(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
}
