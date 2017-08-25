// usage
Map<String, Integer> map = new TreeMap<String, Integer>();
            map.put("p1", b.getInt("p1"));
            map.put("p2", b.getInt("p2"));
            map.put("p3", b.getInt("p3"));
            map.put("p4", b.getInt("p4"));
map = sortByValue(map);

// method itself
public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ) {
    List<Map.Entry<K, V>> list =
            new LinkedList<Map.Entry<K, V>>( map.entrySet() );
    Collections.sort( list, new Comparator<Map.Entry<K, V>>()
    {
        public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
        {
            return (o1.getValue()).compareTo( o2.getValue() );
        }
    } );

    Map<K, V> result = new LinkedHashMap<K, V>();
    for (Map.Entry<K, V> entry : list)
    {
        result.put( entry.getKey(), entry.getValue() );
    }
    return result;
}
