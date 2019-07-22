// 코드 2-4 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
	EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
	public T addTopping(Topping topping) {
	    toppings.add(Objects.requireNonNull(topping));
	    return self();
	}

	abstract Pizza build();

	// 하위 클래스는 이 메서드를 재정의(overriding)하여
	// "this"를 반환하도록 해야 한다.
	protected abstract T self();
    }

    Pizza(Builder<?> builder) {
	toppings = builder.toppings.clone(); // 아이템 50 참조
    }
}
