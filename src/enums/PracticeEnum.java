package enums;

import java.util.Arrays;
import java.util.Optional;

public enum PracticeEnum {
    India("IN9"),
    Malaysia("ML1");

    private String value;

    PracticeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Optional<PracticeEnum> getDetails(String val) {
        return Arrays.stream(values()).filter(PracticeEnum -> PracticeEnum.name().equals(val)).findFirst();
    }

    public static void main(String[] args) {
        String val = "Malaysia";
        Optional<PracticeEnum> res = PracticeEnum.getDetails(val);
//        System.out.println(res.isPresent() ? res.get().getValue(): "_" );
        System.out.println(PracticeEnum.valueOf(val).getValue());
    }
}
