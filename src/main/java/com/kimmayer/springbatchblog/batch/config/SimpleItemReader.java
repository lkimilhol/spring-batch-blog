package com.kimmayer.springbatchblog.batch.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

@Component
public class SimpleItemReader implements ItemReader<String> {
    @Override
    public String read() {
        return "s";
    }
}
