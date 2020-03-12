package com.songj.memento;

public class Originator{
    private String state;

    private Caretaker caretaker;

    public Originator() {
        this.caretaker = new Caretaker();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMement(){
        Memento memento = new Memento(this.state);
        caretaker.add(memento);
    }

    public void refresh(int index){
        Memento memento = caretaker.get();
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }

    private class Memento{
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    private class Caretaker{
        private Memento memento;

        public void add(Memento memento){
            this.memento = memento;
        }

        public Memento get(){
            return this.memento;
        }
    }
}
