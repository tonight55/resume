package com.lee.resume.tiny.modules.resume.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 简历分享表
 * </p>
 *
 * @author lee
 * @since 2022-06-30
 */
@Getter
@Setter
@ApiModel(value = "Resumeshare对象", description = "简历分享表")
public class Resumeshare implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;

    private Long resumeId;


}
