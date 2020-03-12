package com.songj.mediator;

public class ConcreteMediator extends Mediator {
    @Override
    void componentChanged(AbstractComponent component) {
        if(component instanceof Button){
            List list = (List) map.get("list");
            list.action();
        }else if(component instanceof List){
            ComboBox comboBox = (ComboBox) map.get("combox");
            comboBox.action();
        }else if(component instanceof TextBox){
            Button button = (Button) map.get("button");
            button.action();
        }else if(component instanceof ComboBox){
            TextBox textBox = (TextBox) map.get("textbox");
            textBox.action();
        }
    }

    @Override
    public void add(String key, AbstractComponent component){
        map.put(key, component);
    }
}
