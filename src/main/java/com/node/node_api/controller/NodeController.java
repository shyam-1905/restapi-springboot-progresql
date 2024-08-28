package com.node.node_api.controller;


import com.node.node_api.entity.Node;
import com.node.node_api.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @PostMapping
    public ResponseEntity<Node> addNode(@Valid @RequestBody Node node) {
        Node savedNode = nodeService.addNode(node);
        return new ResponseEntity<>(savedNode, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Node>> getAllNodes() {
        List<Node> nodes = nodeService.getAllNodes();
        return new ResponseEntity<>(nodes, HttpStatus.OK);
    }

}

