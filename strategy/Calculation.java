package strategy;

public enum Calculation {
    ADD {@Override
    public String toString() {
            return "add";
        }
},
    MINUS{@Override
        public String toString() {
            return  "minus";
        }
    },MULTI{@Override
        public String toString() {
            return  "multi";
        }
    },DIV{@Override
        public String toString() {
            return  "div";
        }
    }
}
