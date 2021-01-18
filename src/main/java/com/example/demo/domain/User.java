/**
 * 
 */
package com.example.demo.domain;

import java.io.Serializable;

import lombok.Data;

/**
 *
 * @author 黄永琦
 * @since 2021-01-12
 * @see
 */
@Data
public class User implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 7200797381299073073L;
    private Long userId;
    private String userName;

}
