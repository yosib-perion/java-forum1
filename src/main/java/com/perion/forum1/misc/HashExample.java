package com.perion.forum1.misc;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;
import java.time.Duration;
import java.time.Instant;

public class HashExample {

    public static void main(String[] args) {

        HashFunction hashFunction = Hashing.adler32();

        Instant start = Instant.now();
        HashCode hashCode = hashFunction.hashString("https://github.com/google/guava/wiki/HashingExplained", Charset.defaultCharset());
        Instant end = Instant.now();

        System.out.println(hashCode.toString());;
        System.out.println(Duration.between(start, end).toMillis());

    }
}
