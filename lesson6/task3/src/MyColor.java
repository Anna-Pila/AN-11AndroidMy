enum MyColor  {

    //Добавила желтый цвет для проверки дапазона.

    RED("Red", 255, 0, 0),
    GREEN("Green", 0, 255, 0),
    BLUE("Blue", 0, 0, 255),
    YELLOW("Yellow", 10, -8, 256);


    private String colorName;
    int r;
    int g;
    int b;

    MyColor(String colorName, final int r, final int g, final int b) {
        if (!(Utils.rangeCheck(r, g, b, 0, 255))) {
            this.colorName = "Error color!";
        } else {
            this.colorName = colorName;
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    public String getColorName() {
        return colorName + "( " + r + " ; " + g + " ; " + b + " )";
    }


}

