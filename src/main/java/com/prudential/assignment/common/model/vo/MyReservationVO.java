package com.prudential.assignment.common.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("我的预定记录VO")
public class MyReservationVO {

    @ApiModelProperty("记录id")
    private Long id;

    @ApiModelProperty("车型")
    private String carModel;

    @ApiModelProperty("预定开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;

    @ApiModelProperty("预定结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    @ApiModelProperty("归还时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime returnTime;

    /**
     * {@link com.prudential.assignment.enums.ReservationStatus}
     */
    @ApiModelProperty("状态 CREATED FINISHED")
    private String status;

}
