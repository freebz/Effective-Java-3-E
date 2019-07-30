@Override public boolean equals(Object o) {
    if (!(o instanceof Bigram))
	return false;
    Bigram b = (Bigram) o;
    return b.first == first && b.second == second;
}
