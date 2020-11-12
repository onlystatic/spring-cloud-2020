package com.noonhope.springcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author v_qianglong
 * @date 2020/11/11 11:27
 */
@Setter
@Getter
@TableName("t_storage")
public class Storage {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @JsonProperty("product_id")
    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;

    public Storage(Long productId, Integer total, Integer used, Integer residue) {
        this.productId = productId;
        this.total = total;
        this.used = used;
        this.residue = residue;
    }
}
