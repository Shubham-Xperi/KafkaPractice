package com.shubho.countstreamprocessor.processor;

import org.springframework.stereotype.Component;

/**
 * 1. This class is for the topology where it will consume the data 'random-data-topic'
 * 2. It will process the data and make convert it to an hashmap where the hashmap key will be the
 *    first letter of the word
 * 3. Then it will be going to publish the data in another topic call word-dictionary.
 */
@Component
public class WordProcessor {
}
