package com.bobo.d4_polymorphic_pc;

public class Computer {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Computer(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(name + "开机了");
    }

    public void installUSB(USB usb) {
        // 多态：usb
        usb.connect();

        // 独有功能先判断，再强转
        if(usb instanceof Keyboard) {
            Keyboard k = (Keyboard) usb;
            k.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }

        usb.unconnect();
    }
}
