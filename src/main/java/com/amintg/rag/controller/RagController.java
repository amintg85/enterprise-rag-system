package com.amintg.rag.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/rag")
public class RagController{@GetMapping("/query") public String q(@RequestParam String q){return "Answer: "+q;}}
