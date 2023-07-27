public String acronymFor(List<String> list) {

    String acronym = "";
    for (String i : list) {
        String first = i.substring(0,1);
        acronym += first.toUpperCase();
    }
    
    return acronym;    
}
