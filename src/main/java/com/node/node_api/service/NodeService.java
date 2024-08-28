package com.node.node_api.service;

import com.node.node_api.entity.Node;
import com.node.node_api.repository.NodeRepository;
import com.node.node_api.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import java.util.List;


@Service
public class NodeService {

    @Autowired
    private NodeRepository nodeRepository;

    @Autowired
    private ValidationUtil validationUtil;

    public Node addNode(@Valid Node node) {
        validationUtil.validateNode(node);
        return nodeRepository.save(node);
    }

    public List<Node> getAllNodes() {
        return nodeRepository.findAll();
    }
}