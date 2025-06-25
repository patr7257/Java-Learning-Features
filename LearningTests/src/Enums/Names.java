package Enums;

public enum Names {
    BELLA, MAX, LUNA, CHARLIE, COCO,
    BUDDY, MOLLY, ROCKY, DAISY, LEO,
    LUCY, MILO, BAILEY, STELLA, OREO,
    GINGER, HUNTER, RUBY, ZEUS, SADIE,
    PEPPER, CHLOE, DUKE, RILEY, SIMBA;

    public String value() {          // convenience
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
