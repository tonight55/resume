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
 * 简历模板表
 * </p>
 *
 * @author lee
 * @since 2022-06-30
 */
@Getter
@Setter
@ApiModel(value = "Resumemodel对象", description = "简历模板表")
public class Resumemodel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("文件保存路径")
    private String nameFile;

    @ApiModelProperty("文件显示的名称")
    private String displayName;

    @ApiModelProperty("文件导入时间")
    private String uploadDate;


}
