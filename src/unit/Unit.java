package unit;

public enum Unit {
    METER{
       String getBaseUnit(){
            return "";
        }
    },
    KILOGRAM{
        String getBaseUnit(){
            return KILOGRAM.toString();
        }
    },
    SECOND,
    AMPERE,
    KELVIN,
    MOLE,
    CANDEL;
}
