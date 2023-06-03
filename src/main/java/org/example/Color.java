package org.example;

public enum Color { // Кожен мисливець ...
    RED("FF0000"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    },
    ORANGE("FFA500"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    },
    YELLOW("FFFF00"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    },
    GREEN("008000"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    },
    CYAN("00FFFF"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    },
    BLUE("0000FF"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    },
    PURPLE("800080"){
        public String toString(){ // перевизначаю toString
            return "My color is " + this.name();
        }
    };
    private String hexRGB;
    private Color(String hexRGB){
        this.hexRGB = hexRGB;
    }
    public String getHexRGB() {
        return "#" + hexRGB;
    }
}
