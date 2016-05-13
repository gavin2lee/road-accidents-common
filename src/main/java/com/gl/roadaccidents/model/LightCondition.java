package com.gl.roadaccidents.model;

/**
 * Created by gavin on 16-5-13.
 */
public class LightCondition extends BaseEntity{
    private static final long serialVersionUID = 8451808527791954060L;
    private Integer code;
    private String label;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}