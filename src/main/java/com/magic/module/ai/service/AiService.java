package com.magic.module.ai.service;

public interface AiService {
    Object call(String systemContent, String userContent);
}