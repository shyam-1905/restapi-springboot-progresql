package com.node.node_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;



@Entity
@Table(name = "nodes")
public class Node {
    
	@Id
    @Column(unique = true, nullable = false)
    @NotBlank(message = "Node ID is required")
    @Pattern(regexp = "^[a-zA-Z0-9_]*$", message = "Node ID can only contain alphanumeric characters and underscores")
    private String nodeId;

    @NotBlank(message = "Node name is required")
    @jakarta.validation.constraints.Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Node name can only contain alphanumeric characters and spaces")
    private String nodeName;

    @jakarta.validation.constraints.Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Description can only contain alphanumeric characters and spaces")
    private String description;

    @jakarta.validation.constraints.Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Memo can only contain alphanumeric characters and spaces")
    private String memo;

    @NotBlank(message = "Node type is required")
    private String nodeType;


	private String parentNodeGroupName;
	private String parentNodeGroupId;
	private String parentNodeId;
 // Getter methods
    public String getNodeId() {
        return nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getDescription() {
        return description;
    }

    public String getMemo() {
        return memo;
    }

    public String getNodeType() {
        return nodeType;
    }

    public String getParentNodeGroupName() {
        return parentNodeGroupName;
    }

    public String getParentNodeGroupId() {
        return parentNodeGroupId;
    }

    public String getParentNodeId() {
        return parentNodeId;
    }

    // Setter methods (if needed)
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public void setParentNodeGroupName(String parentNodeGroupName) {
        this.parentNodeGroupName = parentNodeGroupName;
    }

    public void setParentNodeGroupId(String parentNodeGroupId) {
        this.parentNodeGroupId = parentNodeGroupId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }
}