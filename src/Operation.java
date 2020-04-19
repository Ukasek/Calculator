public enum Operation {

    ADD {
        @Override
        int performOperation(int num1, int num2) {
            return num1 + num2;
        }
    }, SUBTRACT {
        @Override
        int performOperation(int num1, int num2) {
            return num1 - num2;
        }
    }, DIVIDE {
        @Override
        int performOperation(int num1, int num2) {
            return num1 / num2;
        }
    }, MULTIPLY {
        @Override
        int performOperation(int num1, int num2) {
            return num1 * num2;
        }
    };

    abstract int performOperation(int num1, int num2);

}
