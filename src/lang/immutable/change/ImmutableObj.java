package lang.immutable.change;

import lang.immutable.address.ImmutableAddress;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    private ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); //이렇게 하면 불변도 유지하면서 새로운 값 반환 가능
    }
    public int getValue() {
        return value;
    }
}
