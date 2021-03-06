package com.Inheritance;

// abstract ( in contrast of ABSTRACT : FINAL , CLASS could not EXTENDED ) this UIControl class so
// so it could not be instantiate anymore,
// it could only be extended
public abstract class UIControl {
    private boolean isEnable = true;

    /*public UIControl(boolean isEnable) {
        this.isEnable = isEnable;
    }*/

    // abstract this render() method  so
    // so it could only & MUST be implemented.
    // ( in contrast of ABSTRACT : FINAL , METHOD could not be OVERRIDING )
    public void render() {
        System.out.println("Parent Class");
    }
    public void enable() {
        isEnable = true;
    }
    public void disable() {
        isEnable = false;
    }

    // Getters to read the values
    public boolean isEnabled() {
        return this.isEnable;
    }
}
