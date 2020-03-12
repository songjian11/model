package com.songj.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Button button = new Button(mediator);
        List list = new List(mediator);
        TextBox textBox = new TextBox(mediator);
        ComboBox comboBox = new ComboBox(mediator);

        mediator.add("button", button);
        mediator.add("list", list);
        mediator.add("textbox", textBox);
        mediator.add("combox", comboBox);

        button.update();
        textBox.update();
    }
}
