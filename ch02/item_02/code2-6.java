// 코드 2-6 칼초네 피자

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static Builder extends Pizza.Builder<Builder> {
	private boolean sauceInside = false; // 기본값

	public Builder sauceInside() {
	    sauceInside = true;
	    return this;
	}

	@Override public Calzone build() {
	    return new Calzone(this);
	}

	@Override protected Builder self() { return this; }
    }

    private Calzone(Builder builder) {
	super(builder);
	sauceInside = builder.sauceInside;
    }
}
