/**
 * 
 */
package com.example.demo.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 *
 * @author 黄永琦
 * @since 2021-01-12
 * @see  
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     *  
     * @param 
     * @param 
     * @return 
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.get();
    }

}
