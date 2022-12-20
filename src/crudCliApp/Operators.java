package crudCliApp;

public enum Operators {
        CREATE(1),
        PRINT(2),
        SEARCH(3),
        DELETE(4),
        UPDATE(5);
        public final int code;

        private Operators(int code) {
                this.code = code;
        }
        public static Operators valueOfLabel(int code) {
                for (Operators e : values()) {
                        if (e.code==(code)) {
                                return e;
                        }
                }
                return null;
        }
}

