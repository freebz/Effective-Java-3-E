map.merge(key, 1, (count, incr) -> count + incr);


map.merge(key, 1, Integer::sum);
