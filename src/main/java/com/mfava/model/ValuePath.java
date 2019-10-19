package com.mfava.model;

import java.util.List;

public class ValuePath {

    public ValuePath(List<Integer> nodes, Integer pathTotalValue) {
        this.nodes = nodes;
        this.pathTotalValue = pathTotalValue;
    }

    private List<Integer> nodes;

    private Integer pathTotalValue;

    public List<Integer> getNodes() {
        return nodes;
    }

    public void setNodes(List<Integer> nodes) {
        this.nodes = nodes;
    }

    public Integer getPathTotalValue() {
        return pathTotalValue;
    }

    public void setPathTotalValue(Integer pathTotalValue) {
        this.pathTotalValue = pathTotalValue;
    }

}
