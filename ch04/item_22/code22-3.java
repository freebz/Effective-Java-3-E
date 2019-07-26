// 코드 22-3 정적 임포트를 사용해 상수 이름만으로 사용하기

import static effectivejava.chapter4.item22.constantutilityclass.PhysicalConstants.*;

public class Test {
    double atoms(double mols) {
	return AVOGADROS_NUMBER * mols;
    }
    ...
    // PhysicalConstants를 빈번히 사용한다면 정적 임포트가 값어치를 한다.
}
