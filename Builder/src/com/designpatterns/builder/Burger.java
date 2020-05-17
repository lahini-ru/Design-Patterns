package com.designpatterns.builder;

public class Burger {

    private final String bun;
    private final String cheese;
    private final String meat;
    private final String dressing;
    private final Boolean etc;

    public Burger(Builder builder) {

        this.bun=builder.bun;
        this.cheese=builder.cheese;
        this.meat=builder.meat;
        this.dressing=builder.dressing;
        this.etc=builder.etc;
    }

    static class Builder{
        private String bun;
        private String cheese;
        private String meat;
        private String dressing;
        private Boolean etc;

        public Burger build(){
            return new Burger(this);
        }

        public Builder(String bun){
            this.bun=bun;
        }

        public Builder cheese(String cheese){
            this.cheese=cheese;
            return this;
        }

        public Builder meat(String meat){
            this.meat=meat;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing=dressing;
            return this;
        }

        public Builder etc(Boolean etc){
            this.etc=etc;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", cheese='" + cheese + '\'' +
                ", meat='" + meat + '\'' +
                ", dressing='" + dressing + '\'' +
                ", etc=" + etc +
                '}';
    }
}
