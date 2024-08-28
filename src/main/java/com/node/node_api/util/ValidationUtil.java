package com.node.node_api.util;

import com.node.node_api.entity.Node;
import org.springframework.stereotype.Component;
import jakarta.validation.ValidationException;
import java.util.regex.Pattern;

@Component
public class ValidationUtil {

    private static final Pattern SPECIAL_CHARS = Pattern.compile("[!@#$%^&*()]");

    public void validateNode(Node node) {
        if (containsSpecialChars(node.getNodeId()) ||
            containsSpecialChars(node.getNodeName()) ||
            containsSpecialChars(node.getDescription()) ||
            containsSpecialChars(node.getMemo()) ||
            containsSpecialChars(node.getNodeType()) ||
            containsSpecialChars(node.getParentNodeGroupName()) ||
            containsSpecialChars(node.getParentNodeGroupId()) ||
            containsSpecialChars(node.getParentNodeId())) {
            throw new ValidationException("Special characters are not allowed in any field");
        }
    }

    private boolean containsSpecialChars(String str) {
        return str != null && SPECIAL_CHARS.matcher(str).find();
    }
}