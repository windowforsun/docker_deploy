package com.example.demo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@RedisHash("Data")
public class Data {
    @Id
    private long id;
    @Indexed
    private long firstIndex;
    @Indexed
    private long secondIndex;
    private String str;
}


