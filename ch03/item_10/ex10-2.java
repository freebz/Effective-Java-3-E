CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
String s = "polish";


List<CaseInsensitiveString> list = new ArrayList<>();
list.add(cis);


@Override public boolean equals(Object o) {
    return o instanceof CaseInsensitiveString &&
	((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
}
