Map<String, Long> freq = words
    .collect(groupingBy(String::toLowerCase, counting()));
